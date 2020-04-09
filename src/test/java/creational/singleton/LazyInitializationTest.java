package creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class LazyInitializationTest {

  @Test
  public void getInstance() {
    assertEquals(LazyInitialization.getInstance(), LazyInitialization.getInstance());
  }
}