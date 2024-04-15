package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.PrivateProfileTransitionalModelInterface;

public class privateProfileController {

	PrivateProfileTransitionalModelInterface model;
	
	public void setModel(PrivateProfileTransitionalModelInterface newModel) {
		model = newModel;
	}
	
	@FXML
	void onClickEditButton(ActionEvent event) {
		model.changeToEditView();
		System.out.println("clicked Edit Profile");
	}
	
}
