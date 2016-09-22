/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering.pkg3;

/**
 *
 * @author Thomas
 */
public class Innlevering3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Oppgave 1
        System.out.println("Oppgave 1:");
        Task3_1();
        System.out.println();
        
        // Alternativ løsning for oppgave 1:
        System.out.println("Alternativ løsning for Oppgave 1:");
        Task3_1_v2();
        System.out.println();
        
        // Oppgave 2
        System.out.println("Oppgave 2");
        Task3_2();
        System.out.println();
        
        // Oppgave 3:
        System.out.println("Oppgave 3");
        Task3_3();
        System.out.println();
        
        // Oppgave 4:
        System.out.println("Oppgave 4");
        Task3_4();
        System.out.println();
        
        // Oppgave 5:
        System.out.println("Oppgave 5");
        Task3_5();
        System.out.println();
        
        // Oppgave 6
        System.out.println("Oppgave 6");
        Task3_6();
        System.out.println();
    }

    public static void Task3_1() {
        String lyrics = "%d %s of beer on the wall, %d %s of beer.\n"
                + "Take one down and pass it around, %d %s of beer on the wall.";

        String lyrics_end = "No more bottles of beer on the wall, no more bottles of beer.\n"
                + "Go to the store and buy some more, 99 bottles of beer on the wall.";

        // Kjør en loop som skriver ut alle versene og teller ned antall ølflasker
        for (int i = 99; i > 0; i--) {
            // Skriv ut passende streng modifisert med riktig antall, og riktig formulering på ordet "bottle"/"Bottles"
            System.out.printf(
                    lyrics,                         // Dette inneholder teksten som en template
                    i,                              // Bytter ut den første tallverdien med i
                    (i > 1 ? "bottles" : "bottle"), // Bytter ut den første flertalls-verdien av bottle(s) basert på i > 1
                    i,                              // Bytter ut den andre tallverdien med i
                    (i > 1 ? "bottles" : "bottle"), // Igjen, flertalls-verdi baaser på i > 1
                    i - 1,                          // Bytter ut den siste tallverdien med i - 1
                    (((i - 1) > 1 || (i - 1) == 0) ? "bottles" : "bottle"));    // Flertallsverdi basert på i-1>0 eller i-1==0
            
            System.out.println("\n");               // Ny linje
        }
        
        // Skriv ut den siste delen av sangteksten som er litt anderledes enn de andre versene
        System.out.println(lyrics_end);
        System.out.println();
    }
    
    // Alternativ løsning til bottles of beer
    public static void Task3_1_v2() {
        String b = "s";
        for(int i=99; i>0; i--) {
            if(i == 1) {
                b = "";
            }
            System.out.println(i+" bottle"+b+" of beer on the wall, "+i+" bottle"+b+" of beer");
            
            if(i > 1) {
                if(i-1 == 1) {
                    b = "";
                }
                System.out.println("Take one down, and pass it around, "+(i-1)+" bottle"+b+" of beer on the wall\n");
            } else {
                System.out.println("Take one down, and pass it around, no more bottles of beer on the wall\n");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n"
                                   + "Go to the store and buy some more, 99 bottles of beer on the wall.");
            }
        }
    }

    private static int[] numbers;

    public static void Task3_2() {
        // Lag en array med 10 plasser
        // Numbers er en medlemsvariabel av classen, og kan brukes videre i andre metoder
        numbers = new int[10];

        // Fyll arrayet med tall fra 0-9
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        // Skriv ut innholdet i arrayet
        System.out.println(java.util.Arrays.toString(numbers));
    }

    // Importer arrayet fra forrige oppgave, kopier det og lag en reversert versjon
    public static void Task3_3() {
        // Dersom numbers arrayet ikke er fylt enda, fyll det med den forrige metoden
        if (numbers == null) {
            Task3_2();
        }

        // Lag et nytt array med 10 plasser (kan også bruke numbers.clone, men må i det tilfellet gjøre en annen operasjon videre
        int[] numbers_reverse = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // Looper igjennom arrayen numbers og legger inn verdiene i reversert rekkefølge i den nye arrayen
            numbers_reverse[i] = numbers[numbers.length - 1 - i];
        }
        
        // Skriv ut innholdet i arrayet
        System.out.println(java.util.Arrays.toString(numbers_reverse));
    }

    // Lag to variabler med forskjellige verdier, og bytt om verdiene
    public static void Task3_4() {
        int a = 1;
        int b = 2;
        int c;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("Bytter plass...");

        c = a;
        a = b;
        b = c;

        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
    
    public static void Task3_5() {
        int[] input = new int[5];

        for (int i = 0; i < input.length; i++) {
            input[i] = i;
        }

        System.out.println(java.util.Arrays.toString(input));

        for (int u = 0; u < input.length / 2; u++) {
            int temp = input[u];
            input[u] = input[input.length - 1 - u];
            input[input.length - 1 - u] = temp;
        }

        System.out.println(java.util.Arrays.toString(input));
    }

    public static void Task3_6() {
        double[][] arr = new double[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int u = 0; u < arr[i].length; u++) {
                arr[i][u] = Math.random();
            }
        }

        for (double[] n : arr) {
            System.out.println(java.util.Arrays.toString(n));
        }
    }

}
