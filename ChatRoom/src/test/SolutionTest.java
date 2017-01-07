package test;

import com.a7mad.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
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
    public void testCase1() {
        assertTrue(solution.solveProblem("ahhellllloou"));
        assertFalse(solution.solveProblem("hlelo"));
    }

    @Test
    public void testCase2() {
        assertTrue(solution.solveProblem("ahhellllloou"));
        assertFalse(solution.solveProblem("hlelo"));
    }
}
