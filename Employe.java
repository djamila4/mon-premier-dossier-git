public class Employe{
	
	//Propriete
	
	private String nom;
	private String prenom;
	
	//Constructeur
	
	public Employe(){}
	
	public Employe(String nom){
		this.nom = nom;
		
	}
	
	public Employe(String nom, String prenom){
		this.nom = nom;
			this.prenom = prenom;
		
	}
//setter et getter
	public String getNom(){
		return this.nom
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public String getPrenom(){
		return this.prenom
	}
	public void setPrenom(String prenom){
		this.prenom = prenom;
	}
}