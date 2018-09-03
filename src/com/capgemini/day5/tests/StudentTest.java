package com.capgemini.day5.tests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day5.AgeNotWithinRangeException;
import com.capgemini.day5.Student;
import com.capgemini.day5.tests.NameNotValidException;

class StudentTest {

	
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
		
		
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"pooja",22,"Java"));
			
			assertThrows(NameNotValidException.class,()-> new Student(11,"pooja99",21,"Java"));
			assertAll(()-> new Student(11,"pooja",21,"Java"));
		try {
			 new Student(11,"pooja",21,"Java");
		}
		catch(Exception e)
		{
			fail("Failed Statement");
		}
		
	}
}
