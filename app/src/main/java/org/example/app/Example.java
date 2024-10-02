import java.awt.image.BufferedImage;
import java.io.IOException;

import app.ImageEditor;
import app.ImageResizer;
import app.ImageRotator;
import app.ImageBrightnessAdjuster;

public class Example {
    public static void main(String[] args) {
        
        try {
            ImageEditor editor = new ImageEditor("images/hardy.png");

            ImageResizer resizer = new ImageResizer();
            BufferedImage resizedImage = resizer.resizeImage(editor.getImage(), 600, 600);
            editor.setImage(resizedImage);
            editor.saveImage("png", "images/hardy1.png");

            ImageRotator rotator = new ImageRotator();
            BufferedImage rotatedImage = rotator.rotateImage(editor.getImage(), 45);
            editor.setImage(rotatedImage);
            editor.saveImage("png", "images/hardy2.png");

            ImageBrightnessAdjuster brightnessAdjuster = new ImageBrightnessAdjuster();
            BufferedImage brightenedImage = brightnessAdjuster.adjustBrightness(editor.getImage(), 1.4f);
            editor.setImage(brightenedImage);
            editor.saveImage("png", "images/hardy3.png");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}