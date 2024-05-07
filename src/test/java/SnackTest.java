import org.example.VendingMachine.Snack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SnackTest {

    @Test
    public void SnackPropertyTest() {
        Snack testSnack = new Snack("Coke", 0.5, 10);
        assertEquals(testSnack.getName(), "Coke");
        assertEquals(testSnack.getQuantity(), 10);
        assertEquals(testSnack.getPrice(), 0.5);
    }

}
