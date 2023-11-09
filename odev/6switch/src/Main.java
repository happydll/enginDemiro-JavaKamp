import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		
		System.out.println("Notunuzu giriniz: ");
		
		try {
			
			char userGradeChar ='A';
			int grade = userInput.nextInt();
			
			if (grade >= 85 && grade <= 100) {
				userGradeChar='A';	
			}
			else if (grade >= 75 && grade < 85) {
				userGradeChar='B';
			}
			else if (grade >= 65 && grade < 75) {
				userGradeChar='C';	
			}
			else if (grade >= 50 && grade < 65) {
				userGradeChar='D';
			}
			else {
				userGradeChar='F';
			}
			
			String message ="Durumunuz: ";
				
			switch (userGradeChar) {
			case 'A': 
				//System.out.println(message + "Geçtiniz");
				//break;
			case 'B':
				//System.out.println(message + "Geçtiniz");
				//break;
			case 'C':
				//System.out.println(message + "Geçtiniz");
				//break;
				//Aynı çıktıyı almak istiyorsak boş bırak ve break atmadan yazmaya devam et
			case 'D':
				System.out.println(message + "Geçtiniz");
				break;
			case 'F':
				System.out.println(message + "Kaldınız");
				break;
			default:
				System.out.println("Geçersiz not girdiniz");
			}// kullanıcı eğer not dışında bir şey girerse uygulama ekrana hata basmadan sonlanır
		}catch(java.util.InputMismatchException e) {
			System.out.println("geçersiz giriş yaptınız");
		}

	}

}

