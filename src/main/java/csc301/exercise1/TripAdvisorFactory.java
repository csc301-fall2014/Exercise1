package csc301.exercise1;

public class TripAdvisorFactory {


	private String tripAdvisorType;
	private boolean fasterButLessAccurate;


	public TripAdvisorFactory() {
		// Load the implementation type from an environment variable
		tripAdvisorType = System.getenv("TRIP_ADVISOR_IMPL");
		tripAdvisorType = tripAdvisorType == null ? "MyTripAdvisor" : tripAdvisorType;
		validateTripAdvisorType(tripAdvisorType);
		
		// Load other parameters from an environment variable
		fasterButLessAccurate = "true".equals(System.getenv("TRIP_ADVISOR_FASTER_BUT_LESS_ACCURATE"));
	}
	
	
	public void validateTripAdvisorType(String type){
		if(! (type.equals("MyTripAdvisor") || type.equals("MyTripAdvisor2"))){
			throw new IllegalArgumentException("No such TripAdvisor type - " + type);
		}
	}

	
	
	public TripAdvisor newTripAdvisor() {
		if("MyTripAdvisor".equals(tripAdvisorType)){
			return new MyTripAdvisor();
		} else if("MyTripAdvisor2".equals(tripAdvisorType)){
			return new MyTripAdvisor2(fasterButLessAccurate);
		} else {
			throw new RuntimeException("I don't know how to create TripAdvisor instances of type " + tripAdvisorType);
		}
	}
	
}
