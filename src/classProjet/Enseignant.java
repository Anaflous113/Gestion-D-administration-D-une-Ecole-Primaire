package classProjet;

import java.time.LocalDate;

public class Enseignant {
	private String nom, prenom, email, matiere;
	private LocalDate dateDeNaissance;
	private int enseignantId, NbrAbs;
	public Enseignant(String nom, String prenom, String email,
			String matiere, LocalDate dateDeNaissance, int enseignantId,
			int nbrAbs) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email =  email;
		this.matiere = matiere;
		this.dateDeNaissance = dateDeNaissance;
		this.enseignantId = enseignantId;
		NbrAbs = nbrAbs;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public int getEnseignantId() {
		return enseignantId;
	}
	public void setEnseignantId(int enseignantId) {
		this.enseignantId = enseignantId;
	}
	public int getNbrAbs() {
		return NbrAbs;
	}
	public void setNbrAbs(int nbrAbs) {
		NbrAbs = nbrAbs;
	}
	@Override
	public String toString() {
		return "Enseignant [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", matiere=" + matiere
				+ ", dateDeNaissance=" + dateDeNaissance + ", enseignantId=" + enseignantId + ", NbrAbs=" + NbrAbs
				+ "]";
	}
	
	
	 
	

}
