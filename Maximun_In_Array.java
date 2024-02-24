package practice_DSA;
import java.util.*;
public class Maximun_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int [] arr = new int[n];
	    
		int i = 0;
		while(i<arr.length) {
			arr[i] = sc.nextInt();
			i++;
		}
		System.out.print(max(arr));

	}

	public static int max1(int[] arr) {
		// TODO Auto-generated method stub
		int m = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			m = Math.max(m, arr[i]);
		}
		return m;
	}

	public static int max(int[] arr) {
		// TODO Auto-generated method stub
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}
		}
		return m;

	}

}
