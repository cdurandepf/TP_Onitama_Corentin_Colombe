/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama;

/**
 *
 * @author Corentin DURAND
 */
public class Pion {
    
    private boolean etreRoi;
    private Joueur posseseur;
    private String couleur;
    
    
    public Pion(Joueur j){
        posseseur = j;
        couleur = posseseur.lireCouleur();
    }
    
    public void definirRoi(boolean b){// permet de definir si un pion est roi
        etreRoi = b;
    }
    
    public Joueur proprietaire(){
        return(posseseur);
    }
    
    public String lireCouleur(){
        return(couleur);
    }
    
    public boolean acessRoi(){
        return(etreRoi);
    }
    
}
