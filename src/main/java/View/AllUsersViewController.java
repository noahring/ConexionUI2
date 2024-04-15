package View;

import javafx.fxml.FXML;
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
}
