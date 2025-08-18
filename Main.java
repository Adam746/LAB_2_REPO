public class Main {
    public static void main(String[] args) {
        // Create a new Human instance
        Human person = new Human("John Doe", 30, "Male", 6, "Brown");



        // Using the getter methods
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        System.out.println("height: "+ person.getHeight() + ", hairColor: " + person.getHairColor());

        // Using the setter methods
        person.setName("Jane Doe");
        person.setAge(28);
        person.sleep(6);

        // Invoking the custom method
        person.talk("Hello, world!");
    }
}
