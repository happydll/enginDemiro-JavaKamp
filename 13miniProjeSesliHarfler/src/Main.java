
public class Main {

	public static void main(String[] args) {
		//ünlü harf kalın sesli mi ince sesli mi?
		
		char harf='Ö';
		
		String message="kalındır";
		String message2="incedir";
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(message);
			break;
		default:
			System.out.println(message2);
			break;
		}
		
		
	}

}
