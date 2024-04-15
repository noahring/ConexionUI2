package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class ViewTransitionalModel implements ViewTransitionModelInterface {
	
	
	BorderPane  mainview;
	
	public ViewTransitionalModel(BorderPane view) {
		mainview = view;
	}

	
	// Not required for design implementation 3
	@Override
	public void showHome() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showAllEmployer() {
		// TODO Auto-generated method stub

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/allEmployers.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void showAllJobs() {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/allJobs.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void showAllUsers() {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/allUsers.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void showAllSkills() {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/allSkills.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	public void showProfile() {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/privateProfile.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	public void showAllPosts() {
		// TODO Auto-generated method stub
		
	}

}