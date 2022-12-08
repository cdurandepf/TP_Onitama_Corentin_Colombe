package onitama;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Corentin DURAND
 */
public class Jeu {

    private PlateauJeu plateau = new PlateauJeu();
    private Joueur tableau_joueur[] = new Joueur[2];
    private Joueur joueurCourant;
    private Deck deck_jeu = new Deck();
    
    public Jeu(Joueur j1, Joueur j2){
        tableau_joueur[0] = j1;
        tableau_joueur[1] = j2;
    }

    public void attribuerCouleurAuxJoueurs() {
        int n = (int) (Math.random() * 2);
        if (n == 1) {
            tableau_joueur[0].affecterCouleur("rouge");
            tableau_joueur[1].affecterCouleur("jaune");
        }

        if (n == 2) {
            tableau_joueur[0].affecterCouleur("jaune");
            tableau_joueur[1].affecterCouleur("rouge");
        }

    }

    public void affecterCarte(Deck deck) {
        tableau_joueur[0].definirMainCourante(deck.acessDeckJoueur(1));
    }

    public void affecterPion() {
        for (int i = 0; i < 5; i++) {
            if (i != 2) {
                Pion p = new Pion(tableau_joueur[0]);
                tableau_joueur[0].affecterPion(p);
                Pion p_ = new Pion(tableau_joueur[1]);
                tableau_joueur[1].affecterPion(p_);
            } else {
                Pion roi_1 = new Pion(tableau_joueur[0]);
                Pion roi_2 = new Pion(tableau_joueur[1]);
                roi_1.definirRoi(true);
                roi_2.definirRoi(true);
                tableau_joueur[0].affecterPion(roi_1);
                tableau_joueur[1].affecterPion(roi_2);
            }
        }

    }

    public void initialiserJeu() {
        attribuerCouleurAuxJoueurs();
        affecterCarte(deck_jeu);
        affecterPion();
        for (int i = 0; i < 5; i++) {
            plateau.affecterPionSurCase(4, i, tableau_joueur[0].acessMainPion(i));
            plateau.affecterPionSurCase(0, i, tableau_joueur[1].acessMainPion(i));
        }

    }
    
    public PlateauJeu acessPlateau(){
        return(plateau);
    }

}
