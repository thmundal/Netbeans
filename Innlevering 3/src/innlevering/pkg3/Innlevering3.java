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
        String lyrics = "%d bottles of beer on the wall, %d bottles of beer.\n"
                + "Take one down and pass it around, %d %s of beer on the wall.";

        String lyrics_end = "No more bottles of beer on the wall, no more bottles of beer.\n"
                + "Go to the store and buy some more, 99 bottles of beer on the wall.";

        for (int i = 99; i > 0; i--) {
            System.out.printf(lyrics, i, i, i - 1, (i == 2 ? "bottle" : "bottles"));
            System.out.println();
            System.out.println();
        }
        System.out.println(lyrics_end);
        System.out.println();
    }

    private static int[] numbers;

    public static void Task3_2() {
        numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        System.out.println(java.util.Arrays.toString(numbers));
    }

    public static void Task3_3() {
        if (numbers == null) {
            Task3_2();
        }

        int[] numbers_reverse = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers_reverse[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(java.util.Arrays.toString(numbers_reverse));
    }

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
