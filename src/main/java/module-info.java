module com.example.holiday {
    requires java.sql;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;


    opens com.example.holiday to javafx.fxml;
    exports com.example.holiday;
}