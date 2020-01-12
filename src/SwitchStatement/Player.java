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
public abstract class Player {
   private final Type type;
   private final int delta;

   public Player(int delta) {
       this.type = null;
       this.delta = delta;
   }
   
   public Player(Type type, int delta) {
      this.type = type;
      this.delta = delta;
   }

   public Type getType() {
      return type;
   }

   public int getDelta() {
      return delta;
   }

   public abstract int playerEndurance();


}
