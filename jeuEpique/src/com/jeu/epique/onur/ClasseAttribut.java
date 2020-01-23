package com.jeu.epique.onur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClasseAttribut {

    private Scanner sc = new Scanner(System.in);
    private int joueur;
    private boolean a = true;
    private int attrubut;
    private int attaque;

    public int classe()
    {
        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
            try {
                joueur = sc.nextInt();
                if (joueur > 0 && joueur < 4 ) {
                    a = true;
                }
                else {
                    a = false;
                }
            } catch (InputMismatchException e) {
                a = false;
                sc.nextLine();
            }
        }while ( a == false);
        return joueur;
    }


    public int lesAttribut()
    {
        do {
            try {
                attrubut = sc.nextInt();
                if (attrubut >= 0 && attrubut <= 100) {
                    a = true; }
                else {
                    a = false; }
            } catch (InputMismatchException e) {
                a = false;
                sc.nextLine();
            }
        } while (a == false);

        return attrubut;
    }


    public int attaque()
    {
        do {
            try {
                attaque = sc.nextInt();
                if (attaque >= 1 && attaque <= 2) {
                    a = true; }
                else {
                    a = false; }
            } catch (InputMismatchException e) {
                a = false;
                sc.nextLine();
            }
        } while (a == false);

        return attaque;
    }
}
