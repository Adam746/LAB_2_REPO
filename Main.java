public class Main {
	public static void main(String[] args) {
		// Create a new Human instance
		Human person = new Human("John Doe", 30, "Male", 6, "Brown");
		Time timer = new Time();

		// Using the getter methods
		System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
		System.out.println("height: "+ person.getHeight() + ", hairColor: " + person.getHairColor());

		// Using the setter methods
		person.setName("Jane Doe");
		
		// Test the aging methods (wait 6 seconds)
		person.setAge(28);
		System.out.println("Person is " + person.getAge() + " years old.");
		try {
		    Thread.sleep(6000);
		}
		catch (Exception e) {
		    System.out.println(e);
		}
		System.out.println("Person is " + person.getAge() + " years old.");

		// Invoking the custom method
		//person.talk("Hello, world!");
	}
}
