package Icecek;

public class Sarap extends AlkolluIcecek{

    private double sekerOrani;
    private String meyveCesidi;


    public Sarap(String isim, String marka, double fiyat, String meyveCesidi, double alkolOrani, double sekerOrani){
        super( isim,marka, fiyat, alkolOrani);
        this.meyveCesidi = meyveCesidi;
        this.sekerOrani = sekerOrani;

    }

    public void sarapTuru(double sekerOrani){
        System.err.print("Şarabın Türü: ");
        if(sekerOrani>0 && sekerOrani<=0.4){
            System.err.print("Sek (Dry) Şarap");
        }
        else if(sekerOrani>=0.5 && sekerOrani<2){
            System.err.print("Dömisek (Yarı Şekerli) Şarap");
        }
        else if (sekerOrani>=2 && sekerOrani<7){
            System.err.print("Tabii Tatlı Şarap");
        }
        else if (sekerOrani>=7 && sekerOrani<12){
            System.err.print("Likör (Çerez) Şarap");
        }
        else if (sekerOrani>=12 && sekerOrani<22){
            System.err.print("Mistel Şarap");
        }
        else{
            System.err.print("Şarabın türü bilinmiyor.");
        }

    }

    @Override
    public void icecekBilgileriniGoster() {
        super.icecekBilgileriniGoster();
        System.err.println("Yapıldığı meyve çeşidi: "+this.meyveCesidi);
        System.err.println("Şarabın şeker oranı: %"+ this.sekerOrani);

    }

    public double getSekerOrani() {
        return sekerOrani;
    }

    public void setSekerOrani(double sekerOrani) {
        this.sekerOrani = sekerOrani;
    }

    public String getMeyveCesidi() {
        return meyveCesidi;
    }

    public void setMeyveCesidi(String meyveCesidi) {
        this.meyveCesidi = meyveCesidi;
    }
}

