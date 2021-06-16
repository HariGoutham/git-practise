
public class Test {

	public static void main(String[] args) {
		String s = "nurses run";
		System.out.println(s);
		System.out.println(reverse(s));
		System.out.println(isAPalindrome(s.replaceAll("\\s", "")));

	}

	private static String reverse(String s) {

		char[] stringToChar = s.toCharArray();
		for (int i = 0; i < ((stringToChar.length) / 2); i++) {
			char temp = stringToChar[i];
			stringToChar[i] = stringToChar[(stringToChar.length - 1) - i];
			stringToChar[(stringToChar.length - 1) - i] = temp;
		}

		return new String(stringToChar);
	}
	
	private static Boolean isAPalindrome(String s) {

		boolean isPalindrome = true;
		
		char[] stringToChar = s.toCharArray();
		
		for (int i = 0; i < ((stringToChar.length) / 2); i++) {
			
			if(stringToChar[i] != stringToChar[(stringToChar.length - 1) - i]) {
				isPalindrome = false;
			}

		}

		return isPalindrome;
	}
}
