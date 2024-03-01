package practice_DSA;
import java.util.*;
public class calculate_the_sum_circularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		int []temp = new int[n];
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i= 0; i<n; i++) {
			temp[i] = arr[i];
		}
		
		int q = sc.nextInt();
		while(q-->0) {
			int p = sc.nextInt();
			for(int i = 0; i<n; i++) {
				int r = i-p;
				if(r<0) {
					r = n+r;
				}
				arr[i] += temp[r];
			}
			for(int i = 0; i<n; i++) {
				temp[i] = arr[i];
			}
		}
		
		int sum = 0;
		for(int i = 0; i<n; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

	}

}
