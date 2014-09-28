package csc301.exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TripAdvisorFactoryUtil {

	
	public static TripAdvisorFactory createFactoryFromConf(String confFilePath) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(confFilePath));
		
		String type = properties.getProperty("TRIP_ADVISOR_IMPL");
		
		if("MyTripAdvisor".equals(type)){
			return new MyTripAdvisorFactory();
			
		} else if("MyTripAdvisor2".equals(type)){
			// Load a property (and specify a default value)
			String fasterButLessAccurate = properties.getProperty("TRIP_ADVISOR_FASTER_BUT_LESS_ACCURATE", "false");
			return new MyTripAdvisor2Factory("true".equals(fasterButLessAccurate));
			
		} else {
			throw new RuntimeException("No such TripAdvisor type - " + type);
		}
	}
	
}
