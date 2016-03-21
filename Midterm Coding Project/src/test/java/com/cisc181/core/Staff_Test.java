package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	private static ArrayList<Staff> A;
	
	@BeforeClass
	public static void setup() throws Exception{
		A = new ArrayList<Staff>();
		
		A.add(new Staff ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), "123 Maple Street", "123456789", "A@email.com",
				"1", 1, 10000.00 ,new GregorianCalendar(2016, 1, 1).getTime(), eTitle.MR));
		A.add(new Staff ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), "123 Maple Street", "123456789", "A@email.com",
				"1", 1, 20000.00 ,new GregorianCalendar(2016, 1, 1).getTime(), eTitle.MR));
		A.add(new Staff ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), "123 Maple Street", "0123456789", "A@email.com",
				"1", 1, 30000.00 ,new GregorianCalendar(2016, 1, 1).getTime(), eTitle.MR));
		A.add(new Staff ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), "123 Maple Street", "0123456789", "A@email.com",
				"1", 1, 40000.00 ,new GregorianCalendar(2016, 1, 1).getTime(), eTitle.MR));
		A.add(new Staff ("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), "123 Maple Street", "0123456789", "A@email.com",
				"1", 1, 50000.00 ,new GregorianCalendar(2016, 1, 1).getTime(), eTitle.MR));
	}
	
	@Test
	public void test() {
		double total = 0.0;
		for (Staff s : A) {
			total += s.getSalary();
		}
		double avg = (total/5);
		assertEquals(avg, 30000.00, .01);
	}
	
	@Test (expected = PersonException.class)
	public void test2() throws Exception{
		new Staff("A", "B", "C",new GregorianCalendar(2000, 1, 1).getTime(), "123 Maple Street", "123456789", "A@email.com",
				"1", 1, 10000.00,new GregorianCalendar(2016, 1, 1).getTime(), eTitle.MR);
	}
	
	@Test (expected = PersonException.class)
	public void test3() throws Exception{
		new Staff("A", "B", "C",new GregorianCalendar(1900, 1, 1).getTime(), "123 Maple Street", "123456789", "A@email.com",
				"1", 1, 10000.00,new GregorianCalendar(2016, 1, 1).getTime(), eTitle.MR);
	}
}
