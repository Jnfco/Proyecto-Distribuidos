/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;

/**
 *
 * @author jnfco
 */
public class FXMLDocumentController implements Initializable 
{
    
    @FXML
    private GridPane gridPane;
    
    @FXML
    private Button centralButton;
    
    @FXML
    private ToggleButton estacion1;
    
    @FXML
    private ToggleButton estacion2;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    
    
}
