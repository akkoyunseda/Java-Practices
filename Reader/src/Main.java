import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        kelimeOku();
        satirOku();

    }

    private static void kelimeOku() throws IOException{
        MyReader myReader = new MyReader();
        ArrayList<String> kelimeler = myReader.readWords("src/dosya.txt");

        for (String s : kelimeler) {
            System.err.print(s + " ");
        }
    }

    private static void satirOku() throws IOException {
        MyReader myReader = new MyReader();
        String satir = myReader.readLineAt("src/dosya.txt", 4);
        System.err.println(satir);

    }

}