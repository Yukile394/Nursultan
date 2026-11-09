package minecraft;

import java.nio.file.Path;
import java.util.function.UnaryOperator;

public class class05279 {
   private final Path N;
   private class05270 y;

   public class05279(Path var1) {
      super();
      this.N = var1;
      this.y = class05270.N(var1);
   }

   public void y() {
      this.y.L(this.N);
   }

   public class05270 N() {
      return this.y;
   }

   public class05279 N(UnaryOperator<class05270> var1) {
      (this.y = var1.apply(this.y)).L(this.N);
      return this;
   }
}
