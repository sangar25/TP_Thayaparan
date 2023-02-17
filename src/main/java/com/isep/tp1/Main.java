package com.isep.tp1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*exo n°4
        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);
        /

        /exo n°4.1
        System.out.println("Bonjour, quel est votre prénom ?");
        Scanner scanner = new Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("Bonjour, " + nom);
        /

        /exo n°5.1
        somme();
        /

        /exo n°5.2
        division();
        /

        / exo n°5.3
        volume();
        /

        / exo n°6
        commentaire();
        */
    }
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + "est egale a " + somme);
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir le deuxieme entier");
        float deuxiemeEntier = scanner.nextFloat();
        float somme = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + "est egale a " + somme);
    }
    public static void  volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la hauteur");
        float hauteur = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float largeur = scanner.nextFloat();
        System.out.println("Veuillez saisir la profondeur");
        float profondeur = scanner.nextFloat();
        float volume = hauteur * largeur * profondeur;
        System.out.println("Le volume de " + hauteur + " avec " + largeur + " et " + profondeur + "est egale a " + volume);
    }
    public static void commentaire() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier");
        // On saisit ’11’
        int entier = scanner.nextInt();
        System.out.println("Saisir une operation");
        // Parce que le caractere newline n’a pas ete lu, c’est lui qui va se
        // retrouver dans la variable operation
        // Il va aussi etre impossible de saisir une autre valeur pour operation
        String operation = scanner.nextLine();
    }
}

