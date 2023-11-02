
public class Main {

	public static void main(String[] args) {
		
		// belirtilen sayı belirtilen dizide var mı yok mu?
		
		int[] sayilar = new int[] {1,2,3,4,5,7,8,9};
		int aranacak =9;
		
		boolean varMı=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMı=true;
				break;
			}
		}
		if(varMı) {
			System.out.println("Bu sayı var.");
		}else {
			System.out.println("Bu sayı yok.");
		}

	}

}
