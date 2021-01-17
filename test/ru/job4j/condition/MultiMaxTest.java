package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(6, 4, 2);
        assertThat(result, is(6));
    }
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(4, 6, 2);
        assertThat(result, is(6));
    }
    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(4, 2, 6);
        assertThat(result, is(6));
    }
    @Test
    public void whenAllMax() {
        int result = MultiMax.max(6, 6, 6);
        assertThat(result, is(6));
    }
    @Test
    public void whenOneMax() {
        int result = MultiMax.max(1, 100, 100);
        assertThat(result, is(100));
    }
}