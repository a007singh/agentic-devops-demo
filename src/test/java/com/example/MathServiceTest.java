import org.junit.Test;
import static org.junit.Assert.*;

public class MathServiceTest {

    @Test
    public void testMultiply() {
        MathService mathService = new MathService();
        int result = mathService.multiply(3, 4);
        assertEquals(12, result);
    }

}