package thirty_day_challenge;

import java.util.ArrayList;
import java.util.List;

public class BinaryMatrix {

    private int count = 0;

    public List<Integer> dimensions() {
        System.out.println(++count);
        List<Integer> l = new ArrayList<>();
        l.add(100);
        l.add(100);
        return l;
    }

    public int get(int i, int mid) {
        System.out.println(++count);
        return 0;
    }
}
