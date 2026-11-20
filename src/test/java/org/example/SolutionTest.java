package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testStrStr(){
        Solution solution = new Solution();
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }
}