import org.example.VendingMachine.Snack;
import org.example.VendingMachine.VendingMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {
    private VendingMachine vendingMachine = new VendingMachine();
    @Test
    public void VendingMachineSelectedSnackTest() {
        vendingMachine.selectSnack("Snickers");
        assertEquals(vendingMachine.getSelectedSnack().getName(), "Snickers");
    }
    @Test
    public void VendingMachineMoneyTest() {
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(89.00);
        assertEquals(vendingMachine.getMoney(), 89.00);
    }

}
