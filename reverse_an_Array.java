package practice_DSA;
import java.util.*;
public class reverse_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int[n]; 
	
		for(int i = 0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		Reverse(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void Reverse(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		
		 while(i<j) {
			 int temp = arr[i];
			 arr[i] = arr[j];
			 arr[j] = temp;
			 i++;
			 j--;
		 }
	}

}
