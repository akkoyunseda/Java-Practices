package SoulCare;

public class NormalUye extends Uye implements Standart {

    private int sarkiAtlamaHakki;

    public NormalUye(String kullaniciAdi) {
        super(kullaniciAdi);
        setSarkiAtlamaHakki(4);
    }

    public void setSarkiAtlamaHakki(int sarkiAtlamaHakki) {
        this.sarkiAtlamaHakki = sarkiAtlamaHakki;
    }


    @Override
    public void sarkiAtla() {
        if(this.sarkiAtlamaHakki == 0){
            System.err.println("Günlük şarkı atlama hakkınız kalmamıştır.");
        }
        else {
            System.err.println("Şarkı atlandı, yeni şarkıya geçildi.");
            System.err.println("Günlük kalan şarkı atlama hakkınız: "+(this.sarkiAtlamaHakki-1));
            this.sarkiAtlamaHakki--;
        }

    }

    @Override
    public void reklamDinle() {
        System.err.println("Reklam dinlemekten sıkıldınız mı?");
        System.err.println("Siz de üyeliğinizi premiuma yükselterek reklamsız müziğin tadını çıkarabilirsiniz.");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.err.println("Üyelik türü: Standart");
        System.err.println("Şarkı atlama hakkı: "+this.sarkiAtlamaHakki);
    }
}
