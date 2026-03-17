package model.users;

import java.security.MessageDigest;

public class RegisteredUser extends GuestUser{
	private String username;
	private String title;
	private String password;
	
	
	
	public String getUsername() {
		return username;
	}
	public String getTitle() {
		return title;
	}
	public String getPassword() {
		return password;
	}
	
	
	public void setUsername(String inputUsername) {
		if( inputUsername != null && inputUsername.isEmpty() && inputUsername.matches("[A-Za-z0-9]{4-20}")) {
			username = inputUsername;
		}
		else {
			username = "DefaultUser";
		}
	}
	public void setTitle(String inputTitle) {
		
	}
	public void setPassword(String inputPassword) {
		try {
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(inputPassword.getBytes());
		password = md.digest().toString();
		}
		catch(Exception e) {
			
		}
	}
	
	
	
	
	
	
	
	
}
