import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Bitmap {

    public static void main(String[] args) {

        System.out.println(args[0]);
        // grab image
        Path imagePath = FileSystems.getDefault().getPath("res","img.bmp");
        // read image
        Bitmap bmp = new Bitmap(imagePath);
        // tranform image
        bmp.flipHorizontally();
        // output image
        bmp.save(FileSystems.getDefault().getPath("res", "img_after.bmp"));


        }
    }

    public static String getBitmap() {

    }

    public static File readImage() {

    }

    public static File tranformBitmap() {

    }

    public static void putBitma() {

    }
}


