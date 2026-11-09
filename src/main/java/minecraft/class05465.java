package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public abstract class class05465 extends class00891 {
   public static final int N = 3;
   public static final class06667 y = class06665.n;

   public static boolean T(class00500 var0) {
      return var0.y(y) && (var0.N(class01210.C) || var0.N(class01210.yl)) && var0.L(y);
   }

   protected class05465(class01362 var1) {
      super(var1);
   }

   protected boolean b(class00500 var1) {
      return !var1.L(y);
   }

   protected abstract Iterable<class06889> U(class00500 var1);

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class07307 var4, BiConsumer<class06584, class07209> var5) {
      if (var4.M() && var1.L(y)) {
         N(null, var1, var2, var3);
      }

      super.N(var1, var2, var3, var4, var5);
   }

   private static void N(class07284 var0, class00500 var1, class07209 var2, boolean var3) {
      var0.method_8652(var2, var1.y(y, var3), 11);
   }

   @Override
   protected abstract MapCodec<? extends class05465> N();

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      if (!var1.method_8608() && var4.method_5809() && this.b(var2)) {
         N(var1, var2, var3.u(), true);
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(y)) {
         this.U(var1).forEach(var3x -> N(var2, var3x.y(var3.method_10263(), var3.method_10264(), var3.method_10260()), var4));
      }
   }

   private static void N(class07299 var0, class06889 var1, class06069 var2) {
      float f = var2.z();
      if (f < 0.3F) {
         var0.method_8406(class07107.NZ, var1.M, var1.B, var1.Z, 0.0, 0.0, 0.0);
         if (f < 0.17F) {
            var0.method_8486(var1.M + 0.5, var1.B + 0.5, var1.Z + 0.5, class04909.iU, class04911.field_15245, 1.0F + var2.z(), var2.z() * 0.7F + 0.3F, false);
         }
      }

      var0.method_8406(class07107.Nc, var1.M, var1.B, var1.Z, 0.0, 0.0, 0.0);
   }

   public static void N(@Nullable class08036 var0, class00500 var1, class07284 var2, class07209 var3) {
      N(var2, var1, var3, false);
      if (var1.i() instanceof class05465) {
         ((class05465)var1.i())
            .U(var1)
            .forEach(
               var2x -> var2.method_8406(
                  class07107.NZ, var3.method_10263() + var2x.N(), var3.method_10264() + var2x.y(), var3.method_10260() + var2x.L(), 0.0, 0.1F, 0.0
               )
            );
      }

      var2.method_8396(null, var3, class04909.iW, class04911.field_15245, 1.0F, 1.0F);
      var2.N(var0, class01194.L, var3);
   }
}
