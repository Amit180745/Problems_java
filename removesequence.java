package practice_DSA;

public class removesequence {
	public static void main(String[] args) {
		String str = "dabcababc";
		String k = "abc";
		
		String result = str.replace(k,"");
		System.out.println(result);
	}
}
