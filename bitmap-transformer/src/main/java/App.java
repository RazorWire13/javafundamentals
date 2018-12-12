<<<<<<< HEAD
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class App {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }

        Path imagePath = FileSystems.getDefault().getPath("resources", "test_image.bmp");
        Bitmap bmp = new Bitmap(imagePath);
        bmp.flipOnX();
//        bmp.flipOnY();
        bmp.save(FileSystems.getDefault().getPath("resources", "test_xformed.bmp"));
    }
}
=======
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


>>>>>>> 0f12528440b0df0e5e493adab063bd5f68ee9e52
