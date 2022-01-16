package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldReturnZero() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnUpperLimit() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn100For900() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

}
