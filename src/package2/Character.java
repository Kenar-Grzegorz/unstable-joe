/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package2;

import java.io.Serializable;

/**
 *
 * @author gregg
 */
public class Character implements  Serializable {
    private String name;

    public Character() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + '}';
    }
    
}
