package practice_DSA;

public class findthedifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s,t));

	}
	    public static char findTheDifference(String s, String t) {
	        int sum = 0;
	        
	        for (char ch : t.toCharArray())
	            sum += ch;
	        
	        for (char ch : s.toCharArray())
	            sum -= ch;
	        
	        return (char) sum;
	    }
	}

