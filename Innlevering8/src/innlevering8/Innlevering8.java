/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 888651
 */
public class Innlevering8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Oppgave1a();
        Oppgave1b();
        Oppgave1c();
        Oppgave2a();
        Oppgave2b();
        Oppgave3b();
        Oppgave4();
    }
    
    public static void Oppgave1a() {
        System.out.println("Hello World");
    }
    
    
    /**
     * Oppgave 1 b
     */
    public static void Oppgave1b() {
        System.out.print("jeg har eksamen");
        System.out.print(" i java-\n");
        System.out.print("programmering");
        System.out.print(" og");
        System.out.print(" elsker det!");
    }
    
    public static void Oppgave1c() {
        int limit = 10;
        
        for(int i=1; i<limit; i++) {
            System.out.println(2 * i * (i - 1));
        }
        
        int a = 0;
        while(a < limit) {
            System.out.println(2 * a * (a - 1));
            a++;
        }
    }
    
    public static void Oppgave2a() {
        int square = 5;
        int lines = 0;
        
        for(int y = 0; y < square; y++) {
            lines++;
            for(int x = 1; x <=lines; x++) {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
    
    public static void Oppgave2b() {
        Scanner in = new Scanner(System.in);
        ArrayList intList = new ArrayList();
        
        int input = -1;
        
        while(input != 0) {
            try {
                System.out.println("Angi nummer: ");
                input = in.nextInt();
                intList.add(input);
            } catch(Exception e) {
                System.out.println("Ugyldig input");
            }
        }
    }
    
    public static void Oppgave3b() {
        Tabell t = new Tabell();
        t.printArray();
        
        t.sort();
        t.printArray();
    }
    
    public static void Oppgave4() {
        int floors = 3;
        int rooms = 5;
        Hybelhus hus = new Hybelhus(floors);
        
        String[] letters = {"A","B","C","D","E"};
        
        for(int i=0; i<floors; i++) {
            Floor floor = new Floor(rooms);
            
            for(int j=0; j<rooms; j++) {
                Hybel room = new Hybel(j, letters[j]);
                floor.addRoom(room);
            }
            hus.addFloor(floor);
        }
    }
    
}
