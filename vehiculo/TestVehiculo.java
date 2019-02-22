package vehiculo;

public class TestVehiculo {

	public static void main(String[] args) {
		
		Vehiculo veh = new Vehiculo(4,500);
		System.out.println("El numero de ruedas del vehiculo es de: " + veh.getNumRuedas());
		System.out.println("La autonomia maxima del vehiculo es de: " + veh.getAutonomia() + "km");
		Coche c = new Coche(5);
		System.out.println("El numero de ruedas del vehiculo es de: " + veh.getNumRuedas());
		System.out.println("La autonomia maxima del vehiculo es de: " + veh.getAutonomia() + "km");
		System.out.println("El numero maximo de ocupantes del coche es de: " + c.getNumPasajeros());
		Camion cam = new Camion(4000);
		System.out.println("El numero de ruedas del vehiculo es de: " + veh.getNumRuedas());
		System.out.println("La autonomia maxima del vehiculo es de: " + veh.getAutonomia() + "km");
		System.out.println("El numero maximo de carga del camion es de: " + cam.getCarga() + "Kg");
	}	

}
