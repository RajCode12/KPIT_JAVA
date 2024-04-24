package CollectionProject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ElementTest {
	public static void main(String[] args) {
		TreeSet<Element> list = new TreeSet<>();
		list.add(new Element("Hydrogen",1,1));
		list.add(new Element("Oxygen",8,16));
		list.add(new Element("Nitrogen",7,14));
		
		System.out.println("Before sorting....");
		Iterator<Element> it = list.iterator();
		while(it.hasNext()) {
			Element e = it.next();
			System.out.println(e);
		}
	}
}
class Element implements Comparable<Element>{
	String name;
	int atomicNumber;
	int atomicMass;
	Element(String name, int atomicNumber, int atomicMass) {
		this.name = name;
		this.atomicNumber = atomicNumber;
		this.atomicMass = atomicMass;
	}
	
	@Override
	public String toString() {
		return "Element [name=" + name + ", atomicNumber=" + atomicNumber + ", atomicMass=" + atomicMass + "]";
	}

	@Override
	public int compareTo(Element o) {
		return Integer.compare(atomicMass,o.atomicMass);
	}
}
