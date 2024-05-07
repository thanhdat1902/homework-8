import org.example.VendingMachine.States.DispensingSnackState;
import org.example.VendingMachine.States.IdleState;
import org.example.VendingMachine.States.WaitingForMoneyState;
import org.example.VendingMachine.VendingMachine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StateOfVendingMachineTest {
    private final VendingMachine vendingMachine = new VendingMachine();
    @Test
    public void defaultVendingMachineStateTest(){
        assertInstanceOf(IdleState.class, vendingMachine.getState());
    }
    @Test
    public void afterSelectSnackStateTest(){
        vendingMachine.selectSnack("Coke");
        assertInstanceOf(WaitingForMoneyState.class, vendingMachine.getState());
    }
    @Test
    public void selectOutOfStockSnackTest(){
        for(int i =0; i< 2; i++) {
            vendingMachine.selectSnack("Snickers");
            vendingMachine.insertMoney(5);
            vendingMachine.dispenseSnack();
        }
        vendingMachine.selectSnack("Snickers");
        assertInstanceOf(IdleState.class, vendingMachine.getState());
    }
    @Test
    public void selectNoneExistentSnackTest(){
        vendingMachine.selectSnack("Burger");
        assertInstanceOf(IdleState.class, vendingMachine.getState());
    }

    @Test
    public void waitingForMoneyStateTest(){
        vendingMachine.selectSnack("Coke");
        assertInstanceOf(WaitingForMoneyState.class, vendingMachine.getState());
    }
    @Test
    public void waitingForMoneyButNotEnoughAmountTest(){
        vendingMachine.selectSnack("Doritos");
        vendingMachine.insertMoney(2);
        assertInstanceOf(IdleState.class, vendingMachine.getState());
    }
    @Test
    public void dispensingSnackTest(){
        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(5);
        assertInstanceOf(DispensingSnackState.class, vendingMachine.getState());
    }
}
