package minecraft;

import com.mojang.serialization.MapCodec;

public class class05271 extends class05261 {
   public static final MapCodec<class05271> N = class03530.N(class04227.Z).fieldOf("tag").xmap(class05271::new, var0 -> var0.y);
   private final class03530<class00891> y;

   public class05271(class03530<class00891> var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean N(class00500 var1, class06069 var2) {
      return var1.N(this.y);
   }

   @Override
   protected class05240<?> N() {
      return class05240.u;
   }
}
