package package3;

public class StringOccurance {

	public static void main(String[] args) {
		
		String s = "Manasqa";
		
		int count;
		
		String[] arr = s.split("");
		int temp=1;
		String s2 ="";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
				//m is equals to a, m equals n ...etc
					temp=temp+1;
				}
				
			}
			if(s2.contains(arr[i])==false) {
				System.out.println(arr[i]+"="+temp);
				s2 = s2+arr[i];
			}
			temp=1; //reset to 1 as temp value increments if it has multiple value
			
			
		}
	}
}
