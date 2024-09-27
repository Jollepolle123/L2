import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageEditor {

    // Läser in bilden som skickas in.
    public BufferedImage readImage(String filePath) throws IOException {
        return ImageIO.read(new File(filePath));
    }

    // Sparar bilden till satt format och "path".
    public void saveImage(BufferedImage image, String imageFormat, String outPutPath) throws IOException {
        ImageIO.write(image, imageFormat, new File(outPutPath));
    }

    // Ändrar bildernas höjd och bredd.
    public BufferedImage resizeImage(BufferedImage image, int width, int height) {
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage bufferedImage = new BufferedImage(width, height, image.getType());
        Graphics2D g2d = bufferedImage.createGraphics();
        g2d.drawImage(resizedImage, 0, 0, null);
        g2d.dispose();
        return bufferedImage;
    }

}