import org.junit.*;
import static org.junit.Assert.*;

public class VendingMachineTest {

    VendingMachine vm;
    @Before
    public void setUp() {
        vm = new VendingMachine();
    }

    @After
    public void tearDown() {}

    @Test
    public void vmShouldTurnOnOffWhenSwitchedOnOff() {
        assertFalse(vm.isOn());

        vm.pushButton();

        assertTrue(vm.isOn());

        vm.pushButton();

        assertFalse(vm.isOn());
    }

}