/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksamensoppgave2015;

/**
 *
 * @author Thomas
 */
public class Eksamensoppgave2015 { // <-- DETTE ER EN KLASSE

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Oppgave 1 a
        CheckPassFail chk = new CheckPassFail(args);            // <-- DETTE ER EN KONSTRUKTØR, chk ER ET OBJEKT SOM BLIR INSTANSIERT AV KONSTRUKTØREN
        
        // Oppgave 1 b
        PrintNumberInWorld number = new PrintNumberInWorld(args);

        // Oppgave 1 c
        int /* <- DETTE ER EN PRIMITIV DATATYPE */ bleh;
        
        System.out.println("Identifikator / Identifyer er navnet på en metode i en klasse");
        System.out.println("Case-sensitive refererer til det faktum at det er en betydelig forskjell mellom store og små bokstaver");
        System.out.println("En klasse er en \"blueprint\" eller oppskrift til et objekt.");
        System.out.println("Et objekt er data som er instansiert av en klasse og er definert av klassens konstruktør, medlemmer og metoder");
        System.out.println("En primitiv datatype er en datatype som er grunnleggende for programmeringsspråket, for java er eksempler \"int\", \"String\" og \"boolean\"");
        System.out.println("En konstruktør er funksjonen som instansierer et objekt av en gitt klasse");
        
        // Oppgave 2
        printOdds();
        
        // Oppgave 3
        NumberStorage nstore = new NumberStorage();
        nstore.sortArray();
    }
    
    public static void Idenfifier() /* <-- DETTE ER EN IDENTIFIKATOR / IDENTIFYER */{
        
    }
    
    /**
     * Metode som utfører oppgave 2
     */
    public static void printOdds() {
        for(int i=0; i<100; i++) {
            if(i % 2 != 0) {
                // Oppgave 2 b
                if(i == 11 || i == 57 || i== 61 || i == 97) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
    
    /**
     * Metode som utfører oppgave 1 a
     */
    public static void HelloWorld() {
        System.out.println("Hello World");
    }
    
    /**
     * Oppgave 1 b
     */
    public static void strinParts() {
        System.out.print("jeg har eksamen");
        System.out.print(" i java-\n");
        System.out.print("programmering");
        System.out.print(" og");
        System.out.print(" elsker det!");
    }
    
}
