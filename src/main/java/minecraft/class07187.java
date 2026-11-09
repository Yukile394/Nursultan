package minecraft;

import com.mojang.brigadier.arguments.IntegerArgumentType;

public final class class07187 implements class06763<IntegerArgumentType> {
   final int N;
   final int y;

   class07187(class07201 var1, int var2, int var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   public IntegerArgumentType y(class04348 var1) {
      return IntegerArgumentType.integer(this.N, this.y);
   }

   @Override
   public class06799<IntegerArgumentType, ?> N() {
      return this.L;
   }
}
