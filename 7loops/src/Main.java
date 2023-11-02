
public class Main {

	public static void main(String[] args) {
		
		//For
		/*
		
		Tanımı:
		
		for(sayaç tanımı; şart tanımı; sayacın nasıl artacağı){
			döngü sürecinde ne yapılacaksa;
		}
		
		*/
		
		
		for(int i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		
		for(int a=1; a<10; a+=2) {
			System.out.println(a);
		}
		System.out.println("For döngüsü bitti");
		
		
		//While
		
		/*
		Tanımı:
		
		while(koşul){
			döngü sürecinde ne yapılacaksa
		}
		*/
		
		//her döngü o blok içinde geçerlidir
		//eğer while döngüsüünde de i yi kullanmak istiyorsak onu yukarısında tanımlamalıyız.		
		
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++; //bunu yazmasaydık döngü bir infinity loop olurdu
		}
		System.out.println("While dögüsü bitti");
		
		
		//Do-While
		
		/*
		Tanımı:
		
		do{
			döngü sürecinde ne olacağı
		}while(koşul);
		
		*/
		
		//int i=1;
		do {
			System.out.println(i);
			i+=3;
		}while(i<10);
		System.out.println("Do-While döngüsü bitti");
		
		//Do-While ın Whiledan farkı şart sağlanmasa bile 1 kez çalışır.
	}

}
