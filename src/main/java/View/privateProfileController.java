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
import models.User;
import models.Post;


public class privateProfileController {
	
	allPagesModel model;
	ViewTransitionalModel viewModel;
	User user;
	
	public void setModel(allPagesModel model) {
		this.model = model;
		profileSkills.setItems(user.getSkills());
		profileRecentPost.setItems(user.getPosts());
		profileName.setText(user.getUsername());
		profileBio.setText(user.getBio());
	}

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public allPagesModel getModel() {
		return model;
	}

	public ViewTransitionalModel getViewModel() {
		return viewModel;
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
    	viewModel.changetoEditView(user);
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
