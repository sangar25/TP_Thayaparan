package com.isep.tp2;

import java.util.Scanner;

public class Main {
   /* */ public static void main(String[] args) {
        discriminant();
    }
        public static void discriminant() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quelle est la valeur de a ?");
            int a = scanner.nextInt();
            System.out.println("Quelle est la valeur de b ?");
            int b = scanner.nextInt();
            System.out.println("Quelle est la valeur de c ?");
            int c = scanner.nextInt();
            int delta = (int) (Math.pow(b, 2) - 4 * a * c);
            if (delta < 0) {
                System.out.println("Ce polynome n'a pas de racine reelle");
        }
            if (delta == 0) {
                System.out.println("-Ce polynome n'a pas de racine reelle");
            }

    }
}