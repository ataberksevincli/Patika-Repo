module com.example.patikarepo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.patikarepo to javafx.fxml;
    exports com.example.patikarepo;
}