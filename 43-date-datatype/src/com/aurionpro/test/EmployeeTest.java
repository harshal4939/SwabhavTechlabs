package com.aurionpro.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "xyz", 40000, LocalDate.of(2022, 06, 06));

		Employee emp2 = new Employee(102, "lmn", 30000, LocalDate.of(2022, 06, 10));
		System.out.println(emp1);
		System.out.println(emp2);

		LocalDate demo = emp1.getDate();

		System.out.println("DAy-of-year:-" + demo.getDayOfYear());

		System.out.println("DAy-of-Month:-" + demo.getDayOfMonth());

		System.out.println("DAys-of-Month:-" + demo.lengthOfMonth());

		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);

		System.out.println("current Date:-" + myObj);

		LocalTime myObj1 = LocalTime.now();
		System.out.println("Currrent Time:-" + myObj1);

		LocalDateTime myObj2 = LocalDateTime.now();
		System.out.println("DAte Time:- " + myObj2);

		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myObj2.format(myFormatObj);
		System.out.println("After formatting Date and Time : " + formattedDate);
	}

}
