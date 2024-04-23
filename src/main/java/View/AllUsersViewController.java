package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.User;
import models.allPagesModel;

public class AllUsersViewController {
	allPagesModel model;
	public void setModel(allPagesModel model) {
		this.model = model;
		allUsersList.setItems(model.getUsers());
	}
    @FXML
    private ListView<User> allUsersList;

    @FXML
    private Button showFollowedUsersButton;

    @FXML
    void onClickShowFollowedUsers(ActionEvent event) {
    	if(model.getLoggedIn()!=null) {
    	allUsersList.setItems(model.getLoggedIn().getUsers());
    	}
    }

}