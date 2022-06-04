package template_pattern;

import template_pattern.HotDrink;

public class Tea extends HotDrink {
    @Override
    protected void addMainComponrent() {
        System.out.println("adding tea to the hot water");
    }

    @Override
    protected void addExtraStuff() {
        System.out.println("adding milk and suger to the tea");
    }
}
