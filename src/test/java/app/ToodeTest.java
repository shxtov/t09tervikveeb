package app;

import org.junit.*;
import static org.junit.Assert.*;

public class ToodeTest{

    @Test
    public void incrementTest(){
        Toode arvuti = new Toode("Arvuti", 1, 3);
        arvuti.increment();
        assertEquals(2, arvuti.amount);
    }

    @Test
    public void sumTest(){
        Toode arvuti = new Toode("Arvuti", 2, 5);
        arvuti.increment();
        arvuti.increment();
        assertEquals(20, arvuti.sum(), 0.1);
    }

}