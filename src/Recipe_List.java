import java.util.ArrayList;

public class Recipe_List {
	
	private static ArrayList<String> recpies = new ArrayList<String>();

	public static ArrayList<String> getRecpies() {
		return recpies;
	}

	public static void setRecpie(String recpie) {
		recpies.add(recpie);
	}

}
