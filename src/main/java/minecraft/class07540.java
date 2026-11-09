package minecraft;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class class07540 implements BooleanSupplier {
   @Override
   public boolean getAsBoolean() {
      return !Files.exists(this.N);
   }

   class07540(Path var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return "verify that " + this.N + " is deleted";
   }
}
