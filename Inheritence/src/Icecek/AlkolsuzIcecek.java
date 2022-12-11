package Icecek;

public class AlkolsuzIcecek extends Icecek{

    public AlkolsuzIcecek(String isim, String marka, double fiyat) {
        super(isim, marka, fiyat);
    }

    @Override
    public void icecekBilgileriniGoster() {
        System.err.println("Bu içecek alkol içermemektedir.");
        super.icecekBilgileriniGoster();

    }
}
