package dev.hilligans.softwareraster.graphics;

import dev.Hilligans.ourcraft.Client.Client;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.RenderWindow;
import org.lwjgl.system.MemoryUtil;

import javax.swing.*;
import java.awt.*;
import java.nio.ByteBuffer;

public class SoftwareRasterWindow extends RenderWindow {

    public int windowId;
    public JFrame jFrame;
    public Client client;
    public boolean vsync = false;
    public ByteBuffer[] buffers = new ByteBuffer[2];

    public SoftwareRasterWindow(Client client, SoftwareRasterEngine engine, String name, int width, int height) {
        super(engine);
        this.client = client;
        jFrame = new JFrame(name);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.show();
        jFrame.setSize(width, height);
        windowId = getWindowId();
        createBuffers();
    }

    @Override
    public long getWindowID() {
        return windowId;
    }

    @Override
    public void close() {
        jFrame.dispose();
    }

    @Override
    public boolean shouldClose() {
        return false;
    }

    @Override
    public void swapBuffers() {
        synchronized (this) {
            ByteBuffer buf = buffers[0];
            buffers[0] = buffers[1];
            buffers[1] = buf;
            buffers[1].clear();
        }
    }

    @Override
    public Client getClient() {
        return client;
    }

    @Override
    public float getWindowWidth() {
        return jFrame.getWidth();
    }

    @Override
    public float getWindowHeight() {
        return jFrame.getHeight();
    }

    @Override
    public boolean isWindowFocused() {
        return false;
    }

    @Override
    public String getWindowingName() {
        return "awt";
    }

    public void createBuffers() {
        //4 bytes for the colour + 4 bytes for the z component
        int size = jFrame.getWidth() * jFrame.getHeight() * 8;

        synchronized (this) {
            if(buffers[0] != null) {
                MemoryUtil.memFree(buffers[0]);
                MemoryUtil.memFree(buffers[1]);
            }
            buffers[0] = MemoryUtil.memCalloc(size);
            buffers[1] = MemoryUtil.memCalloc(size);
        }
    }

    static int windowIdd = 0;

    public synchronized int getWindowId() {
        return ++windowIdd;
    }
}
