package package3;

public class PairOfNum {

	public static void main(String[] args) {
		
		int[] arr = {4, 5, 7, 11, 9, 13, 8, 12};
		
		System.out.println("Pair of Elements in the array are: ");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == 20) {
			System.out.println(arr[i]+","+arr[j]);
			
			}
		}

		}
		
	}
	
}
