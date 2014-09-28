package csc301.exercise1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TrainCompany {

	private static Map<String,TrainCompany> nameToCopmany = new HashMap<String, TrainCompany>();
	
	public static TrainCompany createInstance(String name){
		name = normalizeName(name);
		if(nameToCopmany.containsKey(name)){
			throw new IllegalArgumentException("There is already a company called '" + name + "'.");
		}
		nameToCopmany.put(name, new TrainCompany(name));
		return getInstance(name);
	}
	
	public static TrainCompany getInstance(String name){
		return nameToCopmany.get(name);
	}
	
	
	private static String normalizeName(String name){
		if(name == null){
			throw new IllegalArgumentException("No null names please.");
		}
		name = name.trim();
		if(name.isEmpty()){
			throw new IllegalArgumentException("TrainCopmany's name must contain non-white-space characters.");
		}
		return name;
	}
	
	
	private TrainCompany(String name) {
		setName(name);
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%s, offering %d routes between %d stations", 
				getName(), getDirectRoutesCount(), getStationsCount());
	}
	
	
	
	public String getName() {
		return null;
	}
	
	private void setName(String name) {
	}
	
	
	
	/**
	 * @return The DirectRoute object that was created/updated.
	 */
	public DirectRoute createOrUpdateDirectRoute(String fromStation, String toStation, double price){
		return null;
	}
	
	
	/**
	 * Delete the specified route, if it exists.
	 */
	public void deleteDirectRoute(String fromStation, String toStation){
		
	}
	
	
	/**
	 * @return null if there is no route from <code>fromStation</code> to
	 * 			<code>toStation</code> with this TrainCompany.
	 */
	public DirectRoute getDirectRoute(String fromStation, String toStation){
		return null;
	}
	
	public Collection<DirectRoute> getDirectRoutesFrom(String fromStation){
		return null;
	}
	
	public Collection<DirectRoute> getRoutesTo(String toStation){
		return null;
	}
	
	public Collection<DirectRoute> getAllDirectRoutes(){
		return null;
	}
	
	
	
	public int getDirectRoutesCount(){
		return getAllDirectRoutes().size();
	}
	
	
	/**
	 * @return The number of stations with service by this TrainCompany.
	 * To be clearer:
	 * - Take the union of all stations (from and to) from this.getAllDirectRoutes()
	 * - Count the unique number of stations (i.e. You only count a station
	 *   once, even if there are multiple routes from/to this station) 
	 */
	public int getStationsCount(){
		return 0;
	}
}
