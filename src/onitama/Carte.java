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

    public Carte(int t, String nom_i) { // constructeur
        type = t;
        nom = nom_i;
    }

    public int acessType() { // acesseur de type
        return (type);
    }

    public void afficherMouvement(Joueur j) {
        int n;
        if (j.lireCouleur().equals("rouge")) {
            n = 1;
        } else {
            n = 2;
        }
        switch (n) {
            case 1:
                grilleCarte(type);
                grilleMouvement.afficherGrille();
                System.out.println(j.acessMainCourante()[0]);
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
            case 9 : 
                grilleMouvement.affecterMontrerMouvement(1,1,true);
                grilleMouvement.affecterMontrerMouvement(1,3,true);
                grilleMouvement.affecterMontrerMouvement(3,1,true);
                grilleMouvement.affecterMontrerMouvement(3,3,true);
                break;
            case 10 :
                grilleMouvement.affecterMontrerMouvement(1,1,true);
                grilleMouvement.affecterMontrerMouvement(1,3,true);
                grilleMouvement.affecterMontrerMouvement(3,2,true);
                break;
            case 11 : 
                grilleMouvement.affecterMontrerMouvement(1,2,true);
                grilleMouvement.affecterMontrerMouvement(2,1,true);
                grilleMouvement.affecterMontrerMouvement(3,3,true);
                break;
            case 12 : 
                grilleMouvement.affecterMontrerMouvement(1,2,true);
                grilleMouvement.affecterMontrerMouvement(3,1,true);
                grilleMouvement.affecterMontrerMouvement(3,3,true);
                break;
            case 13 : 
                grilleMouvement.affecterMontrerMouvement(1,2,true);
                grilleMouvement.affecterMontrerMouvement(2,1,true);
                grilleMouvement.affecterMontrerMouvement(3,3,true);
                break;
            case 14 : 
                grilleMouvement.affecterMontrerMouvement(1,2,true);
                grilleMouvement.affecterMontrerMouvement(2,1,true);
                grilleMouvement.affecterMontrerMouvement(2,3,true);
                break;
            case 15 : 
                grilleMouvement.affecterMontrerMouvement(1,1,true);
                grilleMouvement.affecterMontrerMouvement(3,1,true);
                grilleMouvement.affecterMontrerMouvement(2,3,true);
                break;
            case 16 : 
                grilleMouvement.affecterMontrerMouvement(1,3,true);
                grilleMouvement.affecterMontrerMouvement(2,1,true);
                grilleMouvement.affecterMontrerMouvement(3,3,true);
                break;

        }
    }

    @Override
    public String toString() { // renvoye les donné d'une carte
        return ("Type : " + type);
    }

}
