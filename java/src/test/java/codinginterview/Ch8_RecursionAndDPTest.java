package codinginterview;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static codinginterview.book.Ch8_RecursionAndDP.*;

public class Ch8_RecursionAndDPTest {
    @Test
    public void test_tripleStep() {
        Assert.assertEquals(4, tripleStep(3));
        Assert.assertEquals(13, tripleStep(5));
    }

    @Test
    public void test_robotGrid() {
        boolean[][] grid = new boolean[5][5];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(grid[i], true);
        }
        grid[3][0] = false;
        grid[3][1] = false;
        grid[3][3] = false;
        grid[3][4] = false;

        Assert.assertTrue(!robotInAGrid(grid).isEmpty());

        grid[3][2] = false;
        Assert.assertTrue(robotInAGrid(grid).isEmpty());
    }

    @Test
    public void test_MagicIndex() {
        int[] arr;

        arr = new int[]{2, 3, 4, 5, 6, 7};
        Assert.assertEquals(Integer.MIN_VALUE, getMagicIndex(arr));

        arr = new int[]{-2, -3, -4, -5, -6, -7};
        Assert.assertEquals(Integer.MIN_VALUE, getMagicIndex(arr));

        arr = new int[]{-2, 1, 3, 7, 23};
        Assert.assertEquals(1, getMagicIndex(arr));
    }

    @Test
    public void test_PowerSet() {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(7);

        final Set<Set<Integer>> subsets = powerSet(set);

        Assert.assertEquals(7, subsets.size());
    }

    @Test
    public void test_multiply() {
        Assert.assertEquals(6, multiply(2, 3));
        Assert.assertEquals(0, multiply(2, 0));
        Assert.assertEquals(0, multiply(0, 2));
    }
}
