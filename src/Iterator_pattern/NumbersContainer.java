package Iterator_pattern;

public class NumbersContainer implements Container{
    int[] numbers = {1,2,3,4,5,6,7,8,9};
    int position = 0;
    @Override
    public Iterator getIterator() {
        return new NumberIterator();
    }
    class NumberIterator implements Iterator{

        @Override
        public boolean hasNext() {
            return position < numbers.length  ;
        }

        @Override
        public Object next() {
            int x = numbers[position];
             position++;
             return x;
        }
    }
}
