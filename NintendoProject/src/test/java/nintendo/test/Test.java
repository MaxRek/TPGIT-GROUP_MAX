package nintendo.test;

import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Adresse;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Adresse adresseBoutique = new Adresse(21, "rue de paris" , "Paris");
		Boutique boutique = new Boutique("La boutique de Nintendo", adresseBoutique);
	

		Console console1 = new Console("ordinateur",299.99,LocalDate.now());
		Jeu jeu1= new Jeu("Zelda",console1,boutique);
		Jeu jeu2= new Jeu("FIFA",console1,boutique);
		
		List<Achat> achatsCli1 = new ArrayList();
		
		achatsCli1.add(new Achat(jeu1, LocalDate.now(),19.99));
		achatsCli1.add(new Achat(jeu2, LocalDate.now(),29.99));
		
		List<Achat> achatsCli2 = new ArrayList();
		achatsCli2.add(new Achat(jeu1, LocalDate.now(),19.99));
		achatsCli2.add(new Achat(jeu2, LocalDate.now(),29.99));
		
		Client cli1 = new Client("GRUSON","Jonah",achatsCli1);
		Client cli2 = new Client("REKAR","Maxime",achatsCli2);
		
		
	}


}
