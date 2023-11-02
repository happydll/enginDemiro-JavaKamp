
public class Main {

	public static void main(String[] args) {
		
		double[] mylist = {1.2,1.3,2.1,11.1,4.5,5.6};
		
		//1. Bu listedeki verileri ekrana yazdır
	
		for(double number:mylist) {
			System.out.println(number);
		}
		
		//2. Bu listedeki verilerin toplamını yazdır
		
		double total=0;
		
		for(double number:mylist) {
			total=total+number;
		}
		System.out.println("Toplam: " + total);

		//3 bu dizinin ortalamasını yazdır
		
		double average=0;
		
		for(double number:mylist) {
			total=total+number;
			average= total/mylist.length;
		}
		System.out.println("Ortalama: " + average);
		
		//4 bu dizi içindeki en büyük sayıyı yazdır
		
		double max = mylist[0];
		
		for(double number:mylist) {
			if(max< number) {
				max=number;
				}
			}
		System.out.println("En büyük sayı: "+ max);
		
	}

}