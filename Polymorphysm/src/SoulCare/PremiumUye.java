package SoulCare;

public class PremiumUye extends Uye implements PremiumOzel{

    private String sarkiIsmi;
    public void setSarkiIsmi(String sarkiIsmi) {
        this.sarkiIsmi = sarkiIsmi;
    }

    public PremiumUye(String kullaniciAdi) {
        super(kullaniciAdi);
    }


    private double aylikUcret;
    public void setAylikUcret(double aylikUcret) {
        this.aylikUcret = aylikUcret ;
    }

    @Override
    public void ucretOde(){
        System.err.println(this.aylikUcret+" TL ücret ödendi.");
    }

    @Override
    public void cevrimdisiDinle() {


    }

    @Override
    public void sarkiIndir(){
        System.err.println(sarkiIsmi+" şarkısı indirildi.");
    }


    @Override
    public void sarkiAtla(){
        System.err.println("Şarkı atlandı, yeni şarkıya geçiliyor.");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.err.println("Aylık Ödenen Ücret: "+this.aylikUcret);
    }
}
