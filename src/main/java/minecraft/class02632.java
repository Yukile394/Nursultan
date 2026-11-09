package minecraft;

import java.util.OptionalInt;

public class class02632 {
   private class02627 N = (var0, var1) -> class06758.N(var0, 0.7, new class06889(0.0, 0.1, 0.0));
   private float y = 6.0F;
   private float L = 1.1F;
   private OptionalInt u = OptionalInt.empty();

   public class02632() {
      super();
   }

   public class02632 y(float var1) {
      this.L = var1;
      return this;
   }

   public class02649 N() {
      return new class02649(this.N, this.y, this.L, this.u);
   }

   public class02632 N(int var1) {
      this.u = OptionalInt.of(var1);
      return this;
   }

   public class02632 N(class02627 var1) {
      this.N = var1;
      return this;
   }

   public class02632 N(float var1) {
      this.y = var1;
      return this;
   }
}
