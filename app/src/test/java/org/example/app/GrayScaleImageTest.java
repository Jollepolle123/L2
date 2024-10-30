import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import app.GrayScaleImage;
import app.ImageEditor;

public class GrayScaleImageTest {

    @Test
    public void testDifferentColors() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        GrayScaleImage greyScaler = new GrayScaleImage();
        BufferedImage greyImage = greyScaler.grayScale(editor.getImage());

        // Kontrollera att några pixelvärden har ändrats
        Color originalColor = new Color(editor.getImage().getRGB(0, 0));
        Color greyColor = new Color(greyImage.getRGB(0, 0));

        assertNotEquals(originalColor.getRed(), greyColor.getRed());
        assertNotEquals(originalColor.getGreen(), greyColor.getGreen());
        assertNotEquals(originalColor.getBlue(), greyColor.getBlue());
    }

    @Test
    public void testSameColors() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        GrayScaleImage greyScaler = new GrayScaleImage();
        BufferedImage greyImage = greyScaler.grayScale(editor.getImage());

        // Kontrollera att några pixelvärden har ändrats
        Color originalColor = new Color(editor.getImage().getRGB(0, 0));
        Color greyColor = new Color(greyImage.getRGB(0, 0));

        assertEquals(greyColor.getRed(), greyColor.getGreen());
        assertEquals(greyColor.getGreen(), greyColor.getBlue());
    }
}