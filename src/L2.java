import java.io.File;
import java.awt.*; 
import java.awt.image.BufferedImage; 
import javax.imageio.ImageIO;

public class L2 {

    public static void main(String[] args) {

        System.out.println("hej");

        try {

            File inputFile = new File("../image/robin.PNG"); 
            BufferedImage originalImage = ImageIO.read(inputFile); 
            
            int width = 1500;
            int height = 600;
            BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); 
            Graphics2D g2d = resizedImage.createGraphics(); 
            g2d.drawImage(originalImage, 0, 0, width, height, null); 
            g2d.dispose(); 
 
            File outputFile = new File("../image/robin2.PNG"); 
            ImageIO.write(resizedImage, "png", outputFile); 

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());

        }

    }
}