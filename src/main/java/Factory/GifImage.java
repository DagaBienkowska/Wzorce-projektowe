package Factory;

public class GifImage implements Image {

    private String imageString;

    public GifImage(String imageString) {
        this.imageString = imageString;
    }


    @Override
    public String getImage() {
        return imageString;
    }
}
