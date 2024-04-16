import View.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.Employer;
import models.User;
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
		User ben = model.addUser("ben", "The greatest philosopher in the Western world");
		ben.setPassword("12345");
		User noah = model.addUser("noah", "From the Southeastern U.S.");
		noah.setPassword("12345");
		User johnson =johnson = model.addUser("johnson", "an unusual man");
		johnson.setPassword("12345");
		
		
		
		Employer Acme = model.addEmployer("Acme");
		
		model.addJob("matress tester", "sleep", Acme);
		model.addPost("I just really like computer science", "I just really like computer science", johnson);
	}
	public static void main(String [] args){
		launch(args);
	}
}
