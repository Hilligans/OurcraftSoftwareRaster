package dev.hilligans.softwareraster.graphics;

import dev.Hilligans.ourcraft.Client.MatrixStack;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.API.GraphicsContext;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.API.IDefaultEngineImpl;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.PipelineState;
import dev.Hilligans.ourcraft.Client.Rendering.Graphics.ShaderSource;
import dev.Hilligans.ourcraft.Client.Rendering.VertexMesh;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

public class SoftwareRasterDefaultImpl implements IDefaultEngineImpl<SoftwareRasterWindow, GraphicsContext> {

    public SoftwareRasterEngine engine;

    public SoftwareRasterDefaultImpl(SoftwareRasterEngine engine) {
        this.engine = engine;
    }

    @Override
    public void drawMesh(SoftwareRasterWindow softwareRasterWindow, GraphicsContext graphicsContext, MatrixStack matrixStack, int i, int i1, int i2, long l, int i3) {

    }

    @Override
    public int createMesh(SoftwareRasterWindow softwareRasterWindow, GraphicsContext graphicsContext, VertexMesh vertexMesh) {
        return 0;
    }

    @Override
    public void destroyMesh(SoftwareRasterWindow softwareRasterWindow, GraphicsContext graphicsContext, int i) {

    }

    @Override
    public int createTexture(SoftwareRasterWindow softwareRasterWindow, GraphicsContext graphicsContext, ByteBuffer byteBuffer, int i, int i1, int i2) {
        return 0;
    }

    @Override
    public void destroyTexture(SoftwareRasterWindow softwareRasterWindow, GraphicsContext graphicsContext, int i) {

    }

    @Override
    public void drawAndDestroyMesh(SoftwareRasterWindow softwareRasterWindow, GraphicsContext graphicsContext, MatrixStack matrixStack, VertexMesh vertexMesh, int i, int i1) {

    }

    @Override
    public void setState(SoftwareRasterWindow softwareRasterWindow, GraphicsContext graphicsContext, PipelineState pipelineState) {

    }

    @Override
    public int createProgram(GraphicsContext graphicsContext, ShaderSource shaderSource) {
        return 0;
    }

    @Override
    public void uploadData(GraphicsContext graphicsContext, FloatBuffer floatBuffer, int i, String s, int i1) {

    }

    @Override
    public int getUniformIndex(GraphicsContext graphicsContext, String s, int i) {
        return 0;
    }
}
