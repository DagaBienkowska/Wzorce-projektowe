package Factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class JpegImageReader implements ImageReader {
    @Override
    public Image createImage(String img) {
        return new JpegImage(img);
    }

    @Override
    public void save(Image image) {
        try {
            Files.write(Paths.get("image.jpeg"), Collections.singletonList(image.getImage()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
