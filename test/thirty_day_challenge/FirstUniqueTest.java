package thirty_day_challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstUniqueTest {

    @Test
    public void test1() {
        FirstUnique firstUnique = new FirstUnique(new int[]{7,7,7,7,7,7});
        System.out.println(firstUnique.showFirstUnique()); // return -1
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3]
        firstUnique.add(3);            // the queue is now [7,7,7,7,7,7,7,3,3]
        firstUnique.add(7);            // the queue is now [7,7,7,7,7,7,7,3,3,7]
        firstUnique.add(17);           // the queue is now [7,7,7,7,7,7,7,3,3,7,17]
        System.out.println(firstUnique.showFirstUnique()); // return 17
    }

}