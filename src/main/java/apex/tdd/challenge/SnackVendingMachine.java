package apex.tdd.challenge;

import lombok.ToString;

@ToString
public class SnackVendingMachine implements VendingMachine {
    boolean on;

    public void switchButton() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }
}
