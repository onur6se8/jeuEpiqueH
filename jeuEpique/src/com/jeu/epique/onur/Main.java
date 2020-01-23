package com.jeu.epique.onur;

public class Main {

    static int joueur1[] = new int[6];
    static int joueur2[] = new int[6];

    private static Classe joueurX = new Classe();
    private static ClasseAttribut joueur = new ClasseAttribut();

    private static int action;
    private static int attackDamage;

    private static int tour = 1;

    private static Personnage personnage1;
    private static Personnage personnage2;

    public static void main(String[] args) {

        joueur1 = joueurX.classe(1);
        joueur2 = joueurX.classe(2);

        if ( joueur1[0] == 1)
        {
            personnage1 = new Guerrier(joueur1[1], joueur2[1] ,joueur1[2],joueur1[3],joueur1[4],joueur1[5],joueur1[6]);
        }
        else if ( joueur1[0] == 2)
        {
            personnage1 = new Rodeur(joueur1[1], joueur2[1],joueur1[2],joueur1[3],joueur1[4],joueur1[5],joueur1[6]);
        }
        else if ( joueur1[0] == 3)
        {
            personnage1 = new Mage(joueur1[1], joueur2[1],joueur1[2],joueur1[3],joueur1[4],joueur1[5],joueur1[6]);
        }



        if ( joueur2[0] == 1)
        {
            personnage2 = new Guerrier(joueur2[1], joueur1[1],joueur2[2],joueur2[3],joueur2[4],joueur2[5],joueur2[6]);
        }
        else if ( joueur2[0] == 2)
        {
            personnage2 = new Rodeur(joueur2[1], joueur1[1],joueur2[2],joueur2[3],joueur2[4],joueur2[5],joueur2[6]);
        }
        else if ( joueur2[0] == 3)
        {
            personnage2 = new Mage(joueur2[1], joueur1[1],joueur2[2],joueur2[3],joueur2[4],joueur2[5],joueur2[6]);
        }


        do {
            if ( tour == 1) {
                System.out.println("Joueur 1 (" + personnage1.getHp() + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
                action = joueur.attaque();
                if (action == 1)
                {
                    attackDamage = personnage1.doNormalAttack();
                    personnage2.domage(attackDamage);
                }
                else if (action == 2)
                {
                    attackDamage = personnage1.doSpecialAttack();
                    personnage2.domage(attackDamage);
                }

                tour = 2;
            }
            else if ( tour == 2) {
                System.out.println("Joueur 2 (" + personnage2.getHp() + " Vitalité) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque Spéciale)");
                action = joueur.attaque();
                if (action == 1)
                {
                    attackDamage = personnage2.doNormalAttack();
                    personnage1.domage(attackDamage);
                }
                else if ( action == 2)
                {
                    attackDamage = personnage2.doSpecialAttack();
                    personnage1.domage(attackDamage);
                }
                tour = 1;
            }

        }while (personnage1.getHp() > 0 && personnage2.getHp() > 0);



        if ( personnage1.getHp() < personnage2.getHp()){
            System.out.println("Joueur 1 a perdu !");
        }
        else
        {
            System.out.println("Joueur 2 a perdu !");
        }

    }
}
