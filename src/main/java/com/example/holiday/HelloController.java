package com.example.holiday;

//import com.example.holiday.exceptions.UsernameAlreadyExistsException;
//import com.example.holiday.services.UserService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private Button cancelButton;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    public void cancelButtonAction(ActionEvent e){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtonAction(ActionEvent e){
        loginMessageLabel.setText("Da");
        if(usernameTextField.getText().isBlank()==false && passwordPasswordField.getText().isBlank()==false)
        {
            loginMessageLabel.setText("You try to login");
        } else {
            loginMessageLabel.setText("Please enter username and password.");
        }
    }
    @FXML
    private ChoiceBox<String> myChoiceBox;
    public void initialize() {
        myChoiceBox.getItems().addAll("Admin", "User");
    }
/*    @FXML
    public void handleRegisterAction() {
        try {
            UserService.addUser(usernameTextField.getText(), passwordPasswordField.getText(), (String) myChoiceBox.getValue());
            registrationMessage.setText("Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            registrationMessage.setText(e.getMessage());
        }

    }

 */

}
