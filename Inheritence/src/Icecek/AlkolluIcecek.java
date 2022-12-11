package Icecek;

public class AlkolluIcecek extends Icecek{
    private double alkolOrani;
    private double proof;

    public AlkolluIcecek(String isim, String marka, double fiyat, double alkolOrani) {
        super(isim, marka, fiyat);
        this.alkolOrani = alkolOrani;
    }

    public void alkolDerecesi(double alkolOrani){
        proof = alkolOrani*2;
        System.err.println("İçeceğin alkol derecesi: "+proof+" proof");
    }

    @Override
    public void icecekBilgileriniGoster() {
        super.icecekBilgileriniGoster();
        System.err.println("İçecekteki alkol oranı: %"+ this.alkolOrani);
        alkolDerecesi(this.alkolOrani);
    }
}
