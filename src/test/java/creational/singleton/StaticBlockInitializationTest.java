package creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class StaticBlockInitializationTest {

  @Test
  public void getInstance() {
    assertEquals(StaticBlockInitialization.getInstance(), StaticBlockInitialization.getInstance());
  }
}