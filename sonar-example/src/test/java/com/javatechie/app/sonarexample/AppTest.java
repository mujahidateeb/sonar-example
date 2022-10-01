package com.javatechie.app.sonarexample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {

		App a = new App();
		a.m1();
		a.getData();
		App.main(null);
		assertTrue(true);
	}
	
	/**
	 * <dependency>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.8</version>
</dependency>
<dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.4.0</version>
        <scope>test</scope>
    </dependency>
    mvn install -Dtest=com.javatechie.app.sonarexample.AppTest sonar:sonar
    https://www.youtube.com/watch?v=hyBznKcoKEg
    https://www.baeldung.com/sonarqube-jacoco-code-coverage
    https://www.sonarqube.org/downloads/
	 * 
	 * 
	 * 
	 * 
	 * **/
	
}
