package CollectionProject;
import java.util.*;
import java.util.Iterator;
public class GenericTest2 {
	public static void main(String[] args) {
		ArrayList<Kite> kiteList = new ArrayList<>();
		kiteList.add(new Kite("Yellow",10));
		kiteList.add(new Kite("Blue",20));
		kiteList.add(new Kite("Red",30));
		kiteList.add(new Kite("Green",40));
		kiteList.add(new Kite("Purple",50));
		
		Iterator<Kite> iterator = kiteList.iterator();;
		while(iterator.hasNext()) {
			Kite kite = iterator.next();
			System.out.println(kite);
		}
		
		TreeSet<Kite> kiteSet = new TreeSet<>();
		kiteSet.add(new Kite("Yellow",10));
		kiteSet.add(new Kite("Blue",20));
		kiteSet.add(new Kite("Red",30));
		kiteSet.add(new Kite("Green",40));
		kiteSet.add(new Kite("Purple",50));
	}
}
class Kite {
	String color;
	int cost;
	Kite(String color, int cost) {
		this.color = color;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Kite [color=" + color + ", cost=" + cost + "]";
	}
	public int compareTo(Kite k) {
		System.out.println("Comparing " + color + " with " + k.color);
		return Integer.compare(cost,k.cost);
	}
}
