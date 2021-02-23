package classProjet;

public class Classe {
	private int idC;
	private double moyenne;
	private String nomC, niveau;
	public int getIdC() {
		return idC;
	}
	public void setIdC(int idC) {
		this.idC = idC;
	}
	public double getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	public String getNomC() {
		return nomC;
	}
	public void setNomC(String nomC) {
		this.nomC = nomC;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public Classe(int idC, double moyenne, String nomC, String niveau) {
		super();
		this.idC = idC;
		this.moyenne = moyenne;
		this.nomC = nomC;
		this.niveau = niveau;
	}
	@Override
	public String toString() {
		return "Classe [idC=" + idC + ", moyenne=" + moyenne + ", nomC=" + nomC + ", niveau=" + niveau + "]";
	}
	
	

}
