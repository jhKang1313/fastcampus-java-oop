package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JavaSortTest {
    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void test(){
        //Given
        JavaSort<Integer> javaSort = new JavaSort<>();
        //When
        List<Integer> actual = javaSort.sort(Arrays.asList(3, 2, 1, 5, 4));
        //Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}