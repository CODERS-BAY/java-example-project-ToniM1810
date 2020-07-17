
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {

    private final Application instance;
    private final int x = 10;
    private final int y = 5;

    public ApplicationTest() {
        instance = new Application(x, y);
    }

    /**
     * Test of add method, of class MyTestClass.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int expResult = x + y;
        int result = instance.add();
        assertEquals(expResult, result);
    }

    /**
     * Test of mod method, of class MyTestClass.
     */
    @Test
    public void testMod() {
        System.out.println("mod");
        int expResult = x % y;
        int result = instance.mod();
        assertEquals(expResult, result);
    }

    /**
     * Test output to see a test fail.
     */
    @Test
    public void testFail() {
        fail("This method is intended to fail.");
    }

    @Test
    public void testRuntimeError() {
        System.out.println("This will produce an intended runtime error");
        int[] arr = {1,2,3};
        System.out.println(arr[3]);
    }
}
