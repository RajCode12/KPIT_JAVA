package InterfaceProject;
public class InstrumentTest {
	public static void main(String[] args) {
		//string - musical 
		Guitar g = new Guitar();
		MusicalEvent.performance1(g);
		System.out.println("*******************************");
		Violin v = new Violin();
		MusicalEvent.performance2(v);
		System.out.println("*******************************");
		//air - musical 
		Flute f = new Flute();
		MusicalEvent.performance5(f);
		System.out.println("*******************************");
		Bansuri b = new Bansuri();
		MusicalEvent.performance6(b);
		System.out.println("*******************************");
		
		//surgical - medical
		Scissor s = new Scissor();
		MedicalImergency.imergency1(s);
		System.out.println("*******************************");
		Cutter c = new Cutter();
		MedicalImergency.imergency2(c);
		System.out.println("*******************************");
		//diagnostic - medical 
		Stethoscope s1 = new Stethoscope();
		MedicalImergency.imergency5(s1);
		System.out.println("*******************************");
		Otoscope o = new Otoscope();
		MedicalImergency.imergency6(o);
		System.out.println("*******************************");
		
	}
}
// interface is abstract so all the method inside it
// must be define inside the class that implements it
interface StringBasedInterface {
	void use();
	void play();
	void tuneStrings();
	
}	
// make child class or sub class abstract until and unless all the 
// methods of interface is not defined in any class

//implementing the interface because we don't want that musical 
//should access the methods of medical
interface AirBasedInterface {
	void use();
	void play();
	void blowAir();
}
interface SurgicalBasedInterface {
	void use();
	void diagnose();
	void doSurgery();
}
interface DiagnosticBasedInterface {
	void use();
	void diagnose();
	void checkUp();
}
abstract class MusicalEvent implements AirBasedInterface, StringBasedInterface{
	static void performance1(Guitar g) {
		g.use();
		g.tuneStrings();
		g.play();
		g.pluck();
	}
	static void performance2(Violin v) {
		v.use();
		v.tuneStrings();
		v.play();
		v.arco();
	}
	static void performance3(StringBasedInterface s) {
		s.use();
		s.tuneStrings();
		s.play();
	}
	static void performance4(AirBasedInterface a) {
		a.use();
		a.play();
		a.blowAir();
	}
	static void performance5(Flute f) {
		f.use();
		f.blowAir();
		f.play();
	}
	static void performance6(Bansuri b) {
		b.use();
		b.blowAir();
		b.play();
	}
	static void performance7(MusicalInstrument m) {
		m.use();
		m.play();
	}
}
abstract class MedicalImergency implements SurgicalBasedInterface, DiagnosticBasedInterface{
	static void imergency1(Scissor s) {
		s.use();
		s.diagnose();
		s.doSurgery();
		s.preciseCut();
	}
	static void imergency2(Cutter c) {
		c.use();
		c.diagnose();
		c.doSurgery();
		c.cut();
	}
	static void imergency3(SurgicalBasedInterface s) {
		s.use();
		s.diagnose();
		s.doSurgery();
	}
	static void imergency4(DiagnosticBasedInterface d) {
		d.use();
		d.diagnose();
		d.checkUp();
	}
	static void imergency5(Stethoscope s) {
		s.use();
		s.diagnose();
		s.checkUp();
	}
	static void imergency6(Otoscope o) {
		o.use();
		o.diagnose();
		o.checkUp();
	}
	static void imergency7(MedicalInstrument m) {
		m.use();
		m.diagnose();
	}
}
interface Instrument {
	void use();
}
abstract class MusicalInstrument implements Instrument {
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument {
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Guitar......");
	}

	@Override
	public void tuneStrings() {
		// TODO Auto-generated method stub
		System.out.println("Tuning the GuitarStrings.....");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing the Guitar.......");
	}
	
	void pluck() {
		System.out.println("Plucking the Guitar");
	}
	
}
class Violin extends StringBasedMusicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Violin......");
	}

	@Override
	public void tuneStrings() {
		// TODO Auto-generated method stub
		System.out.println("Tuning the ViolinStrings.....");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing the Violin.......");
	}
	void arco() {
		System.out.println("Playing Violin with a bow");
	}
	
}
abstract class AirBasedMusicalInstrument extends MusicalInstrument {
	abstract void blowAir();
}
class Flute extends AirBasedMusicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Flute......");
	}

	@Override
	public void blowAir() {
		// TODO Auto-generated method stub
		System.out.println("Blowing the Flute......");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing the Flute.......");
	}
	
}
class Bansuri extends AirBasedMusicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Bansuri......");
	}

	@Override
	public void blowAir() {
		// TODO Auto-generated method stub
		System.out.println("Blowing the Bansuri......");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing the Bansuri.......");
	}
	
}

//***************************************************************

abstract class MedicalInstrument implements Instrument {
	abstract void diagnose();
}
abstract class SurgicalBasedMedicalInstrument extends MedicalInstrument {
	abstract void doSurgery();
}
class Scissor extends SurgicalBasedMedicalInstrument{

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Scissor......");
	}

	@Override
	public void doSurgery() {
		// TODO Auto-generated method stub
		System.out.println("Doing the Surgery......");
	}

	@Override
	public void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("Identifying the Disease.....");
	}
	void preciseCut() {
		System.out.println("Cutting with Scissor......");
	}
	
}
class Cutter extends SurgicalBasedMedicalInstrument {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Cutter......");
	}

	@Override
	public void doSurgery() {
		// TODO Auto-generated method stub
		System.out.println("Doing the Surgery......");
	}

	@Override
	public void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("Identifying the Disease.....");
	}
	void cut() {
		System.out.println("Cutting with Cutter.....");
	}
	
	
}
abstract class DiagnosticBasedMedicalInstrument extends MedicalInstrument {
	abstract void checkUp();
}
class Stethoscope extends DiagnosticBasedMedicalInstrument {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Stethoscope......");
	}

	@Override
	public void checkUp() {
		// TODO Auto-generated method stub
		System.out.println("Checking the Patients......");
	}

	@Override
	public void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("Identifying the Disease.....");
	}

	
	
}
class Otoscope extends DiagnosticBasedMedicalInstrument {

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("Using the Otoscope......");
	}

	@Override
	public void checkUp() {
		// TODO Auto-generated method stub
		System.out.println("Checking the Patients......");
	}

	@Override
	public void diagnose() {
		// TODO Auto-generated method stub
		System.out.println("Identifying the Disease.....");
	}
}
		



