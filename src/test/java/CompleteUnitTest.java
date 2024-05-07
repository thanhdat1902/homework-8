import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({SnackTest.class, SnackDispenseHandlerTest.class, StateOfVendingMachineTest.class, VendingMachineTest.class})
public class CompleteUnitTest {
}
