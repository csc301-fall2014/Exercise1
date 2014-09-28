package csc301.exercise1;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyTripAdvisor {

	static TripAdvisorFactory factory;
	
	
	@BeforeClass
	public static void init(){
		factory = new TripAdvisorFactory();
	}
	
	
	
	@Test
	public void test() {
		TripAdvisor a = factory.newTripAdvisor();
		System.out.println("Our TripAdvisor's class is " + a.getClass() + "\n" + a);
	}
	

}
