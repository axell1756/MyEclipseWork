package workingWithFiles;

import java.util.ArrayList;

public class Person {
	
	String name;
	String occipation;
	int age;
	
	public Person() {
		
	};
	public Person(String name, String occipation, int age) {
		this.setName(name);
		this.setOccipation(occipation);
		this.setAge(age);
	}
	
	private ArrayList<Person> personArray = new ArrayList<Person>();
	
	public String getName() {
		return name;
	}
	public String getOccipation() {
		return occipation;
	}
	public String getPersonArray() {
		
		String res = "";
		for (int i = 0; i < personArray.size(); i++) {
			res = res + "\n" + i + personArray.get(i).toString();
		}
		return res;
	}	
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOccipation(String occipation) {
		this.occipation = occipation;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void addToPerson(String name, String occupation, int age) {
		Person p = new Person(name, occupation, age);
		personArray.add(p);
	}
	public String toString() {
		return "Person [getName()=" + getName() + ", getOccipation()=" + getOccipation() + ", getPersonArray()="
				+ getPersonArray() + ", getAge()=" + getAge() + "]";
	}

	
}
