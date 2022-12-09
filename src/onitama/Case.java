/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama;

/**
 *
 * @author Corentin DURAND
 */
public class Case {

    private Pion pionCourant;
    private Temple avoirTemple;
    private boolean montrerMouvement = false;
    private boolean pionReper = false;

    public Case(Pion p, Temple temple) {
        pionCourant = p;
        avoirTemple = temple;

    }
    
    public void affecterMontrerMouvement(boolean b){//Permet de montrer le mouvement d'une carte 
        montrerMouvement = b;
    }

    public Pion acessPion() {//Permet d'accesder au pion sur la case
        return (pionCourant);
    }

    public boolean presencePion() {//Verifie si un pion est sur la case
        if (pionCourant != null) {
            return (true);
        } else {
            return (false);
        }
    }

    public void definirPion(Pion p) {//Pose un pion sur la case
        pionCourant = p;
    }

    public Temple acessTemple() {//Renvoie les information sur le temple
        return (avoirTemple);
    }
    
    public void affecterReper(boolean b){//Pose l'origine des case, permet de calibrer le mouvement
        pionReper = b;
    }
    
    

    @Override
    public String toString() {
        if(pionReper){
            return("[.O.]");
        }
        if(montrerMouvement){
            return("[.M.]");
        }
        if (avoirTemple != null) {
            return ("[.T.]");
        } else if (pionCourant != null) {
            if (pionCourant.lireCouleur().equals("rouge")) {
                if (pionCourant.acessRoi()) {
                    return ("[R_R]");
                } else {
                    return ("[P_R]");
                }
            } else {
                if (pionCourant.acessRoi()) {
                    return ("[R_J]");
                } else {
                    return ("[P_J]");
                }
            }
        }else{
            return("[...]");
        }
    }

}
