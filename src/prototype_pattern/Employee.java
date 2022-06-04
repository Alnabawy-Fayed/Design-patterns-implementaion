package prototype_pattern;

public abstract class   Employee {
   public int id ;
   public String name;
   public double sallary;
   public Address address;

   public abstract Employee deepClone() throws CloneNotSupportedException;
}
