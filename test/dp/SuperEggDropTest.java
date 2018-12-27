package dp;

import dp.SuperEggDrop;
import org.junit.Assert;
import org.junit.Test;

public class SuperEggDropTest {

    private SuperEggDrop eggDrop = new SuperEggDrop();

    @Test
    public void  test1() {
        Assert.assertEquals(2, eggDrop.superEggDrop(1, 2));
    }
    @Test
    public void  test2() {
        Assert.assertEquals(3, eggDrop.superEggDrop(2, 6));
    }
    @Test
    public void  test3() {
        Assert.assertEquals(4, eggDrop.superEggDrop(4, 10000));
    }

}