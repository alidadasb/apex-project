public class VendingMachine {
    boolean on;

    public void powerButton() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

}
