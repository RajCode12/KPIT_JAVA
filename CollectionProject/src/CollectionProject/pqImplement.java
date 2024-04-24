package CollectionProject;

import java.util.*;

public class pqImplement {
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<>(new myCmp());
		pq.add(new Student(1,"Dev",76));
		pq.add(new Student(2,"Raj",84));
		pq.add(new Student(3,"Aditya",90));
		pq.add(new Student(4,"Abhay",50));
		for(Student s : pq) {
			System.out.println(s);
		}
	}
}
class Student {
	int id;
	String name;
	int marks;
	Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}
class myCmp implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if(s1.marks >= s2.marks) {
			return s1.marks - s2.marks;
		}
		return s2.marks - s1.marks;
	}
}
