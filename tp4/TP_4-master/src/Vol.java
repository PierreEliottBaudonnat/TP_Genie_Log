import java.time.*;
import java.util.*;

public class Vol{

	private String[] identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private List<Reservation> listeReservations;

	public Vol(String[] identifiant, ZonedDateTime depart, ZonedDateTime arrivee){
		this.identifiant = identifiant;
		this.depart = depart;
		this.arrivee = arrivee;
		this.listeReservations = new ArrayList<>();
	}

	public void duree(){
		return;
	}

	public void ouvrir(){
		return;
	}

	public void fermee(){
		return;
	}

}
