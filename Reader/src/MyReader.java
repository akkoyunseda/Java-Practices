import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyReader{

    public ArrayList<String> readWords(String path) throws IOException{
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        ArrayList<String> kelimeler = new ArrayList<>();

        while (scanner.hasNext()) {
            kelimeler.add(scanner.next());
        }
        return kelimeler;
    }

    public String readLineAt(String path, int satirNo) throws IOException {

        int counter = 0;
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        String satir = scanner.nextLine();

        while (satir != null) {
            counter++;
            if (counter == satirNo) {
                break;
            }
            satir = scanner.nextLine();
        }

        return satir;
    }
}
