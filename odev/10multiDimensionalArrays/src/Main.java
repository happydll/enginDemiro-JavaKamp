
public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[3][3];
		
		sehirler[0][0] = "İzmir";
		sehirler[0][1] = "Aydın";
		sehirler[0][2] = "Muğla";
		sehirler[1][0] = "Samsun";
		sehirler[1][1] = "Zonguldak";
		sehirler[1][2] = "Rize";
		sehirler[2][0] = "Ankara";
		sehirler[2][1] = "Konya";
		sehirler[2][2] = "Eskişehir";
		
		for(int i=0;i<=2;i++) {
			System.out.println("-------------");
			for(int l=0;l<=2;l++) {				
				System.out.println(sehirler[i][l]);
			}
		}
	}

}
