package SoulCare;

public class OgrenciPreUye extends PremiumUye{

    private String ogrenciMail;

    public OgrenciPreUye(String kullaniciAdi) {
        super(kullaniciAdi);
    }

    @Override
    public void setMail(String ogrenciMail) {
        this.ogrenciMail = ogrenciMail;
        super.setMail(this.ogrenciMail);
    }


    @Override
    public void ucretOde(){
       super.setAylikUcret(10.49);
       super.ucretOde();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.err.println("Üyelik Türü: Öğrenci Premium");
    }
}
