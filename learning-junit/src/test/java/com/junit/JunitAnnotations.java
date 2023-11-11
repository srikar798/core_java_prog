package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class JunitAnnotations {
    
    @Test
    void sampleTest(){
        int expected = 55;
        assertEquals(expected, Stream.of(1,2,3,4,5,6,7,8,9,10).mapToInt(i->i).sum());
    }
    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("Number Test",
                () -> assertEquals(numbers[1], 1),
                () -> assertEquals(numbers[2], 2),
                () -> assertEquals(numbers[3], 3));
    }

    @Test
    void trueAssumption(){
        assertTrue(5>6,"5 is less than 6");
        assertTrue(5< 6,"5 is less than 6");
    }



}
