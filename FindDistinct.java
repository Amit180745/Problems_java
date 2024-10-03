package practice_DSA;

import java.util.Arrays;

public class FindDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,2,3,1,4,18,4};
		
		Arrays.sort(arr);
		for(int i = 0; i<arr.length; i++) {
			int j;
			for(j=0;j<i;j++) 
				if(arr[i]==arr[j]) 
					break;
					
				if(i==j) 
				System.out.print(arr[i] + " ");
				
	
		}
	}

}
