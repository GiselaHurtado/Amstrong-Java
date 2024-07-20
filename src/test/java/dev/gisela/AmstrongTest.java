package dev.gisela;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AmstrongTest {
    @Test
    void testMain() {
           assertTrue(Amstrong.isAmstrong(0));  
        assertTrue(Amstrong.isAmstrong(1));  
        assertTrue(Amstrong.isAmstrong(153)); 
        assertTrue(Amstrong.isAmstrong(370)); 
        assertTrue(Amstrong.isAmstrong(371)); 
        assertTrue(Amstrong.isAmstrong(407)); 

      
        assertFalse(Amstrong.isAmstrong(10));  
        assertFalse(Amstrong.isAmstrong(100)); 
        assertFalse(Amstrong.isAmstrong(123)); 
        assertFalse(Amstrong.isAmstrong(500)); 
    }

    }

