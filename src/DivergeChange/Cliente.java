/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivergeChange;

/**
 *
 * @author DELL
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private int codigo;
    private Cuenta cuenta;
    
    public Cliente(){
        
    }
    public Cliente(String nombre, String apellido, int codigo, Cuenta cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.cuenta = cuenta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
   
}
