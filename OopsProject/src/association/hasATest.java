//package association;
//
//public class hasATest {
//
//	public static void main(String[] args) {
//		Human human1 = new Human();
//		human1.heart.pumping();// has-A relation
//		
//		System.out.println("*********************");
//		Poet poet = new Poet();
//		poet.thinking();
//		poet.leftLung.inhale();
//		
//		//uses-A relation
//		
//		Pen pen1 = new Pen();
//		Paper paper1 = new Paper();
//		poet.imagine(pen1,paper1);
//		
//		
//		//produces-A relation
//		String text = "";
//		poet.write(text);
//		String date = "01/01/2024";
//		
//		Poetry poetry1 = new Poetry(poet.poetName,date,text.length(),text);
//		poetry1.showPoetry();
//		
//	}
//}
//class Leg {
//	void walking() {
//		System.out.println("Leg is moving");
//	}
//}
//class Hand {
//	void shaking() {
//		System.out.println("Hand is moving");
//	}
//}
//class Heart {
//	void pumping() {
//		System.out.println("Heart is pumping");
//	}
//}
//class Lung {
//	void inhale() {
//		System.out.println("Inhaling");
//	}
//	void exhale() {
//		System.out.println("Exhaling");
//	}
//}
//class Human {
//	//SOP should always be inside a method
//	Heart heart = new Heart();
//	Lung rightLung;
//	Lung leftLung;
//	Leg leg = new Leg();
//	Hand hand = new Hand();
//	Human() {
//		System.out.println("Human constructor");
//		rightLung = new Lung();
//		leftLung = new Lung();
//		
//		//leg.walking();
//		//hand.shaking();
//		
//		rightLung.inhale();
//		rightLung.exhale();
//		leftLung.inhale();
//		leftLung.exhale();
//	}
//	void thinking() {
//		System.out.println("Human is thinking");
//	}
//	void feeling() {
//		System.out.println("Human is feeling");
//	}
//}
//class Poet extends Human {
//	String poetName;
//	Poet() {
//		this.poetName = "RajKumar";
//	}
//	void thinking() {
//		System.out.println("Poet is thinking");
//	}
//	void imagine(Pen pen, Paper paper) {
//		System.out.println("Poet is imagining");
//		pen.write();
//		paper.lines = "I am a disco dancer";
//		paper.read();
//	}
//	void write(String text) {
//		text = "I am a disco dancer";
//	}
//}
//class Pen {
//	void write() {
//		System.out.println("Writing");
//	}
//}
//class Paper {
//	String lines;
//	String read() {
//		return lines;
//	}
//}
//class Poetry {
//	String poetName;
//	String date;
//	int numberOfChars;
//	String text;
//	Paper p = new Paper();
//	Poetry(String poetName, String date, int numberOfChars, String text) {
//		super();
//		this.date = date;
//		this.numberOfChars = numberOfChars;
//	}
//	void showPoetry() {
//		System.out.println("******Poetry********");
//		System.out.println("Publication : " + date);
//		System.out.println("Number of Characters : " + numberOfChars);
//		System.out.println("Poet Name : " + poetName);
//		System.out.println(text);
//		
//	}
//}
