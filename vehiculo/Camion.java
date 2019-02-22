package vehiculo;
/**
 * 
 * @author Antonio garcia
 * @version 20/10/2018.
 * <h2>Clase Hija<h2>
 * <p>Esta clase es una clase hija que hereda de la clase madre vehiculo.
 * Esta clase recibe ciertos parametros heredados de la madre como el numRuedas y la autonomia.<p>
 *
 */

class Camion extends Vehiculo{
	/**
	 * Variables propias de esta clase.
	 * double carga: Variable que especifica la carga maxima que soporta el camion.
	 * 
	 */
	private double carga;
	/**
	 * Constructor que inicializa las variables propias de la clase camion y hereda las de la clase vehiculo.
	 * Aparte invocando al metodo super() esta clase hereda las variables encontradas en la clase vehiculo.
	 * @param numRuedas
	 * @param autonomia
	 */
	public Camion(int numRuedas, double autonomia) {
		super(numRuedas, autonomia);
	}
	/**
	 * Este metodo constructor inicializa la variable carga.
	 * @param carga
	 */

	public Camion(double carga) {
		this.setCarga(carga);
	}

	/**Este metodo devuelve la variable carga.
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}

	/**Metodo el cual pasas por parameto el valor double carga.
	 * @param carga the carga to set
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}
	/**
	 * Este metodo muestra por pantalla los valores de la variablñe double carga.
	 * @param carga
	 */
	public void verDatos(double carga) {
		System.out.println("La carga maxima permitida en el camion es de: " +carga);
	}
	/**
	 * Este metodo devuelve los valores de las variables heredadas de la clase madre.
	 * En este caso heredan el verDatos de vehiculo(numRudas y autonomia).
	 */
	public void verDatos() {
		super.verDatos(getNumRuedas(), getAutonomia());
	}
}