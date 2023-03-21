module com.example.asteroidsapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.asteroidsapplication to javafx.fxml;
    exports com.example.asteroidsapplication;
}