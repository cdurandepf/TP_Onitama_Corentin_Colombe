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
        int n = (int) (Math.random() * 1);
        joueurCourant = tableau_joueur[n];
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
            int n = (int) (Math.random() * 15); // Choisie un nombre aléatoir entre 1 et 16
            n += 1;
            if (!verification.contains(n)) { // On verifie que la carte n'a pas deja été donné
                verification.add(n); // On ajoute le numero de carte que l'on met dans notre deck
                Carte carte = new Carte(n);
                deck.add(carte);
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
        int l_p = 2;
        int col_p = 2;
        Pion p_play = null;
        int ligne = 15;
        int colone = 15;
        int[][] VerificationMouvement = new int[2][5];
        boolean condition = true;
        int imp = 4; // permet de verifiez qu'il y à des mouvement possible
        while (imp == 4) {
            imp = 0;
            p_play = null;
            while (p_play == null || p_play.lireCouleur() != j.acessCouleur()) {
                System.out.println("Quel pion souhaitez vous jouer\nEntrer les coordonnee du pion :\nLigne :");
                l_p = sc.nextInt() - 1;
                System.out.println("Colone :");
                col_p = sc.nextInt() - 1;
                p_play = plateau.choixPion(l_p, col_p);
                if (p_play == null) {
                    System.out.println("Il n'y à pas de pion sur cette case, choisissez une autre case");
                } else if (p_play.lireCouleur() != j.acessCouleur()) {
                    System.out.println("Ce pion ne vous appartient pas");
                } else {
                    System.out.println("Vous decidez de joue le pion " + p_play);
                }

            }
            Carte carte = choixCarte(j);
            grilleMouvement = plateau;

            for (int i = 0; i < 4; i++) {
                System.out.println(l_p + " " + carte.acessVect()[0][i]);
                System.out.println(col_p + " " + carte.acessVect()[1][i]);
                ligne = l_p + carte.acessVect()[0][i]; //définit la ligne d'un mouvement possible
                colone = col_p + carte.acessVect()[1][i]; // de même pour la colone
                if (!(ligne >= 5 || ligne < 0 || colone >= 5 || colone < 0) && (plateau.acessCase(ligne, colone).presencePion() == false)) {
                    plateau.affecterMontrerMouvement(ligne, colone, true);
                    VerificationMouvement[0][i] = ligne;
                    VerificationMouvement[1][i] = colone;
                } else if (!(ligne >= 5 || ligne < 0 || colone >= 5 || colone < 0) && plateau.acessCase(ligne, colone).presencePion() && plateau.acessCase(ligne, colone).acessPion().lireCouleur() != j.lireCouleur()) {
                    plateau.affectermangerPion(ligne, colone, true);
                    VerificationMouvement[0][i] = ligne;
                    VerificationMouvement[1][i] = colone;
                } else {
                    imp += 1;
                }

            }
            if (imp == 4) {
                System.out.println("Il n'y à aucun mouvement possible pour ce pion et cette carte\nChoisisé un autre pion ou une autre carte");
            }
        }
        plateau.afficherGrille();
        System.out.println("Vous pouvez vous deplacer sur les case noté d'un '.M.' ou manger sur les case note d'un '.A.' , Choisissez une case");
        int ligne_m = 15;
        int colone_m = 15;
        while (condition) {
            int verif = 0;
            System.out.println("Ligne :");
            ligne_m = sc.nextInt() - 1;
            System.out.println("Colonne :");
            colone_m = sc.nextInt() - 1;
            for (int i = 0; i < 4; i++) {
                if (VerificationMouvement[0][i] == ligne_m & VerificationMouvement[1][i] == colone_m) {
                    condition = false;
                } else {
                    verif += 1;
                }
            }
            if (verif == 4) {
                System.out.println("Entrer invalide, veuillez choisir un case note '.M.' ou '.A.'");
            }
        }
        plateau.affecterPionSurCase(ligne_m, colone_m, plateau.acessCase(l_p, col_p).acessPion());
        for (int i = 0; i < 4; i++) {
            plateau.affecterMontrerMouvement(VerificationMouvement[0][i], VerificationMouvement[1][i], false);
            plateau.affectermangerPion(VerificationMouvement[0][i], VerificationMouvement[1][i], false);
        }
        plateau.affecterMontrerMouvement(ligne_m, colone_m, false);
        plateau.affecterPionSurCase(l_p, col_p, null);

    }

    public boolean Gagner() {
        
        System.out.println(plateau.gagnerRoi());
        System.out.println(plateau.gagnerTemple());
        if (plateau.gagnerRoi().equals("") && plateau.gagnerTemple().equals(" ")) {        
            System.out.println("ééé");
            return (false);
        }
        return (true);

    }

    public Carte choixCarte(Joueur j) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vous possèder les carte :\n1)" + j.acessMainCourante().get(0) + "\n2)" + j.acessMainCourante().get(1));
        System.out.println("Quels carte voulez vous jouer\nSelection 1 ou 2");
        int choix = sc.nextInt();
        while (choix != 1 & choix != 2) {
            System.out.println("L'entrer n'est pas valide, Choisiser entre 1 et 2");
            choix = sc.nextInt();
        }
        System.out.println("Vous décidez de jouer la carte " + j.acessMainCourante().get(choix - 1));
        return (j.acessMainCourante().get(choix - 1));
    }

    public void initialiserJeu() {
        grilleMouvement.affecterPionReper(2, 2, true);
        creeDeck();
        attribuerCouleurAuxJoueurs();
        premierJoueur();
        creeDeckJoueur();
        affecterPion();
        for (int i = 0; i < 5; i++) {
            plateau.affecterPionSurCase(4, i, tableau_joueur[0].acessMainPion(i));
            plateau.affecterPionSurCase(0, i, tableau_joueur[1].acessMainPion(i));
        }
        System.out.println("Le premier Joueur est " + joueurCourant.acessNom());

    }

    public PlateauJeu acessPlateau() {
        return (plateau);
    }

    public void changementJoueur() {
        if (joueurCourant == tableau_joueur[0]) {
            joueurCourant = tableau_joueur[1];
        } else {
            joueurCourant = tableau_joueur[0];
        }
        plateau.Transposer();
    }

    public void Partie() {
        initialiserJeu();
        while (true) {
            System.out.println("Au tour de " + joueurCourant.acessNom());
            System.out.println("Vous jouez les " + joueurCourant.acessCouleur());
            System.out.println("Voici t'es carte : ");
            System.out.println(joueurCourant.acessMainCourante());
            System.out.println("Voici le plateau :");
            plateau.afficherGrille();
            Mouvement(joueurCourant);
            Gagner();
            if (Gagner()) {
                break;
            }
            changementJoueur();
        }

    }

}
