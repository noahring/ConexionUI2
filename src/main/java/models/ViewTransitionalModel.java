package models;

import java.io.IOException;
import java.net.URL;

import View.AllEmployersViewController;
import View.AllJobsViewController;
import View.AllSkillsViewController;
import View.AllUsersViewController;
import View.EditProfileViewController;
import View.LoginViewController;
import View.privateProfileController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

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
		//System.out.println((loader.getController())==null);
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/allSkills.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
			AllSkillsViewController cont = loader.getController();
			//System.out.println(cont==null);
			cont.setModel(model);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	@Override
	public void showPrivateProfile(User user) {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		if(user==null) {
			changetoLoginView();
			return;
		}
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/privateProfile.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
			privateProfileController cont = loader.getController();
			System.out.println((cont==null));
			cont.setUser(user);
			cont.setModel(model);
			cont.setViewModel(this);
			
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
	public void changetoEditView(User user) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/editProfile.fxml"));
		URL url = loader.getLocation();
		try {
			Node view = loader.load();
			mainview.setCenter(view);
			EditProfileViewController cont = loader.getController();
			cont.setUser(user);
			cont.setModel(model);
			cont.setViewModel(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


	@Override
	public void changetoLoginView() {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		//loader.setLocation(ViewTransitionalModel.class.getResource("../View/editProfile.fxml"));
		loader.setLocation(ViewTransitionalModel.class.getResource("../View/login.fxml"));
		URL url = loader.getLocation();
		//System.out.println(url);
		try {
			Node view = loader.load();
			//System.out.println("reached1");
			mainview.setCenter(view);
			
			LoginViewController cont = loader.getController();
			//System.out.println("reached");
			cont.setViewModel(this);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		}
	@Override
	public void login(String username, String password) {
		boolean found = false;
		for(int i = 0; i< model.getUsers().size(); i++) {
			User current = model.getUsers().get(i);
			if((current.getUsername().equals(username)) && (current.getPassword().equals(password))) {
				found = true;
				showPrivateProfile(current);
				model.loggedIn=current;
			}
		}
		if(found==false) {
			showPrivateProfile(null);
			model.loggedIn= null;
		}
	}
}
