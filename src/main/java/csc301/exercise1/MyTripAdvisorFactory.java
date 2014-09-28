package csc301.exercise1;


public class MyTripAdvisorFactory implements TripAdvisorFactory {

	@Override
	public TripAdvisor newTripAdvisor() {
		return new MyTripAdvisor();
	}

}
