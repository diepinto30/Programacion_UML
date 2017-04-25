/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

/**
 *
 * @author UTPL
 */
public class Producto {
    private String strDescripcion;
    private double dblPrecio;

    public Producto(String astrDescripcion, double aPrecio) {
        this.strDescripcion = astrDescripcion;
        this.dblPrecio = aPrecio;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public double getDblPrecio() {
        return dblPrecio;
    }
    
    
}
