package Palindrom;
import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String original;
		String reverse = "";
		
		System.out.println("Kelime giriniz: ");
		original = scanner.next();
		
		
		int length = original.length();
		
		for(int i=length-1; i>=0; i--){
			reverse += original.charAt(i);
		}
		
		if(reverse.equals(original)){
			 System.out.println("Girilen kelime Palindrom bir kelimedir.");
		}
		else {
            System.out.println("Girilen kelime Palindrom bir kelime degildir.");
        }
		
	}

}
