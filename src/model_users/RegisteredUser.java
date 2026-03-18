package model_users;

import java.security.MessageDigest;

public class RegisteredUser extends GuestUser{
	private String username;
	private String password;
	
	
	
	public String getUsername() {
		return username;
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
	
	//regex maska parolei: https://uibakery.io/regex-library/password
	public void setPassword(String inputPassword) {
		if(inputPassword != null && inputPassword.isEmpty() && inputPassword.matches("/^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$/")) {	
			try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(inputPassword.getBytes());
			password = md.digest().toString();
			}
			catch(Exception e) {
				password = "0000";
			}
		}
		else {
			password = "0000";
		}
	}
	
	
	
	
	
	
	
	
}
