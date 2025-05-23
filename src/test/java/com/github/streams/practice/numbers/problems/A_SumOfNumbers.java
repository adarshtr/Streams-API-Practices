package com.github.streams.practice.numbers.problems;

import com.github.streams.practice.numbers.NumbersProblemSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given an array of integers like {5,6,7,8)
 * Find the sum of the all the elements in the array.
 * The output should be in this case is: 26.
 */
class A_SumOfNumbers {

  @Test
  @Disabled
  void testSumOfUniqueDigitsTest() {
    final var input = List.of(5, 6, 7, 8, 5, 5, 8, 8, 7);
    var mySolution = NumbersProblemSolution.sumOfNumbers(input);
    var yourSolution = List.of();

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
