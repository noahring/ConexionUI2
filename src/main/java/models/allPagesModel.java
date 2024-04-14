package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class allPagesModel {
	ObservableList<User> users = FXCollections.observableArrayList();
	ObservableList<Employer> employers = FXCollections.observableArrayList();
	ObservableList<Job> jobPosts = FXCollections.observableArrayList();
	ObservableList<Skill> skills = FXCollections.observableArrayList();
	ObservableList<Post> posts = FXCollections.observableArrayList();
	
	public allPagesModel() {
		
	}
	//
	public ObservableList<User> getUsers() {
		return users;
	}

	public ObservableList<Employer> getEmployers() {
		return employers;
	}

	public ObservableList<Job> getJobPosts() {
		return jobPosts;
	}

	public ObservableList<Skill> getSkills() {
		return skills;
	}

	public ObservableList<Post> getPosts() {
		return posts;
	}
	
	//adders
	public void addUser(String username, String password) {
		User newUser = new User(username, password);
		this.users.add(newUser);
	}
	public void addSkill(String skillname) {
		Skill newSkill = new Skill(skillname);
		this.skills.add(newSkill);
	}
	public void addPost(String postName, String postText, User postAuthor) {
		Post newPost = new Post(postName, postText, postAuthor);
		this.posts.add(newPost);
		postAuthor.posts.add(newPost);
	}
	public void addJob(String postName, String postText, Employer postAuthor) {
		Job newJob = new Job(postName, postText, postAuthor);
		this.jobPosts.add(newJob);
		postAuthor.jobs.add(newJob);
	}
}
