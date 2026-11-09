package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01096 extends class00865 {
   public static final MapCodec<class01096> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00801.field_46251.fieldOf("precipitation").forGetter(var0x -> var0x.F), class04823.y.fieldOf("interactions").forGetter(var0x -> var0x.L), t()
         )
         .apply(var0, class01096::new)
   );
   public static final int i = 1;
   public static final int R = 3;
   public static final class08071 M = class06665.NX;
   private static final int B = 6;
   private static final double Z = 3.0;
   private static final class00494[] O = class07536.N(() -> class00891.N(2, var0 -> class00389.N(class00865.y, class00891.y(12.0, 4.0, y(var0 + 1)))));
   private final class00801 F;

   public static void L(class00500 var0, class07299 var1, class07209 var2) {
      int ix = var0.L(M) - 1;
      class00500 class00500 = ix == 0 ? class00869.MZ.W() : var0.y(M, ix);
      var1.method_8501(var2, class00500);
      var1.N(class01194.L, var2, class01164.N(class00500));
   }

   public class01096(class00801 var1, class04835 var2, class01362 var3) {
      super(var3, var2);
      this.F = var1;
      this.P(this.Q.y().y(M, 1));
   }

   @Override
   protected double U(class00500 var1) {
      return y(var1.L(M)) / 16.0;
   }

   private void u(class00500 var1, class07299 var2, class07209 var3) {
      if (this.F == class00801.field_9383) {
         L(class00869.Mz.W().y(M, var1.L(M)), var2, var3);
      } else {
         L(var1, var2, var3);
      }
   }

   private static double y(int var0) {
      return 6.0 + var0 * 3.0;
   }

   @Override
   public boolean E(class00500 var1) {
      return var1.L(M) == 3;
   }

   @Override
   public MapCodec<class01096> N() {
      return u;
   }

   @Override
   public void N_4(class00500 var1, class07299 var2, class07209 var3, class00801 var4) {
      if (class05476.N(var2, var4) && var1.L(M) != 3 && var4 == this.F) {
         class00500 class00500 = var1.N(M);
         var2.method_8501(var3, class00500);
         var2.N(class01194.L, var3, class01164.N(class00500));
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var2 instanceof class04782 class04782) {
         class07209 class07209 = var3.method_10062();
         var5.N(class08397.field_56645, var5x -> {
            if (var5x.method_5809() && var5x.method_36971(class04782, class07209)) {
               this.u(var1, var2, class07209);
            }
         });
      }

      var5.N(class08397.field_56645);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class07049 var4) {
      return O[var1.L(M) - 1];
   }

   @Override
   protected boolean N(class04651 var1) {
      return var1 == class04684.L && this.F == class00801.field_9382;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return var1.L(M);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(M);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class04651 var4) {
      if (!this.E(var1)) {
         class00500 class00500 = var1.y(M, var1.L(M) + 1);
         var2.method_8501(var3, class00500);
         var2.N(class01194.L, var3, class01164.N(class00500));
         var2.N(1047, var3, 0);
      }
   }
}
