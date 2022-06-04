package adapter_pattern;

import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new Tank());
        enemies.add(new fighterAircraft());
        enemies.add(new SoldierAdapter(new Soldier()));
        for(Enemy enemy : enemies){
           enemy.fire();
           enemy.refillGas();
        }
    }
}
