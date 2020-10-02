package thirty_day_challenge_sep;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluateDivisionTest {

    @Test
    public void test1() {
        EvaluateDivision div = new EvaluateDivision();
        List<List<String>> eqs  = new ArrayList<>();
        List<String> eq1 = new ArrayList<>();
        eq1.add("a");
        eq1.add("b");
        List<String> eq2 = new ArrayList<>();
        eq2.add("b");
        eq2.add("c");
        eqs.add(eq1);
        eqs.add(eq2);

        double[] vals = new double[2];
        vals[0] = 2.0d;
        vals[1] = 3.0d;

        List<List<String>> queries  = new ArrayList<>();
        List<String> q1 = new ArrayList<>();
        q1.add("a");
        q1.add("c");
        List<String> q2 = new ArrayList<>();
        q2.add("b");
        q2.add("a");
        queries.add(q1);
        queries.add(q2);

        double[] res = div.calcEquation(eqs, vals, queries);

        System.out.println(Arrays.toString(res));
    }

}