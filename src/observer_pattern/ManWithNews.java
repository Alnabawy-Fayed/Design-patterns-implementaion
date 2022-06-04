package observer_pattern;

import java.util.ArrayList;

public class ManWithNews {
    private ArrayList<Lover> lovers = new ArrayList<>();
    ArrayList<Crush> crushes = new ArrayList<>();
    public void setCrushesNews(){
        crushes.add(new Crush("alic",true));
        crushes.add(new Crush("elaa",false));
        crushes.add(new Crush("sara",true));
        crushes.add(new Crush("slama",false));
    }
    public void addLover(Lover lover){
        lovers.add(lover);
    }
    public void unSubscribe(Lover lover){
        lovers.remove(lover);
    }

    public void notifyAllLovers(){
        for(Lover lover: lovers){
            lover.update(crushes);
        }
    }

}
