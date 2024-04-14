package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class User {
	String username;
	String password;
	ObservableList<Skill> skills = FXCollections.observableArrayList();
	ObservableList<Post> posts = FXCollections.observableArrayList();	
	//constructor
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
		
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
