package app;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class ColorSaturator {

    public BufferedImage saturateImage(BufferedImage image, int saturation) {

        int width = image.getWidth();
        int height = image.getHeight();
        BufferedImage saturatedImage = new BufferedImage(width, height, image.getType());
        float hsb[] = new float[3];
        

        // Tar alla pixlar från bilden och byter ut dem med det nya värdet efter "mättnaden" är tillagd.
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = image.getRGB(x, y);
                
                // Förskjuter pixelns argb värde åt höger och tar de sista 8 bitarna för att få ut rätt värde för varje färg.
                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;
                
                Color.RGBtoHSB(r, g, b, hsb);
                
                hsb[1] = Math.min(1.0f, hsb[1] * (saturation / 100f));
                int saturatedRGB = Color.HSBtoRGB(hsb[0], hsb[1], hsb[2]);
                saturatedRGB = (a << 24) | (saturatedRGB & 0x00ffffff);
                
                saturatedImage.setRGB(x, y, saturatedRGB);
            }
        }
        return saturatedImage;
    }
}