package bubblesort;


public class bubblesort {		
	public static void main(String[] args) {
		int arr[] = {7,6,5,4,3,1,2};
		int length = arr.length;
		for(int i = 0;i < length - 1; i++) {
			for(int j = 0;j < length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int kk = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = kk;
				}
			}
		}
		
		for(int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
 }