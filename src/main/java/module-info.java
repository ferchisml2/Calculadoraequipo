module com.example.calculadoraequipo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.calculadoraequipo to javafx.fxml;
    exports com.example.calculadoraequipo;
}