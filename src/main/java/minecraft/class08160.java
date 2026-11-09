package minecraft;

import com.mojang.serialization.MapCodec;

public class class08160 implements class08164 {
   public static final class08160 y = new class08160();
   public static final MapCodec<class08160> L = MapCodec.unit(y);

   private class08160() {
      super();
   }

   @Override
   public boolean N(class08152 var1) {
      return true;
   }

   @Override
   public MapCodec<class08160> N() {
      return L;
   }
}
