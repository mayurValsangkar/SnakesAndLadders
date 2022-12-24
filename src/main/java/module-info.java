module com.example.snakeladderdec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeladderdec to javafx.fxml;
    exports com.example.snakeladderdec;
}