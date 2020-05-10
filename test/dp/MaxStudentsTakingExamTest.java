package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxStudentsTakingExamTest {

    private MaxStudentsTakingExam max = new MaxStudentsTakingExam();

    @Test
    public void test1() {
        System.out.println(max.maxStudents(new char[][]{{'.','#'},{'#','#'},{'#','.'},{'#','#'},{'.','#'}}));
    }

}