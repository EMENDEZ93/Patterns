package Person;

public class Person {

	private static Person person;
	private String name;
	
	private Person() {
		
	}
	
	public static Person getInstance() {

		if(person == null) {
			person = new Person();
		}
		
		return person;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
}
