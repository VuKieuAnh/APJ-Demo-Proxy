package image;

public class ProxyImage implements Image {
    private Image realImage;
    private String urlFile;

    public ProxyImage(String urlFile) {
        this.urlFile = urlFile;
        System.out.println("Anh chua dc load "+ this.urlFile);
    }

    @Override
    public void showImage() {
        if (realImage == null){
            realImage = new RealImage(this.urlFile);
        }
        else {
            System.out.println("Anh da ton tai" + this.urlFile);
        }
        realImage.showImage();
    }
}
