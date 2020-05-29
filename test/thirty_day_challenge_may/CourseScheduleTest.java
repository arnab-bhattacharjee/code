package thirty_day_challenge_may;

import org.junit.Test;

import static org.junit.Assert.*;

public class CourseScheduleTest {

    private CourseSchedule schedule = new CourseSchedule();

    @Test
    public void test1() {
        System.out.println(schedule.canFinish(2, new int[][]{{1,0}}));
    }

}