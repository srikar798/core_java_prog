package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnagramTest {

    AnagramExample obj;
    @BeforeEach
    void init(){
        obj = new AnagramExample();
    }

    @Test
    void isAnagramTestWithAnagramStrings(){
        boolean res = obj.isAnagram("listen","silent");
        Assertions.assertTrue(res);
    }

    @Test
    void isAnagramTestNotAnagramStrings() {
        boolean res = obj.isAnagram("listens","silent");
        Assertions.assertFalse(res);
    }

}
