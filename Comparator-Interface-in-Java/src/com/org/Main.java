package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> students = polulateData();

		System.out.println("**********Befor Sort**********");
		dilplayList(students);

		Collections.sort(students, new SortByName());
		System.out.println("**********After Sort By Name**********");
		dilplayList(students);

		Collections.sort(students, new SortByRoll());
		System.out.println("**********After Sort By Roll**********");
		dilplayList(students);

	}

	public static void dilplayList(List<Student> students) {
		for (Student student : students) {
			System.out.println("Name: " + student.getName() + ", Roll: " + student.getRoll());
		}
	}

	public static List<Student> polulateData() {
		List<Student> students = new ArrayList<>();

		Student student = new Student();

		student.setName("Sandip");
		student.setRoll(1);
		students.add(student);

		student = new Student();

		student.setName("Asmi");
		student.setRoll(2);
		students.add(student);

		student = new Student();

		student.setName("Arpita");
		student.setRoll(3);
		students.add(student);

		return students;
	}

}
