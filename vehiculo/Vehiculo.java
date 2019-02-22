package vehiculo;
/**
 * @author Antonio Garcia.
 * @version 20/10/2018.
 * @see <a href = "https://github.com/antoniogarcia23/vehiculo" /> proyecto en github </a>
 * <h1>Clase Madre<h1>
 * 	<p>Aqui desarrollaremos la clase principal llamada vehiculo.
 * La cual utilizaremos para realizar herencia en otras dos clases del proyecto: camion y coche.<p>
 */
public class Vehiculo {
	/**
	 * variables:
	 * numRuedas: es una variable entera que nos especifica el numero de ruedas de un vehiculo.
	 * autonomia: es una variable doble entera que nos especifica el numero de km que puede recorrer un vehiculo con carburante.
	 */
	private int numRuedas;
	private double autonomia;
	/**
	 * Constructor vacio.
	 */
	public Vehiculo() {
		
	}
	/**
	 *Metodo constructor que recibe los dos paramentros anteriores y los inicializa.
	 * @param numRuedas
	 * @param autonomia
	 */
////////////////////////////////////
	public Vehiculo(int numRuedas, double autonomia) {
		this.setNumRuedas(numRuedas);
		this.setAutonomia(autonomia);
	}
////////////////////////////////////
	/**
	 * Este metodo devuelve el valor numRuedas.
	 * @return the numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}
//////////////////////////////////////
	/**
	 * Metodo al cual pasas por parametro el numero de ruedas.
	 * @param numRuedas the numRuedas to set
	 */
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
///////////////////////////////////////
	/**
	 * Metodo que devuelve el valor numRuedas.
	 * @return the autonomia
	 */
	public double getAutonomia() {
		return autonomia;
	}
/////////////////////////////////////////
	/**
	 * Metodo el cual pasas por parametro la autonomia.
	 * @param autonomia the autonomia to set
	 */
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
	/**
	 * Metodo para ver en pantalla los parametros antes dados.
	 * @param numRuedas
	 * @param autonomia
	 */
/////////////////////////////////////////
	public void verDatos(int numRuedas, double autonomia) {
		System.out.println("EL numero de ruedas de este coche es: " + numRuedas);
		System.out.println("La autonomia de este coche es :" + autonomia);
	}
	
	
}
