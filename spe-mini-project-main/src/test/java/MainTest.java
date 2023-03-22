import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MainTest {
    Main obj = new Main();
    @Test
    public void TestCases(){
        assertEquals("calculating factorial",120,obj.factorial(5), 0.001);
        assertEquals("calculating factorial",24,obj.factorial(4), 0.001);
        assertEquals("power for Correct Output", 5, obj.power(5, 1),0.001);
        assertEquals("power for Correct Output", 16, obj.power(4, 2), 0.001);
        assertEquals("natural log for Correct Output", 1.6094379124341003, obj.log(5), 0.001);
        assertEquals("natural log for Correct Output", 1.3862943611198906, obj.log(4),0.001);
        assertEquals("square root for Correct Output", 5, obj.SquareRoot(25),0.001);
        assertEquals("square root for Correct Output", 4, obj.SquareRoot(16),0.001);
        assertNotEquals("Square Root Test 1", 1, obj.SquareRoot(4), 0.001);
        assertNotEquals("Factorial Test 1", 0, obj.factorial(0), 0.001);
        assertNotEquals("Log Test 1", 2, obj.log(10), 0.001);

    }

}
