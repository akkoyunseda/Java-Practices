package SoulCare;

public class NormalPreUye extends PremiumUye{

    public NormalPreUye(String kullaniciAdi) {
        super(kullaniciAdi);
    }

    @Override
    public void ucretOde() {
        super.setAylikUcret(20.99);
        super.ucretOde();
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.err.println("Üyelik Türü: Standart Premium");
    }
}
