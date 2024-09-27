import java.awt.image.BufferedImage;
import java.io.IOException;

public class L2 {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        
        try {

            BufferedImage image = editor.readImage("../image/robin.PNG");

            BufferedImage resizedImage = editor.resizeImage(image, 200, 200);
            editor.saveImage(resizedImage, "png", "../image/robin1.PNG");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}