package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import models.Job;
import models.ViewTransitionalModel;
import models.allPagesModel;

public class AllJobsViewController {
	ViewTransitionalModel vm;
	allPagesModel model;
	public void setModel(allPagesModel model) {
		this.model = model;
		allJobsList.setItems(model.getJobPosts());
	}
    @FXML
    private ListView<Job> allJobsList;

    @FXML
    private Button myJobsButton;

    @FXML
    void onClickShowOnlyMyJobs(ActionEvent event) {
    	allJobsList.setItems(model.getLoggedIn().getJobs());
    }

}

