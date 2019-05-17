import java.util.Collections;

/**
 * 
 */

/**
 * @author Elouan
 *
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex1();
		//Ex2();
		//Ex3();
		Ex4();
	}
	
	static void Ex1() {
		Cours c1 = new Cours("ITC315", 66, "Informatique2");

		// Testons la restriction alphanumérique...
		Cours c2 = new Cours("ITC&316", 66, "Electronique Numerique");
		
		// Testons les Getters...
		System.out.println("\n** GETTER **");
		System.out.println("c1.getCode() : " + c1.getCode());
		System.out.println("c1.getVolHoraire() : " + c1.getVolHoraire());
		System.out.println("c1.getIntitule() : " + c1.getIntitule());
		System.out.println("***********\n");
		
		// Testons les Setters...
		System.out.println("** SETTER **");
		// nouvelle valeur pour c1 : ITC317 - 55h - Onde et Propagation
		System.out.println("Les nouvelles valeurs des attributs de c1 doivent être : "
			+ "\n code : ITC317" 
			+ "\n volHoraire : 55"
			+ "\n intitule : Onde et Propagation");
		c1.setCode("ITC317");
		c1.setVolHoraire(55);
		c1.setIntitule("Onde et Propagation");
		System.out.print("toString : " + c1.toString());
		System.out.println("************\n");
		
		// Testons de set code à une valeur ne satisfesant pas la condition alphanumérique
		c2.setCode("a#a");
		
	}
	
	static void Ex2() {
		Formation IT_3A;
		IT_3A = new Formation("ITC3A", "Infotronique");
		
		IT_3A.autoFill();
		
		System.out.println(IT_3A.toString());
	}
	
	static void Ex3() {
		// Création des 7 cours
		Cours info2 = new Cours("ITC315", 66, "Informatique2");
		Cours elecNum = new Cours("ITC316", 66, "Electronique Numerique");
		
		Cours OndePropag = new Cours("ITC317", 66, "Ondes et Propagation");
		Cours ccna = new Cours("ITC318", 48, "Certification CCNA");
		
		Cours tsi = new Cours("ITC319", 66, "Traitement du Signal et des Images");
		Cours projet = new Cours("ITPC32", 35, "Projet");
		
		// ANGLAIS2 et non ANGLAIS 2 car la gestion des espaces n'est pas handled
		Cours anglais = new Cours("ANGLAIS2", 35, "Anglais");
		
		// Création de la Formation
		Formation IT = new Formation("IT3A", "Infotronique");
		
		// Ajouts des 7 Cours à la Formation
		IT.addCours(info2);
		IT.addCours(elecNum);
		IT.addCours(OndePropag);
		IT.addCours(ccna);
		IT.addCours(tsi);
		IT.addCours(projet);
		IT.addCours(anglais);
		
		//Affichage
		System.out.println("\n" + IT.toString());
		
		// Suppression du 2ème Cours de la liste
		IT.removeCours(1);
		
		//Ré-Affichage
		System.out.println("\n" + IT.toString());
		
		//Affichage du 2eme Cours de la Formation
		System.out.println("Le nouveau deuxième Cours de la liste est : " +IT.getCours(1).toString() + ".");
	}
	
	static void Ex4() {
		Cours info2 = new Cours("ITC315", 66, "Informatique2");
		Cours elecNum = new Cours("ITC316", 66, "Electronique Numerique");
		
		/* Rappel
		 * 	 - true = 1
		 *   - false = 0
		 */
		System.out.println("true = 1 | false = 0");
		
		// Should be false
		System.out.println("info2 est-il identique à elecNum : " + info2.compareTo(elecNum));
		
		// Should be true
		System.out.println("info2 est-il identique à info2 : " + info2.compareTo(info2));
		
		// Sort
		Formation IT = new Formation("IT3A", "Infotronique");
		IT.autoFill();
		System.out.println(IT.toString());
		Collections.sort(IT.getList());
		System.out.println(IT.toString());
	}
}