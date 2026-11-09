package minecraft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class class07552 implements BooleanSupplier {
   @Override
   public boolean getAsBoolean() {
      try {
         Files.deleteIfExists(this.N);
         return true;
      } catch (IOException ioexception) {
         class07536.N.warn("Failed to delete", ioexception);
         return false;
      }
   }

   class07552(Path var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return "delete old " + this.N;
   }
}
