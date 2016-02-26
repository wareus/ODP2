package gui;

import gui.util.ImageDecorator;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Wareus on 2016-02-24.
 */
public class Assets
{
    public static Image hull, engine, wings;

    public static void load()
    {
//        hull = loadImage("assets/Hull.png");
//        engine = loadImage("assets/Engine.png");
//        wings = loadImage("assets/Wings.png");
        hull = loadImage("assets/Hull.png");

        System.out.println("hull = " + hull.getWidth());
    }

    private static Image loadImage(String path)
    {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SwingFXUtils.toFXImage(bufferedImage, null);
    }
}
