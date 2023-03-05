package TaskSixth_Solid.HWRefactor;

public class ReportUser implements UserReportable{

    private User user;

    public ReportUser(User user) {
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
