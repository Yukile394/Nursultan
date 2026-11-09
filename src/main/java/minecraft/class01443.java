package minecraft;

import com.mojang.serialization.MapCodec;

public class class01443 extends class01471 {
   public static final MapCodec<class01443> y = class00500.N.fieldOf("state").xmap(class01339::i, class00891::W).xmap(class01443::new, var0 -> var0.L);
   private final class00891 L;

   public class01443(class00891 var1) {
      super();
      this.L = var1;
   }

   @Override
   protected class01473<?> N() {
      return class01473.R;
   }

   @Override
   public class00500 N(class06069 var1, class07209 var2) {
      class07185 class07185 = class07185.N(var1);
      return this.L.W().L(class07004.L, class07185);
   }
}
