public class VendingMachine {
    boolean on;

    public void pushButton() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

}
