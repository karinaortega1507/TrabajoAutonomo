/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivergeChange;

/**
 *
 * @author Hp
 */
public class Cuenta {
    private int numCuenta;
    private double saldo;
    private Cliente cliente= new Cliente();

    public Cuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    public double getSaldo() {
        return saldo;
    }
    public void acreditar(double monto){
        saldo = saldo + monto;
    }
    public void debitar(double monto){
        saldo = saldo - monto;
    }

    public String toXml() {
        return "<Cuenta><id>{" + Integer.toString(this.getNumCuenta())+ "</id>" + "<saldo>"+ Double.toString(getSaldo()) + "<saldo/cuenta>";
    }
}
