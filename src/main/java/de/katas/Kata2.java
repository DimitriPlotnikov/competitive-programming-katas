package de.katas;

/**
 * 443. String Compression
 */
public class Kata2 {
  public int compress(char[] chars) {
    // Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
    // Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

    int i = 0;
    int outputIndex = 0;

    while (i < chars.length) {
      int charCount = 0;
      char curChar = chars[i];

      while (i < chars.length && curChar == chars[i]) {
        ++charCount;
        ++i;
      }

      chars[outputIndex++] = curChar;

      if (charCount > 1) {
        String charCountString = Integer.toString(charCount);
        for (int j = 0; j < charCountString.length(); ++j) {
          chars[outputIndex + j] = charCountString.charAt(j);
        }
        outputIndex += charCountString.length();
      }
    }

    return outputIndex;
  }

}
