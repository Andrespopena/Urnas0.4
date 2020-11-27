public class Bola {
	private String color; // {AZUL, ROJO}, NO NULO

	public Bola(String color) {
		assert (color != null) : "Error: el color de una bola no puede ser nulo";
		assert color.equals("AZUL") || color.equals("ROJO")
				: String.format("Error: el color de una bola debe ser AZUL o ROJO (color=%s)", color);
		this.color = color;
	}

	public static Bola generar() {
		// Generar color aleatorio entre los colores posibles de una bola
		String color = generarColor();
		return new Bola(color);
	}

	// Genera un color aleatorio de los posibles para una bola
	private static String generarColor() {
		// TODO: generar color aleatoriamente
		return "AZUL";
	}

	public String getColor() {
		return color;
	}

	public String toString() {
		return "Bola: " + color;
	}

}