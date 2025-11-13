/**
 * Represents a Dog with various attributes such as personality, name, hair color, breed, age, and size.
 */
public class Dog {
    // Instance variables

    /**
     * The personality of the dog.
     */
    private String personality;

    /**
     * The name of the dog.
     */
    private String name;

    /**
     * The hair color of the dog.
     */
    private String hairColor;

    /**
     * The breed of the dog.
     */
    private String breed;

    /**
     * The age of the dog in years.
     */
    private int age;

    /**
     * The size of the dog (e.g., small, medium, large).
     */
    private String howBig;

    /**
     * Constructs a new Dog object with the specified attributes.
     *
     * @param personality The personality of the dog.
     * @param name        The name of the dog.
     * @param hairColor   The hair color of the dog.
     * @param breed       The breed of the dog.
     * @param age         The age of the dog in years.
     * @param howBig      The size of the dog.
     */
    public Dog(String personality, String name, String hairColor, String breed, int age, String howBig) {
        this.personality = personality;
        this.name = name;
        this.hairColor = hairColor;
        this.breed = breed;
        this.age = age;
        this.howBig = howBig;
    }

    /**
     * Gets the personality of the dog.
     *
     * @return The personality of the dog.
     */
    public String getPersonality() {
        return personality;
    }

    /**
     * Sets the personality of the dog.
     *
     * @param personality The personality to set.
     */
    public void setPersonality(String personality) {
        this.personality = personality;
    }

    /**
     * Gets the name of the dog.
     *
     * @return The name of the dog.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the dog.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the hair color of the dog.
     *
     * @return The hair color of the dog.
     */
    public String getHairColor() {
        return hairColor;
    }

    /**
     * Sets the hair color of the dog.
     *
     * @param hairColor The hair color to set.
     */
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * Gets the breed of the dog.
     *
     * @return The breed of the dog.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the breed of the dog.
     *
     * @param breed The breed to set.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Gets the age of the dog.
     *
     * @return The age of the dog in years.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the dog.
     *
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the size of the dog.
     *
     * @return The size of the dog.
     */
    public String getHowBig() {
        return howBig;
    }

    /**
     * Sets the size of the dog.
     *
     * @param howBig The size to set.
     */
    public void setHowBig(String howBig) {
        this.howBig = howBig;
    }
}
