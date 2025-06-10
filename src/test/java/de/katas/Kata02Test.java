package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata02Test {

  @Test
  public void testInputs() {

    // Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
    // Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
    char testData1[] = new char[]{'a','a','b','b','c','c','c'};
    Assertions.assertEquals(6, new Kara02().compress(testData1));
    // Output: Return 1, and the first character of the input array should be: ["a"]
    // Explanation: The only group is "a", which remains uncompressed since it's a single character.
    char testData2[] = new char[]{'a'};
    Assertions.assertEquals(1, new Kara02().compress(testData2));
    // Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
    // Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
    char testData3[] = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
    Assertions.assertEquals(4, new Kara02().compress(testData3));
  }

}
