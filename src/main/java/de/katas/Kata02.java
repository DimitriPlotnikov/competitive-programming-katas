package de.katas;

/**
 * 443. String Compression
 */
public class Kata02 {
  public int compress(char[] chars) {
    int outputIndex = 0;
    char currentChar = chars[0];
    int seqCounter = 0;
    for (int i = 0; i < chars.length; ++i) {
      if (chars[i] == currentChar) {
        ++seqCounter;
      } else {
        if (seqCounter == 1) {
          ++outputIndex;
        } else {
          chars[outputIndex] = currentChar;
          chars[outputIndex + 1] = (char) seqCounter;
        }
      }
    }
    return outputIndex + 1;
  }

}
