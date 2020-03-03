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
public class Distribuidor {
    
    float precioDiesel;
    float precioKerosene;
    float precio93;
    float precio95;
    float precio97;
    float factorUtilidad;

    public Distribuidor(float precioDiesel, float precioKerosene, float precio93, float precio95, float precio97, float factorUtilidad) {
        this.precioDiesel = precioDiesel;
        this.precioKerosene = precioKerosene;
        this.precio93 = precio93;
        this.precio95 = precio95;
        this.precio97 = precio97;
        this.factorUtilidad = factorUtilidad;
    }

    public Distribuidor() {
    }

    public float getPrecioDiesel() {
        return precioDiesel;
    }

    public void setPrecioDiesel(float precioDiesel) {
        this.precioDiesel = precioDiesel;
    }

    public float getPrecioKerosene() {
        return precioKerosene;
    }

    public void setPrecioKerosene(float precioKerosene) {
        this.precioKerosene = precioKerosene;
    }

    public float getPrecio93() {
        return precio93;
    }

    public void setPrecio93(float precio93) {
        this.precio93 = precio93;
    }

    public float getPrecio95() {
        return precio95;
    }

    public void setPrecio95(float precio95) {
        this.precio95 = precio95;
    }

    public float getPrecio97() {
        return precio97;
    }

    public void setPrecio97(float precio97) {
        this.precio97 = precio97;
    }

    public float getFactorUtilidad() {
        return factorUtilidad;
    }

    public void setFactorUtilidad(float factorUtilidad) {
        this.factorUtilidad = factorUtilidad;
    }
    
}
