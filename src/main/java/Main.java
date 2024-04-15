import View.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.ViewTransitionalModel;
import models.allPagesModel;
public class Main extends Application {
	allPagesModel model = new allPagesModel();
	@Override
	
	public void start(Stage stage) throws Exception {
		prepopulate(model);
		System.out.println(model.getSkills());
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("View/navBar.fxml"));
		BorderPane view = loader.load();
		
		MainController cont = loader.getController();
		
		ViewTransitionalModel vm = new ViewTransitionalModel(view, model);
		cont.setModel(vm);
		
		
		Scene s = new Scene(view);
		stage.setScene(s);
		stage.show();
	}
	public void prepopulate(allPagesModel model) {
		model.addSkill("Python");
		model.addSkill("Java");
		model.addUser("Ben", "The greatest philosopher in the Western world");
		model.addUser("Noah", "From the Southeastern U.S.");
		model.addUser("Johnson", "an unusual man");
		
		model.addEmployer("Acme");
	}
	public static void main(String [] args){
		launch(args);
	}
}
