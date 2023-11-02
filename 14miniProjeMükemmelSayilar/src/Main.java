
public class Main {

	public static void main(String[] args) {
		
		//Mükemmel sayı mıdır?
		
		/*
		Tanım
		Mükemmel sayılar tüm pozitif tam bölenlerinin toplamına
		eşit olan sayılardır
		
		örn 6 --> 1,2,3 mükemmel sayıdır
		örn 28 --> 1,2,4,7,14 mükemmel sayıdır 
		*/
	
		int number=29;
		int total =0;
		
		for(int i=1;i<number;i++) {
			if(number % i ==0) {
				total=total+i;
			}
		}
		
		if(total == number) {
			System.out.println("Bu sayı mükemmel sayıdır.");
		}else {
			System.out.println("Bu sayı mükemmel sayı değildir.");
		}
		
	}

}
