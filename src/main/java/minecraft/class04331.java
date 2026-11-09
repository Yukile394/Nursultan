package minecraft;

import com.mojang.serialization.MapCodec;

public class class04331 extends class04050 {
   public static final MapCodec<class04331> N = class06338.b.fieldOf("chance").xmap(class04331::new, var0 -> var0.L);
   private final int L;

   private class04331(int var1) {
      super();
      this.L = var1;
   }

   @Override
   protected boolean y(class01034 var1, class06069 var2, class07209 var3) {
      return var2.z() < 1.0F / this.L;
   }

   @Override
   public class04323<?> N() {
      return class04323.y;
   }

   public static class04331 N(int var0) {
      return new class04331(var0);
   }
}
