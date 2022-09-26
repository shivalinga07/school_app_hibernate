package com.ty.controller;

import com.ty.dao.StudentDAO;
import com.ty.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO studentDAO = new StudentDAO();
		Student student = new Student();
	/*	student.setName("shridhar");
		student.setPercentage(87.05);
		studentDAO.saveStudent(student);                   insert student
		System.out.println("inserted");*/
	/*	studentDAO.deleteStudent(3);              delete student
		System.out.println("deleted");*/
	/*	studentDAO.findStudentById(4);                  find student
		System.out.println("student is searching");*/
		
		student.setName("sridhar");
		student.setPercentage(76.45);
		studentDAO.updateStudent(student);
		System.out.println("updated suceessfully");
		
	}

}
