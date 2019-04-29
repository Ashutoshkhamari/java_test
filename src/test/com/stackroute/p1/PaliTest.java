package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaliTest {
      Pali pali;

    @Before
    public void setUp() throws Exception {
        pali=new Pali();
    }

    @After
    public void tearDown() throws Exception {
        pali=null;
    }

    @Test
    public void palindrome() {
       String actualString= pali.palindrome(101);
       String expectedString="palindrome number ";
       assertEquals("Not Equal bxz",expectedString,actualString);
    }
    @Test
    public void notPalindrome() {
        String actualString= pali.palindrome(10);
        String expectedString="palindrome number ";
        assertNotEquals("Not Equal bxz",expectedString,actualString);
    }
}