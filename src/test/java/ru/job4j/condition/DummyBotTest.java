package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, умник.")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("Как ты?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }

    @Test
    public void whenUnknown2Bot() {
        assertThat(
                DummyBot.answer("Что делаешь?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}