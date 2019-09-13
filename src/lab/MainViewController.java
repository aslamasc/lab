package lab;
import  javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;



import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;


public class MainViewController implements Initializable{
	@FXML private Button nextButton;

	@FXML private TextField textField;


	@Override
	public void initialize(URL loaction, ResourceBundle resources){
		textField.textProperty().addListener((observable, oldValue, newValue) -> {
		    validate(newValue);
		});
		//nextButton.setDisable(true);
	}

	
	
	public void validate(String matriculationNumber) {
		boolean isCorrect= IsMatriculationNumber(matriculationNumber);
		nextButton.setDisable(isCorrect);
		if(isCorrect) {
			System.out.println("validation success");
			nextButton.setDisable(false);
		}
		else {
			System.out.println("validation faill");
			nextButton.setDisable(true);
		}
		
	}

	public boolean IsMatriculationNumber(String matriculationNumber) {
		
		return matriculationNumber.matches("[00000000-99999999]+") && matriculationNumber.length()==8;
	}
	
	@FXML
	private void next() {
		System.out.println("next Button Click");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}