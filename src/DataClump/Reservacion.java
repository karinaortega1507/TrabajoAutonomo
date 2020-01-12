/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClump;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Reservacion {
    private int codigo;
    private float precio;
    private Date fecha_ida;
    private Date fecha_retorno;

    public Reservacion(int codigo, float precio, Date fecha_ida, Date fecha_retorno) {
        this.codigo = codigo;
        this.precio = precio;
        this.fecha_ida = fecha_ida;
        this.fecha_retorno = fecha_retorno;
    }

    public int getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public Date getFecha_ida() {
        return fecha_ida;
    }

    public Date getFecha_retorno() {
        return fecha_retorno;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFecha_ida(Date fecha_ida) {
        this.fecha_ida = fecha_ida;
    }

    public void setFecha_retorno(Date fecha_retorno) {
        this.fecha_retorno = fecha_retorno;
    }
   
    
    
    
}
