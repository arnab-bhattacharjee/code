package thirty_day_challenge_june;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ReconstructItineraryTest {

    @Test
    public void test1() {
        ReconstructItinerary r = new ReconstructItinerary();

        List<List<String>> in = new ArrayList<>();
        in.add(new ArrayList<>(Arrays.asList("JFK","SFO")));
        in.add(new ArrayList<>(Arrays.asList("JFK","ATL")));
        in.add(new ArrayList<>(Arrays.asList("SFO","ATL")));
        in.add(new ArrayList<>(Arrays.asList("ATL","JFK")));
        in.add(new ArrayList<>(Arrays.asList("ATL","SFO")));

        r.findItinerary(in);
    }

}