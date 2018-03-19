/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    public static int rekurencja(int p, int o) {
        if (o == 0) {
            System.out.println(1);
        } else if (o % 2 == 1) {
            System.out.println(p * Math.pow(Math.pow(p, (o - 1) / 2), 2));
        } else {
            System.out.println(Math.pow(Math.pow(p, (o / 2)), 2));
        }
        return 0;
    }

    public static int iteracja(int e, int u) {
        int h = 1;
        if (e == 1 || u == 0) {
            System.out.println(1);
        } else {
            for (; Math.abs(u) > 0;) {
                h = h * e;
                if (u < 0) {
                    u++;
                } else {
                    u--;
                }
            }
            System.out.println(h);
        }
        return 0;
    }

    public static int Fibo(int f) {
        int f1;
        int f2;
        int f3;
        if (f == 0) {
            System.out.println(0);
        }
        if (f == 1) {
            System.out.println(1);
        }
        f1 = 0;
        f2 = 1;
        for (int i = 2; i <= f; i++) {
            f3 = f2 + f1;
            f1 = f2;
            f2 = f3;

        }
        System.out.println(f2);
        return 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4

        //Zad 1.4
        System.out.println("-------------------ZADANIE 1.4------------------------");
        int x = -10 << 3;
        int y = -10 >> 3;
        int z = -10 >>> 3;

        System.out.println("Przesunięcie w lewo ze znakiem <<: " + x
                + "\nPrzesunięcie w prawo ze znakiem >>: " + y
                + "\nPrzesunięcie w prawo bez znaku >>>: " + z);

        //zad 1.7
        System.out.println("\n\n-------------------ZADANIE 1.7------------------------");
        boolean a = true;
        boolean b = false;

        System.out.println("--Operator logiczny NOT--");
        System.out.println("Normalna wartość logiczna: " + a
                + "\nNOT: " + !(a && b));

        System.out.println("--Operator logiczny XOR--");
        System.out.println("Wartość logiczna prawda ^ prawda: " + (a ^ a)
                + "\nWartość logiczna prawda ^ fałsz: " + (a ^ b)
                + "\nWartość logiczna fałsz ^ fałsz: " + (b ^ b));

        //zad 2.2
        System.out.println("\n\n-------------------ZADANIE 2.2------------------------");
        System.out.println("toCharArray()-zmienia napis w tablice znaków typu char");
        String s1 = "Czesc";

        char[] d = s1.toCharArray();
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        }

        System.out.println("\n\ngetBytes()-zmienia napis na tablice typu byte");

        byte[] f = s1.getBytes();
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i]);
        }

        System.out.println("\n\nboolean equals(String str)-uwzględnia wielkość liter i zwraca true jeżeli dwie zmienne typu String są takie same");
        String c1 = "Bieszczady";
        String c2 = "Bieszczady";
        String c3 = "bieszczady";

        if (c1.equals(c2)) {
            System.out.println("Napisy są takie same");
        } else {
            System.out.println("Napisy są różne");
        }
        if (c1.equals(c3)) {
            System.out.println("Napisy są takie same");
        } else {
            System.out.println("Napisy są różne");
        }

        System.out.println("\n\nboolean equalsIgnoreCase(String str)-ignoruje wielkość liter i zwraca true jeżeli dwie zmienne typu String są takie same ");
        String v1 = "Bieszczady";
        String v2 = "bieszczady";
        String v3 = "mazury";
        if (v1.equalsIgnoreCase(v2)) {
            System.out.println("Napisy są takie same");
        } else {
            System.out.println("Napisy są różne");
        }
        if (v1.equalsIgnoreCase(v3)) {
            System.out.println("Napisy są takie same");
        } else {
            System.out.println("Napisy są różne");
        }
        System.out.println("\n\nint campareTo(String str)-porównoje dwie zmienne typu String leksograficznie");
        String b1 = "Krowa";

        int test = b1.compareTo("Krowa");
        int test4 = b1.compareTo("krowa");
        System.out.println("Napisy są takie same: " + test
                + "\nPierwsze słowo jest większe: " + test4);

        System.out.println("\n\nint campareToIgnoreCase(String str)-ignoruje wielkość liter i porównoje dwie zmienne typu String leksograficznie");
        int test1 = b1.compareToIgnoreCase("KrOwA");
        int test2 = b1.compareToIgnoreCase("Kot");
        System.out.println("Napisy są takie same: " + test1
                + "\nPierwsze słowo jest większe: " + test2);

        System.out.println("\n\nint indexOf(String str)-przeszukuje zmienną String w celu znalezienia danego znaku i zwraca index pierwszego znalezionego znaku");
        String n = "Katarzyna";
        int t5 = n.indexOf('a');
        System.out.println("Index pierwszego znalezionego znaku: " + t5);

        System.out.println("\n\nint lastIndexOf(int i)-przeszukuje zmienną String w celu znalezienia danego znaku i zwraca index ostatniego znalezionego znaku");
        int t6 = n.lastIndexOf('a');
        System.out.println("Index ostatniego znalezionego znaku: " + t6);

        System.out.println("\n\nString substring-zwraca podaną przez nas część zmiennej typu String(podajemy numery indeksów)");
        System.out.println(n.substring(1, 4));

        System.out.println("\n\nString replace(char orginal, char zamiennik)-zamienia podany znak na inny podany przez nas");
        System.out.println(n.replace('r', 'z'));

        String n2 = "           Katarzyna    ";
        System.out.println("\n\nString trim()-usuwa nadmierne i poprzadzające puste indeksy");
        System.out.println(n2.trim());

        String n3 = "KaTaRzYnA";
        System.out.println("\n\nString toLowerCase()-zamienia wielkie litery na małe");
        System.out.println(n3.toLowerCase());

        System.out.println("\n\nString toUpperrCase()-zamienia małe litery na wielkie");
        System.out.println(n3.toUpperCase());

        System.out.println("\n\nString[] split-rozdziela Stringa na mniejsze od podanego przez nas znaku");
        for (String retval : n.split("r")) {
            System.out.println(retval);
        }
        //zad 3.3
        System.out.println("\n\n-------------------ZADANIE 3.3------------------------");
        int podstawa, wykladnik, w;
        System.out.println("Podaj podstawę: ");
        Scanner o4 = new Scanner(System.in);
        podstawa = o4.nextInt();
        System.out.println("Podaj wykładnik: ");
        wykladnik = o4.nextInt();
        System.out.println("Wybierz:\n1.Potęgowanie rekurencyjne \n2.Potęgowanie interacyjne");
        w = o4.nextInt();
        if (w == 1) {
            rekurencja(podstawa, wykladnik);
        } else if (w == 2) {
            iteracja(podstawa, wykladnik);

        }
        //zad 3.4
        System.out.println("\n\n-------------------ZADANIE 3.4------------------------");
        System.out.println("Podaj liczbę dla której ma być obliczony ciąg Fibonacciego: ");
        Scanner o5 = new Scanner(System.in);
        w = o5.nextInt();
        Fibo(w);
    }
}
