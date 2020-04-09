package creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnumSingletonTest {

  @Test
  public void test() {
    assertEquals(EnumSingleton.INSTANCE, EnumSingleton.INSTANCE);
  }
}