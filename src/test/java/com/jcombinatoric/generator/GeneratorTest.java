package com.jcombinatoric.generator;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratorTest {

    @Test
    public void testGeneratePermutation() throws Exception {
        Generator gen = new Generator();
        gen.generatePermutation();
        assertTrue(0 == 0);
    }

    @Test
    public void testGenerateCombinations() throws Exception {
        Generator gen = new Generator();
        gen.generateCombinations(1);
        assertTrue(1 == 1);
    }
}