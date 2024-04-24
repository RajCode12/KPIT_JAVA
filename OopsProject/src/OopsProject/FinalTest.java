package OopsProject;

public class FinalTest {
	public static void main(String[] args) {
		float pi = 3.14f;
		pi = 3.19f;
		System.out.println(pi);
		
		// if we want that pi value cannot be reassigned -> make it final 
		// final float pi = 3.14;
		
		Chess chess = new Chess();
		chess.moveBishop();
		
		GraphicalChess graphChess = new GraphicalChess();
		graphChess.moveMyBishop();
		
		Chess graChess = new GraphicalChess();
		graChess.moveBishop();
		
	}
}
// final class cannot be inherited
class Chess {
	//final method cannot be overridden
	final void moveBishop() {
		System.out.println("Moving bishop diagonally....back/forward...");
	}
	
}
class GraphicalChess extends Chess {
	void moveMyBishop() {
		System.out.println("Moving bishop vertically....back/forward....");
	}
	
}
