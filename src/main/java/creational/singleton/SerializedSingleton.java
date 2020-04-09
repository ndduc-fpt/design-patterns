package creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

  private static final long serialVersionUID = -1578636613942129422L;

  public static SerializedSingleton getInstance() {
    return SerializedSingletonHelper.INSTANCE;
  }

  protected Object readResolve() {
    return getInstance();
  }

  private static class SerializedSingletonHelper {
    private static final SerializedSingleton INSTANCE = new SerializedSingleton();
  }

  private SerializedSingleton() {

  }
}
