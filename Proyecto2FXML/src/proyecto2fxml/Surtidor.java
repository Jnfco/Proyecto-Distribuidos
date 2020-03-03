/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2fxml;

/**
 *
 * @author jnfco
 */
public class Surtidor {

    int idDistribuidor;
    String tipoCombustible;
    float litrosVendidos;
    float litrosDisponibles;
    float venta;
    float precioLitro;

    public Surtidor(int idDistribuidor, String tipoCombustible, float litrosVendidos, float litrosDisponibles, float venta, float precioLitro) {
        this.idDistribuidor = idDistribuidor;
        this.tipoCombustible = tipoCombustible;
        this.litrosVendidos = litrosVendidos;
        this.litrosDisponibles = litrosDisponibles;
        this.venta = venta;
        this.precioLitro = precioLitro;
    }
    
    public Surtidor(){
        
    }
    
    public int getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(int idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public float getLitrosVendidos() {
        return litrosVendidos;
    }

    public void setLitrosVendidos(float litrosVendidos) {
        this.litrosVendidos = litrosVendidos;
    }

    public float getLitrosDisponibles() {
        return litrosDisponibles;
    }

    public void setLitrosDisponibles(float litrosDisponibles) {
        this.litrosDisponibles = litrosDisponibles;
    }

    public float getVenta() {
        return venta;
    }

    public void setVenta(float venta) {
        this.venta = venta;
    }

    public float getPrecioLitro() {
        return precioLitro;
    }

    public void setPrecioLitro(float precioLitro) {
        this.precioLitro = precioLitro;
    }
    
    
    
    
    
}
