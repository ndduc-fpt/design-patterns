package creational.singleton;

/**
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a singleton class but it has a drawback that instance
 * is created even though client application might not be using it.
 */
public class EagerInitialization {

  private static final EagerInitialization instance = new EagerInitialization();

  public static EagerInitialization getInstance() {
    return instance;
  }

  private EagerInitialization() {

  }
}
