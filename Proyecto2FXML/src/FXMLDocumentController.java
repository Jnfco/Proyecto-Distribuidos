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
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import proyecto2fxml.Proyecto2FXML;

/**
 *
 * @author jnfco
 */
public class FXMLDocumentController implements Initializable 
{
    
    
    @FXML
    private Button centralButton;
    
    @FXML
    private Button estacion1;
    
    @FXML
    private Button estacion2;
    
    @FXML
    private TableView tablaEst1;
    
    @FXML
    private TableView tablaEst2;
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        System.out.println("Botón Central");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        System.out.println("inicializar");
        this.estacion1.wrapTextProperty().setValue(true);
        this.estacion2.wrapTextProperty().setValue(true);
        Proyecto2FXML p2 = new Proyecto2FXML();
        this.tablaEst1 = new TableView(p2.mostrarDatos(tablaEst1));
        
        //this.tablaEst1.refresh();
        System.out.println("tabla creada");
    }    
    
    @FXML
    private void botonEstacion1Handler(ActionEvent event)
    {
        System.out.println("e1");
    }
    
    @FXML
    private void botonEstacion2Handler(ActionEvent event)
    {
        System.out.println("e2");
    }
    
}
