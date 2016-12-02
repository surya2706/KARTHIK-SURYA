package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "Id is: " + id + " and name is :" + name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class StringLengthComparator implements Comparator<String> {

	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			return 1;
		}
		if (len1 < len2) {
			return -1;
		}
		return 0;
	}
}

class AlphabeticalComparator implements Comparator<String> {

	public int compare(String s1, String s2) {

		return s1.compareTo(s2);
	}
}

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList<String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Elephant");
		animals.add("Giraffe");
		animals.add("Bear");

		/*
		 * Collections.sort(animals, new AlphabeticalComparator()); for(String
		 * animal: animals){ System.out.println(animal);
		 * 
		 * };
		 */

		List<Person> people = new ArrayList<Person>();

		people.add(new Person(1, "Karthik"));
		people.add(new Person(3, "Surya"));
		people.add(new Person(2, "Bhasker"));
		people.add(new Person(4, "Kamesh"));

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {
					return 1;

				}
				if (p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}
		}

		);
		for (Person person : people) {
			System.out.println(person);
		}

	}
}
