
public class Demo1 {
	
	static boolean A = true;
	static boolean B = true;
	static boolean C = false;
	
	public static void main(String[] args){
		System.out.println((A && B) || (B && C) || A); // true
		System.out.println(( A || B) && (B || C) && B); // true
		System.out.println(!((A && B) || (B && C))); // false
		System.out.println(((A || B) && (B || C))); // true
	}

}
