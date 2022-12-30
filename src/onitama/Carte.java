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
    private int[][] Vect = new int[2][4];

    public Carte(int t) { // constructeur
        type = t;//Donne le type de carte
        switch (t) {
            case 1:
                Vect[0][0] = -2;//Lui attribue des vecteur
                Vect[1][0] = 0;

                Vect[0][1] = 1;
                Vect[1][1] = 0;

                Vect[0][2] = 0;
                Vect[1][2] = 0;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Tiger";// lui attribue un nom
                break;
            case 2:
                Vect[0][0] = -1;
                Vect[1][0] = -2;

                Vect[0][1] = 1;
                Vect[1][1] = -1;

                Vect[0][2] = 1;
                Vect[1][2] = 1;

                Vect[0][3] = -1;
                Vect[1][3] = 2;

                nom = "Dragon";
                break;
            case 3:
                Vect[0][0] = 0;
                Vect[1][0] = -2;

                Vect[0][1] = -1;
                Vect[1][1] = -1;

                Vect[0][2] = 1;
                Vect[1][2] = 1;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Frog";
                break;
            case 4:
                Vect[0][0] = 1;
                Vect[1][0] = -1;

                Vect[0][1] = -1;
                Vect[1][1] = 1;

                Vect[0][2] = 0;
                Vect[1][2] = 2;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Rabbit";
                break;
            case 5:
                Vect[0][0] = 0;
                Vect[1][0] = -2;

                Vect[0][1] = 1;
                Vect[1][1] = 0;

                Vect[0][2] = 0;
                Vect[1][2] = 2;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Crab";
                break;
            case 6:
                Vect[0][0] = 0;
                Vect[1][0] = -1;

                Vect[0][1] = -1;
                Vect[1][1] = -1;

                Vect[0][2] = 0;
                Vect[1][2] = 1;

                Vect[0][3] = -1;
                Vect[1][3] = 1;
                nom = "Elephant";
                break;
            case 7:
                Vect[0][0] = 0;
                Vect[1][0] = -1;

                Vect[0][1] = -1;
                Vect[1][1] = -1;

                Vect[0][2] = 0;
                Vect[1][2] = 1;

                Vect[0][3] = 1;
                Vect[1][3] = 1;
                nom = "Goose";
                break;
            case 8:
                Vect[0][0] = 0;
                Vect[1][0] = -1;

                Vect[0][1] = 1;
                Vect[1][1] = -1;

                Vect[0][2] = 0;
                Vect[1][2] = 1;

                Vect[0][3] = -1;
                Vect[1][3] = 1;
                nom = "Rooster";
                break;
            case 9:
                Vect[0][0] = 1;
                Vect[1][0] = 1;

                Vect[0][1] = 1;
                Vect[1][1] = -1;

                Vect[0][2] = -1;
                Vect[1][2] = 1;

                Vect[0][3] = -1;
                Vect[1][3] = -1;
                nom = "Monkey";
                break;
            case 10:
                Vect[0][0] = -1;
                Vect[1][0] = -1;

                Vect[0][1] = -1;
                Vect[1][1] = 1;

                Vect[0][2] = 1;
                Vect[1][2] = 0;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Mantis";
                break;
            case 11:
                Vect[0][0] = 0;
                Vect[1][0] = -1;

                Vect[0][1] = -1;
                Vect[1][1] = 0;

                Vect[0][2] = 1;
                Vect[1][2] = 0;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Horse";
                break;
            case 12:
                Vect[0][0] = -1;
                Vect[1][0] = 0;

                Vect[0][1] = 1;
                Vect[1][1] = 0;

                Vect[0][2] = 0;
                Vect[1][2] = 1;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Ox";
                break;
            case 13:
                Vect[0][0] = -1;
                Vect[1][0] = 0;

                Vect[0][1] = 1;
                Vect[1][1] = 1;

                Vect[0][2] = 1;
                Vect[1][2] = -1;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Crane";
                break;
            case 14:
                Vect[0][0] = -1;
                Vect[1][0] = 0;

                Vect[0][1] = 0;
                Vect[1][1] = 1;

                Vect[0][2] = 0;
                Vect[1][2] = -1;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Boar";
                break;
            case 15:
                Vect[0][0] = -1;
                Vect[1][0] = -1;

                Vect[0][1] = 1;
                Vect[1][1] = -1;

                Vect[0][2] = 0;
                Vect[1][2] = 1;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Eel";
                break;
            case 16:
                Vect[0][0] = 1;
                Vect[1][0] = 1;

                Vect[0][1] = 0;
                Vect[1][1] = -1;

                Vect[0][2] = -1;
                Vect[1][2] = 1;

                Vect[0][3] = 0;
                Vect[1][3] = 0;
                nom = "Cobra";
                break;
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
        return ("Type : " + type + "   Nom : " + nom);
    }

}
