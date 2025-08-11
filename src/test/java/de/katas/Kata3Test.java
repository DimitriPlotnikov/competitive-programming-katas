package de.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests some expected and corner cases.
 */
public class Kata3Test {

  @Test
  public void input1() {
    String word1 = "horse", word2 = "ros";
    
    Assertions.assertEquals(3, new Kata3().minDistance(word1, word2));
  }
  
  @Test
  public void input2() {
    String word1 = "intention", word2 = "execution";
    
    Kata3 kata03 = new Kata3();
    
    Assertions.assertEquals(5, kata03.minDistance(word1, word2));
  }
  
  @Test
  public void input3() {
    String word1 = "dinitrophenylhydrazine", word2 = "acetylphenylhydrazine";
    
    Kata3 kata03 = new Kata3();
    
    Assertions.assertEquals(6, kata03.minDistance(word1, word2));
  }

}
