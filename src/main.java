
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1();
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
}