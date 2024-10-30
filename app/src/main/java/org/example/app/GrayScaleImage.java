package app;

import java.awt.image.BufferedImage;

public class GrayScaleImage {
    public BufferedImage grayScale(BufferedImage image) {
        int width = image.getWidth(); 
        int height = image.getHeight(); 
        
        // Tar alla pixlar från bilden och byter ut dem med det genomsnittliga rgb värdet för varje pixel.
        for (int y = 0; y < height; y++) { 
            for (int x = 0; x < width; x++) { 
                int p = image.getRGB(x, y); 

                // Förskjuter pixelns argb värde åt höger och tar de sista 8 bitarna för att få ut rätt värde för varje färg.
                int a = (p >> 24) & 0xff; 
                int r = (p >> 16) & 0xff; 
                int g = (p >> 8) & 0xff; 
                int b = p & 0xff; 
                
                int avg = (r + g + b) / 3;
                
                p = (a << 24) | (avg << 16) | (avg << 8) | avg; 
                image.setRGB(x, y, p); 
            } 
        } 
        return image;
    }
}