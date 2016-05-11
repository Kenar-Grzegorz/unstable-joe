/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkdungeon;
import byui.cit260.darkdungeon.model.*;

/**
 *
 * @author gregg
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // created by Greg
        CharacterClass character = new CharacterClass();
        character.setHealth(100);
        character.setAttackStr(50);
        System.out.println(character.toString());
        
        //test location
    }
    
}
