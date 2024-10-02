import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageEditorTest {

    @Test
    public void testImageLoading() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        assertNotNull(editor.getImage());
    }

    @Test
    public void testImageSaving() throws IOException {
        ImageEditor editor = new ImageEditor("images/hardy.png");
        editor.saveImage("png", "images/hardyTest.png");
        File file = new File("images/hardyTest.png");
        assertTrue(file.exists());
    }
}