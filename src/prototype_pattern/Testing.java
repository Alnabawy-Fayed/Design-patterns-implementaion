package prototype_pattern;

public class Testing {
    public static void main(String[] args) throws CloneNotSupportedException {
        FreshEmployee freshEmployee = new FreshEmployee(1,"nabawy",1000,new Address("masr",90));
        Employee freshEmployee1 = freshEmployee.clone();
        System.out.println(freshEmployee);
        System.out.println(freshEmployee1);
        freshEmployee.getAddress().setStreetName("cairo");
        System.out.println(freshEmployee);
        System.out.println(freshEmployee1);
    }
}
