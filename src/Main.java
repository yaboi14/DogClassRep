public class Main{
    public static void main(String [] args){
        Dog dog1 = new Dog("Playful", "Buddy", "Brown", "Labrador", 3, "Medium");
        Dog dog2 = new Dog("Calm", "Max", "Black", "German Shepherd", 5, "Large");

        System.out.println("Dog 1: " + dog1.getName() + ", Personality: " + dog1.getPersonality());
        System.out.println("Dog 2: " + dog2.getName() + ", Personality: " + dog2.getPersonality());
    } 
}