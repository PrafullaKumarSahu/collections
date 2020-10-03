/**
 * 
 */
package collections.complexdatastructure;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	public static String[] vehicles = {
			"ambulance", "helicaptor", "lifeboat"
	};
	
	public static String[][] drivers = {
			{"Fred", "Sue", "Pete"},
			{"Fredi", "Sue", "Pete", "Richard"},
			{"Mary", "Bob", "Pete"}
	};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Set<String>> personnels = new HashMap<>();
		
		for (int i = 0; i < vehicles.length; i++) {
			String[] driverList = drivers[i];
			Set<String> driverSet = new LinkedHashSet<>();
			for(String driver: driverList) {
				driverSet.add(driver);
			}
			personnels.put(vehicles[i], driverSet);
		}
		
		Set<String> ambulanceDrivers = personnels.get("ambulance");
		System.out.println("Avaialble ambulance drivers are:");
		for (String ambulanceDriver: ambulanceDrivers) {
			System.out.println(ambulanceDriver);
		}
		
		for (String vehicle: personnels.keySet()) {
			System.out.println("Drivers for " + vehicle + " are:");
			Set<String> vehicleDrivers = personnels.get(vehicle);
			for (String vehicleDriver: vehicleDrivers) {
				System.out.println(vehicleDriver);
			}
		}
	}

}
