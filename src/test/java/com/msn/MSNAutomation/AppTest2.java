package com.msn.MSNAutomation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest2 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest2( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    @Before
    public void setUp() {
    	System.out.println("Added setUp() method");
    }
    
    @Test
    public void test1() {
    	System.out.println("Added test1() method");
    }
    
    @After
    public void tearDown() {
    	System.out.println("Added tearDown() method");
    }
}
