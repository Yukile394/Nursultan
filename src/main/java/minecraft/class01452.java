package minecraft;

import com.mojang.serialization.MapCodec;

public class class01452 extends class01471 {
   public static final MapCodec<class01452> y = class00500.N.fieldOf("state").xmap(class01452::new, var0 -> var0.L);
   private final class00500 L;

   public class01452(class00500 var1) {
      super();
      this.L = var1;
   }

   @Override
   protected class01473<?> N() {
      return class01473.N;
   }

   @Override
   public class00500 N(class06069 var1, class07209 var2) {
      return this.L;
   }
}
