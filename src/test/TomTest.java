import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomTest {
    Tom t1;

    @Before
    public void setUp() throws Exception {
        t1=new Tom();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
            public void s1()
    {
        String str=t1.s1(35);
        assertEquals("Number not between 20 and 30",str);
    }

}