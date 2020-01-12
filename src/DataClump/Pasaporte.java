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
public class Pasaporte {
    private int numPasaporte;
    private Date fechaExpedicion;
    private int codigo;
    private TipoPasaporte tipo;
    private Date fechaExpiracion;

    public Pasaporte(int numPasaporte, Date fechaExpedicion, int codigo, TipoPasaporte tipo, Date fechaExpiracion) {
        this.numPasaporte = numPasaporte;
        this.fechaExpedicion = fechaExpedicion;
        this.codigo = codigo;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getNumPasaporte() {
        return numPasaporte;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public int getCodigo() {
        return codigo;
    }

    public TipoPasaporte getTipo() {
        return tipo;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setNumPasaporte(int numPasaporte) {
        this.numPasaporte = numPasaporte;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTipo(TipoPasaporte tipo) {
        this.tipo = tipo;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    
    
}
