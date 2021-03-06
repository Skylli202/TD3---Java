import java.util.Scanner;

public class Cours {
	private String code;
	private int volHoraire;
	private String intitule;
	
	public Cours(String code, int volHoraire, String intitule) {
		this.volHoraire = volHoraire;
		this.intitule = intitule;
		
		// Verif carac alphanum ?
		if(isAlphaNum(code)) {
			this.code = code;
		} else {
			System.out.println("Le code de ce cours est erronée. \n default code : ITC000 set.");
			this.code = "ITC000";
		}
	}
	
	// Getter
	String getCode() {return code;}
	int getVolHoraire() {return volHoraire;}
	String getIntitule() {return intitule;}
	
	// Setter
	void setCode(String str) {
		while(!isAlphaNum(str)) {
			System.out.println("Votre code n'est pas alphanumérique. \n Saisissez à nouveau");
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();
		}
		System.out.println("Nouveau code pour l'enseignement " + this.intitule + " [" + str + "]" + " (anciennement : " + this.code + ")");
		this.code = str;
	}
	void setVolHoraire(int i) {
		this.volHoraire = i;
		System.out.println("Nouveau volume horaire pour l'enseignement " + this.intitule + " [" + this.code + "]");
	}
	void setIntitule(String str) {
		System.out.println("Nouvelle intitule pour l'enseignement " + str + " (anciennement : " + this.intitule + ")");
		//System.out.println("L'enseignement " + this.intitule + "est renommé " + str +".");
		this.intitule = str;
	}
	
	//@overide toString()
	public String toString() {
		String str = "";
		
		str = this.intitule + " - [" + this.code + "](" + this.volHoraire + "h)";
		
		return str;
	}
	
	// Verification Alphanumerique
	public boolean isAlphaNum(String str) {
		int length = str.length();
		
		for(int i=0; i < length; i++) {
			char ch = str.charAt(i);
			if(!Character.isLetterOrDigit(ch))
				return false;
		}
		
		return true;
	}
}