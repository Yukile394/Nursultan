package minecraft;

import java.util.Arrays;

public class class03620 implements class03621 {
   private final class03621[] N;

   public class03620(class03621... var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return "MultipliedFloats" + Arrays.toString((Object[])this.N);
   }

   @Override
   public float N(class06069 var1) {
      float f = 1.0F;

      for (class03621 class03621 : this.N) {
         f *= class03621.N(var1);
      }

      return f;
   }
}
