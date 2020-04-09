package creational.singleton;

public class BillPughSingleton {

  public static BillPughSingleton getInstance() {
    return BillPushSingletonHelper.INSTANCE;
  }

  private static class BillPushSingletonHelper {
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  private BillPughSingleton() {

  }
}
