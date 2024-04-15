package View;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import models.Job;
import models.allPagesModel;

public class AllJobsViewController
{
	allPagesModel model;
	public void setModel(allPagesModel model) {
		this.model = model;
		allJobsList.setItems(model.getJobPosts());
	}
    

	@FXML
    private ListView<Job> allJobsList;
}
