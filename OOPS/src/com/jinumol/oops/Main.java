package com.jinumol.oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDepartment ad=new AdminDepartment();
		HrDepartment hr=new HrDepartment();
		TechDepartment tc=new TechDepartment();
		
		
		System.out.println("Welcome to "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
	
		
		
		System.out.println("\nWelcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		
		System.out.println("\n\nWelcome to "+tc.departmentName());
		System.out.println(tc.getTodaysWork());
		System.out.println(tc.getWorkDeadline());
		System.out.println(tc.getTechStackInformation());
		System.out.println(tc.isTodayAHoliday());
	}

}
