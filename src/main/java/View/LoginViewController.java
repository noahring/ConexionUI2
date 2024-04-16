package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import models.ViewTransitionalModel;
import models.allPagesModel;

public class LoginViewController {
	
	allPagesModel model;
	ViewTransitionalModel viewModel;
	
    @FXML
    private TextField emailBox;

    @FXML
    private Button loginButton;

    @FXML
    private TextField passwordBox;

    @FXML
    void onClickLogin(ActionEvent event) {
    	String username = emailBox.textProperty().get();
    	String password = passwordBox.textProperty().get();
    	viewModel.login(username, password);
    	
    	//System.out.println(username);
    }

	public allPagesModel getModel() {
		return model;
	}

	public void setModel(allPagesModel model) {
		this.model = model;
	}

	public ViewTransitionalModel getViewModel() {
		return viewModel;
	}

	public void setViewModel(ViewTransitionalModel viewModel) {
		this.viewModel = viewModel;
	}

}
