package model;

import java.time.LocalDateTime;

public class Post {
	private String msg;
	private LocalDateTime datetime = LocalDateTime.now();
	private int countOfLikes = 0;//TODO parvidot uz sarakstu ar registretiem lietotajiem...
	
	
	public String getMsg() {
		return msg;
	}
	public LocalDateTime getDateTime() {
		return datetime;
	}
	public int getCountOfLikes() {
		return countOfLikes;
	}
	
	
	public void setMsg(String inputMsg) {
		if((inputMsg != null) && (!inputMsg.isEmpty()) && (inputMsg.length() < 1000) ) {
			msg = inputMsg;
		}
		else {
			msg = "Unknown post";
		}
	}
	public void setDate() {
		datetime = LocalDateTime.now();
		}
	public void incrementCountOfLikes() {
		countOfLikes++;
	}
	
	
	
	
	
	
}
