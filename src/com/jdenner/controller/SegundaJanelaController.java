package com.jdenner.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Juliano
 */
public class SegundaJanelaController implements Initializable {

    @FXML
    private Label lbTexto;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    public void setTexto(String texto) {
        lbTexto.setText(texto);
    }
    
}
