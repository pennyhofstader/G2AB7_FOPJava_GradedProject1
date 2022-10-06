package com.gradedassignment1.tech;

//importing packages to access the respective methods
import com.gradedassignment1.superDepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	// defining the methods
	public String departmentName() {
		return "Welcome To Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";

	}

}