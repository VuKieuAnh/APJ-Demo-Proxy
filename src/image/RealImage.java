package image;

public class RealImage implements Image, MakeDecision {
    private String urlFile;

    public RealImage(String urlFile) {
        this.urlFile = urlFile;
        System.out.println("Tao moi anh" + this.urlFile);
    }

    @Override
    public void showImage() {
        System.out.println("Anh dc show " + this.urlFile);
    }

    @Override
    public void makeDecision() {
        System.out.println("Dung ra quyet dinh");
    }
}
