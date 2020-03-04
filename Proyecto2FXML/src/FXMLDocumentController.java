/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
    private Button estacion1;
    
    @FXML
    private Button estacion2;
    
    @FXML
    private TableView tablaEst1;
    
    @FXML
    private TableView tablaEst2;
    
       @FXML 
    private Button agregarVenta1; 
     
    @FXML 
    private Button agregarVenta2; 
    
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException 
    {
        System.out.println("BotÃ³n Central");
         
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Central.fxml"));
       // stage.setTitle("Register");
        stage.setScene(new Scene(root,1020,650));
        stage.show();
        
         
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
        this.estacion1.wrapTextProperty().setValue(true);
        this.estacion2.wrapTextProperty().setValue(true);
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
    
    @FXML 
    private void agregarVenta1Handler(ActionEvent event)    
    { 
        // agregar datos de una venta random a la base de datos 
    } 
     
    @FXML 
    private void agregarVenta2Handler(ActionEvent event)    
    { 
        // agregar datos de una venta random a la base de datos 
    } 
    
}
