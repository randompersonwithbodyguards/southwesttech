/* austin smith 
today */


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.scene.control.*;
import java.awt.*;
import javafx.scene.paint.Color;
import javafx.collections.ObservableList;
import javafx.animation.*;
import javafx.scene.shape.Rectangle;
import javafx.animation.*;
import javafx.util.Duration;
import javafx.scene.input.MouseButton;


public class Exercise15_anime extends Application{
	@Override
	public void start(Stage primaryStage){
		Pane pane = new Pane();
		
		
		Rectangle r = new Rectangle(50, 40);
		r.setFill(Color.rgb(127, 255, 0));
		
		
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.BLACK);
		polygon.setRotate(22.5);

		
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = 250, centerY = 250;
		double radius = Math.min(500, 500) * 0.4;

		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 5;
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}   
		pane.getChildren().addAll(polygon,r);
		
		PathTransition pt = new PathTransition();
		pt.setPath(polygon);
		pt.setNode(r);
		pt.setAutoReverse(true);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setDuration(Duration.millis(4000));
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.play();
		
		FadeTransition ft = new FadeTransition(Duration.millis(2000), r);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("Exercise15_anime");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		r.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY){
				pt.pause();
				System.out.println("DOne did pause");
			}
			else if (e.getButton() == MouseButton.SECONDARY){
				pt.play();
				System.out.println("Started AGainnnnnn");
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	
		
	}
}