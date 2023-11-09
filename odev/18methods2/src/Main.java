
public class Main {

	public static void main(String[] args) {
		
		String message= "Bugün hava çok güzel.";
		//String newMessage= message.substring(0,2);
		//String newMessage= add(); //string olan bir değere void olan bir oparasyon atayamazsın.
		//String newMessage= number(); //string olan bir değere int döndüren bir oparasyon atayamazsın.
		String newMessage= name();
		//int newNumber= number();
		int newNumber= adding(5, 7);
		
		System.out.println(newMessage);
		System.out.println(newNumber);
		
		int total= adding2(1,2,4,6,7,9,111);
		
		System.out.println(total);

	}
	
	public static void add() {
		System.out.println("eklendi");
	}
	
	public static void delete() {
		System.out.println("silindi");
	}
	
	public static void update() {
		System.out.println("güncellendi");
		
	}
	public static int number() {
		return 5;

	}
	
	public static int adding(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int adding2(int... sayilar) { //variable arguments
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	public static String name() {
		return "ali";
	}
}
