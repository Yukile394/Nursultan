package minecraft;

import com.mojang.serialization.MapCodec;

public class class04321 extends class06041 {
   public static final MapCodec<class04321> N = class02142.N(0, 256).fieldOf("count").xmap(class04321::new, var0 -> var0.L);
   private final class02142 L;

   private class04321(class02142 var1) {
      super();
      this.L = var1;
   }

   @Override
   protected int N(class06069 var1, class07209 var2) {
      return this.L.N(var1);
   }

   @Override
   public class04323<?> N() {
      return class04323.R;
   }

   public static class04321 N(class02142 var0) {
      return new class04321(var0);
   }

   public static class04321 N(int var0) {
      return N(class02151.N(var0));
   }
}
