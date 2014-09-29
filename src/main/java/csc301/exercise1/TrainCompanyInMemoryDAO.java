package csc301.exercise1;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class TrainCompanyInMemoryDAO implements TrainCopmanyDAO {

	private Map<String,TrainCompany> nameToCopmany = new HashMap<String, TrainCompany>();

	@Override
	public TrainCompany createInstance(String name) {
		name = normalizeName(name);
		if(nameToCopmany.containsKey(name)){
			throw new IllegalArgumentException("There is already a company called '" + name + "'.");
		}

		nameToCopmany.put(name, instantiateTrainCopmany(name));
		return getInstance(name);
	}

	@Override
	public TrainCompany getInstance(String name) {
		return nameToCopmany.get(name);
	}


	private TrainCompany instantiateTrainCopmany(String name){
		try{
			// Get the constructor of TrainCompany that takes a single String argument
			Constructor<TrainCompany> constructor = TrainCompany.class.getDeclaredConstructor(String.class);
			// Override Java's access check
			constructor.setAccessible(true);
			// Call the constructor
			return constructor.newInstance(name);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}


	private String normalizeName(String name){
		if(name == null){
			throw new IllegalArgumentException("No null names please.");
		}
		name = name.trim();
		if(name.isEmpty()){
			throw new IllegalArgumentException("TrainCopmany's name must contain non-white-space characters.");
		}
		return name;
	}
}
