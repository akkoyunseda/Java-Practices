import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        harftenSayi();
        harftenSayi2();
    }

    private static void harftenSayi() {
        String kelime = new Scanner(System.in).nextLine();
        kelime = kelime.toLowerCase();


        String unlu = "aeıioöuü";
        char[] sayi = {'1', '2', '3', '4', '5', '6', '7', '8'};

        for (int i = 0; i < kelime.length(); i++) {
            for (int j = 0; j < unlu.length(); j++) {

                if (kelime.charAt(i) == unlu.charAt(j)) {
                    kelime = kelime.replace(kelime.charAt(i), sayi[j]);
                }
            }
        }
        System.err.println(kelime);
    }

    private static void harftenSayi2()//switch case ile
    {
        String kelime = new Scanner(System.in).nextLine();
        kelime = kelime.toLowerCase();

        for (int i = 0; i < kelime.length(); i++){
            switch (kelime.charAt(i)){
                case 'a': kelime = kelime.replace(kelime.charAt(i),'1');break;
                case 'e': kelime = kelime.replace(kelime.charAt(i),'2');break;
                case 'ı': kelime = kelime.replace(kelime.charAt(i),'3');break;
                case 'i': kelime = kelime.replace(kelime.charAt(i),'4');break;
                case 'o': kelime = kelime.replace(kelime.charAt(i),'5');break;
                case 'ö': kelime = kelime.replace(kelime.charAt(i),'6');break;
                case 'u': kelime = kelime.replace(kelime.charAt(i),'7');break;
                case 'ü': kelime = kelime.replace(kelime.charAt(i),'8');break;
                default: continue;

            }
        }
        System.err.println(kelime);
    }
}
