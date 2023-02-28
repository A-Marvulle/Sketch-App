package tools;

import java.util.Random;

public class Generator {

  private static final Random rand = new Random();
  
  public static int randomInt(int lowestValue, int upperBound) {
    return rand.nextInt(upperBound - lowestValue) + lowestValue;    
  }

  public static int randomInt(int upperBound) {
    return rand.nextInt(upperBound);
  }
}