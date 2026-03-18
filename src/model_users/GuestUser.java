package model_users;

public class GuestUser {
	private long id;

	private static long counter = 1;
	
	
	public long getId() {
		return id;
	}

	public void setId() {
		id = counter++;
	}
	
	public GuestUser() {
		setId();
	}
	
	public String toString() {
		String result = " " + id;
		return result;
	}
	
}
