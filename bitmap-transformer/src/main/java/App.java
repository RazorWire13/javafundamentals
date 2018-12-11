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
