package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class06342 extends class00891 implements class06084, class06344 {
   public static final MapCodec<class06342> N = y(class06342::new);
   public static final class08064<class07211> y = class06665.yb;
   public static final class08064<class06337> L = class06665.yj;
   public static final class06667 u = class06665.q;
   private static final int i = 11;
   private static final int R = 2;
   private static final float M = 0.02F;
   private static final float B = 0.12F;
   private static final int Z = 11;
   private static final float O = 0.17578125F;
   private static final float F = 0.05859375F;
   private static final double A = 0.6;
   private static final float f = 1.0F;
   private static final int C = 40;
   private static final int S = 6;
   private static final float x = 2.5F;
   private static final int D = 2;
   private static final float h = 5.0F;
   private static final float r = 0.011377778F;
   private static final int NN = 7;
   private static final int Ny = 10;
   private static final class00494 NL = class00891.y(6.0, 0.0, 16.0);
   private static final class00494 Nu = class00891.y(6.0, 0.0, 11.0);
   private static final class00494 Ni = class00891.y(6.0, 5.0, 16.0);
   private static final class00494 NR = class00891.y(8.0, 0.0, 16.0);
   private static final class00494 NM = class00891.y(10.0, 0.0, 16.0);
   private static final class00494 NB = class00891.y(12.0, 0.0, 16.0);
   private static final double NZ = Ni.method_1091(class07185.field_11052);
   private static final float Nz = (float)NB.method_1091(class07185.field_11048);
   private static final class00494 NU = class00891.y(4.0, 0.0, 16.0);

   private static boolean L(class05487 var0, class07209 var1, class07211 var2) {
      class07209 class07209 = var1.method_10093(var2.b());
      class00500 class00500 = var0.method_8320(class07209);
      return class00500.L(var0, class07209, var2) || y(class00500, var2);
   }

   public static void L(class00500 var0, class04782 var1, class07209 var2, class06069 var3) {
      class00500 class00500xx = var1.method_8320(var2.method_10086(1));
      class00500 class00500x = var1.method_8320(var2.method_10086(2));
      if (N(class00500xx, class00500x)) {
         class07209 class07209 = N(var0, var1, var2, 7, false);
         if (class07209 != null) {
            class00500 class00500xx = var1.method_8320(class07209);
            if (U(class00500xx) && y(class00500xx, var1, class07209)) {
               if (var3.Z()) {
                  N(var1, class07209, class07211.field_11033);
               } else {
                  y(var1, class07209);
               }
            }
         }
      }
   }

   private static boolean T(class00500 var0) {
      return y(var0, class07211.field_11033);
   }

   public class06342(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11036).y(L, class06337.field_28065).y(u, false));
   }

   private static boolean b(class00500 var0) {
      return y(var0, class07211.field_11036);
   }

   public static boolean U(class00500 var0) {
      return T(var0) && var0.L(L) == class06337.field_28065 && !var0.L(u);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   private static void y(class00500 var0, class07284 var1, class07209 var2) {
      class07209 class07209x;
      class07209 class07209x;
      if (var0.L(y) == class07211.field_11036) {
         class07209x = var2;
         class07209x = var2.method_10084();
      } else {
         class07209x = var2;
         class07209x = var2.method_10074();
      }

      N(var1, class07209x, class07211.field_11033, class06337.field_28064);
      N(var1, class07209x, class07211.field_11036, class06337.field_28064);
   }

   private static boolean y(class00500 var0, class05487 var1, class07209 var2) {
      return T(var0) && !var1.method_8320(var2.method_10084()).N(class00869.vp);
   }

   private static void y(class04782 var0, class07209 var1) {
      class07218 class07218 = var1.method_25503();

      for (int ix = 0; ix < 10; ix++) {
         class07218.N(class07211.field_11033);
         class00500 class00500 = var0.method_8320(class07218);
         if (!class00500.Y().W()) {
            return;
         }

         if (N(class00500, class07211.field_11036) && y(class00500, var0, class07218)) {
            N(var0, class07218, class07211.field_11036);
            return;
         }

         if (L(var0, class07218, class07211.field_11036) && !var0.z(class07218.method_10074())) {
            N(var0, class07218.method_10074(), class07211.field_11036);
            return;
         }

         if (!L((class07290)var0, class07218, class00500)) {
            return;
         }
      }
   }

   @Nullable
   private static class07211 y(class05487 var0, class07209 var1, class07211 var2) {
      class07211 class07211;
      if (L(var0, var1, var2)) {
         class07211 = var2;
      } else {
         if (!L(var0, var1, var2.b())) {
            return null;
         }

         class07211 = var2.b();
      }

      return class07211;
   }

   private static boolean y(class00500 var0, class04782 var1, class07209 var2) {
      class07211 class07211 = var0.L(y);
      class07209 class07209 = var2.method_10093(class07211);
      class00500 class00500 = var1.method_8320(class07209);
      if (!class00500.Y().W()) {
         return false;
      } else {
         return class00500.P() ? true : N(class00500, class07211.b());
      }
   }

   private static boolean y(class00500 var0, class07211 var1) {
      return var0.N(class00869.vp) && var0.L(y) == var1;
   }

   private static Optional<class06336> y(class07299 var0, class07209 var1, class00500 var2) {
      return !T(var2) ? Optional.empty() : N(var0, var1, var2, 11).map(var1x -> {
         class07209 class07209 = var1x.method_10084();
         class00500 class00500 = var0.method_8320(class07209);
         Object object;
         if (class00500.N(class00869.nB) && !var0.method_75728().N(class00608.Y, class07209)) {
            object = class04684.L;
         } else {
            object = var0.method_8316(class07209).N();
         }

         return new class06336(class07209, (class04651)object, class00500);
      });
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      N(var1, var2, var3, var4.z());
      if (var4.z() < 0.011377778F && y(var1, (class05487)var2, var3)) {
         L(var1, var2, var3, var4);
      }
   }

   @Nullable
   private static class07209 N(class07299 var0, class07209 var1, class04651 var2) {
      Predicate predicate = var1x -> var1x.i() instanceof class00865 && ((class00865)var1x.i()).N(var2);
      BiPredicate bipredicate = (var1x, var2x) -> L((class07290)var0, var1x, var2x);
      return N(var0, var1, class07211.field_11033.i(), bipredicate, predicate, 11).orElse(null);
   }

   private static boolean N(class00500 var0, class00500 var1) {
      return var0.N(class00869.vF) && var1.N(class00869.K) && var1.Y().u();
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public MapCodec<class06342> N() {
      return N;
   }

   private static boolean N(class04651 var0) {
      return var0 == class04684.i || var0 == class04684.L;
   }

   private static class07126 N(class07299 var0, class04651 var1, class07209 var2) {
      if (var1.N(class04684.N)) {
         return var0.method_75728().N(class00608.v, var2);
      } else {
         return var1.N(class01231.y) ? class07107.Na : class07107.NF;
      }
   }

   private static boolean L(class07290 var0, class07209 var1, class00500 var2) {
      if (var2.P()) {
         return true;
      } else if (var2.t()) {
         return false;
      } else if (!var2.Y().W()) {
         return false;
      } else {
         class00494 class00494 = var2.M(var0, var1);
         return !class00389.L(NU, class00494, class07003.Z);
      }
   }

   private static Optional<class07209> N(
      class07284 var0, class07209 var1, class07212 var2, BiPredicate<class07209, class00500> var3, Predicate<class00500> var4, int var5
   ) {
      class07211 class07211 = class07211.N(var2, class07185.field_11052);
      class07218 class07218 = var1.method_25503();

      for (int ix = 1; ix < var5; ix++) {
         class07218.N(class07211);
         class00500 class00500 = var0.method_8320(class07218);
         if (var4.test(class00500)) {
            return Optional.of(class07218.method_10062());
         }

         if (var0.method_31601(class07218.method_10264()) || !var3.test(class07218, class00500)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   @Nullable
   public static class07209 N(class07299 var0, class07209 var1) {
      BiPredicate bipredicate = (var1x, var2x) -> L((class07290)var0, var1x, var2x);
      return N(var0, var1, class07211.field_11036.i(), bipredicate, class06342::U, 11).orElse(null);
   }

   public static class04651 N(class04782 var0, class07209 var1) {
      return y(var0, var1, var0.method_8320(var1)).map(var0x -> var0x.y()).filter(class06342::N).orElse(class04684.N);
   }

   public static void N(class00500 var0, class04782 var1, class07209 var2, float var3) {
      if (!(var3 > 0.17578125F) || !(var3 > 0.05859375F)) {
         if (y(var0, (class05487)var1, var2)) {
            Optional<class06336> optional = y(var1, var2, var0);
            if (!optional.isEmpty()) {
               class04651 class04651 = optional.get().y();
               float fx;
               if (class04651 == class04684.L) {
                  fx = 0.17578125F;
               } else {
                  if (class04651 != class04684.i) {
                     return;
                  }

                  fx = 0.05859375F;
               }

               if (!(var3 >= fx)) {
                  class07209 class07209x = N(var0, var1, var2, 11, false);
                  if (class07209x != null) {
                     if (optional.get().L().N(class00869.nB) && class04651 == class04684.L) {
                        class00500 class00500 = class00869.in.W();
                        var1.method_8501(optional.get().N(), class00500);
                        class00891.N_19(optional.get().L(), class00500, var1, optional.get().N());
                        var1.N(class01194.L, optional.get().N(), class01164.N(class00500));
                        var1.N(1504, class07209x, 0);
                     } else {
                        class07209 class07209x = N(var1, class07209x, class04651);
                        if (class07209x != null) {
                           var1.N(1504, class07209x, 0);
                           int ix = class07209x.method_10264() - class07209x.method_10264();
                           int j = 50 + ix;
                           class00500 class00500x = var1.method_8320(class07209x);
                           var1.N(class07209x, class00500x.i(), j);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class07211 class07211x = var1.u().b();
      class07211 class07211x = y(class07299, class07209, class07211x);
      if (class07211x == null) {
         return null;
      } else {
         boolean flag = !var1.method_8046();
         class06337 class06337 = N(class07299, class07209, class07211x, flag);
         return this.W().y(y, class07211x).y(L, class06337).y(u, class07299.method_8316(class07209).N() == class04684.L);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return (switch ((class06337)var1.L(L)) {
         case field_28064 -> NL;
         case field_28065 -> var1.L(y) == class07211.field_11033 ? Ni : Nu;
         case field_28066 -> NR;
         case field_28067 -> NM;
         case field_28068 -> NB;
      }).method_64034(var1.N(var3));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00701 var3) {
      if (!var3.method_5701()) {
         var1.N(1045, var2, 0);
      }
   }

   @Override
   public class07072 N(class07049 var1) {
      return var1.method_48923().L(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      if (var5 != class07211.field_11036 && var5 != class07211.field_11033) {
         return var1;
      } else {
         class07211 class07211 = var1.L(y);
         if (class07211 == class07211.field_11033 && var3.method_8397().N(var4, this)) {
            return var1;
         } else if (var5 == class07211.b() && !this.a_(var1, var2, var4)) {
            if (class07211 == class07211.field_11033) {
               var3.N(var4, this, 2);
            } else {
               var3.N(var4, this, 1);
            }

            return var1;
         } else {
            boolean flag = var1.L(L) == class06337.field_28064;
            class06337 class06337 = N(var2, var4, class07211, flag);
            return var1.y(L, class06337);
         }
      }
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      if (!var1.method_8608()) {
         class07209 class07209 = var3.u();
         if (var1 instanceof class04782 class04782
            && var4.method_36971(class04782, class07209)
            && var4.N(class04782)
            && var4 instanceof class07517
            && var4.method_18798().M() > 0.6) {
            var1.N(class07209, true);
         }
      }
   }

   @Override
   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      if (var2.L(y) == class07211.field_11036 && var2.L(L) == class06337.field_28065) {
         var4.method_5747(var5 + 2.5, 2.0F, var1.method_48963().G());
      } else {
         super.N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (U(var1)) {
         float fx = var4.z();
         if (!(fx > 0.12F)) {
            y(var2, var3, var1).filter(var1x -> fx < 0.02F || N(var1x.y())).ifPresent(var3x -> N(var2, var3, var1, var3x.y(), var3x.N()));
         }
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (b(var1) && !this.a_(var1, (class05487)var2, var3)) {
         var2.N(var3, true);
      } else {
         N(var1, var2, var3);
      }
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class04651 var3, class07209 var4) {
      class06889 class06889 = var2.N(var1);
      double d0 = 0.0625;
      double d1 = var1.method_10263() + 0.5 + class06889.M;
      double d2 = var1.method_10264() + NZ - 0.0625;
      double d3 = var1.method_10260() + 0.5 + class06889.Z;
      class07126 class07126 = N(var0, var3, var4);
      var0.method_8406(class07126, d1, d2, d3, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static class07209 N(class00500 var0, class07284 var1, class07209 var2, int var3, boolean var4) {
      if (N(var0, var4)) {
         return var2;
      } else {
         class07211 class07211 = var0.L(y);
         BiPredicate bipredicate = (var1x, var2x) -> var2x.N(class00869.vp) && var2x.L(y) == class07211;
         return N(var1, var2, class07211.i(), bipredicate, var1x -> N(var1x, var4), var3).orElse(null);
      }
   }

   private static class06337 N(class05487 var0, class07209 var1, class07211 var2, boolean var3) {
      class07211 class07211 = var2.b();
      class00500 class00500 = var0.method_8320(var1.method_10093(var2));
      if (y(class00500, class07211)) {
         return !var3 && class00500.L(L) != class06337.field_28064 ? class06337.field_28065 : class06337.field_28064;
      } else if (!y(class00500, var2)) {
         return class06337.field_28065;
      } else {
         class06337 class06337 = class00500.L(L);
         if (class06337 != class06337.field_28065 && class06337 != class06337.field_28064) {
            return !y(var0.method_8320(var1.method_10093(class07211)), var2) ? class06337.field_28068 : class06337.field_28067;
         } else {
            return class06337.field_28066;
         }
      }
   }

   private static Optional<class07209> N(class07299 var0, class07209 var1, class00500 var2, int var3) {
      class07211 class07211 = var2.L(y);
      BiPredicate bipredicate = (var1x, var2x) -> var2x.N(class00869.vp) && var2x.L(y) == class07211;
      return N(var0, var1, class07211.b().i(), bipredicate, var0x -> !var0x.N(class00869.vp), var3);
   }

   private static boolean N(class00500 var0, boolean var1) {
      if (!var0.N(class00869.vp)) {
         return false;
      } else {
         class06337 class06337 = var0.L(L);
         return class06337 == class06337.field_28065 || var1 && class06337 == class06337.field_28064;
      }
   }

   private static boolean N(class00500 var0, class07211 var1) {
      return N(var0, false) && var0.L(y) == var1;
   }

   private static void N(class00500 var0, class04782 var1, class07209 var2) {
      class07218 class07218 = var2.method_25503();
      class00500 class00500 = var0;

      while (T(class00500)) {
         class00701 class00701 = class00701.N(var1, class07218, class00500);
         if (N(class00500, true)) {
            int ix = Math.max(1 + var2.method_10264() - class07218.method_10264(), 6);
            float fx = 1.0F * ix;
            class00701.N(fx, 40);
            break;
         }

         class07218.N(class07211.field_11033);
         class00500 = var1.method_8320(class07218);
      }
   }

   private static void N(class04782 var0, class07209 var1, class07211 var2) {
      class07209 class07209 = var1.method_10093(var2);
      class00500 class00500 = var0.method_8320(class07209);
      if (N(class00500, var2.b())) {
         y(class00500, (class07284)var0, class07209);
      } else if (class00500.P() || class00500.N(class00869.K)) {
         N(var0, class07209, var2, class06337.field_28065);
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2) {
      y(var0, var1, var2).ifPresent(var3 -> N(var0, var1, var2, var3.y(), var3.N()));
   }

   private static void N(class07284 var0, class07209 var1, class07211 var2, class06337 var3) {
      class00500 class00500 = class00869.vp.W().y(y, var2).y(L, var3).y(u, var0.method_8316(var1).N() == class04684.L);
      var0.method_8652(var1, class00500, 3);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return L(var2, var3, var1.L(y));
   }

   @Override
   protected boolean a_(class00500 var1, class07290 var2, class07209 var3) {
      return false;
   }

   @Override
   protected float G() {
      return Nz;
   }
}
