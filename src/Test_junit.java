import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_junit {
    @Test
    void myFirstTest() {
    	Calculate test = new Calculate();
        assertEquals(2, test.Sqrt(4));
        assertEquals(-1, test.Sqrt(-7));
        Age age = new Age(1996, 21);
        assertEquals(21, age.getAge());
        assertEquals(1996, age.getBirth());
        age.setBirth(2000);
        assertEquals(17, age.getAge());
    }
}
