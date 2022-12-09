/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onitama;

/**
 *
 * @author Corentin DURAND
 */
public class Onitama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Joueur j1 = new Joueur("rouge");
        Joueur j2 = new Joueur("jaune");
        Jeu jeu = new Jeu(j1,j2);
        jeu.initialiserJeu();
        jeu.acessPlateau().afficherGrille();
        //j1.acessMainCourante()[0].afficherMouvement(j1);
        
    }   
    
}
