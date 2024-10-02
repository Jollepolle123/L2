import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import app.ImageColorFilter;
import app.ImageEditor;


public class ImageColorFilterTest {

    @Test
    public void testColorFilter() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        ImageColorFilter colorFilter = new ImageColorFilter();
        BufferedImage filteredImage = colorFilter.adjustColor(editor.getImage(), 1, 1, 10);

        // Kontrollera att några pixelvärden har ändrats
        Color originalColor = new Color(editor.getImage().getRGB(0, 0));
        Color filteredColor = new Color(filteredImage.getRGB(0, 0));

        assertEquals(originalColor.getRed(), filteredColor.getRed());
        assertEquals(originalColor.getGreen(), filteredColor.getGreen());
        assertNotEquals(originalColor.getBlue(), filteredColor.getBlue());
    }
}