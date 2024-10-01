import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import app.ImageBrightnessAdjuster;


public class ImageBrightnessAdjusterTest {

    @Test
    public void testBrightnessAdjustment() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        ImageBrightnessAdjuster brightnessAdjuster = new ImageBrightnessAdjuster();
        BufferedImage brightenedImage = brightnessAdjuster.adjustBrightness(editor.getImage(), 1.2f);

        // Kontrollera att några pixelvärden har ändrats
        Color originalColor = new Color(editor.getImage().getRGB(0, 0));
        Color brightenedColor = new Color(brightenedImage.getRGB(0, 0));

        assertNotEquals(originalColor.getRed(), brightenedColor.getRed());
        assertNotEquals(originalColor.getGreen(), brightenedColor.getGreen());
        assertNotEquals(originalColor.getBlue(), brightenedColor.getBlue());
    }
}