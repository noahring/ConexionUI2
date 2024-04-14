package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Post {
	String postName;
	String postText;
	User postAuthor;
	ObservableList<Skill> skills = FXCollections.observableArrayList();
	
	
	public Post(String postName, String postText, User postAuthor) {
		super();
		this.postName = postName;
		this.postText = postText;
		this.postAuthor = postAuthor;
	}
	
	//adders
	public void addSkill(Skill skill) {
		this.skills.add(skill);
	}
}


