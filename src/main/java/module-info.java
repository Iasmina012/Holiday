module com.example.holiday {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens com.example.holiday to javafx.fxml;
    exports com.example.holiday;
}