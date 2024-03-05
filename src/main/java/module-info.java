module org.openjfx.tipcalculatorapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.openjfx.tipcalculatorapp to javafx.fxml;
    exports org.openjfx.tipcalculatorapp;
}