package co.uniquindio.edu.javafx.Controlador;

import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.edu.javafx.Modelo.EnemigoPlantilla;
import co.uniquindio.edu.javafx.Modelo.Guerrero;
import co.uniquindio.edu.javafx.Modelo.Mago;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class EnemigoPlantillaControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIniciar;

    @FXML
    private Label txtResultado;

    @FXML
    void iniciarBatalla(ActionEvent event) {
        EnemigoPlantilla guerrero = new Guerrero();
        EnemigoPlantilla mago = new Mago();
        txtResultado.setText("Gerrero:  " + guerrero.template() +"\n" + "Mago:  " + mago.template());
    }

    @FXML
    void initialize() {
        assert btnIniciar != null : "fx:id=\"btnIniciar\" was not injected: check your FXML file 'viewEnemigoPlantillaControlador.fxml'.";
        assert txtResultado != null : "fx:id=\"txtResultado\" was not injected: check your FXML file 'viewEnemigoPlantillaControlador.fxml'.";

    }

}
