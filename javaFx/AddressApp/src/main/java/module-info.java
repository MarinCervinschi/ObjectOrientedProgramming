module com.mcervinschi.javafx.addressapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mcervinschi.javafx.addressapp to javafx.fxml;
    exports com.mcervinschi.javafx.addressapp;
}