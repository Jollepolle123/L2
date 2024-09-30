import java.awt.image.BufferedImage;
import java.io.IOException;

public class L2 {
    public static void main(String[] args) {
        
        try {
            ImageEditor editor = new ImageEditor("../image/robin.PNG");

            ImageResizer resizer = new ImageResizer();
            BufferedImage resizedImage = resizer.resizeImage(editor.getImage(), 600, 600);
            editor.setImage(resizedImage);
            editor.saveImage("png", "../image/robin1.PNG");

            ImageRotator rotator = new ImageRotator();
            BufferedImage rotatedImage = rotator.rotateImage(editor.getImage(), 45);
            editor.setImage(rotatedImage);
            editor.saveImage("png", "../image/robin2.PNG");

            ImageBrightnessAdjuster brightnessAdjuster = new ImageBrightnessAdjuster();
            BufferedImage brightenedImage = brightnessAdjuster.adjustBrightness(editor.getImage(), 1.5f);
            editor.setImage(brightenedImage);
            editor.saveImage("png", "../image/robin3.PNG");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}