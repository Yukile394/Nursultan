package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06106 extends class00891 {
   public static final MapCodec<class06106> N = y(class06106::new);
   private static final class00392 y = class00392.L("container.cartography_table");

   public class06106(class01362 var1) {
      super(var1);
   }

   @Override
   public MapCodec<class06106> N() {
      return N;
   }

   @Nullable
   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      return new class03965((var2x, var3x, var4) -> new class06231(var2x, var3x, class05880.N(var2, var3)), y);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608()) {
         var4.method_17355(var1.N(var2, var3));
         var4.method_7281(class01235.Nd);
      }

      return class07082.N;
   }
}
