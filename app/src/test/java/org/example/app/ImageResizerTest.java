import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageResizerTest {

    @Test
    public void testImageResizing() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        ImageResizer resizer = new ImageResizer();
        BufferedImage resizedImage = resizer.resizeImage(editor.getImage(), 200, 200);

        assertEquals(200, resizedImage.getWidth());
        assertEquals(200, resizedImage.getHeight());
    }
}