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
    private ArrayList<Carte> main_courante = new ArrayList();
    private ArrayList<Pion> main_pion = new ArrayList();
    private String nom_j;

    public Joueur(String color, String nom) {
        couleur = color;
        nom_j = nom;
    }

    public String lireCouleur() {
        return (couleur);
    }

    public void affecterCouleur(String color) {
        couleur = color;
    }
    
    public String acessCouleur(){
        return(couleur);
    }

    public void definirMainCourante(ArrayList<Carte> d) {//Prend en entrer un deck et l'affecte comme deck du joueur
        main_courante = d; 
    }
    
    public ArrayList<Carte> acessMainCourante(){
        return(main_courante);
    }

    public void affecterPion(Pion p) {
        main_pion.add(p);
    }
    
    public String acessNom(){
        return(nom_j);
    }

    public Pion acessMainPion(int indice) {
        return (main_pion.get(indice));
    }

}
