package elements.table;

import java.util.HashSet;
import java.util.Iterator;

public class ChemicalElementTest { // 11:15
	public static void main(String[] args) {
		HashSet<ChemicalElement> elementSet = new HashSet<>();
		elementSet.add(new ChemicalElement(1,"Hydrogen","h2O",1));
		elementSet.add(new ChemicalElement(2,"Nitrogen","N",14));
		elementSet.add(new ChemicalElement(3,"Oxygen","O2",16));
		elementSet.add(new ChemicalElement(4,"Iron","Fe",56));
		elementSet.add(new ChemicalElement(4,"Iron","Fe",56));
		
		Iterator<ChemicalElement> it = elementSet.iterator();
		while(it.hasNext()) {
			ChemicalElement e = it.next();
			System.out.println(e);
		}
	}
}
class ChemicalElement {
	int elementNumber;
	String elementName;
	String elementFormula;
	int elementWeight;
	ChemicalElement(int elementNumber, String elementName, String elementFormula ,int elementWeight) {
		super();
		this.elementNumber = elementNumber;
		this.elementName = elementName;
		this.elementFormula = elementFormula;
		this.elementWeight = elementWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [elementNumber=" + elementNumber + ", elementName=" + elementName + ", elementFormula="
				+ elementFormula + ", elementWeight=" + elementWeight + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		ChemicalElement ele = (ChemicalElement) obj;
		if (elementNumber == ele.elementNumber)
			return true;
		if (elementName == null) {
			if (ele.elementName != null)
				return false;
		} else if (elementName.equals(ele.elementName))
			return true;
		if (elementFormula == null) {
			if (ele.elementFormula != null)
				return false;
		} else if (elementFormula.equals(ele.elementFormula))
			return true;
		if(elementWeight != ele.elementWeight) 
			return false;
		if (Float.floatToIntBits(elementWeight) == Float.floatToIntBits(ele.elementWeight))
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		int prime = 31, res = 1;
		res = prime*res + ((elementName != null) ? 0 : elementName.hashCode());
		res = prime*res + elementNumber;
		res = prime*res + Float.floatToIntBits(elementNumber);
		return res;
	}
}
