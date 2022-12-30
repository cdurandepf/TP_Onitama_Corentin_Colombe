/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama;

import java.util.Scanner;

/**
 *
 * @author Corentin DURAND
 */
public class PlateauJeu {

    private Case[][] grille = new Case[5][5];
    private Carte[] deck = new Carte[16];

    public PlateauJeu() {// Créée un plateau de 5 sur 5 fait de case
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grille[i][j] = new Case(null, null);
            }
        }
        for (int i = 0; i < 16; i++) {
            deck[i] = new Carte(i);
        }

    }

    public Pion choixPion(int l, int col) {//Verifie si le joueur à choisie une case sur la qu'elle il y a un pion, si oui renvoie le pion
        if (grille[l][col].presencePion()) {
            return (grille[l][col].acessPion());
        } else {
            return (null);
        }
    }

    public boolean verifieMouvement(Carte c, int l_m, int col_m, int l_p, int col_p) {//Verifi si la case qu'un joueur à selectionner est un mouvement valide
        int l = l_m - l_p;
        int col = col_m - col_p;
        for(int i = 0; i < 4; i++){
            if(l == c.acessVect()[0][i] & col == c.acessVect()[1][i]){
                return(true);
            }                
        }
        return (false);
    }

    public void affecterPionReper(int ligne, int colone, boolean b) {
        grille[ligne][colone].affecterReper(b);
    }

    public void affecterMontrerMouvement(int ligne, int colone, boolean b) {
        grille[ligne][colone].affecterMontrerMouvement(b);
    }

    public void afficherGrille() {//affiche le plateau
        String retour = "";
        for (int i = 0; i < 5; i++) {
            retour = "";
            for (int j = 0; j < 5; j++) {
                retour += grille[i][j].toString();
            }
            System.out.println(retour);
        }
    }

    public void deplacerPion(int type, int ligne, int colone) {

    }

    public void affecterPionSurCase(int ligne, int colone, Pion p) {
        grille[ligne][colone].definirPion(p);
    }
    
    public Case acessCase(int ligne, int colone){
        return(grille[ligne][colone]);
    }

    public void Transposer() {//Inverse le plateau
        Case temp = new Case(null, null); //Permet de stocké temporerement une case
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                temp = grille[i][j];
                grille[i][j] = grille[4 - i][4 - j];
                grille[4 - i][4 - j] = temp;
            }
        }
        for(int j = 0; j < 2; j++){
            temp = grille[2][j];
            grille[2][j] = grille[2][4-j];
            grille[2][4-j] = temp;
        }
    }

}
