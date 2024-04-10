package model;

import java.time.LocalDate;

public abstract class Reservation {
    protected int jour;
    protected int mois; 
    public Reservation(int jour,int mois) {
        this.jour = jour ;
        this.mois = mois ;
    }
    
}