package com.vtxlab.bootcamp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class App1Test {

    @Mock
    private App2 dependency; // we didn't create object

@InjectMocks
private App1 app1;

    @Test
    void testAdd_whenApp2ProviderMethodAlwaysReturn100() {
        // Case 1 : x > 10 && y < 20
        int x = 11, y = 19;

        // if someone call dependency.provider(20, 19), return -100
       when(dependency.provider(22, 19)).thenReturn(100);

        //App1 app1 = new App1(dependency);

        // actual call (unit test start point)
        int result = app1.add(x, y);

        // the case is actually testing the rest of the logic (+1000)
        assertEquals(1100, result);
    }

    @Test
    void test_Add_Case2() {
        // Case 2 : x <= 10 && y < 20
        when(dependency.provider(18, 19)).thenReturn(100);
        //App1 app1 = new App1(dependency);
        int result = app1.add(9, 19);
        assertEquals(600, result);
    }

    @Test
    void test_Add_Case3() {
        // Case 3 : x <= 10 && y >= 20
        when(dependency.provider(18, 20)).thenReturn(100);
        //App1 app1 = new App1(dependency);
        int result = app1.add(9, 20);
        assertEquals(600, result);
    }

    @Test
    void test_Add_Case4() {
        // Case 4 : x > 10 && y >= 20
       when(dependency.provider(18, 19)).thenReturn(100);
        //App1 app1 = new App1(dependency);
        int result = app1.add(9, 19);
        assertEquals(600, result);
    }

    @Test
    void testFirstCharacters() {
        when(dependency.encode('a')).thenReturn('B');
        //when(dependency.encode('b')).thenReturn('C');
        when(dependency.encode('c')).thenReturn('D');
        when(dependency.encode('i')).thenReturn('J');
        when(dependency.encode('j')).thenReturn('K');
        //when(dependency.encode('k')).thenReturn('L');
        //App1 app1 = new App1(dependency);
        List<String> strings = new ArrayList<>(List.of("abc", "ijk", "cba", "jba", "jmk"));
        String result = app1.firstCharacters(strings);
        assertEquals("BJDKK", result);

        verify(dependency, times(1)).encode('a');
        verify(dependency, times(1)).encode('i');
        verify(dependency, times(1)).encode('c');
        verify(dependency, times(2)).encode('j');
    }


}

