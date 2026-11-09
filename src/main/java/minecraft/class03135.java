package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class03135 extends class00891 {
   public static final MapCodec<class03135> N = y(class03135::new);
   public static final class06667 y = class06665.k;
   public static final class06667 L = class06665.n;

   public class03135(class01362 var1) {
      super(var1);
      this.P(this.W().y(L, false).y(y, false));
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, y);
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return var2.method_8320(var3).L(L) ? 15 : 0;
   }

   @Override
   protected MapCodec<? extends class03135> N() {
      return N;
   }

   public void N(class00500 var1, class04782 var2, class07209 var3) {
      boolean flag = var2.W(var3);
      if (flag != var1.L(y)) {
         class00500 class00500 = var1;
         if (!var1.L(y)) {
            class00500 = var1.N(L);
            var2.N(null, var3, class00500.L(L) ? class04909.MB : class04909.MZ, class04911.field_15245);
         }

         var2.method_8652(var3, class00500.y(y, flag), 3);
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (var2 instanceof class04782 class04782) {
         this.N(var1, class04782, var3);
      }
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (var4.i() != var1.i() && var2 instanceof class04782 class04782) {
         this.N(var1, class04782, var3);
      }
   }
}
