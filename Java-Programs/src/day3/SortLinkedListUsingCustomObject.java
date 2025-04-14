package day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortLinkedListUsingCustomObject {

	public static void main(String[] args) {
		
	Comparator<Person> ageCompare = new Comparator<Person>(){
		@Override
		public int compare(Person p1, Person p2) {
			
			return Integer.compare(p1.getAge(), p2.getAge());
		}
	};
		
	LinkedList<Person> list = new LinkedList<>(Arrays.asList(
			
			new Person("Raza", 30),
			
			new Person("Siraj", 29),
			
			new Person("Naved", 28)
	
			));
		
	Collections.sort(list, ageCompare);

	for(Person person : list) {
		
		System.out.println(person.getName()+"  "+person.getAge());
				
	}

	}
}

class Person{
	
	private String name;
	
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		
		this.age = age;
	}
	
	public String getName() {
		
		return name;
	}
	
	public int getAge() {
		
		return age;
	}
}