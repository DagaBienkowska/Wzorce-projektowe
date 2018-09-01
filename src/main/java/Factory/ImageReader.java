package Factory;

public interface ImageReader {

    Image createImage(String img);
    void save(Image image);
}
