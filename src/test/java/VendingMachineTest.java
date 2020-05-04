import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VendingMachineTest {

    VendingMachine vm;
    @Before
    public void setUp() throws Exception {
        vm = new VendingMachine();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testOnOff() {
        assertTrue(vm.isOn());
    }
}