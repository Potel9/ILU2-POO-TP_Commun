package model;

public abstract class Formulaire<T extends Reservation> {
	
	protected int num�ros,jour,mois ; 
	
	protected Formulaire(int jour,int mois) {
		this.jour = jour ; 
		this.mois = mois ;
	}

	public void setIdentificationEntite(int num�ros) {
		this.num�ros = num�ros;
	}
	
	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public Integer getIdentificationEntite() {
		// TODO Auto-generated method stub
		return num�ros;
	}

}
