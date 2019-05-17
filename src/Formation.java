import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Elouan
 *
 */
public class Formation {
	private ArrayList<Cours> list;
	private String code;
	private String nom;
	
	public Formation(String code, String nom) {
		this.list = new ArrayList<Cours>();
		if(Cours.isAlphaNum(code)) {
			this.code = code;
		} else {
			System.out.println("Le code de cette Formation est erronée. \n default code : ESIREM-Error set.");
			this.code = "ESIREM-Error";
		}
		this.nom = nom;
	}
	
	// Getter
	public ArrayList getList() {
		return this.list;
	}
	
	// Setter
	
	// Auto remplissage
	public void autoFill() {
		this.list.add(new Cours("ITC315", 66, "Informatique2"));
		this.list.add(new Cours("ITC316", 66, "Electronique Numerique"));
		
		this.list.add(new Cours("ITC317", 66, "Ondes et Propagation"));
		this.list.add(new Cours("ITC318", 48, "Certification CCNA"));
		
		this.list.add(new Cours("ITC319", 66, "Traitement du Signal et des Images"));
		this.list.add(new Cours("ITPC32", 35, "Projet"));
	}
	
	// @Override toString
	public String toString() {
		String res = "";
		
		res += "Formation : " + this.nom + " [" + this.code + "]\n";
		
		for(Cours c : list) {
			res += "   - " + c.toString() + "\n";
		}
		
		return res;
	}
	
	//add
	public void addCours(Cours c) {
		System.out.println(c.toString() + " bien ajouté à la formation " + this.nom + " [" + this.code + "]");
		this.list.add(c);
	}
	
	//remove
	public void removeCours(int i) {
		System.out.println("Le Cours à l'indice " + i + " a bien été retiré de la formation " + this.nom + " [" + this.code + "]");
		this.list.remove(i);
	}
	public void removeCours(Cours c) {
		System.out.println("Le Cours " + c.toString() + " bien été retiré de la formation " + this.nom + " [" + this.code + "]");
		this.list.remove(c);
	}
	
	//get
	public Cours getCours(int i) {
		return this.list.get(i);
	}
}
