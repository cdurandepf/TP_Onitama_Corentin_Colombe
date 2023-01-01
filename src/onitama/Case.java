/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onitama;

import java.util.logging.Logger;

/**
 *
 * @author Corentin DURAND
 */
public class Case {

    private Pion pionCourant;
    private String avoirTemple;
    private boolean montrerMouvement = false;
    private boolean pionReper = false;
    private boolean mangerPion = false;

    public Case(Pion p, String temple) {
        pionCourant = p;
        avoirTemple = temple;

    }

    public void affecterMontrerMouvement(boolean b) {//Permet de montrer le mouvement d'une carte 
        montrerMouvement = b;
    }

    public boolean acessRoi() {
        if (pionCourant != null) {
            return (pionCourant.acessRoi());
        } else {
            return (false);
        }
    }

    public void affectermangerPion(boolean b) {
        mangerPion = b;
    }

    public boolean acessmangerPion() {
        return (mangerPion);
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

    public String acessTemple() {//Renvoie les information sur le temple
        return (avoirTemple);
    }

    public void affecterReper(boolean b) {//Pose l'origine des case, permet de calibrer le mouvement
        pionReper = b;
    }

    public void affecterTemple(String b) {
        avoirTemple = b;
    }

    public String gangerTemple() {
        if (avoirTemple.equals("r") && pionCourant.acessRoi() && pionCourant.lireCouleur().equals("jaune")) {
            return ("Le joueur Jaune à gagner");
        } else if (avoirTemple.equals("j") && pionCourant.acessRoi() && pionCourant.lireCouleur().equals("rouge")) {
            return ("Le joueur Rouge à gagner");
        } else {
            return ("");
        }
    }

    @Override
    public String toString() {
        if (pionReper) {
            return ("[.O.]");
        } else if (mangerPion) {
            return ("[.A.]");
        }
        if (montrerMouvement) {
            return ("[.M.]");
        }
        if (pionCourant != null) {
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
        } else {
            return ("[...]");
        }
    }

}
