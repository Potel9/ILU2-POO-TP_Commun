package model;

public class FormulaireRestaurant extends Formulaire {
	
	private ReservationRestaurant reservation ;
	private int nbPersonnes,numéroService ;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numéroService ) {
		super(jour, mois);
		reservation = new ReservationRestaurant(jour, mois,0, numéroService);
		this.nbPersonnes = nbPersonnes ; 
		this.numéroService = numéroService;
	}
	public ReservationRestaurant getReservation() {
		return reservation;
	}
	public int getNbPersonnes() {
		return nbPersonnes;
	}
	public int getNuméroService() {
		return numéroService;
	}

	
}
