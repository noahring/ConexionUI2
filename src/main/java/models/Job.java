package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Job {
	String jobTitle;
	String jobDescription;
	Employer postAuthor;
	ObservableList<Skill> skills = FXCollections.observableArrayList();
	public Job(String jobTitle, String jobDescription, Employer postAuthor) {
		super();
		this.jobDescription = jobDescription;
		this.jobTitle = jobTitle;
		this.postAuthor = postAuthor;
	}
	
	//getters and setters
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Employer getPostAuthor() {
		return postAuthor;
	}
	public void setPostAuthor(Employer postAuthor) {
		this.postAuthor = postAuthor;
	}
	public ObservableList<Skill> getSkills() {
		return skills;
	}
	public void setSkills(ObservableList<Skill> skills) {
		this.skills = skills;
	}
	
	//adders
	public void addSkill(Skill skill) {
		this.skills.add(skill);
	}
	
}
