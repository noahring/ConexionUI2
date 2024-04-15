package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
//import models.ViewTransitionModelInterface;
import models.allPagesModel;
import models.Skill;
import models.Post;


public class privateProfileController {
	
	allPagesModel model;
	
	public void setModel(allPagesModel model) {
		
		this.model = model;
		profileSkills.setItems(model.getSkills());
		profileRecentPost.setItems(model.getPosts());
		profileName.setText("Johnson");
		profileBio.setText("I love computer science");
		
	}

    @FXML
    private Button editPrivateProfile;

    @FXML
    private Text profileBio;

    @FXML
    private Label profileName;

    @FXML
    private ListView<Post> profileRecentPost;

    @FXML
    private ListView<Skill> profileSkills;

    @FXML
    private Button signOut;

    @FXML
    void onClickEditButton(ActionEvent event) {
//    	System.out.println("EditProfile Clicked! Implementation WIP!");
//    	model.changetoEditView();
    
    }

    @FXML
    void onClickSignOut(ActionEvent event) {
//    	model.changetoLoginView();
//    	System.out.println("Login Again!");
    }

}
