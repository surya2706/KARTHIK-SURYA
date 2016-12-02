//import java.util.Scanner;
import java.util.regex.*;


public class ValidMail {

	//private static Scanner sc;

	public static void main(String[] args) {
		//sc = new Scanner(System.in);
		//System.out.println("Enter the mail id: ");
		//String s = sc.nextLine();
		Pattern p = Pattern.compile("^[A-Za-z][A-Za-z0-9_.]*@[A-Za-z0-9]([.][A-Za-z]+)+$");
		Matcher m = p.matcher("karthiksurya2706@gmail.com");
		if(m.find() && m.group().equals("karthiksurya2706@gmail.com")){
			System.out.println("Valid mail id.");
		}else{
			System.out.println("Invalid mail id.");
		}

	}

}
