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
public class Hybelhus {
    private ArrayList<Floor> floors;
    
    
    public Hybelhus(int fl) {
        floors =  new ArrayList<>(fl);
    }
    
    public void addFloor(Floor fl) {
        floors.add(fl);
    }
    
    public void moveIn(String name, int floor, char room) {
        
    }
    
    public Hybel findRoomByChar(String c) {
        return new Hybel(1, "a");
    }
}
