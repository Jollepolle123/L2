import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageRotatorTest {

    @Test
    public void testImageRotation() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        ImageRotator rotator = new ImageRotator();
        BufferedImage rotatedImage = rotator.rotateImage(editor.getImage(), 60);

        assertNotNull(rotatedImage);
    }
}