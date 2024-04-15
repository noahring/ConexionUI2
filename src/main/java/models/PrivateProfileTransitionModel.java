package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class PrivateProfileTransitionModel implements PrivateProfileTransitionalModelInterface {
	
	BorderPane  mainview;
	
	public PrivateProfileTransitionModel(BorderPane view) {
		mainview = view;
	}

	@Override
	public void changeToEditView() {
		// TODO Auto-generated method stub
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(PrivateProfileTransitionModel.class.getResource("../View/editProfile.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void changeToLoginPage() {
		// TODO Auto-generated method stub

		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(PrivateProfileTransitionModel.class.getResource("../View/Login.fxml"));
		try {
			Node view = loader.load();
			mainview.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
