import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Food
{
	String stateName;
	String sweetDishName;
	String spicyDishName;
	String NumkinDishName;
	
	public Food(String stateName,String sweetDishName, String spicyDishName, String NumkinDishName) {
		super();
		this.stateName=stateName;
		this. sweetDishName=sweetDishName;
		this.spicyDishName = spicyDishName;
		this. NumkinDishName=NumkinDishName;
		
	}
	@Override
	public String toString() {
		return "Food [stateName="+stateName+",sweetDishName=" + sweetDishName + ",spicyDishName =" +spicyDishName + ",NumkinDishName="
				+NumkinDishName + "]";
	}

}
public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<String,Food> FavoriteDishName = new TreeMap<String,Food>();
		
		Food c1 = new Food("Maharashtra", "Puran Poli", "Vada Pav", "KurKure");
		Food c2 = new Food("Punjab", "gajar ka halwa", "Chole", "Chhips");
		Food c3 = new Food("TamilNadu", "Payasam", "Sambhar", "Aloo  Bhujia");
		Food c4 = new Food("Karnataka", "Maysore Pak", "Gojju", "Sya Sticks");
		Food c5 = new Food("Kerala", "ada Pradhaman", "ldiyappam", "Crunchy tomato");
		
		
		System.out.println("Putting values in the map");
		
		FavoriteDishName.put("Mh",c1);
		FavoriteDishName.put("Pun",c2);
		FavoriteDishName.put("Tm",c3);
		FavoriteDishName.put("Kt",c4);
		FavoriteDishName.put("Kr",c5);
		
		System.out.println("Retrieve the values from the map...");
		
		Set<String> allKeys = FavoriteDishName.keySet();
		Iterator<String> keyIter = allKeys.iterator();
		while(keyIter.hasNext()) {
			String actualKey = keyIter.next();
			Food theFood = FavoriteDishName.get(actualKey);
			System.out.println("The Country : "+theFood);
		}
		System.out.println("================");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter key : ");
		String key = scan.nextLine();
		if(FavoriteDishName.containsKey(key)) {
			Food foodFound = FavoriteDishName.get(key);
			System.out.println("Food found : "+foodFound);
		}
		else {
			System.out.println("Key not found "+key);
		}
	}
}













