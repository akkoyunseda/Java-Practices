
public class MukemmelSayi {
	
	public static void main(String[] args) {
		int i;
		int number = 6;//sayi degistirilebilir.
		int total = 0;
		boolean isPerfect = false;
		
		for(i=1; i<number; i++){
			if(number % i == 0){
				total = total + i;
			}
		}
		
		if(total == number){
			isPerfect = true;
			System.out.println(number + " mukemmel sayidir.");
		}
		else {
			System.out.println(number +" mukemmel sayi degildir.");
		}

	}

}
