public class Human {
    // Data members
    private String name;
    private int age;
    private String gender;
    private int height;
    private String hairColor;

    // Basic constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "Male";
        this.height = 4;
        this.hairColor = "Brown";
    }

    // Basic constructor with Gender
    public Human(String name, int age, String gender, int height, String hairColor) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.hairColor = hairColor;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    
    public int getHeight(){
        return height;
    }

    public String getHairColor(){
        return hairColor;
    }
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = (age > 0) ? age : 1; // Ensure the age is positive
    }

    public void setGender(String gender){
        this.gender = gender;
    }    

    public void setHeight(int height){
        this.height = (height > 4) ? height : 4;
    }

    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }

    // Custom method
    public void talk(String message) {
        System.out.println(name + " says: " + message);
    }

    public void sleep(int duration){
        System.out.println(name + " Goodnight ima go sleep for " + duration + " hours ");
    }
}
