import java.util.ArrayList;
import java.util.Iterator;

class Fruit
{
	private String fname;
	
	public Fruit(String name) {
		super();
		this.fname = fname;
		
	}
	
	@Override
	public String toString() {
		return "Friut [fname=" + fname + "]";
	}
	public String getFruitName() {
		return fname;
	}
	public void setFruitName(String fname) {
		this.fname = fname;
	}
		
}

public class ArrayListTestSelf {
	public static void main(String[] args) {
		//play list in the media player - vlc / windows / iphone
		//content
		//Song mysongs [] = new Song[100];
		
		System.out.println("Preparing content.....");
		Fruit f1 = new Fruit("Mango");
		Fruit f2 = new Fruit("Apple");
		Fruit f3 = new Fruit("Kivi");
		Fruit f4 = new Fruit("Orange");
		Fruit f5 = new Fruit("PaPaya");
		System.out.println("Content is ready........");
		
		System.out.println("Making the Container....");
		ArrayList myTree = new ArrayList();
		System.out.println("Container....is ready...");
		
		System.out.println("Adding the Content in the Container....");
		myTree.add(f1);
		myTree.add(f2);
		myTree.add(f3);
		myTree.add(f4);
		myTree.add(f5);
		System.out.println("Added all the Content in the Container....");
		
		System.out.println("Retriving the Iterator from the Container....");
		Iterator myIterator = myTree.iterator();
		System.out.println("Iterating through the Container....");
		while(myIterator.hasNext())
		{
			Object o = myIterator.next(); // windows button and + <---zoom in
							//windows button and - <---zoom out
			Fruit x = (Fruit) o; // casting of Object to Song
			System.out.println("Fruit : "+x);
		}
		
		System.out.println("End of main....");
	}
}










