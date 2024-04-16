package View;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import models.Post;
import models.Skill;
import models.User;
import models.ViewTransitionalModel;
import models.allPagesModel;
public class EditProfileViewController

{
	User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public allPagesModel getModel() {
		return model;
	}

	public void setModel(allPagesModel model) {
		this.model = model;
		this.skillList.setItems(user.getSkills());
		this.postList.setItems(user.getPosts());
		this.nameBox.setText(user.getUsername());
		this.bioBox.setText(user.getBio());
	}

	public ViewTransitionalModel getViewModel() {
		return viewModel;
	}

	public void setViewModel(ViewTransitionalModel viewModel) {
		this.viewModel = viewModel;
	}

	allPagesModel model;
	ViewTransitionalModel viewModel;
    @FXML
    private Button addSkillButton;

    @FXML
    private Button applyButton;

    @FXML
    private TextArea bioBox;

    @FXML
    private Button cancelButton;

    @FXML
    private Button createPostButton;

    @FXML
    private TextField nameBox;

    @FXML
    private ListView<Post> postList;

    @FXML
    private ListView<Skill> skillList;

    @FXML
    void onClickCreatePostButton(ActionEvent event) {
    	
    }
	
    @FXML
    void onClickAddSkillButton(ActionEvent event) {

    }

    @FXML
    void onClickApplyButton(ActionEvent event) {
    	String username = nameBox.textProperty().get();
    	String bio = bioBox.textProperty().get();
    	user.setBio(bio);
    	viewModel.showPrivateProfile(user);
    	
    }

    @FXML
    void onClickCancelButton(ActionEvent event) {

    }
}
