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

    @FXML
    private TextField inputTextField1;

    @FXML
    private TextField outputTextField1;

    @FXML
    private Button decryptButton;

    @FXML
    private TextField numberTextField;
    
    public void initialize() {
    	
    }
    
   @FXML
   private void encryptText(ActionEvent e) {
	   //Get text from inputText Field
	   String number = numberTextField.getText();
     try {
      int n = Integer.valueOf(number);

      //Ensure text is not empty
     if (inputTextField.getText() != null && inputTextField.getText().length() != 0) {
     //Pass text to Encryption Class
       String message = inputTextField.getText();
       Encrypt hidden = new Encrypt(message, n);
       String output = hidden.encryptText();
     //return encrypted text and print to outputTExtField
       outputTextField.setText(output);
     }
     }
     catch (Exception exception) {
      numberTextField.setText("Enter valid number");

     }
	   
   }

   @FXML
    void decryptText(ActionEvent event) {

      //Get text from inputText Field
     String number = numberTextField.getText();
     try {
      int n = Integer.parseInt(number);

      if (inputTextField1.getText() != null && inputTextField1.getText().length() != 0) {

        String message = inputTextField1.getText();
        Decrypt hidden = new Decrypt(message, n);
        String output = hidden.decryptText();

        outputTextField1.setText(output);

      }

     }
     catch (Exception exception) {
      numberTextField.setText("Enter valid number");

    }




    }	

}

