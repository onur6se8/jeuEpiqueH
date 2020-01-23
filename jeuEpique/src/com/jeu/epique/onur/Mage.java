package com.jeu.epique.onur;

public class Mage extends Personnage {

    public Mage(int joueur1, int joueur2, int niv, int hp, int strenght, int agility, int intelligence) {
        super(joueur1, joueur2, niv, hp, strenght, agility, intelligence);
    }


    @Override
    public int doNormalAttack() {
        System.out.println("Joueur " + getJoueur1() + " utilise Boule de Feu et inflige " + getIntelligence() + " dommages.");
        System.out.println("Joueur " + getJoueur2() + " perd " + getIntelligence() + " points de vie");
        return getIntelligence();
    }

    @Override
    public int doSpecialAttack() {
        System.out.println("Joueur " + getJoueur1() + " utilise Soin et gagne " + (getIntelligence() * 2) + " en vitalité.");
        setHp(getHp() + getIntelligence() * 2);
        if (getHp() > (getNiv() * 5)) {
            setHp(getNiv() * 5);
        }
        return 0;
    }

    @Override
    public void domage(int degat) {
        setHp(getHp() - degat);
    }

}
