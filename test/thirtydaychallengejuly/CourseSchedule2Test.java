package thirtydaychallengejuly;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseSchedule2Test {

    @Test
    public void test1() {
        CourseSchedule2 courses = new CourseSchedule2();
        courses.findOrder(4, new int[][]{{1,0}, {2,0}, {3,1}, {3,2}});
    }

}