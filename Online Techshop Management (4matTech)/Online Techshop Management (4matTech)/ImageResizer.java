import javax.swing.*;
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageResizer {
	public static ImageIcon resizeImage(String fileName, int targetWidth, int targetHeight) {
        try {
            // Make sure the image file exists and can be read
            File file = new File(fileName);
            if (!file.exists() || !file.canRead()) {
                System.out.println("Cannot find or read file: " + fileName);
                return null;
            }

            Image image = ImageIO.read(file);
            Image scaledImage = image.getScaledInstance(targetWidth, targetHeight, Image.SCALE_SMOOTH);

            return new ImageIcon(scaledImage);
        } catch (Exception e) {
            // Print the stack trace to the console for debugging
            e.printStackTrace();
            return null;
        }
    }
}
