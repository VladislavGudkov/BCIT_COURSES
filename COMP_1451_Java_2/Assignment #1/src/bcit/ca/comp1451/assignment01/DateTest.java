package bcit.ca.comp1451.assignment01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Vladislav Gudkov (A00921638)
 */


class DateTest
{

	private Date date1;
	private int day1;
	private int month1;
	private int year1;


	@BeforeEach
	void setUp() throws Exception {
		date1 = new Date(12,12,2012);
		day1 = 12;
		month1 = 12;
		year1 = 2012;
		
	}


	@AfterEach
	void tearDown() throws Exception {
		date1 = null;
	}

	/**
	 * Test method for getDay method
	 */
	@Test
	void testGetDay() {
		assertEquals(12, date1.getDay());
	}
	
	/**
	 * Test method for setDayNegative
	 */
	@Test
	void testGetDayNegative() {
		date1.setDay(0);
		assertEquals(01, date1.getDay());
	}
	
	/**
	 * Test method for setDay limit
	 */
	@Test
	void testGetDayBoudary() {
		date1.setDay(31);
		assertEquals(31, date1.getDay());
	}

	/**
	 * Test method for getMonth
	 */
	@Test
	void testGetMonth() {
		assertEquals(12, date1.getMonth());
	}
	
	/**
	 * Test method for getMonth negative
	 */
	@Test
	void testGetMonthNegative() {
		date1.setMonth(0);
		assertEquals(01, date1.getMonth());
	}
	
	/**
	 * Test method for setMonth boundary
	 */
	@Test
	void testGetMonthBoundary() {
		date1.setMonth(12);
		assertEquals(12, date1.getMonth());
	}

	/**
	 * Test method for getYear
	 */
	@Test
	void testGetYear() {
		assertEquals(2012, date1.getYear());
	}
	
	/**
	 * Test method for setYear negative
	 */
	@Test
	void testGetYearNegative() {
		date1.setYear(1899);
		assertEquals(1900, date1.getYear());
	}
	
	/**
	 * Test method for setYear boundary
	 */
	@Test
	void testGetYearBoundary() {
		date1.setYear(2020);
		assertEquals(2020, date1.getYear());
	}
	
	/**
	 * Test method for formattedDate
	 */
	void testDisplayStructuredDate() {
		date1.dateFormat(day1, month1, year1);
		assertEquals("12/December/2012", date1.dateFormat(day1, month1, year1));
	}



}
