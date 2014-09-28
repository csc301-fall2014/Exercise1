package csc301.exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationFileBasedTripAdvisorFactory {

	private Properties properties;
	private TripAdvisorFactory factory;


	public ConfigurationFileBasedTripAdvisorFactory(String confFilePath) throws FileNotFoundException, IOException {
		this.properties = new Properties();
		this.properties.load(new FileInputStream(confFilePath));
		this.factory = createTripAdvisorFromProperties(this.properties);
	}
	
	
	
	private TripAdvisorFactory createTripAdvisorFromProperties(Properties prop){
		String type = prop.getProperty("TRIP_ADVISOR_IMPL");
		if("MyTripAdvisor".equals(type)){
			return new MyTripAdvisorFactory();
		} else if("MyTripAdvisor2".equals(type)){
			// Load a property (and specify a default value)
			String fasterButLessAccurate = prop.getProperty("TRIP_ADVISOR_FASTER_BUT_LESS_ACCURATE", "false");
			return new MyTripAdvisor2Factory("true".equals(fasterButLessAccurate));
		} else {
			throw new RuntimeException("No such TripAdvisor type - " + type);
		}
	}
	

	
	
	public TripAdvisor newTripAdvisor() {
		return factory.newTripAdvisor();
	}
	
}
