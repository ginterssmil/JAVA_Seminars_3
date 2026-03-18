package model_users;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import model_enums.PostType;
import service.IPostPublish;
import service.MainService;

public class RegisteredUser extends GuestUser implements IPostPublish{
	private String username;
	private String password;
	
	
	
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	
	public void setUsername(String inputUsername) {
		if( inputUsername != null && !inputUsername.isEmpty() && inputUsername.matches("[A-Za-z0-9]{4,20}")) {
			username = inputUsername;
		}
		else {
			username = "DefaultUser";
		}
	}
	
	//regex maska parolei: https://uibakery.io/regex-library/password
	public void setPassword(String inputPassword) {
		if(inputPassword != null && !inputPassword.isEmpty() && inputPassword.matches("[A-Za-z0-9 !@#$%^&*]{1,20}")) {	
			try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(inputPassword.getBytes());
			password = new String(md.digest());
			}
			catch(Exception e) {
				password = "0000";
			}
		}
		else {
			password = "0000";
		}
	}
	
	public RegisteredUser() {
		super();
		setUsername("Default");
		setPassword("Password@123");
	}
	
	public RegisteredUser(String inputUsername, String inputPassword) {
		super();
		setUsername(inputUsername);
		setPassword(inputPassword);
	}
	
	public String toString() {
		String result = id + ", " + username + ",  "+ password + " "; 
		return result;
	}
	
	public boolean login(String inputUsername, String inputPassword) throws NoSuchAlgorithmException {
		for(GuestUser tempU : MainService.getAllUsers()) {
			if( tempU instanceof RegisteredUser) {
				RegisteredUser tempRU = (RegisteredUser) tempU;
				
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(inputPassword.getBytes());
				String inputPasswordEncoded = new String(md.digest());
				
				
				if(tempRU.getUsername().equals(inputUsername) && tempRU.getPassword().equals(inputPasswordEncoded)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void createAndPublishPost(String inputMsg, PostType inputPostType) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
