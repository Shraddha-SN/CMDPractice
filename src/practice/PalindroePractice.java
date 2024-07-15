package practice;

public class PalindroePractice {

	public static void main(String[] args) {

		String s = "yaay";
		String b = "";
		
		for(int i=(s.length())-1;i>=0;i--) {
			b = b+ s.charAt(i);
		}
		System.out.println(b);
		if(s.equalsIgnoreCase(b)) {
			System.out.println("its pallindrome");
		} else {
			System.out.println("its not");
		}
	}

}
