package com.tw.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BinarySearchTest {

    @Test
    public void should_return_right_index_if_target_exists() throws Exception {
        int[] targetList = {1,3,5,7};
        int[] targetList_1 = {1,3,5};
        BinarySearcher searcher = new BinarySearcher();
        int result = searcher.chop(3, targetList);
        int result_1 = searcher.chop(3,targetList_1);

        assertThat(result, is(1));
        assertThat(result_1, is(1));
    }

    @Test
    public void should_return_error_if_target_not_exists() throws Exception {
        int[] targetList = {1,3,5,7};
        int[] targetList_1 = {1,3,5};
        BinarySearcher searcher = new BinarySearcher();
        int result = searcher.chop(9, targetList);
        int result_1 = searcher.chop(4,targetList_1);

        assertThat(result, is(-1));
        assertThat(result_1, is(-1));
    }
}