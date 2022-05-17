package com.example.holiday;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller2 {

    @FXML
    private Button closeButton;

    @FXML
    private Button backButton;

    @FXML
    private Button validButton;

    @FXML
    private Label requestMessageLabel;

    @FXML
    private ListView<String> myListView;

    @FXML
    private DatePicker myDatePicker;

    @FXML
    private Label myLabel1;

    @FXML
    private Label myLabel2;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void initialize () {

        myListView.getItems().addAll(
                "Maternity Leave",
                "Paternity Leave",
                "Casual Leave",
                "Holiday",
                "Vocational training leave",
                "Unpaid leave",
                "Sick leave",
                "Medical leave for work-related injury",
                "Sick childcare leave",
                "Childcare leave",
                "Holiday for special events",
                "Quarantine leave",
                "Accommodation leave",
                " "
                );

        myListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
                String current;
                current = myListView.getSelectionModel().getSelectedItem();
                myLabel1.setText(current);

            }
        });
    }

    public void getDate (ActionEvent e){
        LocalDate myDate = myDatePicker.getValue();
        String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
        myLabel2.setText(myFormattedDate);
    }

    public void validButtonAction (ActionEvent e){

        if (myLabel1.getText().isBlank()==false && myLabel2.getText().isBlank()==false)
            requestMessageLabel.setText("Request sent for validation");
            else
                requestMessageLabel.setText("Invalid Choices");
    }

    FXMLLoader loader3 = new FXMLLoader(getClass().getResource("Register.fxml"));
    public void backButtonAction (ActionEvent e) throws IOException {
        root = loader3.load();
        stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void closeButtonAction (ActionEvent e){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

}

