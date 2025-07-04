package com.example.calculadoraequipo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.scene.Parent;

public class HelloController package com.example.calculadoraequipo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.scene.Parent;

public class HelloController {

    @FXML
    protected void onSumaClick(ActionEvent event) throws Exception {
        abrirOperacion(event, "suma");
    }

    @FXML
    protected void onRestaClick(ActionEvent event) throws Exception {
        abrirOperacion(event, "resta");
    }

    @FXML
    protected void onMultiplicacionClick(ActionEvent event) throws Exception {
        abrirOperacion(event, "multiplicacion");
    }

    @FXML
    protected void onDivisionClick(ActionEvent event) throws Exception {
        abrirOperacion(event, "division");
    }

    private void abrirOperacion(ActionEvent event, String operacion) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("operacion-view.fxml"));
        Parent root = loader.load();

        OperacionController controller = loader.getController();
        controller.setOperacion(operacion);

        Stage stage = new Stage();
        stage.setTitle("Operación: " + operacion);
        stage.setScene(new Scene(root));
        stage.show();

        // Opcional: cerrar la ventana anterior si se desea
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }
}

