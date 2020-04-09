package creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class EagerInitializationTest {

  @Test
  public void getInstance() {
    assertEquals(EagerInitialization.getInstance(), EagerInitialization.getInstance());
  }
}