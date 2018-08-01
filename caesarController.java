import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;


public class caesarController {

    @FXML
    private TextField inputTextField;

    @FXML
    private Button encryptButton;

    @FXML
    private Label titleLabel;

    @FXML
    private TextField outputTextField;
    
    public void initialize() {
    	
    }
    
   @FXML
   private void encryptText(ActionEvent e) {
	   //Get text from inputText Field
	   
	   //Ensure text is not empty
	   if (inputTextField.getText() != null && inputTextField.getText().length() != 0) {
		 //Pass text to Encryption Class
		   String message = inputTextField.getText();
		   Encrypt hidden = new Encrypt(message);
		   String output = hidden.encryptText();
		 //return encrypted text and print to outputTExtField
		   outputTextField.setText(output);
	   }
	   
   }	

}

