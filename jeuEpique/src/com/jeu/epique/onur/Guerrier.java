package com.jeu.epique.onur;

public class Guerrier extends Personnage {

    public Guerrier(int joueur1, int joueur2, int niv, int hp, int strenght, int agility, int intelligence) {
        super(joueur1,joueur2, niv, hp, strenght, agility, intelligence);
    }

    @Override
    public int doNormalAttack() {
        System.out.println("Joueur "+ getJoueur1() +" utilise Coup d’Épée et inflige "+ getStrenght() +" dommages.");
        System.out.println("Joueur "+ getJoueur2() +" perd "+ getStrenght() +" points de vie");
        return getStrenght();
    }

    @Override
    public int doSpecialAttack() {
        System.out.println("Joueur "+ getJoueur1() +" utilise Coup de Rage et inflige "+ (getStrenght()*2) +" dommages.");
        System.out.println("Joueur "+ getJoueur2() +" perd "+ (getStrenght()*2) +" points de vie");

        System.out.println("Joueur "+ getJoueur1() +" perd "+ (getStrenght()/2) +" points de vie");
        setHp( getHp() - (getStrenght()/2) );
        return (getStrenght() * 2);
    }

    @Override
    public void domage(int degat) {
        setHp(getHp() - degat);
    }
}
