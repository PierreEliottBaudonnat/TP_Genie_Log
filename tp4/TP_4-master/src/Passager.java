import java.util.*;

public class Passager{

	private String nom;
	private String contact;
	private List<Reservation> listeReservations;

	public Passager(String nom, String contact){
		this.nom = nom;
		this.contact = contact;
		this.listeReservations = new ArrayList<>();
	}

}
