package minecraft;

import java.lang.Thread.UncaughtExceptionHandler;
import org.slf4j.Logger;

public class class07980 implements UncaughtExceptionHandler {
   private final Logger N;

   public class07980(Logger var1) {
      super();
      this.N = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.N.error("Caught previously unhandled exception :", var2);
   }
}
