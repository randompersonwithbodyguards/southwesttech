import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.event.*;



public class FinalCode extends Application {
	//global radiobutton variables
	boolean addBoolean = false;
	boolean subtractBoolean = false;
	boolean multiplyBoolean = false;
	boolean divideBoolean = false;
	
	FractionObject fraction1 = new FractionObject();
	FractionObject fraction2 = new FractionObject();
	FractionObject fraction3 = new FractionObject();
		
	TextField ansnumerator;
	TextField ansdenominator;
	TextField anscoefficient;
	
	@Override
	public void start(Stage primaryStage) {
		VBox bigV = new VBox();
		
		
		GridPane grid   = new GridPane();
		Button simplify = new Button("Simplify");
		simplify.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				passSimplify();
			}});

		Button clear    = new Button("Clear");
		grid.add(clear, 1, 2);
		grid.add(simplify, 2, 2);
		
		HBox longH = new HBox(15);
		bigV.getChildren().addAll(grid, longH);
		
		TextField f1coefficient = new TextField();
		f1coefficient.setPrefWidth(45);
		f1coefficient.setText("0");
		StackPane f1centering = new StackPane();
		f1centering.getChildren().add(f1coefficient);
		
		VBox f1Vbox  = new VBox();
		VBox radio   = new VBox();
		
		TextField f2coefficient = new TextField();
		f2coefficient.setPrefWidth(45);
		f2coefficient.setText("0");
		StackPane f2centering = new StackPane();
		f2centering.getChildren().add(f2coefficient);
		
		VBox f2Vbox  = new VBox();
		Label equals = new Label(" = ");
		StackPane equalscentering = new StackPane();
		equalscentering.getChildren().add(equals);
		
		anscoefficient = new TextField();
		anscoefficient.setPrefWidth(45);
		anscoefficient.setText("0");
		StackPane anscentering   = new StackPane();
		anscentering.getChildren().add(anscoefficient);
		
		VBox ansVbox    = new VBox();
		VBox buttonVbox = new VBox(15);
		
		longH.getChildren().addAll(f1centering, f1Vbox, radio, f2centering, f2Vbox, equalscentering, anscentering, ansVbox, buttonVbox);
		
		//f1vbox
		TextField f1numerator   = new TextField();
		f1numerator.setPrefWidth(45);
		Label f1dividing        = new Label("————");
		TextField f1denominator = new TextField();
		f1denominator.setPrefWidth(45);
		f1Vbox.getChildren().addAll(f1numerator,f1dividing, f1denominator);
		
		//f2vbox
		TextField f2numerator   = new TextField();
		f2numerator.setPrefWidth(45);
		Label f2dividing        = new Label("————");
		TextField f2denominator = new TextField();
		f2denominator.setPrefWidth(45);
		f2Vbox.getChildren().addAll(f2numerator,f2dividing, f2denominator);
		
		//ansVbox
		ansnumerator   = new TextField();
		ansnumerator.setPrefWidth(45);
		Label ansdividing        = new Label("————");
		ansdenominator = new TextField();
		ansdenominator.setPrefWidth(45);
		ansVbox.getChildren().addAll(ansnumerator,ansdividing, ansdenominator);
		
		//setting the clear button cause it wouldnt work where it was
		clear.setOnAction(new EventHandler<ActionEvent>() {
			@Override // Override the handle method
			public void handle(ActionEvent e) {
				f1coefficient.setText("0");
				f1numerator.setText("");
				f1denominator.setText("");
				f2coefficient.setText("0");
				f2numerator.setText("");
				f2denominator.setText("");
				anscoefficient.setText("0");
				ansnumerator.setText("");
				ansdenominator.setText("");
			}
		});

		
		//radio vbox but its just called radio
		RadioButton add = new RadioButton(" + ");
		add.setOnAction(e -> {
			if (add.isSelected()) {
				addBoolean = true;
				subtractBoolean = false;
				multiplyBoolean = false;
				divideBoolean = false;
			}
		});
		RadioButton subtract = new RadioButton(" - ");
		subtract.setOnAction(e -> {
			if (subtract.isSelected()) {
				addBoolean = false;
				subtractBoolean = true;
				multiplyBoolean = false;
				divideBoolean = false;
			}
		});
		RadioButton multiply = new RadioButton(" x ");
		multiply.setOnAction(e -> {
			if (multiply.isSelected()) {
				addBoolean = false;
				subtractBoolean = false;
				multiplyBoolean = true;
				divideBoolean = false;
			}
		});
		RadioButton divide  = new RadioButton(" ÷ ");
		divide.setOnAction(e -> {
			if (divide.isSelected()) {
				addBoolean = false;
				subtractBoolean = false;
				multiplyBoolean = false;
				divideBoolean = true;
			}
		});
		radio.getChildren().addAll(add, subtract, multiply, divide);
		
		ToggleGroup group = new ToggleGroup();
		add.setToggleGroup(group);
		subtract.setToggleGroup(group);
		multiply.setToggleGroup(group);
		divide.setToggleGroup(group);
		
		//Buttonvbox
		Button solveImproper = new Button("Answer Improper");
		Button solveMixed = new Button("Answer Mixed");
		buttonVbox.getChildren().addAll(solveImproper, solveMixed);
		
		solveImproper.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent e) {
					setObject(Integer.parseInt(f1coefficient.getText()), Integer.parseInt(f1numerator.getText()), Integer.parseInt(f1denominator.getText()), Integer.parseInt(f2coefficient.getText()), Integer.parseInt(f2numerator.getText()), Integer.parseInt(f2denominator.getText()));
					solveImproper();
					
			}});
		solveMixed.setOnAction(e -> {
			setObject(Integer.parseInt(f1coefficient.getText()), Integer.parseInt(f1numerator.getText()), Integer.parseInt(f1denominator.getText()), Integer.parseInt(f2coefficient.getText()), Integer.parseInt(f2numerator.getText()), Integer.parseInt(f2denominator.getText()));
			solveMixed();
			});
		
		
		
		Scene scene = new Scene(bigV);
		primaryStage.setTitle("fraction thingy");
		primaryStage.setScene(scene);
		primaryStage.show();
}
	
	
	public int recursiveGCD(int m, int n){
		if (m%n == 0){
			return n;
		}
		else {
			return recursiveGCD(n, m%n);
		}
	}
	public void solveMixed(){
		solveImproper();
		fraction3.setNumerator(Integer.parseInt(ansnumerator.getText()));
		fraction3.setDenominator(Integer.parseInt(ansdenominator.getText()));
		fraction3.setCoefficient(Integer.parseInt(anscoefficient.getText()));	
			
		int pass = recursiveGCD(fraction3.getNumerator(), fraction3.getDenominator());
			fraction3.simplify(pass);
			
		fraction3.improperConvert();
		
		anscoefficient.setText(Integer.toString(fraction3.getCoefficient()));
		ansdenominator.setText(Integer.toString(fraction3.getDenominator()));
		ansnumerator.setText(Integer.toString(fraction3.getNumerator()));
	}
	
	public void solveImproper(){
		if (addBoolean) {
			int gcd = recursiveGCD(fraction1.getDenominator(), fraction2.getDenominator());
			
			int lcm = (fraction1.getDenominator() * fraction2.getDenominator()) / gcd;
			
			fraction1.makaBig(lcm);
			fraction2.makaBig(lcm);
			
			fraction1.mixedConvert();
			fraction2.mixedConvert();
						
			ansnumerator.setText(Integer.toString(fraction1.getNumerator() + fraction2.getNumerator()));
			
			ansdenominator.setText(Integer.toString(fraction1.getDenominator()));
			
			passSimplify();
			
			
		} 
		else if (subtractBoolean) {
			int gcd = recursiveGCD(fraction1.getDenominator(), fraction2.getDenominator());
			
			int lcm = (fraction1.getDenominator() * fraction2.getDenominator()) / gcd;
			
			fraction1.makaBig(lcm);
			fraction2.makaBig(lcm);

			fraction1.mixedConvert();
			fraction2.mixedConvert();
			
			
			ansnumerator.setText(Integer.toString(fraction1.getNumerator() - fraction2.getNumerator()));
			
			ansdenominator.setText(Integer.toString(fraction1.getDenominator()));
			passSimplify();
		}
		else if(multiplyBoolean){
			fraction1.mixedConvert();
			fraction2.mixedConvert();
			
			ansnumerator.setText(Integer.toString(fraction1.getNumerator() * fraction2.getNumerator()));
			
			ansdenominator.setText(Integer.toString(fraction1.getDenominator() * fraction2.getDenominator()));
			passSimplify();
		}
		else if(divideBoolean){
			fraction1.mixedConvert();
			fraction2.mixedConvert();
			
			int newNumerator = fraction2.getDenominator();
			fraction2.setDenominator(fraction2.getNumerator());
			fraction2.setNumerator(newNumerator);
			
			ansnumerator.setText(Integer.toString(fraction1.getNumerator() * fraction2.getNumerator()));
			
			ansdenominator.setText(Integer.toString(fraction1.getDenominator() * fraction2.getDenominator()));
			passSimplify();

		} 
		else {
			System.out.println("u probably didnt pick a buttonn nnnnnnnnnn");
		}
	int pass = recursiveGCD(fraction3.getNumerator(), fraction3.getDenominator());
		fraction3.simplify(pass);
	}
	
	public  void setObject(int f1coefficient,int f1numerator, int f1denominator, int f2coefficient, int f2numerator, int f2denominator){
		fraction1.setNumerator(f1numerator);
		fraction1.setDenominator(f1denominator);
		fraction1.setCoefficient(f1coefficient);
		
		fraction2.setNumerator(f2numerator);
		fraction2.setDenominator(f2denominator);
		fraction2.setCoefficient(f2coefficient);
	}
	public void passSimplify(){
		fraction3.setNumerator(Integer.parseInt(ansnumerator.getText()));
		fraction3.setDenominator(Integer.parseInt(ansdenominator.getText()));
		fraction3.setCoefficient(Integer.parseInt(anscoefficient.getText()));	
			
		int pass = recursiveGCD(fraction3.getNumerator(), fraction3.getDenominator());
			fraction3.simplify(pass);
			
			ansnumerator.setText(Integer.toString(fraction3.getNumerator()));
			ansdenominator.setText(Integer.toString(fraction3.getDenominator()));
	}
}