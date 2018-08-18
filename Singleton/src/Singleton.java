import Person.Person;

public class Singleton {

	public static void main(String[] args) {
		
		Person person_1 = Person.getInstance();
		Person person_2 = Person.getInstance();
		
		System.out.println("*** Singleton ****");
		System.out.println("******************");
		
		person_1.setName("Person one");
		System.out.println(person_2.getName());
		
		
		System.out.println("******************");
	}

}
