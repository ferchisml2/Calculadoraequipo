//Comentario para hacer un commit
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

    // Método para recibir la operación desde el controlador anterior
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    @FXML
    protected void calcular() {
        try {
            double num1 = Double.parseDouble(numero1Field.getText());
            double num2 = Double.parseDouble(numero2Field.getText());
            double resultado;

            switch (operacion) {
                case "suma":
                    resultado = num1 + num2;
                    break;
                case "resta":
                    resultado = num1 - num2;
                    break;
                case "multiplicacion":
                    resultado = num1 * num2;
                    break;
                case "division":
                    if (num2 == 0) {
                        resultadoLabel.setText("Error: división entre cero");
                        return;
                    }
                    resultado = num1 / num2;
                    break;
                default:
                    resultadoLabel.setText("Operación no válida");
                    return;
            }

            resultadoLabel.setText("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Por favor, ingresa números válidos");
        }
    }
}