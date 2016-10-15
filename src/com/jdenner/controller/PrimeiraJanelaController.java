package com.jdenner.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Juliano
 */
public class PrimeiraJanelaController implements Initializable {

    @FXML
    private TextField tfCampoTexto;

    @FXML
    public void enviarTexto(ActionEvent event) throws IOException {
        String texto = tfCampoTexto.getText();
        
        String url = "/com/jdenner/view/SegundaJanela.fxml";
        FXMLLoader loader = new FXMLLoader(getClass().getResource(url));
        Parent root = loader.load();
        
        SegundaJanelaController controller = loader.getController();
        controller.setTexto(texto);
        
        Scene scene = new Scene(root);
        Stage stage = (Stage) tfCampoTexto.getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
