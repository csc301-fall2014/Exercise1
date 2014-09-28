package csc301.exercise1;

import java.util.List;

public class MyTripAdvisor2 implements TripAdvisor {

	
	private boolean fasterButLessAccurate;

	/*
	 * NOTICE: We changed our constructor signature, which breaks
	 * our static factory method.
	 */
	public MyTripAdvisor2(boolean fasterButLessAccurate) {
		this.fasterButLessAccurate = fasterButLessAccurate;
	}
	
	
	@Override
	public void addTrainCompany(TrainCompany trainCompany) {
		// TODO Auto-generated method stub

	}

	@Override
	public double getCheapestPrice(String fromStation, String toStation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DirectRoute> getCheapestTrip(String fromStation,
			String toStation) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "MyTripAdvisor2 instance, mode: " + (fasterButLessAccurate? "FASTER" : "ACCURATE");
	}

}
