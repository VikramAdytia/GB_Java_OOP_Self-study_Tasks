package TaskSixth_Solid.HWRefactor;

public class Persister implements UserSaveable{
	private User user;
	
	public Persister(User user){
		this.user = user;
	}
	
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}