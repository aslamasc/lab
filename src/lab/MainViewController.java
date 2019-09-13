package lab;
import  javafx.scene.control.Button;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;


public class MainViewController implements Initializable{
	@FXML private Button nextButton;

	@FXML private ComboBox<Integer> n1;
	@FXML private ComboBox<Integer> n2;
	@FXML private ComboBox<Integer> n3;
	@FXML private ComboBox<Integer> n4;
	@FXML private ComboBox<Integer> n5;
	@FXML private ComboBox<Integer> n6;
	@FXML private ComboBox<Integer> n7;
	@FXML private ComboBox<Integer> n8;


	@Override
	public void initialize(URL loaction, ResourceBundle resources){
		Integer[] options = {0, 1, 2, 3, 4, 5, 6, 7, 8 ,9};
		for (ComboBox<Integer> comboBox: Arrays.asList(n1, n2, n3, n4 , n5, n6, n7, n8)) {
			comboBox.getItems().addAll(options);
		}
		nextButton.setDisable(true);
	}

	@FXML
	private void comboBoxValueChanged(){
		for (ComboBox<Integer>comboBox: Arrays.asList(n1,n2,n3,n4,n5,n6,n7,n8)){
			if (comboBox.getValue() == null) {
				System.out.println("At least 1 number of matriculation number not yet filled");
				nextButton.setDisable(true);
				return;
			}
		}
		
		System.out.println("ok");
		nextButton.setDisable(false);
		
		
		
	}
	
	public void validate(String matriculationNumber) {
		boolean isCorrect= IsMatriculationNumber(matriculationNumber);
		nextButton.setDisable(isCorrect);
		if(isCorrect) {
			System.out.println("validation fail");
		}
		else {
			System.out.println("validation success");
		}
		
	}

	public boolean IsMatriculationNumber(String matriculationNumber) {
		
		return matriculationNumber.matches("[0-9]+") && matriculationNumber.length()==8;
	}
	
	@FXML
	private void next() {
		System.out.println("next Button Click");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}