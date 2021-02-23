package classProjet;

import java.time.LocalDate;

public class Eleve {
	private int idE, nombreAbs;
	private String nom, prenom, email;
	private LocalDate dateDeNaissance;
	private double noteS1, noteS2, noteTotale;
	public int getIdE() {
		return idE;
	}
	public void setIdE(int idE) {
		this.idE = idE;
	}
	public int getNombreAbs() {
		return nombreAbs;
	}
	public void setNombreAbs(int nombreAbs) {
		this.nombreAbs = nombreAbs;
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
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public double getNoteS1() {
		return noteS1;
	}
	public void setNoteS1(double noteS1) {
		this.noteS1 = noteS1;
	}
	public double getNoteS2() {
		return noteS2;
	}
	public void setNoteS2(double noteS2) {
		this.noteS2 = noteS2;
	}
	public double getNoteTotale() {
		return noteTotale;
	}
	public void setNoteTotale(double noteTotale) {
		this.noteTotale = noteTotale;
	}
	public Eleve(int idE, int nombreAbs, String nom, String prenom, String email, LocalDate dateDeNaissance,
			double noteS1, double noteS2, double noteTotale) {
		super();
		this.idE = idE;
		this.nombreAbs = nombreAbs;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.dateDeNaissance = dateDeNaissance;
		this.noteS1 = noteS1;
		this.noteS2 = noteS2;
		this.noteTotale = noteTotale;
	}
	@Override
	public String toString() {
		return "Eleve [idE=" + idE + ", nombreAbs=" + nombreAbs + ", nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", dateDeNaissance=" + dateDeNaissance + ", noteS1=" + noteS1 + ", noteS2=" + noteS2
				+ ", noteTotale=" + noteTotale + "]";
	}
	
	

}
