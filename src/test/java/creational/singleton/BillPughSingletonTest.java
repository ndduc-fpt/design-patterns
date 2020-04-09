package creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class BillPughSingletonTest {

  @Test
  public void getInstance() {
    assertEquals(BillPughSingleton.getInstance(), BillPughSingleton.getInstance());
  }
}