module com.cervinschi.marin.javafx.snake {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.cervinschi.marin.javafx.snake to javafx.fxml;
    exports com.cervinschi.marin.javafx.snake;
}