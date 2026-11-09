package minecraft;

import com.mojang.serialization.MapCodec;

public class class05244 extends class05261 {
   public static final MapCodec<class05244> N = class04206.i.T().fieldOf("block").xmap(class05244::new, var0 -> var0.y);
   private final class00891 y;

   public class05244(class00891 var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean N(class00500 var1, class06069 var2) {
      return var1.N(this.y);
   }

   @Override
   protected class05240<?> N() {
      return class05240.y;
   }
}
