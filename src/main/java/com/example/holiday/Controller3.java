package com.example.holiday;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller3 {

    @FXML
    Label nameLabel;

    @FXML
    private Label validationText;

    @FXML
    private Button validationButton;

    @FXML
    private Button closeButton;

    @FXML
    private Button backButton;

    @FXML
    private ImageView myImageView;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void initialize(){
        Image image = new Image("file:///Users/iasmina012/IdeaProjects/demo/Holiday/src/hr.jpg");
        myImageView.setImage(image);
    }

    FXMLLoader loader4 = new FXMLLoader(getClass().getResource("Register.fxml"));
    public void backButtonAction (ActionEvent e) throws IOException {
        root = loader4.load();
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void closeButtonAction (ActionEvent e){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    public void validationButtonAction (ActionEvent e){
        validationText.setText("Requests validated");

    }

}