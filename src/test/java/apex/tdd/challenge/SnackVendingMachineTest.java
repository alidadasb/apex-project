package apex.tdd.challenge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SnackVendingMachineTest {

    SnackVendingMachine vm;
    @Before
    public void setUp() {
        // setup new VM before each test
        vm = new SnackVendingMachine();
    }

    @Test
    public void vmShouldTurnOnOffWhenSwitchedOnOff() {
        // initial state verification
        assertFalse(vm.isOn());

        // when
        vm.switchButton();

        // expect
        assertTrue(vm.isOn());

        // when
        vm.switchButton();

        // expect
        assertFalse(vm.isOn());
    }

}
