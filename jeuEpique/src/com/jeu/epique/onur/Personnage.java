package com.jeu.epique.onur;

public abstract class Personnage {
    private int joueur1;
    private int joueur2;
    private int niv;
    private int hp;
    private int strenght;
    private int agility;
    private int intelligence;

    public Personnage(int joueur1, int joueur2, int niv, int hp, int strenght, int agility, int intelligence) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.niv = niv;
        this.hp = hp;
        this.strenght = strenght;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public int getJoueur1() { return  joueur1; }

    public int getJoueur2() { return  joueur2; }

    public int getNiv(){
        return niv;
    }

    public int getHp() {
        return hp;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }



    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAgility(int agility){
        this.agility = agility;
    }

    public abstract int doNormalAttack ();
    public abstract int doSpecialAttack ();

    public abstract void domage (int degat);

}
