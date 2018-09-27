package org.wecancodeit.flexcode.module4.collectionInterfaces;

public class Student implements Comparable<Student> {

	private String name;
	private int age;
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Student other) {
		if (other instanceof Student) {
			Student otherStudent = (Student) other;
			return this.getAge() - otherStudent.getAge();
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}

}
