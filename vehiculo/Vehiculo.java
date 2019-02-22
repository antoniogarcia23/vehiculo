package vehiculo;

public class Vehiculo {
	private int numRuedas;
	private double autonomia;
	
	public Vehiculo() {
		
	}
////////////////////////////////////
	public Vehiculo(int numRuedas, double autonomia) {
		this.setNumRuedas(numRuedas);
		this.setAutonomia(autonomia);
	}
////////////////////////////////////
	/**
	 * @return the numRuedas
	 */
	public int getNumRuedas() {
		return numRuedas;
	}
//////////////////////////////////////
	/**
	 * @param numRuedas the numRuedas to set
	 */
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
///////////////////////////////////////
	/**
	 * @return the autonomia
	 */
	public double getAutonomia() {
		return autonomia;
	}
/////////////////////////////////////////
	/**
	 * @param autonomia the autonomia to set
	 */
	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}
/////////////////////////////////////////
	public void verDatos(int numRuedas, double autonomia) {
		System.out.println("EL numero de ruedas de este coche es: " + numRuedas);
		System.out.println("La autonomia de este coche es :" + autonomia);
	}
	
	
}
