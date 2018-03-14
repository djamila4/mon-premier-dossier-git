public class Etudiant{
	
	//Propriete
	
	private String nomEtudiant;
	private String prenomEtudiant;
	
	//constructeur
	
	public Etudiant(){}
	
	public Etudiant(String nomEtudiant, String prenomEtudiant){
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		
	}
//setter et getter
	public String getNomEtudiant(){
		return this.nom
	}
	public void setNomEtudiant(String nomEtudiant){
		this.nomEtudiant = nomEtudiant;
	}
	public String getPrenomEtudiant(){
		return this.prenomEtudiant
	}
	public void setPrenomEtudiant(String prenomEtudiant){
		this.prenomEtudiant = prenomEtudiant;
	}
}