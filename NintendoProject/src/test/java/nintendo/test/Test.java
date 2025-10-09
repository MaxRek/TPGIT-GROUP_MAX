package nintendo.test;

import nintendo.model.Adresse;
import nintendo.model.Boutique;
import nintendo.model.Client;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cli1 = new Client("gruson","jonah");
		Client cli2 = new Client("gruson","jonah");
		
		Adresse adresseBoutique = new Adresse(21, "rue de paris" , "Paris");
		Boutique boutique = new Boutique("La boutique de Nintendo", adresseBoutique);
	}
	

}
