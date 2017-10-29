package DD4L;

import org.junit.Test;
import static org.junit.Assert.*;

public class Test_junit {
    public Test_junit(){
    }
    @Test
    public void myFirstTest() {
    	Calculate test = new Calculate();
        assertEquals(2, test.Sqrt(4), 0.0);
        assertEquals(-1, test.Sqrt(-7), 0.0);
        Age age = new Age(1996, 21);
        assertEquals(21, age.getAge());
        assertEquals(1996, age.getBirth());
        age.setBirth(2000);
        assertEquals(17, age.getAge());
    }
}
