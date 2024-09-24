package practice_DSA;

import java.util.*;

public class nqt1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n-2; i++) { 
            int sum = arr[i] + arr[i + 2];
            if (sum > max) {
                max = sum; 
            }
        }
        System.out.println(max);
    }
}
