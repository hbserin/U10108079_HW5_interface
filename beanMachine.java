/**Name:Erin
 *Id:U10108079
 *Exercise:HW5_interface
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.*;


public class beanMachine extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();

		 //create an outline
		Polyline polyline = new Polyline();
		polyline.getPoints().addAll(200.0,50.0, 200.0,100.0, 100.0,300.0, 100.0,400.0, 400.0,400.0, 400.0,300.0, 300.0,100.0, 300.0,50.0);
		pane.getChildren().add(polyline);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane,500,450); // create a scene for the pane
		primaryStage.setTitle("Bean Machine Interface"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
}
