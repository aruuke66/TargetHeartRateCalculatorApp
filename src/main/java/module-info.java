module com.example.targetheartratecalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.targetheartratecalculatorapp to javafx.fxml;
    exports com.example.targetheartratecalculatorapp;
}