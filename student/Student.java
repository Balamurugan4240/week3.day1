package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Bala");
		}
    public void studentDeptment() {
		System.out.println("Power of EEE");

	}
     public void studentId() {
		System.out.println("1234");

	}
     public static void main(String[] args) {
		
    	 Student obj= new Student();
    	 obj.deptname();
    	 obj.studentDeptment();
    	 obj.studentName();
    	 obj.studentId();
    	 Department obj1=new Department();
    	 obj1.collegeCode();
    	 obj1.collegeName();
    	 obj1.collegeRank();
    	
	}
}
