import org.junit.Test;
import static org.junit.Assert.*;

public class CodingBatTest {

    @org.junit.Test
    public void close10() {
        CodingBat cb = new CodingBat();
        assertEquals(8, cb.close10(8 , 13));
        assertEquals(0, cb.close10(13 , 7));
        assertEquals(0, cb.close10(13 , 7));
        assertEquals(10, cb.close10(10 , 12));
        assertEquals(10, cb.close10(11 , 10));
    }

    @Test
    public void hasTeen() {
        CodingBat cb = new CodingBat();
        assertEquals(true, cb.hasTeen(13, 20, 10));
        assertEquals(false, cb.hasTeen(1, 20,12));

    }
}