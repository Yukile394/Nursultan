package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class class05580 extends class08815 implements class00873 {
   public static final MapCodec<class05580> N = y(class05580::new);
   private final class04090 i = new class04090(this);

   public class05580(class01362 var1) {
      super(var1);
   }

   @Override
   public class04090 y() {
      return this.i;
   }

   @Override
   protected boolean y(class00500 var1) {
      return var1.Y().W();
   }

   public static ToIntFunction<class00500> y(int var0) {
      return var1 -> class05543.T(var1) ? var0 : 0;
   }

   @Override
   public MapCodec<class05580> N() {
      return N;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      this.i.N(var4, var1, var3, var2);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return class07211.N().anyMatch(var4 -> this.i.N(var3, var1, var2, var4.b()));
   }
}
