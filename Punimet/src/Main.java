public class Main {

	public static void main(String[] args) {
//		for(int i =1;i<=4;i++) {
//			for(int k = 1; k <= 7;k++) {
//				System.out.print(i*k + " ");
//			}
//			System.out.println("");
//		}
//		int k = 1;
//		while(k <= 5) {
//			int z =1;
//			while(z <=5) {
//				System.out.print(k*z + " ");
//				z++;
//			}
//			System.out.println("");
//			k++;
//		}
//		System.out.println(printo("Denis"));
//		String x = printo("john");
//		System.out.println(x);
		
		int[] numrat = {1,2,3,4,5,6};
		mesatarja(numrat);
		minMax(numrat);
	}
	
	public static void mesatarja(int[] arr) {
		double shuma = 0;
		double rez = 0;
		
		for(int nr : arr) {
			shuma+=nr;
		}
		rez = shuma /arr.length;
		System.out.println("Mesatarja: " + rez);
	}
	public static void minMax(int[] arr) {
		int nrMin = arr[0];
		int nrMax = arr[0];
		for(int nr : arr) {
			if(nr > nrMax) {
				nrMax =nr;
			}
			if(nr < nrMin) {
				nrMin = nr;
			}
		}
		System.out.println("Vlera Max: " + nrMax);
		System.out.println("Vlera Min: " + nrMin);
	}
}