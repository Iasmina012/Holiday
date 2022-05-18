module com.example.holiday {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.holiday to javafx.fxml;
    exports com.example.holiday;
}