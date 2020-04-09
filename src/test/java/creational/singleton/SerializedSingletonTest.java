package creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SerializedSingletonTest {

  @Test
  public void getInstance() {
    assertEquals(SerializedSingleton.getInstance(), SerializedSingleton.getInstance());
  }
}