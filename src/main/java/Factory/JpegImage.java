package Factory;

public class JpegImage implements Image {

    private String imageString;

    public JpegImage(String imageString) {
        this.imageString = imageString;
    }

    @Override
    public String getImage() {
        return imageString;
    }
}
