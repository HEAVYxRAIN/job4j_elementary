package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax22To12Then22() {
        int result = Max.max(22, 12);
        assertThat(result, is(22));
    }

    @Test
    public void whenMax12To22Then22() {
        int result = Max.max(12, 22);
        assertThat(result, is(22));
    }

    @Test
    public void whenMax10To10Then10() {
        int result = Max.max(10, 10);
        assertThat(result, is(10));
    }
}