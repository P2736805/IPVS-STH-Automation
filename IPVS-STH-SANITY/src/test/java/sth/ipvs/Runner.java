package sth.ipvs;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class Runner {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { IPVSCapabilities.class});
		testng.addListener(tla);
		testng.run();
		}
}
