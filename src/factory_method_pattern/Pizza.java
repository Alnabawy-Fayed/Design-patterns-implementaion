package factory_method_pattern;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String size;
    String sauce;
    ArrayList<String> extraStuff = new ArrayList<>();

    public String getName() {
        return name;
    }
    public void preparePizza(){
        System.out.println("preparing the "+ name + " pizza");
    }
    public void bakePizza(){
        System.out.println("bake the "+ name + " pizza");
    }
    public void cutPizza(){
        System.out.println("cutting the "+ name + " pizza");
    }
    public void boxPizza(){
        System.out.println("boxing the "+ name + " pizza");
    }




    public void setExtraStuff(ArrayList<String> extraStuff) {
        this.extraStuff = extraStuff;
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("------"+name+"-----\n");
        builder.append(size+"\n");
        builder.append(sauce+"\n");
        for(int i = 0; i < extraStuff.size(); i++){
            builder.append(""+i+"-"+extraStuff.get((i))+"\n");
        }
        return builder.toString();
    }
}
