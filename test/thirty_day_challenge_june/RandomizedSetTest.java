package thirty_day_challenge_june;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomizedSetTest {

    private RandomizedSet randomSet = new RandomizedSet();

    @Test
    public void test() {
        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomSet.insert(3);

// Returns false as 2 does not exist in the set.
        randomSet.insert(3);

        randomSet.getRandom();

// Inserts 2 to the set, returns true. Set now contains [1,2].
        randomSet.insert(1);

        randomSet.remove(3);

// getRandom should return either 1 or 2 randomly.
        randomSet.getRandom();

// Removes 1 from the set, returns true. Set now contains [2].
        randomSet.insert(0);

// 2 was already in the set, so return false.
        randomSet.remove(0);

// Since 2 is the only number in the set, getRandom always return 2.
        randomSet.getRandom();
    }

}