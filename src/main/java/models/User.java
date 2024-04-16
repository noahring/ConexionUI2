package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class User {
	@Override
	public String toString() {
		return username;
	}
	String username;
	String password;
	String bio;
	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	ObservableList<Skill> skills = FXCollections.observableArrayList();
	ObservableList<Post> posts = FXCollections.observableArrayList();	
	//constructor
	public User(String username, String bio) {
		super();
		this.username = username;
		this.bio = bio;
		
	}
	
	//getters and setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ObservableList<Skill> getSkills() {
		return skills;
	}
	public void setSkills(ObservableList<Skill> skills) {
		this.skills = skills;
	}
	public ObservableList<Post> getPosts() {
		return posts;
	}
	public void setPosts(ObservableList<Post> posts) {
		this.posts = posts;
	}
	
	//adders
	public void addSkill(Skill skill) {
		this.skills.add(skill);
	}
}
