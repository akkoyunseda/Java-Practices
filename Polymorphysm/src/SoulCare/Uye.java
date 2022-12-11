package SoulCare;

public class Uye implements Ortak {
    private final String kullaniciAdi;
    private String sifre;
    private String mail;

    public Uye(String kullaniciAdi){
        this.kullaniciAdi = kullaniciAdi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void getInfo(){
        System.err.println("Kullanıcı adı: "+this.kullaniciAdi);
        System.err.println("Mail adresi: "+this.mail);
    }


    public void muzikDinle(String sarkiAdi)
    {
        System.err.println(this.kullaniciAdi+", '"+sarkiAdi+"' şarkısını dinliyor.");
    }

    @Override
    public void favoriEkle() {

    }

    @Override
    public void favoriKaldir() {

    }

    @Override
    public void calmaListesiOlustur() {

    }

    @Override
    public void calmaListesiKaldir() {

    }

    @Override
    public void sarkiAtla() {

    }
}
