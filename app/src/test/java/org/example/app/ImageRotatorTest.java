import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import app.ImageRotator;
import app.ImageEditor;

public class ImageRotatorTest {

    @Test
    public void testImageRotation() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        ImageRotator rotator = new ImageRotator();
        BufferedImage rotatedImage = rotator.rotateImage(editor.getImage(), 45);

        assertNotNull(rotatedImage);
    }
}