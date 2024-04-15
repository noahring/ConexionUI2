package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import models.ViewTransitionalModel;
import models.allPagesModel;
import models.Skill;
import models.Post;


public class privateProfileController {
	
	allPagesModel model;
	ViewTransitionalModel viewModel;
	
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

    public void setEditProfileModel(allPagesModel model) {
        this.model = model;
    }
    
    public void setViewModel(ViewTransitionalModel viewModel)
    {
    	this.viewModel = viewModel;
    }
    
    @FXML
    void onClickEditButton(ActionEvent event) {
    	viewModel.changetoEditView();
//    	if (viewModel != null) {
//             // Call changetoEditView() on the viewModel instance
//    		break;
//        } else {
//            System.err.println("ViewModel is not initialized.");
//        }
    
    }

    @FXML
    void onClickSignOut(ActionEvent event) {
    	viewModel.changetoLoginView();
//    	model.changetoLoginView();

    }

}
