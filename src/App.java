import java.util.Iterator;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("fox");
		animals.add("cat");
		animals.add("mouse");
		animals.add("rabbit");

		// Iterator can remove items while iterating through the list
		// you could use a listIterator can be used to ADD while
		// Iterating.
		Iterator<String> it = animals.iterator();

		while (it.hasNext()) {
			String animal = it.next();
			System.out.println(animal);

			if (animal.equals("cat")) {
				it.remove();
			}

		}

		System.out.println("");

		// Modern Iteration
		// this for each syntax became available in Java 5
		// you can't remove items from a list with this version
		for (String listAnimal : animals) {
			System.out.println(listAnimal);
		}

	}

}
