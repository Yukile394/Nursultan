package minecraft;

import com.mojang.serialization.MapCodec;

public class class03850 extends class03855 {
   public static final class03850 N = new class03850(class06055.N(0));
   public static final MapCodec<class03850> y = class06055.N.fieldOf("value").xmap(class03850::new, class03850::y);
   private final class06055 u;

   private class03850(class06055 var1) {
      super();
      this.u = var1;
   }

   @Override
   public String toString() {
      return this.u.toString();
   }

   public class06055 y() {
      return this.u;
   }

   public static class03850 N(class06055 var0) {
      return new class03850(var0);
   }

   @Override
   public class03862<?> N() {
      return class03862.N;
   }

   @Override
   public int N(class06069 var1, class06057 var2) {
      return this.u.N(var2);
   }
}
