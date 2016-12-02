import java.util.Scanner;

public class GetDOB {

	static Scanner sc = new Scanner(System.in);
	public static int year;
	public static int month;
	public static int date;

	public static void enterYear() {
		System.out.println("Enter Year of Birth: ");
		year = sc.nextInt();
		GetDateOfBirth.setyear(year);
	}

	public static void enterMonth() {
		System.out.println("Enter month: ");
		month = sc.nextInt();
		GetDateOfBirth.setmonth(month);
	}

	public static void enterDate() {
		System.out.println("Enter date: ");
		date = sc.nextInt();
		GetDateOfBirth.setdate(date);
	}
}
