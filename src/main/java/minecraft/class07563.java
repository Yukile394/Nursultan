package minecraft;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class class07563 implements BooleanSupplier {
   @Override
   public boolean getAsBoolean() {
      try {
         Files.move(this.N, this.y);
         return true;
      } catch (IOException ioexception) {
         class07536.N.error("Failed to rename", ioexception);
         return false;
      }
   }

   class07563(Path var1, Path var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return "rename " + this.N + " to " + this.y;
   }
}
