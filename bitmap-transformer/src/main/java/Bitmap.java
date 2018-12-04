import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;

public class Bitmap {

    public Path path;
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


