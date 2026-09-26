package de.katas;

/** 605. Can Place Flowers */
public class Kata14 {

  /**
   * greedy approach: count every time a plate is possible. handle 3 special cases: 0 plants, plants
   * at the first place, plants at the last place.
   */
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    // counts the number of empty pots so far. at the beginning assume that there are no plants so
    // far.
    int stepsWithoutFlower = 1;

    if (n == 0) {
      return true;
    }

    for (int i = 0; i < flowerbed.length; ++i) {
      if (flowerbed[i] == 0) {
        //        System.out.println(
        //            "i="
        //                + i
        //                + " stepsWithoutFlower="
        //                + stepsWithoutFlower
        //                + " flowersPlanted="
        //                + flowersPlanted);

        if (stepsWithoutFlower == 1
            && (i + 1 < flowerbed.length && flowerbed[i + 1] == 0 || i + 1 == flowerbed.length)) {
          stepsWithoutFlower = 0;
          if (--n == 0) {
            return true;
          }
        } else {
          ++stepsWithoutFlower;
        }
      } else {
        // System.out.println("i=" + i + " flower");
        stepsWithoutFlower = 0;
      }
    }

    return false;
  }
}
