/*
 * Urna 0.3
 * 
 * Una misma bola no puede estar contenida varias veces en la misma urna
 */
public class Urna
{
    private Bola b1;    // <<R>>
    private Bola b2;    // <<R>>   
    private Bola b3;    // <<R>>  
    
    public Urna() {        
    }
    
    public void agregar(Bola b) {
        assert (b != null) : "Error: la bola que se desea agregar no puede ser nula";
        assert !esta(b): String.format("Error: no es posible agregar la bola %s porque ya esta en la urna",b);
        assert (!estaLlena()) : String.format("Error: no es posible agregar la bola %s porque la urna esta llena", b);
        if (b1==null)
            b1=b;
        else if (b2==null)
            b2=b;
        else if (b3==null)       
            b3=b; 
        else                        // PROGRAMACION DEFENSIVA
            assert false: "Error: bola inesperada";    
    }
    
    public boolean estaLlena() {
        return (b1 != null) && (b2 != null) && (b3 != null);
    }
    
    public boolean estaVacia() {
        return (b1 == null) && (b2 == null) && (b3 == null);
    }    
    
    // Devuelve true si la bola recibida ya esta en la urna (e.o.c. false)
    public boolean esta(Bola b) {
        assert b != null : "Error: la bola que se desea comprobar si esta en la urna no puede ser nula";
        return (b == b1) || (b == b2) || (b == b3);
    }
    
    // Saca de la urna la primera bola que encuentre
    // Devuelve: bola (o bien se produce un error si la urna esta vacia)
    public Bola sacar() {
        assert !estaVacia() : "Error: no es posible sacar una bola ya que la urna esta vacia";
        
        Bola aux = null;        
        if (b1 != null) {
            aux = b1;
            b1 = null;
        } else if (b2 != null) {
            aux = b2;
            b2 = null;      
        } else if (b3 != null) {
            aux = b3;
            b3 = null;       
        } else                     // PROGRAMACION DEFENSIVA
            assert false: "Error: inesperado en sacar";
        
        return aux;
    }
    
    // Saca de la urna la primera bola del color color recibido
    // Devuelve: bola (o null si no hay una bola del color deseado)
    // Se produce un error si la urna esta vacia
    public Bola sacar(String color) {
        assert (color != null): "Error: el color de una bola no puede ser nulo";        
        assert !estaVacia() : "Error: no es posible sacar una bola ya que la urna esta vacia";                

        Bola aux = null;
        if (b1 != null && b1.getColor().equals(color)) {
            aux = b1;
            b1 = null;
        } else if (b2 != null && b2.getColor().equals(color)) {
            aux = b2;
            b2 = null;
        } else if (b3 != null && b3.getColor().equals(color)) {
            aux = b3;
            b3 = null;
        } else                     // PROGRAMACION DEFENSIVA
            assert false: "Error: inesperado en sacar bola de un color";

        return aux;
    }

    public void llenar() {
        // TODO: llenar urna
        Bola bola = Bola.generar();
    }
   
    public String toString() { 
        return estaVacia() ? "Urna: vacia" : "Urna: "+b1+" "+b2+" "+b3;
	}
}
