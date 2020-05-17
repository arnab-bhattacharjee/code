package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionParsingTest {

    private ExpressionParsing expressionParsing = new ExpressionParsing();

    @Test
    public void test1() {
        System.out.println(expressionParsing.calculate(" 2-1 + 2 "));
    }

}