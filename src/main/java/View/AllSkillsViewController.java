package View;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import models.Skill;
import models.allPagesModel;
public class AllSkillsViewController {
	allPagesModel model;
	public void setModel(allPagesModel model) {
		this.model = model;
		System.out.println("reached");
		allSkillsList.setItems(model.getSkills());
	}
    @FXML
    private ListView<Skill> allSkillsList;
}
