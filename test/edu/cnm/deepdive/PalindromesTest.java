package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class PalindromesTest {

  static final String[] negativeTestData = {
      "xy",
      "sonar",
      "Madame, I'm Adam",
      "Burrito Dog"
  };

  @ParameterizedTest
  @CsvFileSource(resources = "/affirmative.csv")
  void isPalindromeAffirmative(String testCase) {
    assertTrue(Palindromes.isPalindrome(testCase));
  }


   @ParameterizedTest
   @CsvFileSource(resources = "/negative.csv")
    void isPalindromeNegative(String testCase) {
      assertFalse(Palindromes.isPalindrome(testCase));
    }
  }
}