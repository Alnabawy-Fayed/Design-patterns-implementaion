package observer_pattern;

import java.util.ArrayList;

public interface Lover {
    public void update(ArrayList<Crush> crushes);
    public void showData();
    public void unSubscribe();
}
