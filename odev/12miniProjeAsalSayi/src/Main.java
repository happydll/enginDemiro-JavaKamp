
public class Main {

	public static void main(String[] args) {
		//sayı asal mı değil mi
		
		int number=7;
		boolean isPrime=true;
		
		String message1="Asal sayıdır";
		String message2="Asal sayı değildir";
		
		if(number==1) {
			System.out.println(message2);
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number % i == 0) {
				isPrime=false;
			}
		}
		
		if(isPrime==true) {
			System.out.println(message1);
		}else {
			System.out.println(message2);
		}
		
		
	}

}
