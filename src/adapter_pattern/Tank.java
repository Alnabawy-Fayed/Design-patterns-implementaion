package adapter_pattern;

public class Tank implements Enemy{

    @Override
    public void fire() {
        System.out.println("tank is fifing");
    }

    @Override
    public void refillGas() {
        System.out.println("tank is refilling gas");
    }
}
