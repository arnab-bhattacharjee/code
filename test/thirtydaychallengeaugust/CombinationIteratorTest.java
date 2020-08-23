package thirtydaychallengeaugust;

import org.junit.Test;

public class CombinationIteratorTest {

    @Test
    public void test1() {
        CombinationIterator itr = new CombinationIterator("chp", 1);

        for (int i=0; i<3; i++) {
            System.out.println(itr.next());
            System.out.println(itr.hasNext());
            System.out.println(itr.hasNext());
            System.out.println(itr.hasNext());
            System.out.println(itr.hasNext());

        }
    }
}