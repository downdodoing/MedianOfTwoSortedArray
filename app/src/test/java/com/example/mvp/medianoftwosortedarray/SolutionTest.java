package com.example.mvp.medianoftwosortedarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MVP on 2017/9/5.
 */
public class SolutionTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findMedianSortedArrays() throws Exception {
        assertEquals(2.5, new Solution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4}));
    }

}