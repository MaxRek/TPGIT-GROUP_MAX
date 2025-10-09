package nintendo.model;

public class Boutique {
	String nom;
	String Adresse;
	public Boutique(String nom, String adresse) {
		this.nom = nom;
		Adresse = adresse;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", Adresse=" + Adresse + "]";
	}
	
	

}
