package model;

public class FormulaireRestaurant extends Formulaire {
	
	private ReservationRestaurant reservation ;
	private int nbPersonnes,num�roService ;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int num�roService ) {
		super(jour, mois);
		reservation = new ReservationRestaurant(jour, mois,0, num�roService);
		this.nbPersonnes = nbPersonnes ; 
		this.num�roService = num�roService;
	}
	public ReservationRestaurant getReservation() {
		return reservation;
	}
	public int getNbPersonnes() {
		return nbPersonnes;
	}
	public int getNum�roService() {
		return num�roService;
	}

	
}
