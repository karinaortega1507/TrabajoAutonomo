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
public class Principal {
    public static void main(String[] args) {
        SnookerPlayer snookerPlayer = new SnookerPlayer(7);
        int snookerPlayerEndurance  = snookerPlayer.playerEndurance();
        System.out.println(snookerPlayerEndurance);
    }
    
}
