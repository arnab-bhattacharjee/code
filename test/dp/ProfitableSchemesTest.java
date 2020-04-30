package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfitableSchemesTest {

    private ProfitableSchemes profitableSchemes = new ProfitableSchemes();

    @Test
    public void test1() {
        System.out.println(profitableSchemes.profitableSchemes(10, 5, new int[]{2,3,5}, new int[]{6, 7, 8}));
    }

}