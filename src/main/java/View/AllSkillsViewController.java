package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.Skill;
import models.allPagesModel;

public class AllSkillsViewController {
	allPagesModel model;
	public void setModel(allPagesModel model) {
		this.model = model;
		allSkillsList.setItems(model.getSkills());
	}
    @FXML
    private ListView<Skill> allSkillsList;

    @FXML
    private Button showOnlyMySkillsButton;

    @FXML
    void onClickShowOnlyMySkills(ActionEvent event) {
    	if(model.getLoggedIn()!=null) {
    	allSkillsList.setItems(model.getLoggedIn().getSkills());
    	}
    }
}