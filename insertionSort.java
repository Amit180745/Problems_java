package practice_DSA;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 5, 3, 4, 6, 7, -1 };

		for(int i=1; i<arr.length; i++) {
			int temp =arr[i];
			int j= i-1;
			while(j>=0 && arr[i]>temp) {
				arr[j+1] = arr[j];
				j--;

			}
			arr[j+1]=temp;
			System.out.print(arr[i] + " ");
		}

	}

}
