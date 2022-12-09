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
        switch (t) {
            case 1:
                Vect[0][0] = 3;//Lui attribue des vecteur
                Vect[1][0] = 2;

                Vect[0][1] = 0;
                Vect[1][1] = 2;

                Vect[0][2] = 0;
                Vect[1][2] = 0;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Tiger";// lui attribue un nom
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
                Vect[0][0] = 1;
                Vect[1][0] = 3;

                Vect[0][1] = 2;
                Vect[1][1] = 4;

                Vect[0][2] = 3;
                Vect[1][2] = 1;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Rabbit";
            case 5:
                Vect[0][0] = 1;
                Vect[1][0] = 2;

                Vect[0][1] = 2;
                Vect[1][1] = 0;

                Vect[0][2] = 2;
                Vect[1][2] = 4;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Crab";
            case 6:
                Vect[0][0] = 1;
                Vect[1][0] = 1;

                Vect[0][1] = 1;
                Vect[1][1] = 3;

                Vect[0][2] = 2;
                Vect[1][2] = 1;

                Vect[0][3] = 2;
                Vect[1][3] = 3;
                nom = "Elephant";
            case 7:
                Vect[0][0] = 1;
                Vect[1][0] = 1;

                Vect[0][1] = 2;
                Vect[1][1] = 1;

                Vect[0][2] = 2;
                Vect[1][2] = 3;

                Vect[0][3] = 3;
                Vect[1][3] = 3;
                nom = "Goose";
            case 8:
                Vect[0][0] = 1;
                Vect[1][0] = 3;

                Vect[0][1] = 2;
                Vect[1][1] = 1;

                Vect[0][2] = 2;
                Vect[1][2] = 3;

                Vect[0][3] = 3;
                Vect[1][3] = 1;
                nom = "Rooster";
            case 9:
                Vect[0][0] = 1;
                Vect[1][0] = 1;

                Vect[0][1] = 1;
                Vect[1][1] = 3;

                Vect[0][2] = 3;
                Vect[1][2] = 1;

                Vect[0][3] = 3;
                Vect[1][3] = 3;
                nom = "Monkey";
            case 10:
                Vect[0][0] = 1;
                Vect[1][0] = 1;

                Vect[0][1] = 1;
                Vect[1][1] = 3;

                Vect[0][2] = 3;
                Vect[1][2] = 2;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Mantis";
            case 11:
                Vect[0][0] = 1;
                Vect[1][0] = 2;

                Vect[0][1] = 2;
                Vect[1][1] = 1;

                Vect[0][2] = 3;
                Vect[1][2] = 3;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Horse";
            case 12:
                Vect[0][0] = 1;
                Vect[1][0] = 2;

                Vect[0][1] = 3;
                Vect[1][1] = 1;

                Vect[0][2] = 3;
                Vect[1][2] = 3;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Ox";
            case 13:
                Vect[0][0] = 1;
                Vect[1][0] = 2;

                Vect[0][1] = 2;
                Vect[1][1] = 1;

                Vect[0][2] = 3;
                Vect[1][2] = 3;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Crane";
            case 14:
                Vect[0][0] = 1;
                Vect[1][0] = 2;

                Vect[0][1] = 2;
                Vect[1][1] = 1;

                Vect[0][2] = 2;
                Vect[1][2] = 3;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Boar";
            case 15:
                Vect[0][0] = 1;
                Vect[1][0] = 1;

                Vect[0][1] = 3;
                Vect[1][1] = 1;

                Vect[0][2] = 2;
                Vect[1][2] = 3;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Eel";
            case 16:
                Vect[0][0] = 1;
                Vect[1][0] = 3;

                Vect[0][1] = 2;
                Vect[1][1] = 1;

                Vect[0][2] = 3;
                Vect[1][2] = 3;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Cobra";
        }

    }

    public int acessType() { // acesseur de type
        return (type);
    }
    
    public int[][] acessVect(){
        return(Vect);
    }

    @Override
    public String toString() { // renvoye les donné d'une carte
        return ("Type : " + type + "\nNom : " + nom);
    }

}
