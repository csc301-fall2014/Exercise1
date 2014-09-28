package csc301.exercise1;

import java.util.List;

public interface TripAdvisor {

	
	public void addTrainCompany(TrainCompany trainCompany);
	
	/**
	 * Return -1, if there is no trip between the two specified stations.
	 */
	public double getCheapestPrice(String fromStation, String toStation);
	
	/**
	 * Return null, if there is no trip between the two specified stations.
	 */
	public List<DirectRoute> getCheapestTrip(String fromStation, String toStation);
}
