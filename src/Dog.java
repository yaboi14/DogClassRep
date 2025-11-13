/**
 * Represents a Dog with various attributes such as personality, name, hair color, breed, age, size, and owner.
 */
public class Dog {
    // Instance variables
    private String personality;
    private String name;
    private String hairColor;
    private String breed;
    private int age;
    private String howBig;
    private Owner owner; // secondary object class

    /**
     * Constructs a new Dog object with all attributes specified.
     *
     * @param personality The personality of the dog.
     * @param name        The name of the dog.
     * @param hairColor   The hair color of the dog.
     * @param breed       The breed of the dog.
     * @param age         The age of the dog in years.
     * @param howBig      The size of the dog (e.g., small, medium, large).
     * @param owner       The owner of the dog.
     */
    public Dog(String personality, String name, String hairColor, String breed, int age, String howBig, Owner owner) {
        this.personality = personality;
        this.name = name;
        this.hairColor = hairColor;
        this.breed = breed;
        this.age = age;
        this.howBig = howBig;
        this.owner = owner;
    }

    /**
     * Overloaded constructor that creates a Dog with only a name and breed.
     * Other values are set to defaults.
     *
     * @param name  The name of the dog.
     * @param breed The breed of the dog.
     */
    public Dog(String name, String breed) {
        this("Friendly", name, "Brown", breed, 1, "Medium", new Owner("Unknown", "N/A"));
    }

    // Getters and setters for all instance variables

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHowBig() {
        return howBig;
    }

    public void setHowBig(String howBig) {
        this.howBig = howBig;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    // ---- Behavior Methods ----

    /**
     * Makes the dog bark.
     */
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }

    /**
     * Simulates the dog eating the given food.
     *
     * @param food The type of food the dog eats.
     */
    public void eat(String food) {
        System.out.println(name + " is happily eating " + food + ".");
    }

    /**
     * Makes the dog play with a specified toy.
     *
     * @param toy The toy the dog plays with.
     */
    public void playWith(String toy) {
        System.out.println(name + " is playing with a " + toy + ".");
    }

    /**
     * Increases the dog's age by one year.
     */
    public void celebrateBirthday() {
        age++;
        System.out.println("Happy Birthday, " + name + "! You are now " + age + " years old!");
    }

    /**
     * Returns a string representation of the dog.
     *
     * @return A description of the dog and its owner.
     */
    @Override
    public String toString() {
        return name + " is a " + age + "-year-old " + hairColor + " " + breed + " (" + howBig + ", " +
                personality + " personality), owned by " + owner + ".";
    }
}
