package minecraft;

import com.mojang.brigadier.arguments.LongArgumentType;

public final class class04615 implements class06763<LongArgumentType> {
   final long N;
   final long y;

   class04615(class04608 var1, long var2, long var4) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var4;
   }

   public LongArgumentType y(class04348 var1) {
      return LongArgumentType.longArg(this.N, this.y);
   }

   @Override
   public class06799<LongArgumentType, ?> N() {
      return this.L;
   }
}
