import java.util.*;

public class Client{
	
	private String nom;
	private String paiement;
	private String contact;
	private String reference;
	private List<Reservation> listeReservations;

	public Client(String nom, String paiement, String contact, String reference){
		this.nom = nom;
		this.paiement = paiement;
		this.contact = contact;
		this.reference = reference;
		this.listeReservations = new ArrayList<>();
	}

}
