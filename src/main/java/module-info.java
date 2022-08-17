module com.example.ejerciciotema2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciotema2 to javafx.fxml;
    exports com.example.ejerciciotema2;
}