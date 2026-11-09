package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07010 extends class00864 implements class00873, class07132 {
   public static final MapCodec<class07010> N = y(class07010::new);
   private static final class00494 y = class00891.y(12.0, 0.0, 12.0);

   public class07010(class01362 var1) {
      super(var1);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return class04684.L.N(false);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class00500 class00500x = class00869.yo.W();
      class00500 class00500x = class00500x.y(class07749.u, class08059.field_12609);
      class07209 class07209 = var3.method_10084();
      var1.method_8652(var3, class00500x, 2);
      var1.method_8652(class07209, class00500x, 2);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(@Nullable class07438 var1, class07290 var2, class07209 var3, class00500 var4, class04651 var5) {
      return false;
   }

   @Override
   public boolean N(class07284 var1, class07209 var2, class00500 var3, class04688 var4) {
      return false;
   }

   @Override
   public MapCodec<class07010> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.L(var2, var3, class07211.field_11036) && !var1.N(class00869.EI);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return class04688.N(class01231.N) && class04688.R() == 8 ? super.N(var1) : null;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      class00500 class00500 = super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      if (!class00500.P()) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return class00500;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8320(var2.method_10084()).N(class00869.K);
   }
}
