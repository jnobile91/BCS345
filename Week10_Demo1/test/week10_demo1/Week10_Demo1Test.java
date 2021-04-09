package week10_demo1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Week10_Demo1Test {
    Week10_Demo1 w = new Week10_Demo1();
    
    public Week10_Demo1Test() {
    }

    @Test
    public void testIsPrime() {
        assertEquals("5 is prime ", w.isPrime(5), true);
    }
    
}