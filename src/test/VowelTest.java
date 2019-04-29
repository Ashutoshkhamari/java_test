import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {
    Vowel v1;

    @Before
    public void setUp() throws Exception {
        v1=new Vowel();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
            public void str()
    {
        String ss=v1.str(a);
        assertEquals("Vowel",ss);
    }
}