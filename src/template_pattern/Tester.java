package template_pattern;

public class Tester {
    public static void main(String[] args) {
        HotDrink tea = new Tea();
        tea.prepare();
        HotDrink coffe = new Coffe();
        coffe.prepare();
    }
}
