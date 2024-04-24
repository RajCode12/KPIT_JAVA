package demoDAO;

public class Student {
	int id;
	String name;
	String course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
}

// create table
// kpit -> student  1 class -> POJO
// interface -> 5 methods poji
// class -> interface methods implement -> rpojiImpl
// class testing -> main method  r
