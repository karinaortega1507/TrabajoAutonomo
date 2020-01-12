/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatement;

/**
 *
 * @author DELL
 */
public class SnookerPlayer extends Player {

   public SnookerPlayer(Type type, int delta) {
      super(type, delta);
   }

    public SnookerPlayer(int i) {
        super(i);
    }
   
   @Override
   public int playerEndurance() {
      return ComputeEnduranceAlgorithm.basicEndurance(this.getDelta());
       
   }

    
}
