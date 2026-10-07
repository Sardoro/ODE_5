module com.example.ode_5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ode_5 to javafx.fxml;
    exports com.example.ode_5;
}