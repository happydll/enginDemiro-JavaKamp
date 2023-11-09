
public class Main {

	public static void main(String[] args) {
		//Arkadaş sayı mı?
		
		/*
		 Tanım
		 
		 a ve b birbirinden farklı sayılar olsun
		 1den başlayıp a ya kadar olan (a dahil değil)
		 pozitif tam bölenlerinin toplamı b
		 
		 1den başlayıp b ye kadar olan pozitif tam bölenlerinin toplamı a olan
		 sayılar arkadaş sayılardır.
		 örn 220 ve 284 sayıları arkadaştırlar.
		 */

		int sayi1=220;
		int sayi2=284;
		
		String message="Bu sayılar arkadaş sayılardır.";
		String message2="Bu sayılar arkadaş sayılar değildir.";
				
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1 % i==0) {
				toplam1=toplam1+i;
			}
		}
		
		for(int j=1;j<sayi2;j++) {
			if(sayi2 % j ==0) {
				toplam2=toplam2+j;
			}
		}
		
		if(toplam1==sayi2 && toplam2==sayi1) {
			System.out.println(message);
		}else {
			System.out.println(message2);
		}
	}

}
