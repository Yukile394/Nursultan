package minecraft;

import java.lang.Thread.UncaughtExceptionHandler;
import org.slf4j.Logger;

public class class05103 implements UncaughtExceptionHandler {
   private final Logger N;

   public class05103(Logger var1) {
      super();
      this.N = var1;
   }

   @Override
   public void uncaughtException(Thread var1, Throwable var2) {
      this.N.error("Caught previously unhandled exception", var2);
   }
}
