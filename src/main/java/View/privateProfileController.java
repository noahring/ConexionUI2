package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import models.ViewTransitionModelInterface;

public class privateProfileController {
	
	ViewTransitionModelInterface model;
	
	public void setModel(ViewTransitionModelInterface newModel) {
		
		model = newModel;
	}

    @FXML
    private Button editPrivateProfile;

    @FXML
    private Text profileBio;

    @FXML
    private Label profileName;

    @FXML
    private ListView<?> profileRecentPost;

    @FXML
    private ListView<?> profileSkills;

    @FXML
    private Button signOut;

    @FXML
    void onClickEditButton(ActionEvent event) {
    	System.out.println("EditProfile Clicked! Implementation WIP!");
    	model.changetoEditView();
    
    }

    @FXML
    void onClickSignOut(ActionEvent event) {
    	model.changetoLoginView();
    	System.out.println("Login Again!");
    }

}
