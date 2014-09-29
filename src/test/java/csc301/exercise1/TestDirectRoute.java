package csc301.exercise1;

import org.junit.Test;

import csc301.exercise1.util.Constants;


public class TestDirectRoute {


	TrainCopmanyDAO dao = new TrainCompanyInMemoryDAO();
	
	// A very basic example of a passing test
	@Test
	public void testCreateInstanceWithoutException(){
		new DirectRoute(dao.createInstance("Via"), Constants.TORONTO, Constants.OTTAWA, 37.5);
	}
	
}
