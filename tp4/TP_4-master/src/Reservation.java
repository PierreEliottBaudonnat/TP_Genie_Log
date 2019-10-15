import java.time.*;
import java.util.*;

public class Reservation{

	public Date date;
	public Double identifiant;
	public String etat;
	private List<Client> listeClients;
	private Vol vol;
	private List<Passager> listePassagers;

	public Reservation(Date date, Double identifiant, String etat, Vol vol){
		this.date = date;
		this.identifiant = identifiant;
		this.etat = etat;
		this.listeClients = new ArrayList<>();
		this.vol = vol;
		this.listePassagers = new ArrayList<>();
	}

	public void annuler(){
		etat = "annulée";
	}

	public void confirmer(){
		etat = "confirmée";
	}

	public void payer(){
		if(etat.equals("confirmée")){
			etat = "payée";
		}
		else{
			System.out.println("Vous ne pouvez pas payer cette réservation");
		}
	}
}
