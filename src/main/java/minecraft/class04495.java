package minecraft;

import org.slf4j.Logger;

public class class04495 extends class04482 implements AutoCloseable {
   private final Logger L;

   public class04495(Logger var1) {
      super();
      this.L = var1;
   }

   public class04495(class04489 var1, Logger var2) {
      super(var1);
      this.L = var2;
   }

   @Override
   public void close() {
      if (!this.N()) {
         this.L.warn("[{}] Serialization errors:\n{}", this.L.getName(), this.L());
      }
   }
}
