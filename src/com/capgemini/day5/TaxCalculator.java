package com.capgemini.day5;

public class TaxCalculator 
{
	public static double calculateTax(String employeeName,boolean isIndian, double employeeSalary) throws Exception 
	{
		double taxAmount;
		
		if(isIndian==false)
		{
			throw new Exception("is not an Indian");} else {
			if(employeeSalary>=100000)
				taxAmount=employeeSalary*8/100;
			else {
				if(employeeSalary>=50000&&employeeSalary<=100000)
					taxAmount=employeeSalary*6/100;
				else {
					if(employeeSalary>=30000&&employeeSalary<=50000)
						taxAmount=employeeSalary*5/100;
					else {
						if(employeeSalary>=10000&&employeeSalary<=30000)
							taxAmount=employeeSalary*4/100;
					}
					return employeeSalary;
				}
			}
		}
		return taxAmount;
		
		
		
		
		
	}

	
		
		

	}

