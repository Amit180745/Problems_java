package practice_DSA;
import java.text.DecimalFormat;

public class Avgofpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,3,0,-3,-6,1,-7};
		int sum =0;
		int count=0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>0) {
				sum += arr[i];
				count++;
			}
		}
		if(sum > 0) {
			double avg = (double) sum/count;
            DecimalFormat df = new DecimalFormat("#.00");  // This line limits the output upto 2 decimal places.
            System.out.print("Average is: " + df.format(avg));
//			System.out.println("Average is : " + avg);
		}else {
			System.out.println("No Positive no is present in Array");
		}

	}

}
