public class Person
{
	String name;
	String jobTitle;
	int age;
	
	static Person[] people = new Person[3];
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String about() {
		return ("My name is " + this.getName() + 
				". I am working as a " + this.getJobTitle() + 
				" and I am " + this.getAge() + " years old!");
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static String findByName (String name) {
		
		String result = null;
		
		for (Person lookUp : people) {
			if (lookUp.getName() == name) {
				result = lookUp.about();
				return result;
			}
			else {
				result = ("There is no person with such name!");
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < people.length; i++) {
			people[i] = new Person();
		}
		
		people[0].setName("Jack");
		people[0].setJobTitle("Code Dev");
		people[0].setAge(24);
		
		people[1].setName("Miki");
		people[1].setJobTitle("Tester");
		people[1].setAge(20);
		
		people[2].setName("Mark");
		people[2].setJobTitle("Accountant");
		people[2].setAge(21);
		
		for (Person person : people) {
			System.out.println(person.about() + "\n");
		}
		
		System.out.println(findByName("Jack"));
	}
	
}