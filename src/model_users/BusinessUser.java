package model_users;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.Random;

import model.Page;
import model_enums.PostType;

public class BusinessUser extends RegisteredUser{
	
	private ArrayList<Page> allPages = new ArrayList<Page>();
	
	
	
	public ArrayList<Page> getAllPages() {
		return allPages;
	}

	
	public BusinessUser() {
		//neizsauc super() lai default atskiras no privateUser
		setId();
		setUsername("ziedi");
		setPassword("P1@asd");
	}
	
	public BusinessUser(String inputUsername, String inputPassword) {
			super(inputUsername, inputPassword);
		}
	
	public String toString() {
		return super.toString()+ "->" + allPages;
	}
	
	@Override
	public void createAndPublishPost(String inputMsg, PostType inputPostType) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		// allPages.get(rand.nextInt(0,allPages.size().ge))
	}
	

}
