package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07749 extends class06761 implements class07132 {
   public static final MapCodec<class07749> L = y(class07749::new);
   public static final class08064<class08059> u = class06761.y;
   private static final class00494 i = class00891.y(12.0, 0.0, 16.0);

   public class07749(class01362 var1) {
      super(var1);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return class04684.L.N(false);
   }

   @Override
   public MapCodec<class07749> N() {
      return L;
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
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.L(var2, var3, class07211.field_11036) && !var1.N(class00869.EI);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return i;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = super.N(var1);
      if (class00500 != null) {
         class04688 class04688 = var1.method_8045().method_8316(var1.method_8037().method_10084());
         if (class04688.N(class01231.N) && class04688.R() == 8) {
            return class00500;
         }
      }

      return null;
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(class00869.yJ);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      if (var1.L(u) == class08059.field_12609) {
         class00500 class00500 = var2.method_8320(var3.method_10074());
         return class00500.N(this) && class00500.L(u) == class08059.field_12607;
      } else {
         class04688 class04688 = var2.method_8316(var3);
         return super.a_(var1, var2, var3) && class04688.N(class01231.N) && class04688.R() == 8;
      }
   }
}
