package Icecek;

import java.util.HashMap;

public class MeyveSuyu extends AlkolsuzIcecek {

    private String meyve;
    private String vitamin;


    public void hangiVitamin(){
        HashMap<String, String> meyveler = new HashMap<>();
        meyveler.put("elma","C ve E");
        meyveler.put("şeftali", "C");
        meyveler.put("kayısı","A,B ve C");
        meyveler.put("portakal","C");
        meyveler.put("vişne","A");
        meyveler.put("çilek","A,C ve E");

        meyve = meyve.toLowerCase();
        String[] dMeyve = meyve.split(",");
        for (String m: dMeyve){
            if (meyveler.containsKey(m)){
                vitamin = meyveler.get(m);
                System.err.println( m+": "+vitamin+" vitamini içerir.");
            }
            else{
                System.err.println(m+": içerdiği vitamin bilgisi mevcut değil.");
            }
        }


    }

    public MeyveSuyu(String kategori, String marka, double fiyat, String meyve) {
        super( kategori, marka, fiyat);
        this.meyve = meyve;
    }

    @Override
    public void icecekBilgileriniGoster() {
        super.icecekBilgileriniGoster();
        System.err.println("İçerdiği meyveler: "+this.meyve);

    }

    public String getVitamin() {
        return vitamin;
    }

    public void setMeyve(String meyve) {
        this.meyve = meyve;
    }

    public String getMeyve() {
        return meyve;
    }
}
