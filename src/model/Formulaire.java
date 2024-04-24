package model;

public abstract class Formulaire<T extends Reservation> {
	
	protected int numéros,jour,mois ; 
	
	protected Formulaire(int jour,int mois) {
		this.jour = jour ; 
		this.mois = mois ;
	}

	public void setIdentificationEntite(int numéros) {
		this.numéros = numéros;
	}
	
	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public Integer getIdentificationEntite() {
		// TODO Auto-generated method stub
		return numéros;
	}

}
