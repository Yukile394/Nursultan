package minecraft;

import com.mojang.brigadier.arguments.FloatArgumentType;

public final class class07195 implements class06763<FloatArgumentType> {
   final float N;
   final float y;

   class07195(class07198 var1, float var2, float var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   public FloatArgumentType y(class04348 var1) {
      return FloatArgumentType.floatArg(this.N, this.y);
   }

   @Override
   public class06799<FloatArgumentType, ?> N() {
      return this.L;
   }
}
