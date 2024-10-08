package practice_DSA;
import java.util.*;
public class uniqueFromsetofGivenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i<n; i++){
		a[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> countMap = new HashMap<>();
		for(int num : a){
		countMap.put(num, countMap.getOrDefault(num,0) + 1);
		}
		for(Map.Entry<Integer,Integer>entry : countMap.entrySet()){
		if(entry.getValue() == 1){
		System.out.println(entry.getKey());
		break;
		}
		}
		sc.close();

	}

}
