package org.wecancodeit.flexcode.module4.collectionInterfaces;
import java.util.ArrayList;
import java.util.Iterator;

public class Classroom implements Iterable<Student> {

	private ArrayList<Student> students;
	
	Classroom(ArrayList<Student> students) {
		this.students = students;
	}

	@Override
	public Iterator<Student> iterator() {
		return new ClassroomIterator(this);
	}
	
	class ClassroomIterator implements Iterator<Student> {
		
		private Classroom classroom;
		private int studentIndex = 0;

		public ClassroomIterator(Classroom classroom) {
			this.classroom = classroom;
		}

		@Override
		public boolean hasNext() {
			return studentIndex < classroom.students.size();
		}

		@Override
		public Student next() {
			Student nextStudent = classroom.students.get(studentIndex);
			studentIndex++;
			return nextStudent;
		}
	}
}
