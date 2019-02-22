package vehiculo;
/**
 * 
 * @author Antonio Garcia
 * @version 20/10/2018
 * <h2>Clase Hija<h2>
 * <p>Esta clase es una clase hija que hereda de la clase madre vehiculo.
 *  Esta clase recibe ciertos parametros heredados de la madre como el numRuedas y la autonomia.<p> 
 *
 */
class Coche extends Vehiculo{
	/**
	 * Variables propias de esta clase.
	 * La clase coche tiene un atributo propio que es numPasajeros.
	 * La cual inicializaremos en un constructor.
	 * @param numPasajeros.
	 */
	private int numPasajeros;
	/**
	 * En este constructor heredados las variables de la clase madre vehiculo y las inicializamos invocando al
	 * metodo super().
	 * @param numRuedas
	 * @param autonomia
	 */
	public Coche(int numRuedas, double autonomia) {
		super(numRuedas, autonomia);
	}
	/**
	 * Contrructor propio de la clase Coche que iniciliza el atributo numPasajeros.
	 * @param numPasajeros
	 */
	public Coche(int numPasajeros) {
		this.setNumPasajeros(numPasajeros);
	}

	/**Metodo que devuelve el valor de numPasajeros.
	 * @return the numPasajeros
	 */
	public int getNumPasajeros() {
		return numPasajeros;
	}
	
	/**Metodo que pasa por parametro la variable numPasajero.
	 * @param numPasajeros the numPasajeros to set
	 */
	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	/**
	 *Metodo que muestra la informacion del numPasajeros
	 * @param numPasajeros
	 */
	public void verDatos(int numPasajeros) {
		System.out.println("EL numero de pasajeros maximo permitido es: " +numPasajeros);
	}
	/**
	 * Metodo que muiestra la informacion heredada del metodo madre.
	 * @param numRuedas.
	 * @param autonomia.
	 */
	public void verDatos() {
		super.verDatos(getNumRuedas(), getAutonomia());
}
}
