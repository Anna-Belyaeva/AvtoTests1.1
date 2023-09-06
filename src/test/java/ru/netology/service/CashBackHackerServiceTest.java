package ru.netology.service;
import org.testng.Assert;

public class CashBackHackerServiceTest {

    CashBackHackerService service = new CashBackHackerService();

    @org.testng.annotations.Test
    public void shouldBuy1() {

        Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
    public void shouldBuy999() {

        Assert.assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
    public void shouldNotBuy1000() {

        Assert.assertEquals(service.remain(1000), 0);
    }
}
