package threadsLecture;

/**
 * Created by user on 15.06.2017.
 */
public enum Singleton {
    INSTANCE;
    String someString;
   private Singleton() {
      someString = "dfdf";
    }
}
