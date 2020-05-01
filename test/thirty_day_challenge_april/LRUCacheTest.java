package thirty_day_challenge_april;

import org.junit.Test;

public class LRUCacheTest {

    @Test
    public void test1() {
        LRUCache cache = new LRUCache(10);

        cache.put(10, 13);
        cache.put(3, 17);
        cache.put(6, 11);
        cache.put(10, 5);
        cache.put(9, 10);

        System.out.println(cache.get(13));       // returns 3
        cache.put(2, 19);
        System.out.println(cache.get(2));       // returns 3
        System.out.println(cache.get(3));       // returns 3

        cache.put(5, 25);

        System.out.println(cache.get(8));       // returns 3

        cache.put(9, 22);    // evicts key 1
        cache.put(5, 5);    // evicts key 1
        cache.put(1, 30);    // evicts key 1
        System.out.println(cache.get(11));       // returns -1 (not found)

        cache.put(9, 12);
        System.out.println(cache.get(7));       // returns 3
        System.out.println(cache.get(5));       // returns 3
        System.out.println(cache.get(8));       // returns 3
        System.out.println(cache.get(9));       // returns 3

        cache.put(4, 30);
        cache.put(9, 3);
        System.out.println(cache.get(9));       // returns 3

        System.out.println(cache.get(10));       // returns 3
        System.out.println(cache.get(10));       // returns 3

        cache.put(6, 14);
        cache.put(3, 1);
        System.out.println(cache.get(3));       // returns 3

        cache.put(10, 11);
        System.out.println(cache.get(8));       // returns 3
        cache.put(2, 14);
        System.out.println(cache.get(1));       // returns 3
        System.out.println(cache.get(5));       // returns 3
        System.out.println(cache.get(4));       // returns 3
        cache.put(11, 4);
        cache.put(12, 24);
        cache.put(5, 18);
        System.out.println(cache.get(13));       // returns 3

        cache.put(7, 23);
        System.out.println(cache.get(8));       // returns 3
        System.out.println(cache.get(12));       // returns 3
        cache.put(3, 27);
        cache.put(2, 12);
        System.out.println(cache.get(5));       // returns 3
        cache.put(2, 9);
        cache.put(13, 4);
        cache.put(8, 18);
        cache.put(1, 7);

        System.out.println(cache.get(6));       // returns 3
    }

}