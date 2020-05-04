import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class VendingMachineTest {

    VendingMachine vm;
    @Before
    public void setUp() {
        vm = new VendingMachine();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testVMShouldBeOffWhenInitialized() {
        assertFalse(vm.isOn());
    }
}