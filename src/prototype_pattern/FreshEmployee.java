package prototype_pattern;

public class FreshEmployee  extends    Employee implements Cloneable{

    public  FreshEmployee (){}

    public FreshEmployee(int id,String name,double sallary,Address address) {
        this.id = id;
        this.name = name;
        this.sallary = sallary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (FreshEmployee)super.clone();
    }

    @Override
    public Employee deepClone() throws CloneNotSupportedException {
        FreshEmployee freshEmployee = (FreshEmployee) super.clone();
        freshEmployee.address = new Address(this.address.streetName,this.address.streetNumber);
        return freshEmployee;
    }

    @Override
    public String toString() {
        return "FreshEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sallary=" + sallary +
                ", address=" + address +
                '}';
    }
}
