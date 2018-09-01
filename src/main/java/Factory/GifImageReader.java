package Factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class GifImageReader implements ImageReader {
    @Override
    public Image createImage(String img) {
        return new GifImage(img);
    }

    @Override
    public void save(Image image) {
        try {
            Files.write(Paths.get("image.gif"), Collections.singletonList(image.getImage()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
