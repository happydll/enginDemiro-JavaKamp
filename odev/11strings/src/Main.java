
public class Main {

	public static void main(String[] args) {
		
		//stringler bir char arraydir.
		String message = "bugün hava çok güzel.";
		
		System.out.println(message);
		
		System.out.println("-------------");
		
		System.out.println("Eleman sayısı: " + message.length());
		
		System.out.println("-------------");
		
		System.out.println("5. eleman: "+ message.charAt(4));
		
		System.out.println("-------------");
		
		//iki metini birleştirmek istersek
		System.out.println(message.concat(" Yaşasın!"));

		System.out.println("-------------");
		
		//bu string a ile başlıyor mu 
		System.out.println(message.startsWith("b"));
		//java keys sensitive bir dil.
		
		System.out.println("-------------");
		
		//bu string ! le bitiyor mu?
		System.out.println(message.endsWith("!"));
		
		System.out.println("-------------");
		
		//stringin belli bir bölümünü belirlediğimiz bir kadakter dizisine atmak istersek
		char[] karakter = new char[15];
		message.getChars(4,11,karakter,0);
		
		System.out.println(karakter);
		
		System.out.println("-------------");
		//çok önemli bir fonksiyon
		//ister char olarak ister string olarak tanımla 
		//bu verilen karakterin stringin kaçıncı elamanı olduğunu söyler
		System.out.println(message.indexOf("ü"));
		
		System.out.println(message.indexOf('a'));
		//ilk bulduğu karakteri verir ve sonlanır
		
		//bu fonksiyon da karakteri aramaya dizinin sonundan başlar
		System.out.println(message.lastIndexOf("a"));
		
		System.out.println("-------------");
		
		//string içerisindeki bir karakteri değiştirmek istersek
		String newMessage = message.replace(' ', '-');
		System.out.println(newMessage);
		
		System.out.println("-------------");
		
		//stringin içinden bir bölümü almak istersek
		
		System.out.println(message.substring(2));
		
		//stringin sonuna kadar almak yerine sance belirli bölümü almak istersek
		
		System.out.println(message.substring(2,4));
		
		System.out.println("-------------");
		
		//stringi beliri bir noktadan parçalara ayırmak istersek
		
		for(String word: message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println("-------------");
		
		//stingteki tüm karaktereri küçük harfe çevirmek istersek
		
		System.out.println(message.toLowerCase());
		
		//stringteki tüm ifadeleri büyük harfe çevirmek istersek
		
		System.out.println(message.toUpperCase());
		
		System.out.println("-------------");
		
		//Önemli
		//bir yerden veri çektiğimiz zaman stringin başında
		//ya da sonunda kaynak uyuşmazlığından dolayu boşluklar olabilir.
		//bu boşlukları trim fonksiyonuyla atabiliriz
		
		String db1="   Ali Yılmaz    ";
		System.out.println(db1);
		System.out.println(db1.trim());
		
	}

}
