
public class MainCont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetDOB.enterYear();
		GetDOB.enterMonth();
		GetDOB.enterDate();
		GetDateOfBirth dob = new GetDateOfBirth();
		System.out.println("Entered year: " + dob.getdate() + "/" + dob.getmonth() + "/" + dob.getyear());
	}

}
