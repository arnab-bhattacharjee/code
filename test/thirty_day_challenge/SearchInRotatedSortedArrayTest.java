package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayTest {

    private SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

    @Test
    public void test1() {
        System.out.println(search.search(new int[]{8,9,2,3,4}, 9));
    }

}