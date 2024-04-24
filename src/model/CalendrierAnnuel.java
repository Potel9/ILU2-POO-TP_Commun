package model;

import java.util.Arrays;

public class CalendrierAnnuel {

    private Mois[] calendrier;

    public CalendrierAnnuel() {
        calendrier = new Mois[12];
        calendrier[0] = new Mois("Janvier", 31);
        calendrier[1] = new Mois("Février", 28);
        calendrier[2] = new Mois("Mars", 31);
        calendrier[3] = new Mois("Avril", 30);
        calendrier[4] = new Mois("Mai", 31);
        calendrier[5] = new Mois("Juin", 30);
        calendrier[6] = new Mois("Juillet", 31);
        calendrier[7] = new Mois("Août", 31);
        calendrier[8] = new Mois("Septembre", 30);
        calendrier[9] = new Mois("Octobre", 31);
        calendrier[10] = new Mois("Novembre", 30);
        calendrier[11] = new Mois("Décembre", 31);
    }

    public Mois getMois(int index) {
        if (index < 0 || index >= calendrier.length) {
            throw new IllegalArgumentException("Index de mois invalide");
        }
        return calendrier[index];
    }

    public boolean reserver(int jour,int mois ) {
        if (mois < 1 || mois >= calendrier.length) {
            throw new IllegalArgumentException("Mois invalide");
        }
        if (calendrier[mois-1].estLibre(jour)== true) {
        	calendrier[mois-1].reserver(jour);
        	System.out.println("reservation du "+jour+"/"+mois+" devrait être possible");
        	return true ; 
        }
        else {
        	return false ;
        }
    }

    public boolean estLibre( int jour,int mois) {
        if (mois < 1 || mois > calendrier.length) {
            throw new IllegalArgumentException(jour+"/"+mois+" devrait être occuper");
        }
        return calendrier[mois-1].estLibre(jour);
    }	

    private static class Mois {

        private String nom;
        private boolean[] jours;

        private Mois(String nom, int nombreJours) {
            this.nom = nom;
            jours = new boolean[nombreJours];
            for(int i = 0; i<jours.length;i++) {
            	jours[i]= true ;
            }
        }

        private boolean estLibre(int jour) {
            if (jour < 1 || jour > jours.length) {
                throw new IllegalArgumentException("Jour invalide");
            }
            return jours[jour - 1];
        }

        private void reserver(int jour) {
            if (jour < 1 || jour > jours.length) {
                throw new IllegalArgumentException("Jour invalide");
            }
            if (estLibre(jour)== false) {
                throw new IllegalStateException("Ce jour est déjà réservé");
            }
            jours[jour - 1] = false;
        }
    }
}

