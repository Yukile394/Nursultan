package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class05847 extends class07796 implements class06084 {
   public static final MapCodec<class05847> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("spawn_particles").forGetter(var0x -> var0x.Z), Codec.intRange(0, 1000).fieldOf("fire_damage").forGetter(var0x -> var0x.O), t()
         )
         .apply(var0, class05847::new)
   );
   public static final class06667 y = class06665.n;
   public static final class06667 L = class06665.O;
   public static final class06667 u = class06665.q;
   public static final class08064<class07211> i = class06665.f;
   private static final class00494 R = class00891.y(16.0, 0.0, 7.0);
   private static final class00494 M = class00891.y(4.0, 0.0, 16.0);
   private static final int B = 5;
   private final boolean Z;
   private final int O;

   public static boolean T(class00500 var0) {
      return var0.N(class01210.yB, var0x -> var0x.y(u) && var0x.y(y)) && !var0.L(u) && !var0.L(y);
   }

   public class05847(boolean var1, int var2, class01362 var3) {
      super(var3);
      this.Z = var1;
      this.O = var2;
      this.P(this.Q.y().y(y, true).y(L, false).y(u, false).y(i, class07211.field_11043));
   }

   private boolean b(class00500 var1) {
      return var1.N(class00869.zy);
   }

   public static boolean U(class00500 var0) {
      return var0.y(y) && var0.N(class01210.yB) && var0.L(y);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      if (var1 instanceof class04782 class04782) {
         if (var2.L(y)) {
            class06485 class06485 = class06482.N(class05838.i);
            return N(var3, class00404.field_17380, (var2x, var3x, var4x, var5x) -> class05875.N(class04782, var3x, var4x, var5x, class06485));
         } else {
            return N(var3, class00404.field_17380, class05875::N);
         }
      } else {
         return var2.L(y) ? N(var3, class00404.field_17380, class05875::y) : null;
      }
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class05875(var1, var2);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(i)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u, i);
   }

   @Override
   public MapCodec<class05847> N() {
      return N;
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var3.method_8321(var4) instanceof class05875 class05875) {
         class06584 class06584 = var5.method_5998(var6);
         if (var3.method_8433().N(class00263.B).N(class06584)) {
            if (var3 instanceof class04782 class04782 && class05875.N(class04782, var5, class06584)) {
               var5.method_7281(class01235.Nl);
               return class07082.y;
            }

            return class07082.L;
         }
      }

      return class07082.R;
   }

   @Override
   public boolean N(class07284 var1, class07209 var2, class00500 var3, class04688 var4) {
      if (!var3.L(class06665.q) && var4.N() == class04684.L) {
         if (var3.L(y)) {
            if (!var1.method_8608()) {
               var1.method_8396(null, var2, class04909.Ef, class04911.field_15245, 1.0F, 1.0F);
            }

            N(null, var1, var2, var3);
         }

         var1.method_8652(var2, var3.y(u, true).y(y, false), 3);
         var1.N(var2, var4.N(), var4.N().N(var1));
         return true;
      } else {
         return false;
      }
   }

   public static void N(@Nullable class07049 var0, class07284 var1, class07209 var2, class00500 var3) {
      if (var1.method_8608()) {
         for (int ix = 0; ix < 20; ix++) {
            N((class07299)var1, var2, var3.L(L), true);
         }
      }

      var1.N(var0, class01194.L, var2);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(y)) {
         if (var4.y(10) == 0) {
            var2.method_8486(
               var3.method_10263() + 0.5,
               var3.method_10264() + 0.5,
               var3.method_10260() + 0.5,
               class04909.iz,
               class04911.field_15245,
               0.5F + var4.z(),
               var4.z() * 0.7F + 0.6F,
               false
            );
         }

         if (this.Z && var4.y(5) == 0) {
            for (int ix = 0; ix < var4.y(1) + 1; ix++) {
               var2.method_8406(
                  class07107.NL, var3.method_10263() + 0.5, var3.method_10264() + 0.5, var3.method_10260() + 0.5, var4.z() / 2.0F, 5.0E-5, var4.z() / 2.0F
               );
            }
         }
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return R;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      boolean flag = class07299.method_8316(class07209).N() == class04684.L;
      return this.W().y(u, flag).y(L, this.b(class07299.method_8320(class07209.method_10074()))).y(y, !flag).y(i, var1.method_8042());
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return var5 == class07211.field_11033 ? var1.y(L, this.b(var7)) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(i, var2.N(var1.L(i)));
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var1.L(y) && var4 instanceof class07438) {
         var4.method_64419(var2.method_48963().y(), this.O);
      }

      super.N(var1, var2, var3, var4, var5, var6);
   }

   public static boolean N(class07299 var0, class07209 var1) {
      for (int ix = 1; ix <= 5; ix++) {
         class07209 class07209 = var1.method_10087(ix);
         class00500 class00500 = var0.method_8320(class07209);
         if (U(class00500)) {
            return true;
         }

         if (class00389.L(M, class00500.y(var0, var1, class06092.N()), class07003.Z)) {
            return U(var0.method_8320(class07209.method_10074()));
         }
      }

      return false;
   }

   public static void N(class07299 var0, class07209 var1, boolean var2, boolean var3) {
      class06069 class06069 = var0.method_8409();
      class07134 class07134 = var2 ? class07107.Nd : class07107.Nl;
      var0.method_17452(
         class07134,
         true,
         var1.method_10263() + 0.5 + class06069.U() / 3.0 * (class06069.Z() ? 1 : -1),
         var1.method_10264() + class06069.U() + class06069.U(),
         var1.method_10260() + 0.5 + class06069.U() / 3.0 * (class06069.Z() ? 1 : -1),
         0.0,
         0.07,
         0.0
      );
      if (var3) {
         var0.method_8406(
            class07107.NZ,
            var1.method_10263() + 0.5 + class06069.U() / 4.0 * (class06069.Z() ? 1 : -1),
            var1.method_10264() + 0.4,
            var1.method_10260() + 0.5 + class06069.U() / 4.0 * (class06069.Z() ? 1 : -1),
            0.0,
            0.005,
            0.0
         );
      }
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      class07209 class07209 = var3.u();
      if (var1 instanceof class04782 class04782 && var4.method_5809() && var4.method_36971(class04782, class07209) && !var2.L(y) && !var2.L(u)) {
         var1.method_8652(class07209, var2.y(class06665.n, true), 11);
      }
   }
}
