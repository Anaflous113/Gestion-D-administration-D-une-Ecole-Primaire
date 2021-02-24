package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	 @Override
	public void start(Stage primaryStage) throws  Exception{
		


		

<<<<<<< HEAD
		 Parent root = FXMLLoader.load(getClass().getResource("AddEns.fxml"));
=======
		 Parent root = FXMLLoader.load(getClass().getResource("choix.fxml"));
>>>>>>> 05bdd18a0c9bb747cf1800542789fb4e02e2867c

	

		 Scene scene = new Scene (root);
		
		 primaryStage.setScene(scene);
		 primaryStage.initStyle(StageStyle.UNDECORATED) ;
	     primaryStage.initStyle(StageStyle.TRANSPARENT);
		 primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}