/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama;

/**
 *
 * @author Corentin DURAND
 */
public class Carte {

    private int type; // Type de deplacement de la carte
    private String nom; // Nom de la carte
    private PlateauJeu grilleMouvement = new PlateauJeu();
    private int[][] Vect = new int[1][3];

    public Carte(int t) { // constructeur
        type = t;//Donne le type de carte
        switch (t) {// lui attribue un nom
            case 1:
                Vect[0][0] = 3;
                Vect[1][0] = 2;

                Vect[0][1] = 0;
                Vect[1][1] = 2;

                Vect[0][2] = 0;
                Vect[1][2] = 0;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Tiger";
            case 2:
                Vect[0][0] = 1;
                Vect[1][0] = 0;

                Vect[0][1] = 1;
                Vect[1][1] = 1;

                Vect[0][2] = 3;
                Vect[1][2] = 3;

                Vect[0][3] = 3;
                Vect[1][3] = 4;

                nom = "Dragon";
            case 3:
                Vect[0][0] = 1;
                Vect[1][0] = 1;

                Vect[0][1] = 2;
                Vect[1][1] = 0;

                Vect[0][2] = 3;
                Vect[1][2] = 3;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Frog";
            case 4:
                nom = "Rabbit";
            case 5:
                nom = "Crab";
            case 6:
                nom = "Elephant";
            case 7:
                nom = "Goose";
            case 8:
                nom = "Rooster";
            case 9:
                nom = "Monkey";
            case 10:
                nom = "Mantis";
            case 11:
                nom = "Horse";
            case 12:
                nom = "Ox";
            case 13:
                nom = "Crane";
            case 14:
                nom = "Boar";
            case 15:
                nom = "Eel";
            case 16:
                nom = "Cobra";
        }

    }

    public int acessType() { // acesseur de type
        return (type);
    }

    /*

    public void afficherMouvement(Joueur j) {//Affiche le mouvement d'un carte
        int n;
        if (j.lireCouleur().equals("rouge")) {// Regarde la couleur du joueur
            n = 1;
        } else {
            n = 2;
        }
        switch (n) {//Selon la couleur du joueur oriante les déplacement sur la grille(met en miroire pour le joueur du haut
            case 1:
                grilleCarte(type);
                grilleMouvement.afficherGrille();
                System.out.println(j.acessMainCourante()[0]);
            case 2://Verifier si ça marche
                grilleMouvement.Transposer();//Surtout ça
                grilleCarte(type);
                grilleMouvement.afficherGrille();
                System.out.println(j.acessMainCourante()[0]);
                grilleMouvement.Transposer();

        }
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
     */

    @Override
    public String toString() { // renvoye les donné d'une carte
        return ("Type : " + type + "\nNom : " + nom);
    }

}
