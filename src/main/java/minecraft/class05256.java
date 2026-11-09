package minecraft;

import com.mojang.serialization.MapCodec;

public class class05256 extends class05261 {
   public static final MapCodec<class05256> N = class00500.N.fieldOf("block_state").xmap(class05256::new, var0 -> var0.y);
   private final class00500 y;

   public class05256(class00500 var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean N(class00500 var1, class06069 var2) {
      return var1 == this.y;
   }

   @Override
   protected class05240<?> N() {
      return class05240.L;
   }
}
