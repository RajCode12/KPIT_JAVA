package association;

public class Aggre {
	public static void main(String[] args) {
		Human h = new Human();
		System.out.println("***********");
		Poet poet = new Poet();
		Pen pen = new Pen();
		Paper paper = new Paper();
		System.out.println("***********");
		Poetry po = new Poetry(poet,paper,pen);
	}
}
class Heart {
	void pump() {
		System.out.println("Heart is pumping the blood");
	}
}
class Lung {
	void inhale() {
		System.out.println("Inhaling");
	}
	void exhale() {
		System.out.println("Exhaling");
	}
}
class Leg {
	void move() {
		System.out.println("Leg is moving");
	}
}
class Human {
	Heart h; // has-A relation
	Lung left;
	Lung right;
	Leg leg = new Leg();
	Human() {
		h = new Heart();
		left = new Lung();
		right = new Lung();
		
		h.pump();
		left.inhale();
		left.exhale();
		right.inhale();
		right.exhale();
	}
}
class Paper {
	String text;
	void read() {
		System.out.println("Reading the book " + text);
	}
}
class Pen {
	void write() {
		System.out.println("Writting the book");
	}
}
class Poet extends Human { //is-A relation
	String poetName;
	Poet() {
		this.poetName = "RajKumar";
	}
	void think() {
		System.out.println("Poet is thinking");
	}
	void imagine(Paper paper, Pen pen) { // uses-A relation
		System.out.println("Poet is Imagining");
		pen.write();
		paper.text = "Hello, World!";
		paper.read();
	}
}
class Poetry {
	String poetryName;
	String date;
	int numberOfChars;
	String lines;
	
	Poetry(Poet p, Paper paper, Pen pen) {// produces-A
		p.think();
		p.imagine(paper,pen);
	}
	void showPoetry() {
		System.out.println("**********Poetry*************");
		System.out.println("Poetry Name : " + poetryName);
		System.out.println("Date : " + date);
		System.out.println("numberOfChars : " + numberOfChars);
		System.out.println("Lines : " + lines);	
	}
	
}
