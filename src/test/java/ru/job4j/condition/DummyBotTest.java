package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String answer = DummyBot.answer(in);
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String answer = DummyBot.answer(in);
        Assert.assertEquals(expected, answer);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Почему трава зеленая?";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String answer = DummyBot.answer(in);
        Assert.assertEquals(expected, answer);
    }
}