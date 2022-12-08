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
public class Deck {

    private ArrayList<Carte> deck = new ArrayList();// Création du deck de la partie
    private Carte deck_j1[] = new Carte[2];
    private Carte deck_j2[] = new Carte[2];
    private Carte carte_table;

    public Deck() {
        this.creeDeck();
        for (int i = 0; i < 2; i++) {
            deck_j1[i] = deck.get(i);
        }
        for (int i = 0; i < 2; i++) {
            deck_j2[i] = deck.get(i + 2);
        }
        carte_table = deck.get(4);

    }

    public void creeDeck() { // initialisation du deck
        ArrayList verification = new ArrayList();// Permettra de verifier que nous ne mettons pas deux carte identique dans le deck 
        while (deck.size() != 5) { // Tant que le deck n'est pas remplie on reste dans la boucle
            int n = (int) (Math.random() * 16); // Choisie un nombre aléatoir entre 1 et 16
            if (!verification.contains(n)) { // On verifie que la carte n'a pas deja été donné
                verification.add(n); // On ajoute le numero de carte que l'on met dans notre deck
                switch (n) { // Attribut une carte au deck pour un sertain n
                    case 1:
                        Carte carte_1 = new Carte(1, "Tiger"); // créée carte
                        deck.add(carte_1); // ajoute carte au deck
                        break;
                    case 2:
                        Carte carte_2 = new Carte(2, "Dragon");
                        deck.add(carte_2);
                        break;
                    case 3:
                        Carte carte_3 = new Carte(3, "Frog");
                        deck.add(carte_3);
                        break;
                    case 4:
                        Carte carte_4 = new Carte(4, "Rabbit");
                        deck.add(carte_4);
                        break;
                    case 5:
                        Carte carte_5 = new Carte(5, "Crab");
                        deck.add(carte_5);
                        break;
                    case 6:
                        Carte carte_6 = new Carte(6, "Elephant");
                        deck.add(carte_6);
                        break;
                    case 7:
                        Carte carte_7 = new Carte(7, "Goose");
                        deck.add(carte_7);
                        break;
                    case 8:
                        Carte carte_8 = new Carte(8, "Rooster");
                        deck.add(carte_8);
                        break;
                    case 9:
                        Carte carte_9 = new Carte(9, "Monkey");
                        deck.add(carte_9);
                        break;
                    case 10:
                        Carte carte_10 = new Carte(10, "Mantis");
                        deck.add(carte_10);
                        break;
                    case 11:
                        Carte carte_11 = new Carte(11, "Horse");
                        deck.add(carte_11);
                        break;
                    case 12:
                        Carte carte_12 = new Carte(12, "Ox");
                        deck.add(carte_12);
                        break;
                    case 13:
                        Carte carte_13 = new Carte(13, "Crane");
                        deck.add(carte_13);
                        break;
                    case 14:
                        Carte carte_14 = new Carte(14, "Boar");
                        deck.add(carte_14);
                        break;
                    case 15:
                        Carte carte_15 = new Carte(15, "Eel");
                        deck.add(carte_15);
                        break;

                    case 16:
                        Carte carte_16 = new Carte(16, "Cobra");
                        deck.add(carte_16);
                        break;
                }
            }

        }

    }

    public Carte[] acessDeckJoueur(int n) {// renvoye le deck du joueur demander
        if (n == 1) {
            return (deck_j1);
        } else {
            return (deck_j2);
        }
    }

}
