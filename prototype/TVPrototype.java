/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inv2.prototype;

import java.util.HashMap;

/**
 *
 * @author truez
 */
public class TVPrototype {
    private HashMap<String, TV> prototipos = new HashMap<String, TV>();
    
    public TVPrototype() {
        Plasma element1 = new Plasma("panasonic", 50, "negro", 200000);
        LCD element2 = new LCD("viera", 32, "blanca", 100000);
        prototipos.put("Plasma", element1);
        prototipos.put("LCD", element2);
        //System.out.println(prototipos.get(""));
    }
    
    public Object prototipo(String tipo) throws CloneNotSupportedException {
        return prototipos.get(tipo).clone();
    }
}
