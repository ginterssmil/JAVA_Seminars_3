package model_users;

import java.util.ArrayList;

import model.Post;
import model_enums.PostType;

public class PrivateUser extends RegisteredUser{
	
	private ArrayList<Post> allPrivatePosts =  new ArrayList<Post>();
	private ArrayList<Post> allPublicPosts =  new ArrayList<Post>();
	private ArrayList<RegisteredUser> allMyFollowers = new ArrayList<RegisteredUser>(); 
	
		
	public ArrayList<Post> getAllPrivatePosts() {
		return allPrivatePosts;
	}

	public ArrayList<Post> getAllPublicPosts() {
		return allPublicPosts;
	}

	public ArrayList<RegisteredUser> getAllMyFollowers() {
		return allMyFollowers;
	}

	public PrivateUser() {
		super();
	}

	public PrivateUser(String inputUsername, String inputPassword) {
		super(inputUsername,inputPassword);
	}

	public String toString() {
		String result = super.toString() + "sludinajumi: \n " + allPrivatePosts + "\n" + allPublicPosts + " \n " + "Sekotaji: \n" + allMyFollowers;
		return result;
	}

	@Override
	public void createAndPublishPost(String inputMsg, PostType inputPostType) {
		// TODO Auto-generated method stub
		super.createAndPublishPost(inputMsg, inputPostType);
	}
}
