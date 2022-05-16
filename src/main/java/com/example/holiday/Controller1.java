package com.example.holiday;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller1 {

    @FXML
    private Button cancelButton;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private Stage stage;
    private Scene scene;
    private Parent root;

   public void initialize() {
       myChoiceBox.getItems().addAll("Admin", "User");
   }
       public void cancelButtonAction (ActionEvent e){
           Stage stage = (Stage) cancelButton.getScene().getWindow();
           stage.close();
       }

    public void loginButtonAction (ActionEvent e) throws IOException{
        loginMessageLabel.setText("Da");if(usernameTextField.getText().isBlank()==false && passwordPasswordField.getText().isBlank()==false)
        {
            loginMessageLabel.setText("You try to login");
        } else {
            loginMessageLabel.setText("Please enter username and password.");
        }

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Employee.fxml"));
        root = loader.load();

        Controller2 scene2Controller = loader.getController();

        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}
