package proyecto2fxml;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jnfco
 */
public class Proyecto2FXML extends Application {
    
    Connection connection;
        String url = "jdbc:postgresql://localhost:5432/Distribuidor1";
        String user = "postgres";
        String password = "Distribuidos1234";
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        stage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Proyecto2FXML db = new Proyecto2FXML();
         db.dbConnection();
        launch(args);
         
    }
    
   public Connection dbConnection() {
   
    try {
       
    Class.forName("org.postgresql.Driver");
   
    } catch(ClassNotFoundException e ){
              e.getMessage();
    }
   
    try {
       connection = DriverManager.getConnection(url, user, password);
        JOptionPane.showMessageDialog(null, "Connected");
    } catch (SQLException ex) {
        Logger.getLogger(Proyecto2FXML.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "Failed To Connect");
    }
   
    return connection;
}
    
    
}
