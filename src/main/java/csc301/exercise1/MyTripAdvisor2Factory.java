package csc301.exercise1;

public class MyTripAdvisor2Factory implements TripAdvisorFactory {

	private boolean fasterButLessAccurate;


	public MyTripAdvisor2Factory(boolean fasterButLessAccurate) {
		this.fasterButLessAccurate = fasterButLessAccurate;
	}
	
	
	@Override
	public TripAdvisor newTripAdvisor() {
		return new MyTripAdvisor2(fasterButLessAccurate);
	}

}
