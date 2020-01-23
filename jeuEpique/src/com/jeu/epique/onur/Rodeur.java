package com.jeu.epique.onur;

public class Rodeur extends Personnage {

    public Rodeur(int joueur1, int joueur2, int niv, int hp, int strenght, int agility, int intelligence) {
        super(joueur1, joueur2, niv, hp, strenght, agility, intelligence);
    }

    @Override
    public int doNormalAttack() {
        System.out.println("Joueur "+ getJoueur1() +" utilise Tir à l’Arc et inflige "+ getAgility() +" dommages.");
        System.out.println("Joueur "+ getJoueur2() +" perd "+ getAgility() +" points de vie");
        return getAgility();
    }

    @Override
    public int doSpecialAttack() {
        System.out.println("Joueur "+ getJoueur1() +" utilise Concentration et gagne "+ (getNiv()/2) +" en agilité.");
        setAgility(getAgility() + (getNiv() / 2) );
        return 0;
    }

    @Override
    public void domage(int degat) {
        setHp(getHp() - degat);
    }
}
