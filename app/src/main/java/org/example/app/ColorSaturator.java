package app;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class ColorSaturator {

    public BufferedImage saturateImage(BufferedImage image, int saturation) {

        int width = image.getWidth();
        int height = image.getHeight();
        float hsv[] = new float[3];
        
        if (saturation >= 0 && saturation <= 100) {

            // Tar alla pixlar från bilden och byter ut dem med det genomsnittliga rgb värdet för varje pixel.
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int p = image.getRGB(x, y);
                    
                    // Förskjuter pixelns argb värde åt höger och tar de sista 8 bitarna för att få ut rätt värde för varje färg.
                    int a = (p >> 24) & 0xff;
                    int r = (p >> 16) & 0xff;
                    int g = (p >> 8) & 0xff;
                    int b = p & 0xff;
                    
                    Color.RGBtoHSB(r, g, b, hsv);
                    
                    image.setRGB(x, y, Color.getHSBColor(hsv[0], saturation / 100f, hsv[2]).getRGB());
                }
            }
        }
        return image;
    }

}