package practice_DSA;
import java.util.*;
public class Target_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr =  new int[n];
		int i = 0;
		while(i<arr.length) {
			arr[i] = sc.nextInt();
			i++;
		}
		System.out.println();
		PairSum(arr);

	}
	public static void PairSum(int []arr) {
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int i = 0;
		int j = arr.length - 1;
		while(i<j) {
			int sum = arr[i] + arr[j];
			if(sum == target) {
				System.out.println(arr[i] + " and " + arr[j]);
			}
			i++;
			j--;
		}
	}

}
