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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
         Surtidor surtidor = new Surtidor(1,"Kerosene",10,100,1000,90);
         Distribuidor distribuidor = new Distribuidor(700,650,652,690,600,3);
         
         //Insertar un distribuidor
         //long id = db.insertarDistribuidor(distribuidor);
        //System.out.println("Distribuidor ha sido insertado con el id "+ id +" "+distribuidor.getPrecioKerosene()+" "+distribuidor.getPrecioDiesel()+" "+distribuidor.getPrecio93()+" "+distribuidor.getPrecio95()+" "+distribuidor.getPrecio97()); 
         

//System.out.println("%d,%s,%d,%d,%d,%d surtidor ha sido insertado con el id %d ",surtidor.getIdDistribuidor(),surtidor.getTipoCombustible(),surtidor.getLitrosVendidos(),surtidor.getLitrosDisponibles(),surtidor.getVenta(),surtidor.getPrecioLitro(),id);
         // System.out.println(String.format("%f,%f,%f,%f,%f,%f distribuidor ha sido insertado con el id %d ",distribuidor.getPrecioKerosene(),distribuidor.getPrecioDiesel(),distribuidor.getPrecio93(),distribuidor.getPrecio95(),distribuidor.getPrecio97(),id));
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
   
   public long insertarDistribuidor(Distribuidor distribuidor){
       long id =0;
       String SQL= "INSERT INTO distribuidor(preciodiesel,preciokerosene,precio93,precio95,precio97,factorutilidad) "
               +"VALUES(?,?,?,?,?,?) ";
        try (Connection conn = dbConnection();
                PreparedStatement pstmt = conn.prepareStatement(SQL,
                Statement.RETURN_GENERATED_KEYS)) {
           
 
            pstmt.setFloat(1, distribuidor.getPrecioDiesel());
            pstmt.setFloat(2, distribuidor.getPrecioKerosene());
            pstmt.setFloat(3, distribuidor.getPrecio93());
            pstmt.setFloat(4, distribuidor.getPrecio95());
            pstmt.setFloat(5, distribuidor.getPrecio97());
            pstmt.setFloat(6, distribuidor.getFactorUtilidad());
             
            
            int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;

   }
   
   public long insertarSurtidor(Surtidor surtidor){
       long id =0;
       String SQL= "INSERT INTO surtidor(iddistribuidor,tipocombustible,litrosvendidos,litrosdisponibles,venta,preciolitro) "
               +"VALUES(?,?,?,?,?,?) ";
        try (Connection conn = dbConnection();
                PreparedStatement pstmt = conn.prepareStatement(SQL,
                Statement.RETURN_GENERATED_KEYS)) {
 
            pstmt.setInt(1, surtidor.getIdDistribuidor());
            pstmt.setString(2, surtidor.getTipoCombustible());
            pstmt.setFloat(3, surtidor.getLitrosVendidos());
            pstmt.setFloat(4, surtidor.getLitrosDisponibles());
            pstmt.setFloat(5, surtidor.getVenta());
            pstmt.setFloat(6, surtidor.getPrecioLitro());
            int affectedRows = pstmt.executeUpdate();
            // check the affected rows 
            if (affectedRows > 0) {
                // get the ID back
                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        id = rs.getLong(1);
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return id;

   }
    
    
}
