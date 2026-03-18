package service;

import java.util.ArrayList;
import java.util.Arrays;

import model_enums.PostType;
import model_users.GuestUser;
import model_users.PrivateUser;

public class MainService {
	private static ArrayList<GuestUser> allUsers = new ArrayList<GuestUser>();
	public static void main(String[] args) {
		
		
		GuestUser guest1 = new GuestUser();
		allUsers.add(guest1);
		
		PrivateUser private1 = new PrivateUser();
		PrivateUser private2 = new PrivateUser("Janisberzins","A1sdwadd@d");
		allUsers.addAll(Arrays.asList(private1, private2));
		System.out.println(allUsers);
		try {
			if (private1.login("Default", "Password@123")) {
	
				private1.createAndPublishPost("Sveiciens JAVA nodarbiba!", PostType.publicType);
				private1.createAndPublishPost("Man loti patik JAVA!", PostType.publicType);
				private1.createAndPublishPost("Man sodien ir dzimsanas diena", PostType.privateType);
				System.out.println("--------------------------------------------------");
				private1.followPrivateUser(private2);
				System.out.println(allUsers);
			}
			else {
				System.out.println("Nav pareizs lietotajvards, vai parole");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	
	
	}
	public static ArrayList<GuestUser> getAllUsers() {
		return allUsers;
	}
}
