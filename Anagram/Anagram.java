package Anagram;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1;
		String string2;
		
		System.out.println("Lutfen 1. kelimeyi giriniz: ");
		string1 = scanner.next();
		
		System.out.println("Lutfen 2. kelimeyi giriniz: ");
		string2 = scanner.next();
		
		if(isAnagramSort(string1, string2) == false){
			System.out.println("Kelimeler Anagram Degil!");
		}
		else {
			System.out.println("Kelimeler Anagram!");
		}
		
		scanner.close();
		
	}
	
	 static boolean isAnagramSort(String string1 , String string2){
		if(string1.length() != string2.length()){
			return false;
		}
		char[] s1 = string1.toCharArray();
		char[] s2 = string2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1, s2);
		
		
	}
	

}
