import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
<<<<<<< HEAD
import java.io.IOException;
=======
import java.io.File;
>>>>>>> 0f12528440b0df0e5e493adab063bd5f68ee9e52
import java.nio.file.Path;

public class Bitmap {

    public Path path;
<<<<<<< HEAD
    public BufferedImage imageData;

    public Bitmap(Path imagePath) {
        this.path = imagePath;
        BufferedImage img = null;
        try {
            img = ImageIO.read(imagePath.toFile());
            this.imageData = img;
        } catch (IOException e) {
        }
    }

    public void flipOnX() {
        for (int i = 0; i < this.imageData.getWidth(); i++) {
            for (int j = 0; j < this.imageData.getHeight() / 2; j++) {
                int temp = this.imageData.getRGB(i,j);
                this.imageData.setRGB(i,j, this.imageData.getRGB(i, this.imageData.getWidth() - j - 1));
                this.imageData.setRGB(i, this.imageData.getWidth() - j - 1, temp);
            }
        }
    }

    public void flipOnY() {
        for (int i = 0; i < this.imageData.getWidth(); i++) {
            for (int j = 0; j < this.imageData.getHeight(); j++) {
                int temp = this.imageData.getRGB(i,j);
                this.imageData.setRGB(i,j, this.imageData.getRGB(j, this.imageData.getWidth() - i - 1));
                this.imageData.setRGB(i, this.imageData.getWidth() - i - 1, temp);
            }
        }
    }

    public boolean save(Path savePath) {
        try {
            return ImageIO.write(imageData, "bmp", savePath.toFile());
        } catch (IOException e) {

        }
        return false;
    }
}
=======
    public BufferedImage imageData; {
     this.imageData = imageData;
    }

    public Bitmap(Path imagePath) {
        this.path = imagePath;
        // reads in file and save that dat ain a buffer
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(""))
    }

    public void flipHorizontally() {
        // flip image on instance variable logic
    }

    public boolean save( Path savePath) {
        // output instance variable data into a file at the save path
        return false;

    }

}


>>>>>>> 0f12528440b0df0e5e493adab063bd5f68ee9e52
