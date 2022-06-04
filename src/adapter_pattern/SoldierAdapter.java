package adapter_pattern;

public class SoldierAdapter implements Enemy{
    Soldier soldier;
    public SoldierAdapter(Soldier soldier){
        this.soldier = soldier;
    }
    @Override
    public void fire() {
        soldier.hitWithSword();
    }

    @Override
    public void refillGas() {
        soldier.eatForPower();
    }
}
