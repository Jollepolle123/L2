import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;

import app.ImageEditor;
import app.ImageResizer;
import app.ImageRotator;
import app.ImageBrightnessAdjuster;
import app.ImageColorFilter;
import app.NegativeColorConverter;
import app.GrayScaleImage;
import app.ColorSaturator;

public class Example {
    public static void main(String[] args) {
        
        try {
            ImageEditor editor = new ImageEditor("images/hardy.png");

            ImageResizer resizer = new ImageResizer();
            BufferedImage resizedImage = resizer.resizeImage(editor.getImage(), 600, 600);
            editor.setImage(resizedImage);
            editor.saveImage("png", "images/hardy1.png");

            editor.setImage(ImageIO.read(new File("images/hardy.png")));
            ImageRotator rotator = new ImageRotator();
            BufferedImage rotatedImage = rotator.rotateImage(editor.getImage(), 45);
            editor.setImage(rotatedImage);
            editor.saveImage("png", "images/hardy2.png");

            editor.setImage(ImageIO.read(new File("images/hardy.png")));
            ImageBrightnessAdjuster brightnessAdjuster = new ImageBrightnessAdjuster();
            BufferedImage brightenedImage = brightnessAdjuster.adjustBrightness(editor.getImage(), 1.4f);
            editor.setImage(brightenedImage);
            editor.saveImage("png", "images/hardy3.png");

            editor.setImage(ImageIO.read(new File("images/hardy.png")));
            ImageColorFilter colorFilter = new ImageColorFilter();
            BufferedImage filteredImage = colorFilter.adjustColor(editor.getImage(), 1f, 0f, 1f);
            editor.setImage(filteredImage);
            editor.saveImage("png", "images/hardy4.png");

            editor.setImage(ImageIO.read(new File("images/hardy.png")));
            NegativeColorConverter colorConverter = new NegativeColorConverter();
            BufferedImage convertedImage = colorConverter.convertColors(editor.getImage());
            editor.setImage(convertedImage);
            editor.saveImage("png", "images/hardy5.png");

            editor.setImage(ImageIO.read(new File("images/hardy.png")));
            GrayScaleImage grayScaler = new GrayScaleImage();
            BufferedImage grayImage = grayScaler.grayScale(editor.getImage());
            editor.setImage(grayImage);
            editor.saveImage("png", "images/hardy6.png");

            editor.setImage(ImageIO.read(new File("images/hardy.png")));
            ColorSaturator colorSaturator = new ColorSaturator();
            BufferedImage saturatedImage = colorSaturator.saturateImage(editor.getImage(), 200);
            editor.setImage(saturatedImage);
            editor.saveImage("png", "images/hardy7.png");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}