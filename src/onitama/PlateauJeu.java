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

    public void Mouvement(Joueur j) {
        Scanner sc = new Scanner(System.in);
        int l_m;
        int col_m;
        int l_p;
        int col_p;
        Pion p_play = null;
        while (p_play == null) {
            System.out.println("Quel pion souhaité vous jouée\nEntrer les coordonnée du pion :\nLigne\nColonne");
            l_p = sc.nextInt();
            col_p = sc.nextInt();
            p_play = choixPion(l_p, col_p);
            if (p_play == null) {
                System.out.println("Il n'y à pas de pion sur cette case, choisissez une autre case");
            } else {
                System.out.println("Vous decidez de joue le pion " + p_play);
            }

        }
        int type = choixCarte(j);
        switch (type) {
            case 1:

                System.out.println("Vos mouvement possible sont :");
                //deck[1].afficherMouvement(j);

                System.out.println("Sur quelle cause voulez vous jouer; Entrer"
                        + "\nLigne\nColonne");
                l_m = sc.nextInt();
                col_m = sc.nextInt();
                if(l_m > 5 | l_m < 0 | col_m > 5| col_m < 0 ){
                    System.out.println("La case séléctionné ");
                }

        }
    }

    public int choixCarte(Joueur j) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vous possèder les carte :\n1)" + j.acessMainCourante()[0] + "\n2)" + j.acessMainCourante()[1]);
        System.out.println("Quels carte voulez vous jouer\nSelection 1 ou 2");
        int choix = sc.nextInt();
        while (choix != 1 | choix != 2) {
            System.out.println("L'entrer n'est pas valide, Choisiser entre 1 et 2");
            choix = sc.nextInt();
        }
        System.out.println("Vous décidez de jouer la carte " + choix);
        return (j.acessMainCourante()[choix].acessType());
    }

    public Pion choixPion(int l, int col) {//Verifie si le joueur à choisie une case sur la qu'elle il y a un pion, si oui renvoie le pion
        if (grille[l][col].presencePion()) {
            return (grille[l][col].acessPion());
        } else {
            return (null);
        }
    }

    public boolean verifieMouvement(int type, int l_m, int col_m, int l_p, int col_p) {//Verifi si la case qu'un joueur à selectionner est un mouvement valide
        switch (type) {
            case 1 :
                
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

    public void Transposer() {
        Case temp = new Case(null, null); //Permet de stocké temporerement une case
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                temp = grille[i][j];
                grille[i][j] = grille[j][i];
                grille[j][i] = temp;
            }
        }
    }

}
