/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession;

/**
 *
 * @author karina O.
 */
public class TransporteRefactor {
    
    TipoTransporte tipo;
    
    public TransporteRefactor(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }
    
}
