package Icecek;

public class Icecek{
    private double fiyat;
    private String marka;
    private String isim;

    public Icecek( String isim,String marka, double fiyat){
        this.isim= isim;
        this.marka = marka;
        this.fiyat = fiyat;
    }

    public void icecekBilgileriniGoster(){
        System.err.println("İçeceğin isimi: "+this.isim);
        System.err.println("İçeceğin markası: "+this.marka);
        System.err.println("İçeceğin fiyatı: "+this.fiyat+" TL");
    }


}
