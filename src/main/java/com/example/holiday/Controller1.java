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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
        myChoiceBox.setValue("User");

    }

    public void getChoice(ChoiceBox<String> myChoiceBox){
        String role = myChoiceBox.getValue();
    }

    public void cancelButtonAction (ActionEvent e){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtonAction (ActionEvent e) throws IOException{

        FXMLLoader loader1 = new FXMLLoader(getClass().getResource("Employee.fxml"));
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("HR.fxml"));

        if(usernameTextField.getText().isBlank()==false && passwordPasswordField.getText().isBlank()==false)
        {
            //validateLogin();

            if(myChoiceBox.getValue()=="User") {

                root = loader1.load();
                stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();


            }
            else{

                root = loader2.load();
                stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            }
        } else {

            loginMessageLabel.setText("Please enter the username and password");
        }

    }

    public void validateLogin(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String verifyLogin = "SELECT count(1) FROM UserAccounts WHERE username = '"+usernameTextField.getText()+"' AND PASSWORD = '"+passwordPasswordField.getText()+"'";
        try{
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);
            while(queryResult.next()){
                if(queryResult.getInt(1)==1)
                {
                    loginMessageLabel.setText("Welcome");
                }
                else
                {
                    loginMessageLabel.setText("Try again");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}