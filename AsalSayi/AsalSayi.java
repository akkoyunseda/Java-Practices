
public class AsalSayi {

	public static void main(String[] args) {
		int number = 13; //sayi degistirilebilir.
		int i;
		boolean isPrime = true;
		
		for(i=2; i<number; i++ ){
			if(number % i == 0 || number < 2){
				isPrime = false;
				System.out.println( number + " sayisi asal degil.");
			}
			else {
				System.out.println( number + " sayisi asaldir.");
			}
		}

	}

}
