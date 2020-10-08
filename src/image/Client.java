package image;

public class Client {
    public static void main(String[] args) {
        ProxyImage chi = new ProxyImage("Dung day");
        chi.showImage();
        MakeDecision chi1 = new ProxyMakeDecition("chi 2");
        chi1.makeDecision();
    }
}
