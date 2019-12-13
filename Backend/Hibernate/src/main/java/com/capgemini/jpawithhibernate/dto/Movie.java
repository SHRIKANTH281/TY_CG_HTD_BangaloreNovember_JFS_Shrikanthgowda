package com.capgemini.jpawithhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie {
	@Id
	@Column(name="Id")
private int mid;
	@Column(name="Name")
private String mname;
	@Column(name="Rating")
private String rating;
	
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getRating() {
	return rating;
}
public void setRating(String rating) {
	this.rating = rating;
}

}
