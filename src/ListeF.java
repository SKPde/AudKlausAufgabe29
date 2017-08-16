
public class ListeF {

	private Comparable[] inhalt; // Inhalte der Listenelemente
	private int lastIndex; // Index des letzten Elementes

	public ListeF(int len) {
		inhalt = new Comparable[len];
		lastIndex = -1; // leere Liste
	}

	public Comparable remove(int k) {
		if (inhalt[k] == null || k >= inhalt.length || k < 0 || k > lastIndex) {
			throw new RuntimeException("Gewünschter Index existiert nicht");
		}
		Comparable ruckgabe = inhalt[k];
		lastIndex--;

		for (int x = k; x <= lastIndex; x++) {
			inhalt[k] = inhalt[k + 1];
		}

		return ruckgabe;

	}
	
	public void einfuegen(Comparable c) {
		lastIndex++;
		inhalt[lastIndex] = c;
	}
	
	public void ausgeben() {
		for(int x = 0; x <= lastIndex; x++) {
			System.out.println(inhalt[x]);
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeF liste = new ListeF(9);
		liste.einfuegen("Halberstung");
		liste.einfuegen("Schiftung");
		liste.einfuegen("Müllhofen");
		liste.einfuegen("Leiberstung");
		liste.einfuegen("Winden");
		
		liste.ausgeben();
		
		liste.remove(3);
		liste.remove(3);
		
		liste.einfuegen("Kübelhausen");
		liste.einfuegen("Aubach");
		
		liste.remove(2);
		
		liste.ausgeben();
	}

}
