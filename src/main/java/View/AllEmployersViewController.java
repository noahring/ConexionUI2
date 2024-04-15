package View;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import models.Employer;
import models.allPagesModel;

public class AllEmployersViewController {
	allPagesModel model;
	public void setModel(allPagesModel model) {
		this.model = model;
		allEmployersList.setItems(model.getEmployers());
	}
    @FXML
    private ListView<Employer> allEmployersList;
}
