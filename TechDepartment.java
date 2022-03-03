package com.greatLearning.assignment;

public class TechDepartment extends SuperDepartment
{
	//declare method departmentName of return type string
		public String deparmentName() {
			return " Welcome to Tech Department";
		}

		//declare method getTodaysWork of return type string
		public String getTodaysWork() {
			return "Complete coding of Module 1";
		}
		
		//declare method getTechStackInformation of return type string
		public String getTechStackInformation() {
			return " Core Java ";
		}

		//declare method getWorkDeadline of return type string
		public String getWorkDeadline() {
			return "can be completed by the end of this month ";
		}

		public String isTodayAHoliday() {
			// TODO Auto-generated method stub
			return "today is a Holiday";
		}
}
