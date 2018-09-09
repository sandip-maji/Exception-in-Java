package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<StudentForNameSort> students = polulateData();

		System.out.println("**********Befor Sort**********");
		dilplayList(students);

		Collections.sort(students);
		System.out.println("**********After Sort By Name**********");
		dilplayList(students);


	}

	public static void dilplayList(List<StudentForNameSort> students) {
		for (StudentForNameSort student : students) {
			System.out.println("Name: " + student.getName() + ", Roll: " + student.getRoll());
		}
	}

	public static List<StudentForNameSort> polulateData() {
		List<StudentForNameSort> students = new ArrayList<>();

		StudentForNameSort student = new StudentForNameSort();

		student.setName("Sandip");
		student.setRoll(1);
		students.add(student);

		student = new StudentForNameSort();

		student.setName("Asmi");
		student.setRoll(2);
		students.add(student);

		student = new StudentForNameSort();

		student.setName("Arpita");
		student.setRoll(3);
		students.add(student);

		return students;
	}

}
