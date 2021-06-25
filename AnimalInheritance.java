abstract class Animal1 {
	protected boolean isMammal;
	protected boolean isCarnivorous;
	
	public Animal1(boolean isMammal, boolean isCarnivorous) {
		this.isMammal = isMammal;
		this.isCarnivorous = isCarnivorous;
	}
	
	public boolean getIsMammal() {
		return this.isMammal;
	}
	
	public boolean getIsCarnivorous() {
		return this.isCarnivorous;
	}
	
	abstract public String getGreeting();
	
	public void printAnimal(String name) {
		System.out.println("A " + name + " says '" + this.getGreeting() + "', is " + (this.getIsCarnivorous() ? "" : "not ")
				+ "carnivorous, and is " + (this.getIsMammal() ? "" : "not ") + "a mammal.");
	}
}

class Dog extends Animal1{
	public Dog() {
		super(true, true);
	}
	
	public String getGreeting() {
		return "ruff";
	}
}

class Cow extends Animal1{
	public Cow() {
		super(true, false);
	}
	
	public String getGreeting() {
		return "moo";
	}
}

class Duck extends Animal1{
	public Duck() {
		super(false, false);
	}
	
	public String getGreeting() {
		return "quack";
	}
	public interface Flyer{
		public void fly();
	}
	public class Bird implements Flyer{

		public void fly(){
			System.out.println("flap flap flap");
		}
		
		public void chirp(){
			System.out.println("Tweet tweet!");	
		}
	}
	public class Helicopter implements Flyer{

		public void fly(){
			System.out.println("choppa choppa choppa");
		}
	}
	public static void takeoff(Flyer flyer){
		flyer.fly();
	}
	
}

public class AnimalInheritance{
	
	public static void main(String[] args) {
		Animal1 dog = new Dog();
		dog.printAnimal("dog");
		
		Animal1 cow = new Cow();
		cow.printAnimal("cow");
		
		Animal1 duck = new Duck();
		duck.printAnimal("duck");
		//Bird bird = new Bird();
		//Helicopter helicopter = new Helicopter(		
	}
}