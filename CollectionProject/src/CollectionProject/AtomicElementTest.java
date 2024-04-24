//package CollectionProject;
//
//import java.util.*;
//
//public class AtomicElementTest {
//	public static void main(String[] args) {
//		TreeSet<Element> elementTree = new TreeSet<>();
//		elementTree.add(new Element("Hydrogen",1,1));
//		elementTree.add(new Element("Nitroger",7,14));
//		elementTree.add(new Element("Oxygen",8,16));
//		
//		Iterator<Element> it = elementTree.iterator();
//		while(it.hasNext()) {
//			Element e = it.next();
//			System.out.println(e);
//		}
//	}
//}
//class Element implements Comparable<Element> {
//	String name;
//	int atomicNumber;
//	int atomicMass;
//	Element(String name, int atomicNumber, int atomicMass) {
//		super();
//		this.name = name;
//		this.atomicNumber = atomicNumber;
//		this.atomicMass = atomicMass;
//	}
//	@Override
//	public int compareTo(Element o) {
//		System.out.println("Comparing " + o.name + " with " + name);
//		// TODO Auto-generated method stub
//		return Integer.compare(atomicMass,o.atomicMass);
//	}
//		
//	@Override
//	public String toString() {
//		return "Element [name=" + name + ", atomicNumber=" + atomicNumber + ", atomicMass=" + atomicMass + "]";
//	}
//}
