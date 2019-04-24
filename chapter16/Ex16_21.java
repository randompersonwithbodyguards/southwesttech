/* austin smith
april 29 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.event.*;
import java.util.jar.*;
import javafx.scene.media.*;
import javafx.util.Duration;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;



public class Ex16_21 extends Application {
	Media media = new Media ("https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	MediaPlayer mp = new MediaPlayer(media);
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		
		TextField text = new TextField();
		
		Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), e -> {
			
			int count = Integer.parseInt(text.getText());
			if (count > 0) {
				count--;
				text.setText(Integer.toString(count));
			}
			else {
				mp.play();
			}						
		}));
		
		text.setOnAction(e -> {
			
			timeline.play();
			
		});	
		mp.setCycleCount(Timeline.INDEFINITE);
		timeline.setCycleCount(Timeline.INDEFINITE);	
			
		pane.getChildren().add(text);
		
		Scene scene = new Scene(pane, 170, 30);
		primaryStage.setTitle("blep"); 
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
		
	}
	public static void main(String[] args) {
			Application.launch(args);
	}
	
}