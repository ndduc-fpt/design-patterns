package creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreadSafeSingletonTest {

  @Test
  public void getInstance() {
    assertEquals(ThreadSafeSingleton.getInstance(), ThreadSafeSingleton.getInstance());
  }
}