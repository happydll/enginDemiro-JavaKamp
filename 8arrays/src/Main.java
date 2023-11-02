
public class Main {

	public static void main(String[] args) {
		
		String ogrenci1="Ali";
		String ogrenci2="Veli";
		String ogrenci3="Ayşe";
		String ogrenci4="Fatma";
		
		//System.out.println(ogrenci1);
		//System.out.println(ogrenci2);
		//System.out.println(ogrenci3);
		//System.out.println(ogrenci4);
		
		String[] ogrenciler= new String[4];
		ogrenciler[0]="Ali";
		ogrenciler[1]="Veli";
		ogrenciler[2]="Ayşe";
		ogrenciler[3]="Fatma";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		//kullanman gereken yöntem
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
	}

}
