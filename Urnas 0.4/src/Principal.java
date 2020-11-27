/*
 * Urnas 0.3 
 */
public class Principal {
	public static void main(String[] args) {
		// Bolas
		Bola bola1 = new Bola("AZUL");
		Bola bola2 = new Bola("AZUL");
		Bola bola3 = new Bola("ROJO");

		// Urna
		Urna u1 = new Urna();
		System.out.println(u1);
		u1.agregar(bola1);
		System.out.println(u1);
		u1.agregar(bola2);
		System.out.println(u1);
		u1.agregar(bola3);
		System.out.println(u1);

		// Sacar bolas
		System.out.println("Saco la bola: " + u1.sacar());
		Bola roja = u1.sacar("ROJO");
		System.out.println("He sacado de la urna la bola: " + roja);
		System.out.println(u1);
	}
}