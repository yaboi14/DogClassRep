/**
 * Represents the owner of a dog.
 */
public class Owner {
    private String ownerName;
    private String phoneNumber;

    /**
     * Constructs a new Owner object.
     *
     * @param ownerName   The name of the owner.
     * @param phoneNumber The phone number of the owner.
     */
    public Owner(String ownerName, String phoneNumber) {
        this.ownerName = ownerName;
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns a string representation of the owner.
     *
     * @return A string containing the owner's name and phone number.
     */
    @Override
    public String toString() {
        return ownerName + " (" + phoneNumber + ")";
    }
}
