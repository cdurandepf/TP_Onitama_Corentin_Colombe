/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama;

import java.util.*;

/**
 *
 * @author Corentin DURAND
 */
public class Joueur {

    private String couleur;
    private Carte main_courante[] = new Carte[2];
    private ArrayList<Pion> main_pion = new ArrayList();
    private String nom_j;

    public Joueur(String color) {
        couleur = color;
    }

    public String lireCouleur() {
        return (couleur);
    }

    public void affecterCouleur(String color) {
        couleur = color;
    }

    public void definirMainCourante(Carte[] c) {
        main_courante[0] = c[0];
        main_courante[1] = c[1];
    }
    
    public Carte[] acessMainCourante(){
        return(main_courante);
    }

    public void affecterPion(Pion p) {
        main_pion.add(p);
    }

    public Pion acessMainPion(int indice) {
        return (main_pion.get(indice));
    }

}
