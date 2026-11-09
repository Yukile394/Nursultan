package minecraft;

import com.mojang.brigadier.arguments.DoubleArgumentType;

public final class class07213 implements class06763<DoubleArgumentType> {
   final double N;
   final double y;

   class07213(class07224 var1, double var2, double var4) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var4;
   }

   public DoubleArgumentType y(class04348 var1) {
      return DoubleArgumentType.doubleArg(this.N, this.y);
   }

   @Override
   public class06799<DoubleArgumentType, ?> N() {
      return this.L;
   }
}
