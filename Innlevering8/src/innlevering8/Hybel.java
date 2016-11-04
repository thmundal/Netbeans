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
public class Hybel {
    private int room_floor;
    private String room_letter;
    private ArrayList<String> students;
    
    public Hybel(int fl, String letter) {
        room_floor = fl;
        room_letter = letter;
    }
    
    public String getRoomID() {
        return (String) (room_floor+""+room_letter);
    }
    
    public void addStudent(String name) {
        students.add(name);
    }
    
    public void removeStudent(String name) {
        students.remove(name);
    }
}
