import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import app.NegativeColorConverter;
import app.ImageEditor;

public class NegativeColorConverterTest {

    @Test
    public void testColorInverter() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        NegativeColorConverter colorInverter = new NegativeColorConverter();
        BufferedImage invertedImage = colorInverter.convertColors(editor.getImage());

        // Kontrollera att några pixelvärden har ändrats
        Color originalColor = new Color(editor.getImage().getRGB(0, 0));
        Color invertedColor = new Color(invertedImage.getRGB(0, 0));

        assertNotEquals(originalColor.getRed(), brightenedColor.getRed());
        assertNotEquals(originalColor.getGreen(), brightenedColor.getGreen());
        assertNotEquals(originalColor.getBlue(), brightenedColor.getBlue());
    }
}