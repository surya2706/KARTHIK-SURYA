/*
 * KARTHIK SURYA S
 * 2 Nov 2016
 * Write your own String Class
*/
package exercises;

public class FrontBack {

	public static String backFront(String n) {
		int l = n.length();
		if (l < 4) {
			StringBuffer sb = new StringBuffer(n);
			String rev = new String(sb.reverse());
			return rev;
		} else {
			String s1 = n.substring(0, 2);
			String s2 = n.substring(l - 2, l);
			String s3 = n.substring(2, l - 2);
			StringBuffer sb1 = new StringBuffer(s1);
			StringBuffer sb2 = new StringBuffer(s2);
			String rev1 = new String(sb1.reverse());
			String rev2 = new String(sb2.reverse());
			return rev1 + s3 + rev2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("surya :" + backFront("surya"));
		System.out.println("Ate :" + backFront("Ate"));
		System.out.println("Hello :" + backFront("Hello"));

	}

}
