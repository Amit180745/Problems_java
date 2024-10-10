package practice_DSA;
import java.util.HashMap;
import java.util.Map;
public class findduplicate {

		    public static void main(String[] args) {
		        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 8, 9};
		        Map<Integer, Integer> elementCount = new HashMap<>();

		        for (int element : array) {
		            elementCount.put(element, elementCount.getOrDefault(element, 0) + 1);
		        }

		        System.out.print("Duplicate elements: ");
		        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
		            if (entry.getValue() > 1) {
		                System.out.print(entry.getKey() + " ");
		            }
		        }
		        System.out.println();
		    }
		}



