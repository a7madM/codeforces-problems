package test;

import com.a7mad.Solution;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by a7mad on 07/01/17.
 */
public class SolutionTest {
    Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }


    @Test
    public void testCase() {
        String output = solution.solveProblem("HTTP");
        assertEquals("http", output);


        output = solution.solveProblem("cAPS");
        assertEquals("Caps", output);


        output = solution.solveProblem("Lock");
        assertEquals("Lock", output);

        output = solution.solveProblem("z");
        assertEquals("Z", output);

        output = solution.solveProblem("Z");
        assertEquals("z", output);
    }
}