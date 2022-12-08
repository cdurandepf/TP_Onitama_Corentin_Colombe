/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama;

/**
 *
 * @author Corentin DURAND
 */
public class PlateauJeu {
    
    private Case[][] grille = new Case[5][5];
    
    public PlateauJeu() {// Créée un plateau de 5 sur 5 fait de case
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                grille[i][j] = new Case(null, null);
            }
        }
        

    }
    
    public void affecterPionReper(int ligne, int colone, boolean b){
        grille[ligne][colone].affecterReper(b);
    }
    
    public void affecterMontrerMouvement(int ligne, int colone, boolean b){
        grille[ligne][colone].affecterMontrerMouvement(b);
    }
    
    public void afficherGrille(){//affiche le plateau
        String retour = "";
        for(int i = 0; i < 5; i++){
            retour = "";
            for(int j = 0; j < 5; j++){
                retour += grille[i][j].toString();                
            }                
            System.out.println(retour);
        }
    }
    
    public void affecterPionSurCase(int ligne, int colone, Pion p){
        grille[ligne][colone].definirPion(p);
    }
    
}
