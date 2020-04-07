package dp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    private GroupAnagrams grpAnagrams = new GroupAnagrams();

    @Test
    public void test1() {
        System.out.println(grpAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

}