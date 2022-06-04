package observer_pattern;

import java.util.ArrayList;

public class ShyLover implements Lover{
    ArrayList<Crush> crushes;
    ManWithNews manWithNews ;
    public ShyLover(ManWithNews manWithNews){
        this.manWithNews = manWithNews;
        manWithNews.addLover(this);
    }
    @Override
    public void update(ArrayList<Crush> crushes) {
        this.crushes = crushes;
        showData();
    }
    public void showData(){
        System.out.println("hi i am shyLover and i Know that : ");
        for(Crush crush : crushes){
            System.out.println(crush.getName()+ " is "+ (crush.isSingle()? "single" :"not single"));
        }
    }
    public void unSubscribe(){
        manWithNews.unSubscribe(this);
    }
}
