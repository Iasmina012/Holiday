package com.example.holiday;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller3 {

    @FXML
    Label nameLabel;

    public void displayName (String username) {
        nameLabel.setText("Hello 3: " + username);
    }
}

