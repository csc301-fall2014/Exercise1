package csc301.exercise1;

public class TripAdvisorFactory {

	
	public static TripAdvisor newTripAdvisor(String type){
		if("MyTripAdvisor".equals(type)){
			return new MyTripAdvisor();
		} else if("MyTripAdvisor2".equals(type)){
			return new MyTripAdvisor2();
		} else {
			throw new IllegalArgumentException("No such TripAdvisor type - " + type);
		}
	}
	
}
