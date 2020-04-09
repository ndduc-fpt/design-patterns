package creational.singleton;

public class ThreadSafeSingleton {

  private static ThreadSafeSingleton instance;

  public static ThreadSafeSingleton getInstance() {
    if (instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new ThreadSafeSingleton();
        }
      }
    }

    return instance;
  }

  private ThreadSafeSingleton() {

  }
}
