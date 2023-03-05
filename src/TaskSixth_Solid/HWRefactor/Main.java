package TaskSixth_Solid.HWRefactor;

public class Main{
	public static void main(String[] args){

		User user = new User("Bob");


		UserReportable UR = new ReportUser(user);
		UR.report();

		UserSaveable US = new Persister(user);
		US.save();

	}
}
