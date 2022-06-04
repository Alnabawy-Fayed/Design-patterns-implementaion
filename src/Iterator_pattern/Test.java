package Iterator_pattern;

public class Test {
    public static void main(String[] args) {
        NumbersContainer numbersContainer = new NumbersContainer();
        for(Iterator iterator = numbersContainer.getIterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
