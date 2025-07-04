package com.example.calculadoraequipo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OperacionController {

    @FXML
    private TextField numero1Field;

    @FXML
    private TextField numero2Field;

    @FXML
    private Label resultadoLabel;

    private String operacion;

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    @FXML
    protected void calcular() {
        try {
            double num1 = Double.parseDouble(numero1Field.getText());
            double num2 = Double.parseDouble(numero2Field.getText());
            double resultado;

            if ("suma".equals(operacion)) {
                resultado = num1 + num2;
            } else {
                resultado = num1 - num2;
            }

            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Ingresa números válidos");
        }
    }
}
