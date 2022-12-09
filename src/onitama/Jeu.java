package onitama;

import java.util.ArrayList;
import java.util.Scanner;

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
    private PlateauJeu grilleMouvement = new PlateauJeu();
    private Joueur tableau_joueur[] = new Joueur[2];
    private Joueur joueurCourant;
    private ArrayList<Carte> deck = new ArrayList();

    public Jeu(Joueur j1, Joueur j2) {
        tableau_joueur[0] = j1;
        tableau_joueur[1] = j2;
    }

    public void attribuerCouleurAuxJoueurs() {

        tableau_joueur[0].affecterCouleur("jaune");
        tableau_joueur[1].affecterCouleur("rouge");
    }

    public void afficherMouvementBas(int type) {
        grilleCarte(type);
        grilleMouvement.afficherGrille();
        System.out.println(tableau_joueur[1].acessMainCourante().get(0));

    }

    public void afficherMouvementHaut(int type) {
        grilleMouvement.Transposer();//Surtout ça
        grilleCarte(type);
        grilleMouvement.afficherGrille();
        System.out.println(tableau_joueur[0].acessMainCourante().get(0));
        grilleMouvement.Transposer();
    }

    public void grilleCarte(int n) {
        grilleMouvement.affecterPionReper(2, 2, true);
        switch (n) {
            case 1:
                grilleMouvement.affecterMontrerMouvement(3, 2, true);
                grilleMouvement.affecterMontrerMouvement(0, 2, true);
                break;
            case 2:
                grilleMouvement.affecterMontrerMouvement(1, 0, true);
                grilleMouvement.affecterMontrerMouvement(1, 1, true);
                grilleMouvement.affecterMontrerMouvement(3, 3, true);
                grilleMouvement.affecterMontrerMouvement(3, 4, true);
                break;
            case 3:
                grilleMouvement.affecterMontrerMouvement(1, 1, true);
                grilleMouvement.affecterMontrerMouvement(2, 0, true);
                grilleMouvement.affecterMontrerMouvement(3, 3, true);
                break;
            case 4:
                grilleMouvement.affecterMontrerMouvement(1, 3, true);
                grilleMouvement.affecterMontrerMouvement(2, 4, true);
                grilleMouvement.affecterMontrerMouvement(3, 1, true);
                break;
            case 5:
                grilleMouvement.affecterMontrerMouvement(1, 2, true);
                grilleMouvement.affecterMontrerMouvement(2, 0, true);
                grilleMouvement.affecterMontrerMouvement(2, 4, true);
                break;
            case 6:
                grilleMouvement.affecterMontrerMouvement(1, 1, true);
                grilleMouvement.affecterMontrerMouvement(1, 3, true);
                grilleMouvement.affecterMontrerMouvement(2, 1, true);
                grilleMouvement.affecterMontrerMouvement(2, 3, true);
                break;
            case 7:
                grilleMouvement.affecterMontrerMouvement(1, 1, true);
                grilleMouvement.affecterMontrerMouvement(2, 1, true);
                grilleMouvement.affecterMontrerMouvement(2, 3, true);
                grilleMouvement.affecterMontrerMouvement(3, 3, true);
                break;
            case 8:
                grilleMouvement.affecterMontrerMouvement(1, 3, true);
                grilleMouvement.affecterMontrerMouvement(2, 1, true);
                grilleMouvement.affecterMontrerMouvement(2, 3, true);
                grilleMouvement.affecterMontrerMouvement(3, 1, true);
                break;
            case 9:
                grilleMouvement.affecterMontrerMouvement(1, 1, true);
                grilleMouvement.affecterMontrerMouvement(1, 3, true);
                grilleMouvement.affecterMontrerMouvement(3, 1, true);
                grilleMouvement.affecterMontrerMouvement(3, 3, true);
                break;
            case 10:
                grilleMouvement.affecterMontrerMouvement(1, 1, true);
                grilleMouvement.affecterMontrerMouvement(1, 3, true);
                grilleMouvement.affecterMontrerMouvement(3, 2, true);
                break;
            case 11:
                grilleMouvement.affecterMontrerMouvement(1, 2, true);
                grilleMouvement.affecterMontrerMouvement(2, 1, true);
                grilleMouvement.affecterMontrerMouvement(3, 3, true);
                break;
            case 12:
                grilleMouvement.affecterMontrerMouvement(1, 2, true);
                grilleMouvement.affecterMontrerMouvement(3, 1, true);
                grilleMouvement.affecterMontrerMouvement(3, 3, true);
                break;
            case 13:
                grilleMouvement.affecterMontrerMouvement(1, 2, true);
                grilleMouvement.affecterMontrerMouvement(2, 1, true);
                grilleMouvement.affecterMontrerMouvement(3, 3, true);
                break;
            case 14:
                grilleMouvement.affecterMontrerMouvement(1, 2, true);
                grilleMouvement.affecterMontrerMouvement(2, 1, true);
                grilleMouvement.affecterMontrerMouvement(2, 3, true);
                break;
            case 15:
                grilleMouvement.affecterMontrerMouvement(1, 1, true);
                grilleMouvement.affecterMontrerMouvement(3, 1, true);
                grilleMouvement.affecterMontrerMouvement(2, 3, true);
                break;
            case 16:
                grilleMouvement.affecterMontrerMouvement(1, 3, true);
                grilleMouvement.affecterMontrerMouvement(2, 1, true);
                grilleMouvement.affecterMontrerMouvement(3, 3, true);
                break;

        }
    }

    public void premierJoueur() {
        int n = (int) (Math.random() * 2);
        joueurCourant = tableau_joueur[n - 1];
    }

    public void joueurSuivant() {
        if (joueurCourant == tableau_joueur[0]) {
            joueurCourant = tableau_joueur[1];
        } else {
            joueurCourant = tableau_joueur[0];
        }
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

    public void creeDeck() { // initialisation du deck
        ArrayList verification = new ArrayList();// Permettra de verifier que nous ne mettons pas deux carte identique dans le deck 
        while (deck.size() != 5) { // Tant que le deck n'est pas remplie on reste dans la boucle
            int n = (int) (Math.random() * 16); // Choisie un nombre aléatoir entre 1 et 16
            if (!verification.contains(n)) { // On verifie que la carte n'a pas deja été donné
                verification.add(n); // On ajoute le numero de carte que l'on met dans notre deck
                Carte carte = new Carte(n);
                deck.add(carte);
                /*
                switch (n) { // Attribut une carte au deck pour un sertain n
                    case 1:
                        Carte carte_1 = new Carte(1); // créée carte
                        deck.add(carte_1); // ajoute carte au deck
                        break;
                    case 2:
                        Carte carte_2 = new Carte(2);
                        deck.add(carte_2);
                        break;
                    case 3:
                        Carte carte_3 = new Carte(3);
                        deck.add(carte_3);
                        break;
                    case 4:
                        Carte carte_4 = new Carte(4);
                        deck.add(carte_4);
                        break;
                    case 5:
                        Carte carte_5 = new Carte(5);
                        deck.add(carte_5);
                        break;
                    case 6:
                        Carte carte_6 = new Carte(6);
                        deck.add(carte_6);
                        break;
                    case 7:
                        Carte carte_7 = new Carte(7);
                        deck.add(carte_7);
                        break;
                    case 8:
                        Carte carte_8 = new Carte(8);
                        deck.add(carte_8);
                        break;
                    case 9:
                        Carte carte_9 = new Carte(9);
                        deck.add(carte_9);
                        break;
                    case 10:
                        Carte carte_10 = new Carte(10);
                        deck.add(carte_10);
                        break;
                    case 11:
                        Carte carte_11 = new Carte(11);
                        deck.add(carte_11);
                        break;
                    case 12:
                        Carte carte_12 = new Carte(12);
                        deck.add(carte_12);
                        break;
                    case 13:
                        Carte carte_13 = new Carte(13);
                        deck.add(carte_13);
                        break;
                    case 14:
                        Carte carte_14 = new Carte(14);
                        deck.add(carte_14);
                        break;
                    case 15:
                        Carte carte_15 = new Carte(15);
                        deck.add(carte_15);
                        break;

                    case 16:
                        Carte carte_16 = new Carte(16);
                        deck.add(carte_16);
                        break;
                }
                 */
            }

        }

    }

    public void creeDeckJoueur() {
        ArrayList verification = new ArrayList();// Permettra de verifier que nous ne mettons pas deux carte identique dans le deck 
        ArrayList<Carte> deck_j1 = new ArrayList();
        ArrayList<Carte> deck_j2 = new ArrayList();
        while (deck_j1.size() != 2) { // Tant que le deck n'est pas remplie on reste dans la boucle
            int n = (int) (Math.random() * 5); // Choisie un nombre aléatoir entre 1 et 16
            if (!verification.contains(n)) { // On verifie que la carte n'a pas deja été donné
                verification.add(n); // On ajoute le numero de carte que l'on met dans notre deck
                deck_j1.add(deck.get(n));
                tableau_joueur[0].definirMainCourante(deck_j1);
            }
        }
        while (deck_j2.size() != 2) {
            int n = (int) (Math.random() * 5); // Choisie un nombre aléatoir entre 1 et 16
            if (!verification.contains(n)) { // On verifie que la carte n'a pas deja été donné
                verification.add(n); // On ajoute le numero de carte que l'on met dans notre deck
                deck_j2.add(deck.get(n));
                tableau_joueur[1].definirMainCourante(deck_j2);
            }
        }
    }

    public void Mouvement(Joueur j) {
        Scanner sc = new Scanner(System.in);
        int l_m;
        int col_m;
        int l_p = 2;
        int col_p = 2;
        Pion p_play = null;
        while (p_play == null) {
            System.out.println("Quel pion souhaité vous jouée\nEntrer les coordonnée du pion :\nLigne\nColonne");
            l_p = sc.nextInt();
            col_p = sc.nextInt();
            p_play = plateau.choixPion(l_p, col_p);
            if (p_play == null) {
                System.out.println("Il n'y à pas de pion sur cette case, choisissez une autre case");
            } else {
                System.out.println("Vous decidez de joue le pion " + p_play);
            }

        }
        Carte carte = choixCarte(j);
        switch (carte.acessType()) {
            case 1:

                System.out.println("Vos mouvement possible sont :");
                //deck[1].afficherMouvement(j);

                System.out.println("Sur quelle cause voulez vous jouer; Entrer"
                        + "\nLigne\nColonne");
                l_m = sc.nextInt();
                col_m = sc.nextInt();
                if (l_m > 5 | l_m < 0 | col_m > 5 | col_m < 0) {
                    System.out.println("La case séléctionné n'existe pas, choisir une case valide ");
                }else{
                    plateau.verifieMouvement(carte, l_m, col_m, l_p, col_p);
                }

        }
    }

    public Carte choixCarte(Joueur j) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vous possèder les carte :\n1)" + j.acessMainCourante().get(0) + "\n2)" + j.acessMainCourante().get(1));
        System.out.println("Quels carte voulez vous jouer\nSelection 1 ou 2");
        int choix = sc.nextInt();
        while (choix != 1 | choix != 2) {
            System.out.println("L'entrer n'est pas valide, Choisiser entre 1 et 2");
            choix = sc.nextInt();
        }
        System.out.println("Vous décidez de jouer la carte " + choix);
        return (j.acessMainCourante().get(choix));
    }

    public void initialiserJeu() {
        grilleMouvement.affecterPionReper(2, 2, true);
        attribuerCouleurAuxJoueurs();
        premierJoueur();
        creeDeckJoueur();
        affecterPion();
        for (int i = 0; i < 5; i++) {
            plateau.affecterPionSurCase(4, i, tableau_joueur[0].acessMainPion(i));
            plateau.affecterPionSurCase(0, i, tableau_joueur[1].acessMainPion(i));
        }

    }

    public PlateauJeu acessPlateau() {
        return (plateau);
    }

}
