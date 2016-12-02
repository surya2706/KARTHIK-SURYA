
public class GetDateOfBirth {

	private static int date;
	private static int month;
	private static int year;

	public int getdate() {
		return date;
	}

	public int getmonth() {
		return month;
	}

	public int getyear() {
		return year;
	}

	public static void setdate(int newdate) {
		if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
				&& newdate <= 31) {
			date = newdate;
		} else if (month == 2 && date == 29 && (year % 4 == 0)) {
			date = newdate;
		} else if (month == 2 && date <= 28) {
			date = newdate;
		} else if ((month == 4 || month == 6 | month == 9 || month == 11) && date <= 30) {
			date = newdate;
		} else {
			System.out.println("Invalid date entry.");
			GetDOB.enterDate();
		}

	}

	public static void setmonth(int newmonth) {
		if (newmonth == 12 && year == 2016) {
			System.out.println("Month should not be in future.");
			GetDOB.enterMonth();
		} else if (newmonth <= 12) {
			month = newmonth;
		} else {
			System.out.println("Invalid month entry.");
			GetDOB.enterMonth();
		}
	}

	public static void setyear(int newyear) {
		if (newyear <= 2016 && month < 12) {
			year = newyear;
		} else {
			System.out.println("Year of birth could not be in future.");
			GetDOB.enterYear();
		}

	}
}
