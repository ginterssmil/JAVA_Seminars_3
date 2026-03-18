package model;

import java.util.ArrayList;

import model_users.RegisteredUser;

public class Page {
	private String title;
	private String description;
	private ArrayList<RegisteredUser> allPageFollowers = new ArrayList<RegisteredUser>();
	private ArrayList<Post> allPostsInPAge = new ArrayList<Post>();
	
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public ArrayList<RegisteredUser> getAllPageFollowers() {
		return allPageFollowers;
	}
	public ArrayList<Post> getAllPostsInPAge() {
		return allPostsInPAge;
	}
	
	
	public void setTitle(String inputTitle) {
		if(inputTitle != null && !inputTitle.isEmpty() && inputTitle.matches("[A-Z]{1}[A-Za-z0-9 ,.]{3,30}")) {
			title = inputTitle;
		}
		else {
			title = "Unknown";
		}
	}
	public void setDescription(String inputDescription) {
		if(inputDescription != null && !inputDescription.isEmpty() && inputDescription.matches("[A-Z]{1}[A-Za-z0-9 ,.]{3,10}")) {
			description = inputDescription;
		}
		else {
			description = "Unknown";
		}
	}
	
	
	
}
