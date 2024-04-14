package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Employer {
	String employerName;
	ObservableList<Job> jobs = FXCollections.observableArrayList();
	public Employer(String employerName) {
		super();
		this.employerName = employerName;
	}
	
	//getters and setters
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public ObservableList<Job> getJobs() {
		return jobs;
	}
	public void setJobs(ObservableList<Job> jobs) {
		this.jobs = jobs;
	}	
	
}
