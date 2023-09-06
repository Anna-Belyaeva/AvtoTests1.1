package ru.netology.service;

import org.junit.Assert;

public class CashBackHackerServiceTest {

    CashBackHackerService service = new CashBackHackerService();

    @org.junit.Test
    public void shouldBuy1() {

        Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void shouldBuy999() {

        Assert.assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void shouldNotBuy1000() {

        Assert.assertEquals(0, service.remain(1000));
    }
}
