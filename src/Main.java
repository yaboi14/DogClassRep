public class Main{
    public static void main(String [] args){
       // Create Owner objects
       Owner owner1 = new Owner("Alice", "555-1234");
       Owner owner2 = new Owner("Bob", "555-5678");

       // Create Dog objects using both constructors
       Dog dog1 = new Dog("Playful", "Buddy", "Golden", "Golden Retriever", 3, "Large", owner1);
       Dog dog2 = new Dog("Luna", "Poodle"); // uses overloaded constructor

       // Print dogs (calls toString)
       System.out.println(dog1);
       System.out.println(dog2);

       // Call behavior methods (with and without parameters)
       dog1.bark();                  // no parameter
       dog2.bark();                  // no parameter
       dog1.eat("dog treats");       // with parameter
       dog2.playWith("tennis ball"); // with parameter
       dog1.celebrateBirthday();     // no parameter
    } 
}