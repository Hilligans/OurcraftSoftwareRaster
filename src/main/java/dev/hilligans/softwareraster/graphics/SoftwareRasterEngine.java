package dev.hilligans.softwareraster.graphics;

import dev.Hilligans.ourcraft.Client.MatrixStack;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.API.GraphicsContext;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.API.GraphicsEngineBase;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.API.IGraphicsEngine;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.GraphicsData;
import dev.Hilligans.ourcraft.Client.Rendering.World.StringRenderer;
import dev.Hilligans.ourcraft.ClientMain;
import dev.Hilligans.ourcraft.GameInstance;
import dev.Hilligans.ourcraft.Util.Logger;

import java.util.ArrayList;

public class SoftwareRasterEngine extends GraphicsEngineBase<SoftwareRasterWindow, SoftwareRasterDefaultImpl, GraphicsContext> {


    SoftwareRasterWindow window;
    SoftwareRasterDefaultImpl impl;

    public SoftwareRasterEngine() {
        impl = new SoftwareRasterDefaultImpl(this);
    }

    @Override
    public SoftwareRasterWindow createWindow() {
        window = new SoftwareRasterWindow(ClientMain.getClient(), this, "Window", 1000, 1000);
        return window;
    }

    @Override
    public void render(SoftwareRasterWindow softwareRasterWindow) {

    }

    @Override
    public void renderScreen(MatrixStack matrixStack) {

    }

    @Override
    public SoftwareRasterWindow setup() {
        SoftwareRasterWindow renderWindow = createWindow();
        renderWindow.setRenderPipeline(gameInstance.ARGUMENTS.getString("--renderPipeline", "ourcraft:new_world_pipeline"));
        //renderWindow.setup();
        return renderWindow;
    }

    @Override
    public void close() {

    }

    @Override
    public Logger getLogger() {
        return null;
    }

    @Override
    public boolean isCompatible() {
        return false;
    }

    @Override
    public SoftwareRasterDefaultImpl getDefaultImpl() {
        return impl;
    }

    @Override
    public int getProgram(String s) {
        return 0;
    }


    @Override
    public String getResourceName() {
        return "softwareRaster";
    }

    @Override
    public String getIdentifierName() {
        return "ourcraft_software_raster:softwareRaster";
    }

    @Override
    public String getUniqueName() {
        return "graphicsEngine.ourcraft_software_raster.softwareRaster";
    }
}
