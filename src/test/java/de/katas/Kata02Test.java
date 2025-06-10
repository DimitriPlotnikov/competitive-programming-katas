package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Kata02Test {

  @Test
  public void testInputs1() {
    // Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
    // Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
    char testData[] = new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    int dataLen = new Kata02().compress(testData);
    Assertions.assertEquals(6, dataLen);
    Assertions.assertTrue(compareCharArrays("a2b2c3".toCharArray(), testData, dataLen));
  }

  @Test
  public void testInputs2() {
    // Output: Return 1, and the first character of the input array should be: ["a"]
    // Explanation: The only group is "a", which remains uncompressed since it's a single character.
    char testData[] = new char[] {'a'};
    int dataLen = new Kata02().compress(testData);
    Assertions.assertEquals(1, dataLen);
    Assertions.assertTrue(compareCharArrays("a".toCharArray(), testData, dataLen));
  }

  @Test
  public void testInputs3() {
    // Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
    // Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
    char testData[] = new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    int dataLen = new Kata02().compress(testData);
    Assertions.assertEquals(4, dataLen);
    Assertions.assertTrue(compareCharArrays("ab12".toCharArray(), testData, dataLen));
  }
  
  @Test
  public void testInputs4() {
    // Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
    // Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
    char testData[] = new char[] {'a', 'b', 'c'};
    int dataLen = new Kata02().compress(testData);
    Assertions.assertEquals(3, dataLen);
    Assertions.assertTrue(compareCharArrays("abc".toCharArray(), testData, dataLen));
  }

  boolean compareCharArrays(char a[], char b[], int len) {
    boolean equals = true;
    for (int i = 0; i < len; ++i) {
      if (a[i] != b[i]) {
        equals = false;
        break;
      }
    }

    if (!equals) {
      System.out.println("Expcected: " + new String(a));
      System.out.println("Result: " + new String(b));
    }
    return equals;
  }

}
