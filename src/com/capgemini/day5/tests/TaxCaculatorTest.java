package com.capgemini.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.MyCalculator;
import com.capgemini.day5.TaxCalculator;

class TaxCaculatorTest {

	@Test
	void testCalculateTaxWithValidInputs() throws Exception
	{
//    assertEquals(16000.00,TaxCalculator.calculateTax("jack",true,200000),0.2);
    assertEquals(16000.00,TaxCalculator.calculateTax("cgbajsdg", true, 200000));
	}
	
	@Test
	void testCalculatewithInvalidName() 
	{
		Exception e;
	
    	e=assertThrows(EmployeeNameInvalidException.class,() -> TaxCalculator.calculateTax(null,true,1000));
    	assertEquals("Invalid employeeName",e.getMessage());
    	e=assertThrows(EmployeeNameInvalidException.class,() -> TaxCalculator.calculateTax("",true,1000));
    	assertEquals("Invalid employeeName",e.getMessage());
    		
		
	}
	@Test
	void testCalculateWithInValidCountry() 
	{
		Exception e;
	
		e=assertThrows(InvalidCountryException.class,() -> TaxCalculator.calculateTax("ron",false,25000));
    	assertEquals("Invalid Country",e.getMessage());}

	@Test
	void testCalculateWithIneligible() 
	{
		Exception e;
	
		e=assertThrows(TaxIneligibleException.class,() -> TaxCalculator.calculateTax("bon",false,2300));
    	assertEquals("Invalid Country",e.getMessage());
	}
	}
