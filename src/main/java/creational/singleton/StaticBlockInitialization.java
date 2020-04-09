package creational.singleton;

/**
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of class is created in the static block that provides option
 * for exception handling.
 */
public class StaticBlockInitialization {

  private static StaticBlockInitialization instance;

  static {
    try {
      instance = new StaticBlockInitialization();
    } catch (Exception e) {
      throw new RuntimeException("Error encountered.");
    }
  }

  public static StaticBlockInitialization getInstance() {
    return instance;
  }

  private StaticBlockInitialization() {

  }
}
