import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import app.ColorSaturator;
import app.ImageEditor;

public class ColorSaturatorTest {

    @Test
    public void testColorSaturator() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        ColorSaturator colorSaturator = new ColorSaturator();
        BufferedImage saturatedImage = colorSaturator.saturateImage(editor.getImage(), 200);

        // Kontrollera att "mättnaden" har ändrats
        Color originalColor = new Color(editor.getImage().getRGB(0, 0));
        Color saturatedColor = new Color(saturatedImage.getRGB(0, 0));

        float[] originalHSB = Color.RGBtoHSB(originalColor.getRed(), originalColor.getGreen(), originalColor.getBlue(), null);
        float[] saturatedHSB = Color.RGBtoHSB(saturatedColor.getRed(), saturatedColor.getGreen(), saturatedColor.getBlue(), null);
    
        assertTrue(saturatedHSB[1] > originalHSB[1]);
    }
}