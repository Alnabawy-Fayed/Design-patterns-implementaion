package prototype_pattern;

public class Address {
    public String streetName;
    public int streetNumber;
    public Address(String theStreetName, int theStreetNumber){
        streetNumber = theStreetNumber;
        streetName = theStreetName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
