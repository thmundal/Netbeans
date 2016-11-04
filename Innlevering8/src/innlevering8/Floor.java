/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering8;

import java.util.ArrayList;

/**
 *
 * @author 888651
 */
public class Floor {
    private ArrayList<Hybel> rooms;
    
    public Floor(int rm) {
        rooms = new ArrayList<>(rm);
    }
    
    public void addRoom(Hybel room) {
        rooms.add(room);
    }
}
