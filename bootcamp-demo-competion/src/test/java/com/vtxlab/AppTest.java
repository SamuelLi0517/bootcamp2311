package com.vtxlab;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;


public class AppTest {
    
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true );
    }

    // Compare int, String
    @Test
    void testIntegerString(){
        int actual = 45;
        assertThat(actual, equalTo(45));
        assertThat(actual, is(not(equalTo(45))));

        String actual2 = "hello";
        assertThat(actual2, equalTo("hello"));
        assertThat(actual2, not(equalTo("hello")));
        assertThat(actual2, containsString("ll"));
        assertThat(actual2, not(containsString("ll")));

        
    }
}
