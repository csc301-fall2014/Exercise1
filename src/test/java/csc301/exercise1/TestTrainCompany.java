package csc301.exercise1;

import org.junit.Test;

public class TestTrainCompany {

	TrainCopmanyDAO dao = new TrainCompanyInMemoryDAO();
	
	// An example of how to verify that an exception is thrown
	@Test(expected=IllegalArgumentException.class)
	public void cannotCreateCompanyWithNullName() {
		dao.createInstance(null);
	}
	
	
	@Test
	public void test() {
		System.out.println(dao.createInstance("Via"));
	}
}
