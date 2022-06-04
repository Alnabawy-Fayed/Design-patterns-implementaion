package adapter_pattern;

public class fighterAircraft implements Enemy{
    @Override
    public void fire() {
        System.out.println("the fighter aircraft is firing");
    }

    @Override
    public void refillGas() {
        System.out.println("the fighter aircraft is refilling");
    }
}
