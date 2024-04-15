package models;

import java.io.IOException;

import View.AllEmployersViewController;
import View.AllJobsViewController;
import View.AllSkillsViewController;
import View.AllUsersViewController;
import View.privateProfileController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class ViewTransitionalModel implements ViewTransitionModelInterface {
	
	
	BorderPane  mainview;
	allPagesModel model;
	
	public ViewTransitionalModel(BorderPane view, allPagesModel newModel) {
		mainview = view;
		model = newModel;
	}

	
	// Not required for design implementation 3
	@Override
	public void showHome() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showAllEmployers() {
		// TODO Auto-generated method stub

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/allEmployers.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
			AllEmployersViewController cont = loader.getController();
			cont.setModel(model);
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
			AllJobsViewController cont = loader.getController();
			cont.setModel(model);
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
			AllUsersViewController cont = loader.getController();
			cont.setModel(model);
			
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
			AllSkillsViewController cont = loader.getController();
			cont.setModel(model);
			
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
			privateProfileController cont = loader.getController();
			cont.setModel(model);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	public void showAllPosts() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void changetoEditView() {
//		// TODO Auto-generated method stub
//		FXMLLoader loader = new FXMLLoader();
//		loader.setLocation(ViewTransitionalModel.class.getResource("../View/editProfile.fxml"));
//		try {
//			Node view = loader.load();
//			mainview.setCenter(view);
//			privateProfileController cont = loader.getController();
//			cont.setModel(model);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}


	@Override
	public void changetoLoginView() {
//		// TODO Auto-generated method stub
//		FXMLLoader loader = new FXMLLoader();
//		loader.setLocation(ViewTransitionalModel.class.getResource("../View/Login.fxml"));
//		try {
//			Node view = loader.load();
//			mainview.setCenter(view);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		}
	

}
