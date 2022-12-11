import java.util.LinkedHashSet;
import java.util.Scanner;

public class CharZip {


    public static void main(String[] args) {
        zip();
    }

    private static void zip() {
        System.err.println("Kelime girin: ");
        Scanner sc = new Scanner(System.in);
        String kelime = sc.nextLine();

        LinkedHashSet<Object> count = new LinkedHashSet<>();

        for(int i = 0; i<kelime.length(); i++){
            char key = kelime.charAt(i);
            count.add(key);
        }

        count.forEach((key) -> System.err.print(key));

    }
}
