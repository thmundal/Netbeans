/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering2;

import java.util.Random;

/**
 *
 * @author thmun
 */
public class Innlevering2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Oppgave 1:
        System.out.println("Oppgave 1:");
        Task2_1();
        System.out.println();

        // Oppgave 2:
        System.out.println("Oppgave 2:");
        Task2_2();
        System.out.println();

        // Oppgave 3:
        System.out.println("Oppgave 3:");
        Task2_3();
        System.out.println();

        // Oppgave 4:
        System.out.println("Oppgave 4:");
        Task2_4();
        System.out.println();

        // Oppgave 5:
        System.out.println("Oppgave 5:");
        Task2_5();
        System.out.println();

        // Oppgave 6:
        System.out.println("Oppgave 6:");
        Task2_6();
        System.out.println();

        // Oppgave 7:
        System.out.println("Oppgave 7:");
        Task2_7();
        System.out.println();

        // Oppgave 8:
        System.out.println("Oppgave 8:");
        Task2_8();
        System.out.println();
    }

    public static void Task2_1() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void Task2_2() {
        int n = 0;
        for (int table = 1; table <= 10; ++table) {
            System.out.println();
            for (int i = 1; i <= 10; ++i) {
                System.out.print(table * i + "\t");
            }
        }
        System.out.println();
    }

    public static void Task2_3() {
        System.out.println(factorial(5));
    }

    public static void Task2_4() {
        int integer = 3;
        float decimal = 3;

        System.out.println(integer / 2);
        System.out.println(decimal / 2);

        System.out.println("Integer er en datatype som inneholder et heltall som verdi");
        System.out.println("Float er en datatype som inneholder et desimaltall som verdi");
    }

    public static void Task2_5() {
        for (int i = 0; i <= 10; i++) {
            System.out.print((i % 3) + " ");
        }

        System.out.println();
        System.out.println("Kan brukes til å gjøre operasjoner i diverse intervaller, for annenhver, tredjehver osv. Eller kalkulere primtall");
    }

    public static void Task2_6() {
        for (int i = 1; i < 30; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println();
    }

    public static void Task2_7() {
        int terning1 = (int) (Math.random() * 6 + 1);
        int terning2 = (int) (Math.random() * 6 + 1);

        while (terning1 != terning2) {
            terning1 = (int) (Math.random() * 6 + 1);
            terning2 = (int) (Math.random() * 6 + 1);
        }

        System.out.println("Terning1: " + terning1);
        System.out.println("Terning2: " + terning2);
    }

    public static void Task2_8() {
        Random rand = new Random();
        int terning1 = rand.nextInt(6) + 1;
        int terning2 = rand.nextInt(6) + 1;

        while (terning1 != terning2) {
            terning1 = rand.nextInt(6) + 1;
            terning2 = rand.nextInt(6) + 1;
        }

        System.out.println("Terning1: " + terning1);
        System.out.println("Terning2: " + terning2);
    }

    /**
     * Calculates the factorial of input number
     *
     * @param n The number to calculate factorial of
     * @return int The result of the calculation
     */
    public static int factorial(int n) {
        int k = n;
        for (int i = 1; i < n; i++) {
            k *= i;
        }
        return k;
    }
}
