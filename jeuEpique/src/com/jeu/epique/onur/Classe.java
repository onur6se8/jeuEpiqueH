package com.jeu.epique.onur;

public class Classe {

    private int personnage;

    private int niveau = 0;
    private int vitalite;
    private int force;
    private int agilite;
    private int intelligence;

    private boolean a = true;
    private String classe[] = {"place","Guerrier","Rodeur","Mage"};
    private String debutDePhrase[] = {"place","Woarg ","Woarg ","Abracadabra "};



    private static ClasseAttribut joueur = new ClasseAttribut();



    public int[] classe(int joueur1ou2){

        System.out.println("Création du personnage du Joueur "+joueur1ou2);
        personnage = joueur.classe();


        System.out.println("Niveau du personnage ?");
        niveau = joueur.lesAttribut();

        vitalite = niveau * 5;

        do {

            System.out.println("Force du personnage ?");
            force = joueur.lesAttribut();

            System.out.println("Agilité du personnage ?");
            agilite = joueur.lesAttribut();

            System.out.println("Intelligence du personnage ?");
            intelligence = joueur.lesAttribut();


            if (agilite + force + intelligence != niveau) { a = false; }
            else { a = true; }

        }while ( a == false);



        System.out.println( debutDePhrase[personnage] + "je suis le "+ classe[personnage] + " joueur "+ joueur1ou2 +" niveau "+ niveau + " je possède "+ vitalite + " de vitalité, "+ force +" de force, "+ agilite +" d'agilité et "+ intelligence +" d'intelligence !" );


        return new int[]{personnage,joueur1ou2,niveau,vitalite,force,agilite,intelligence};

    }

}
