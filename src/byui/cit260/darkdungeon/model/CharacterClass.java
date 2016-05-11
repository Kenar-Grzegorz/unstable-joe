/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.darkdungeon.model;

import java.io.Serializable;

/**
 *
 * @author gregg
 */
public class CharacterClass implements Serializable {
    private int health;
    private int attackStr;
    
    
    public CharacterClass() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackStr() {
        return attackStr;
    }

    public void setAttackStr(int attackStr) {
        this.attackStr = attackStr;
    }

    @Override
    public String toString() {
        return "Character{" + "health=" + health + ", attackStr=" + attackStr + '}';
    }
    
    
    
    
    
}
