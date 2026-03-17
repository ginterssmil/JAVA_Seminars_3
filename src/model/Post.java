package model;

import java.sql.Date;

public class Post {
	String msg;
	Date date;
	int countOfLikes;
	
	
	public String getMsg() {
		return msg;
	}
	public Date getDate() {
		return date;
	}
	public int getCountOfLikes() {
		return countOfLikes();
	}
	
	
	public void setMsg(String inputMsg) {
		this.msg = msg;
	}
	public void setDate(Date inputDate) {
		this.date = date;
	}
	public void setCountIfLikes(int iputCountOfLikes) {
		this.countOfLikes = countOfLikes;
	}
	
	
	
	
	
	
}
