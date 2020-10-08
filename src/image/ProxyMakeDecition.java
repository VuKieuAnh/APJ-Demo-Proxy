package image;

public class ProxyMakeDecition implements MakeDecision {
    private MakeDecision makeDecision;
    private String urlFile;

    public ProxyMakeDecition(String urlFile) {
        this.urlFile = urlFile;
        System.out.println("Anh chua dc load "+ this.urlFile);
    }

    @Override
    public void makeDecision() {
        if (makeDecision == null){
            makeDecision = new RealImage(this.urlFile);
        }
        else {
            System.out.println("Quyet dinh" + this.urlFile);
        }
        makeDecision.makeDecision();
    }
}
