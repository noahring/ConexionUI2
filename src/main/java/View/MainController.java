package View;

import javafx.fxml.FXML;
import models.ViewTransitionModelInterface;
import models.allPagesModel;
import javafx.event.ActionEvent;
public class MainController {
	
	
	ViewTransitionModelInterface model;
	allPagesModel mainModel;
	
	public void setModel(ViewTransitionModelInterface newModel) {
		model = newModel;
	}

    @FXML
    void onClickEmployers(ActionEvent event) {
    	model.showAllEmployers();
    	System.out.println("clicked employers");

    }

    @FXML
    void onClickHome(ActionEvent event) {
    	model.showHome();
    	System.out.println("clicked home");
    }

    @FXML
    void onClickJobs(ActionEvent event) {
    	model.showAllJobs();
    	System.out.println("clicked jobs");
    }

    @FXML
    void onClickMyProfile(ActionEvent event) {
    	model.showPrivateProfile(mainModel.getLoggedIn());
    	System.out.println("clicked my profile");
    }

    public allPagesModel getMainModel() {
		return mainModel;
	}

	public void setMainModel(allPagesModel mainModel) {
		this.mainModel = mainModel;
	}

	@FXML
    void onClickPosts(ActionEvent event) {
    	model.showAllPosts();
    	System.out.println("clicked posts");
    }

    @FXML
    void onClickSkills(ActionEvent event) {
    	model.showAllSkills();
    	System.out.println("clicked skilla");
    }

    @FXML
    void onClickUsers(ActionEvent event) {
    	model.showAllUsers();
    	System.out.println("clicked users");
    }

}
