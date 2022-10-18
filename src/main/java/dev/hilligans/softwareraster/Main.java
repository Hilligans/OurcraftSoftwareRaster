package dev.hilligans.softwareraster;

import dev.Hilligans.ourcraft.ModHandler.Content.ModContent;
import dev.Hilligans.ourcraft.ModHandler.Events.Client.GLInitEvent;
import dev.Hilligans.ourcraft.ModHandler.Mod;
import dev.hilligans.softwareraster.graphics.SoftwareRasterEngine;

@Mod(modID = "ourcraft_software_raster")
public class Main {

    public Main(ModContent modContent) {

        System.out.println("Example mod loaded");


        modContent.registerGraphicsEngine(new SoftwareRasterEngine());

    }

    public void event(GLInitEvent event) {
        System.out.println("OpenGL Started");
    }
}
