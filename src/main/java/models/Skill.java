package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Skill {
	ObservableList<Post> posts = FXCollections.observableArrayList();
	String skillName;
	
	public Skill(String skillName) {
		this.skillName = skillName;
	}
}
