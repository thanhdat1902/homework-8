import org.example.VendingMachine.VendingMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SnackDispenseHandlerTest {
    private VendingMachine vendingMachine = new VendingMachine();

    @BeforeEach
    public void init() {

    }

    @Test
    public void CokeDispenserTest() {
        double expectedQuanity = 11;
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        assertEquals(expectedQuanity, vendingMachine.getSelectedSnack().getQuantity());
    }

    @Test
    public void PepsiDispenserTest() {
        double expectedQuanity = 20;
        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        assertEquals(expectedQuanity, vendingMachine.getSelectedSnack().getQuantity());
    }

    @Test
    public void CheetosDispenserTest() {
        double expectedQuanity = 2;
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        assertEquals(expectedQuanity, vendingMachine.getSelectedSnack().getQuantity());
    }

    @Test
    public void DoritosDispenserTest() {
        double expectedQuanity = 3;
        vendingMachine.selectSnack("Doritos");
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        assertEquals(expectedQuanity, vendingMachine.getSelectedSnack().getQuantity());
    }

    @Test
    public void KitKatDispenserTest() {
        double expectedQuanity = 8;
        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        assertEquals(expectedQuanity, vendingMachine.getSelectedSnack().getQuantity());
    }

    @Test
    public void SnickersDispenserTest() {
        double expectedQuanity = 1;
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        assertEquals(expectedQuanity, vendingMachine.getSelectedSnack().getQuantity());
    }
}
