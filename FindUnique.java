package practice_DSA;
import java.util.*;
public class FindUnique {

	  public static void main(String args[])   
	    {   
	        int[] arr= {3, 5, 1, 3, 9, 9, 22, 4, 3, 1, 5};  
	        Arrays.sort(arr);
	  
	        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
	         
	        for (int j = 0; j < arr.length; j++) {   
	            hashmap.put(arr[j], j);   
	        }    
	        System.out.println(hashmap.keySet());   
	    
	    }   
}
