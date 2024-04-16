package View;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import models.ViewTransitionalModel;
import models.allPagesModel;
public class EditProfileViewController
{
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
    private ListView<?> postList;

    @FXML
    private ListView<?> skillList;

    @FXML
    void onClickCreatePostButton(ActionEvent event) {
    	
    }
	
    @FXML
    void onClickAddSkillButton(ActionEvent event) {

    }

    @FXML
    void onClickApplyButton(ActionEvent event) {
    	String username = nameBox.textProperty().get();
    	String password = bioBox.textProperty().get();
    }

    @FXML
    void onClickCancelButton(ActionEvent event) {

    }
}
