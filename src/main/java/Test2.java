
public class Test2 {

	public static void main(String[] args) {
		
		char[] h = new String("RamireddyHariGouthamReddy").toCharArray();
		
		for(int i=(h.length - 1); i >= 0 ; i--) {
			System.out.print(h[i]);
		}
		
		System.out.println();
		
		for(int i=0; i < (h.length/2) ; i++) {
			char temp = h[i];
			h[i] = h[h.length-1-i];
			h[h.length-1-i]=temp;
		}
		
		
		System.out.println(new String(h));
	}

}
