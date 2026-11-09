package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;
import java.util.Set;
import net.caffeinemc.mods.lithium.common.ai.pathing.PathNodeCache;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07955 extends class02119 {
   public static final double y = 0.5;
   private static final double N = 1.125;
   private final Long2ObjectMap<class04425> W = new Long2ObjectOpenHashMap();
   private final Object2BooleanMap<class00734> m = new Object2BooleanOpenHashMap();
   private final class01763[] P = new class01763[class07221.field_11062.y()];

   protected boolean L() {
      return false;
   }

   protected double L(class07209 var1) {
      class07322 class07322 = this.L.N();
      return (this.R() || this.L()) && class07322.method_8316(var1).N(class01231.N) ? var1.method_10264() + 0.5 : N(class07322, var1);
   }

   public class07955() {
      super();
   }

   private double B() {
      return Math.max(1.125, (double)this.u.method_49476());
   }

   private class01763 u(int var1, int var2, int var3) {
      for (int i = var2 - 1; i >= this.u.method_73183().method_31607(); i--) {
         if (var2 - i > this.u.method_5850()) {
            return this.y(var1, i, var3);
         }

         class04425 class04425 = this.N(var1, i, var3);
         float f = this.u.N(class04425);
         if (class04425 != class04425.field_7) {
            if (f >= 0.0F) {
               return this.N(var1, i, var3, class04425, f);
            }

            return this.y(var1, i, var3);
         }
      }

      return this.y(var1, var2, var3);
   }

   private boolean y(class01763 var1) {
      class00734 class00734 = this.u.method_5829();
      class06889 class06889 = new class06889(
         var1.N - this.u.method_23317() + class00734.y() / 2.0,
         var1.y - this.u.method_23318() + class00734.L() / 2.0,
         var1.L - this.u.method_23321() + class00734.u() / 2.0
      );
      int i = class04995.L(class06889.M() / class00734.N());
      class06889 = class06889.L((double)(1.0F / i));

      for (int j = 1; j <= i; j++) {
         class00734 = class00734.L(class06889);
         if (this.N(class00734)) {
            return false;
         }
      }

      return true;
   }

   private static void y(class07290 var0, class07209 var1, CallbackInfoReturnable var2, class00500 var3) {
      class04425 class04425 = LandPathNodeTypesRegistry.getPathNodeType(var3, var0, var1, false);
      if (class04425 != null) {
         var2.setReturnValue(class04425);
      }
   }

   private static class04425 y(class02682 var0, int var1, int var2, int var3, class04425 var4) {
      return PathNodeCache.getNodeTypeFromNeighbors(var0, var1, var2, var3, var4);
   }

   public static class04425 y(class07290 var0, class07209 var1) {
      class00500 class00500 = var0.method_8320(var1);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, var1, callbackinforeturnable, class00500);
      if (callbackinforeturnable.isCancelled()) {
         return (class04425)callbackinforeturnable.getReturnValue();
      } else {
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
         y(var0, var1, callbackinforeturnable1, class00500);
         if (callbackinforeturnable1.isCancelled()) {
            return (class04425)callbackinforeturnable1.getReturnValue();
         } else {
            class00891 class00891 = class00500.i();
            if (class00500.P()) {
               return class04425.field_7;
            } else if (class00500.N(class01210.X) || class00500.N(class00869.RS) || class00500.N(class00869.nL)) {
               return class04425.field_19;
            } else if (class00500.N(class00869.ba)) {
               return class04425.field_33534;
            } else if (class00500.N(class00869.ij) || class00500.N(class00869.sM)) {
               return class04425.field_17;
            } else if (class00500.N(class00869.TM)) {
               return class04425.field_21326;
            } else if (class00500.N(class00869.Mb)) {
               return class04425.field_21516;
            } else if (!class00500.N(class00869.Lm) && !class00500.N(class00869.vp)) {
               class04688 class04688 = class00500.Y();
               if (class04688.N(class01231.y)) {
                  return class04425.field_14;
               } else if (N(class00500)) {
                  return class04425.field_3;
               } else if (class00891 instanceof class07196 class07196) {
                  if (class00500.L(class07196.i)) {
                     return class04425.field_15;
                  } else {
                     return class07196.y().L() ? class04425.field_23 : class04425.field_8;
                  }
               } else if (class00891 instanceof class07760) {
                  return class04425.field_21;
               } else if (class00891 instanceof class07131) {
                  return class04425.field_6;
               } else if (!class00500.N(class01210.A) && !class00500.N(class01210.q) && (!(class00891 instanceof class07188) || class00500.L(class07188.y))) {
                  if (!class00500.N(class08791.field_50)) {
                     return class04425.field_22;
                  } else {
                     return class04688.N(class01231.N) ? class04425.field_18 : class04425.field_7;
                  }
               } else {
                  return class04425.field_10;
               }
            } else {
               return class04425.field_43351;
            }
         }
      }
   }

   private class01763 y(int var1, int var2, int var3) {
      class01763 class01763 = this.L(var1, var2, var3);
      class01763.E = class04425.field_22;
      class01763.U = -1.0F;
      return class01763;
   }

   public Set<class04425> y(class02682 var1, int var2, int var3, int var4) {
      EnumSet<class04425> enumset = EnumSet.noneOf(class04425.class);

      for (int i = 0; i < this.R; i++) {
         for (int j = 0; j < this.M; j++) {
            for (int k = 0; k < this.B; k++) {
               int l = i + var2;
               int i1 = j + var3;
               int j1 = k + var4;
               class04425 class04425 = this.N(var1, l, i1, j1);
               class07209 class07209 = this.u.method_24515();
               boolean flag = this.u();
               if (class04425 == class04425.field_23 && this.i() && flag) {
                  class04425 = class04425.field_26446;
               }

               if (class04425 == class04425.field_15 && !flag) {
                  class04425 = class04425.field_22;
               }

               if (class04425 == class04425.field_21
                  && this.N(var1, class07209.method_10263(), class07209.method_10264(), class07209.method_10260()) != class04425.field_21
                  && this.N(var1, class07209.method_10263(), class07209.method_10264() - 1, class07209.method_10260()) != class04425.field_21) {
                  class04425 = class04425.field_25418;
               }

               enumset.add(class04425);
            }
         }
      }

      return enumset;
   }

   protected boolean y(class07209 var1) {
      class04425 class04425 = this.N(var1.method_10263(), var1.method_10264(), var1.method_10260());
      return class04425 != class04425.field_7 && this.u.N(class04425) >= 0.0F;
   }

   @Override
   public class01763 y() {
      class07218 class07218 = new class07218();
      int i = this.u.method_31478();
      class00500 class00500x = this.L.N(class07218.N(this.u.method_23317(), (double)i, this.u.method_23321()));
      if (!this.u.method_26319(class00500x.Y())) {
         if (this.R() && this.u.method_5799()) {
            while (true) {
               if (!class00500x.N(class00869.K) && class00500x.Y() != class04684.L.N(false)) {
                  i--;
                  break;
               }

               class00500x = this.L.N(class07218.N(this.u.method_23317(), (double)(++i), this.u.method_23321()));
            }
         } else if (this.u.method_24828()) {
            i = class04995.N(this.u.method_23318() + 0.5);
         } else {
            class07218.N(this.u.method_23317(), this.u.method_23318() + 1.0, this.u.method_23321());

            while (class07218.method_10264() > this.L.N().method_31607()) {
               i = class07218.method_10264();
               class07218.method_10099(class07218.method_10264() - 1);
               class00500 class00500x = this.L.N(class07218);
               if (!class00500x.P() && !class00500x.N(class08791.field_50)) {
                  break;
               }
            }
         }
      } else {
         while (this.u.method_26319(class00500x.Y())) {
            class00500x = this.L.N(class07218.N(this.u.method_23317(), (double)(++i), this.u.method_23321()));
         }

         i--;
      }

      class07209 class07209 = this.u.method_24515();
      if (!this.y(class07218.N(class07209.method_10263(), i, class07209.method_10260()))) {
         class00734 class00734 = this.u.method_5829();
         if (this.y(class07218.N(class00734.N, (double)i, class00734.L))
            || this.y(class07218.N(class00734.N, (double)i, class00734.R))
            || this.y(class07218.N(class00734.u, (double)i, class00734.L))
            || this.y(class07218.N(class00734.u, (double)i, class00734.R))) {
            return this.N(class07218);
         }
      }

      return this.N(new class07209(class07209.method_10263(), i, class07209.method_10260()));
   }

   public static class04425 N(class07079 var0, class07209 var1) {
      return N(new class02682(var0.method_73183(), var0), var1.method_25503());
   }

   @Override
   public class04425 N(class02682 var1, int var2, int var3, int var4) {
      return N(var1, new class07218(var2, var3, var4));
   }

   public static class04425 N(class02682 var0, class07218 var1) {
      int i = var1.method_10263();
      int j = var1.method_10264();
      int k = var1.method_10260();
      class04425 class04425 = var0.N(i, j, k);
      if (class04425 == class04425.field_7 && j >= var0.N().method_31607() + 1) {
         return switch (var0.N(i, j - 1, k)) {
            case field_7, field_18, field_14, field_12 -> class04425.field_7;
            case field_3 -> class04425.field_3;
            case field_17 -> class04425.field_17;
            case field_21326 -> class04425.field_21326;
            case field_33534 -> class04425.field_36432;
            case field_43351 -> class04425.field_43351;
            case field_19 -> class04425.field_47413;
            default -> y(var0, i, j, k, class04425.field_12);
         };
      } else {
         return class04425;
      }
   }

   protected class01763 N(class07209 var1) {
      class01763 class01763 = this.u(var1);
      class01763.E = this.N(class01763.N, class01763.y, class01763.L);
      class01763.U = this.u.N(class01763.E);
      return class01763;
   }

   @Override
   public class04425 N(class02682 var1, int var2, int var3, int var4, class07079 var5) {
      Set<class04425> set = this.y(var1, var2, var3, var4);
      if (set.contains(class04425.field_10)) {
         return class04425.field_10;
      } else if (set.contains(class04425.field_25418)) {
         return class04425.field_25418;
      } else {
         class04425 class04425x = class04425.field_22;

         for (class04425 class04425x : set) {
            if (var5.N(class04425x) < 0.0F) {
               return class04425x;
            }

            if (var5.N(class04425x) >= var5.N(class04425x)) {
               class04425x = class04425x;
            }
         }

         return this.R <= 1 && class04425x != class04425.field_7 && var5.N(class04425x) == 0.0F && this.N(var1, var2, var3, var4) == class04425.field_7
            ? class04425.field_7
            : class04425x;
      }
   }

   protected class04425 N(int var1, int var2, int var3) {
      return (class04425)this.W.computeIfAbsent(class07209.method_10064(var1, var2, var3), var4 -> this.N(this.L, var1, var2, var3, this.u));
   }

   private static void N(class07290 var0, class07209 var1, CallbackInfoReturnable var2, class00500 var3) {
      class04425 class04425 = PathNodeCache.getPathNodeType(var3);
      if (class04425 != null) {
         var2.setReturnValue(class04425);
      }
   }

   private static void N(class02682 var0, int var1, int var2, int var3, class04425 var4, CallbackInfoReturnable var5, int var6, int var7, int var8) {
      if (var4 == null && (var6 != -1 || var7 != -1 || var8 != -1)) {
         var5.setReturnValue(null);
      }
   }

   @Override
   public void N() {
      this.u.a();
      this.W.clear();
      this.m.clear();
      super.N();
   }

   @Override
   public void N(class00783 var1, class07079 var2) {
      super.N(var1, var2);
      var2.X();
   }

   public static class04425 N(class02682 var0, int var1, int var2, int var3, class04425 var4) {
      for (int i = -1; i <= 1; i++) {
         for (int j = -1; j <= 1; j++) {
            for (int k = -1; k <= 1; k++) {
               if (i != 0 || k != 0) {
                  int l = var1 + i;
                  int i1 = var2 + j;
                  CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
                  N(var0, var1, var2, var3, var4, callbackinforeturnable, i, j, k);
                  if (callbackinforeturnable.isCancelled()) {
                     return (class04425)callbackinforeturnable.getReturnValue();
                  }

                  class04425 class04425 = var0.N(l, i1, var3 + k);
                  if (class04425 == class04425.field_17) {
                     return class04425.field_5;
                  }

                  if (class04425 == class04425.field_3 || class04425 == class04425.field_14) {
                     return class04425.field_9;
                  }

                  if (class04425 == class04425.field_18) {
                     return class04425.field_4;
                  }

                  if (class04425 == class04425.field_43351) {
                     return class04425.field_43351;
                  }
               }
            }
         }
      }

      return var4;
   }

   public static double N(class07290 var0, class07209 var1) {
      class07209 class07209 = var1.method_10074();
      class00494 class00494 = var0.method_8320(class07209).M(var0, class07209);
      return class07209.method_10264() + (class00494.method_1110() ? 0.0 : class00494.method_1105(class07185.field_11052));
   }

   protected boolean N(@Nullable class01763 var1, class01763 var2) {
      return var1 != null && !var1.Z && (var1.U >= 0.0F || var2.U < 0.0F);
   }

   @Nullable
   protected class01763 N(int var1, int var2, int var3, int var4, double var5, class07211 var7, class04425 var8) {
      class01763 class01763 = null;
      class07218 class07218 = new class07218();
      if (this.L(class07218.N(var1, var2, var3)) - var5 > this.B()) {
         return null;
      } else {
         class04425 class04425 = this.N(var1, var2, var3);
         float f = this.u.N(class04425);
         if (f >= 0.0F) {
            class01763 = this.N(var1, var2, var3, class04425, f);
         }

         if (N(var8) && class01763 != null && class01763.U >= 0.0F && !this.y(class01763)) {
            class01763 = null;
         }

         if (class04425 != class04425.field_12 && (!this.L() || class04425 != class04425.field_18)) {
            if ((class01763 == null || class01763.U < 0.0F)
               && var4 > 0
               && (class04425 != class04425.field_10 || this.M())
               && class04425 != class04425.field_25418
               && class04425 != class04425.field_19
               && class04425 != class04425.field_33534) {
               class01763 = this.N(var1, var2, var3, var4, var5, var7, var8, class07218);
            } else if (!this.L() && class04425 == class04425.field_18 && !this.R()) {
               class01763 = this.N(var1, var2, var3, class01763);
            } else if (class04425 == class04425.field_7) {
               class01763 = this.u(var1, var2, var3);
            } else if (N(class04425) && class01763 == null) {
               class01763 = this.N(var1, var2, var3, class04425);
            }

            return class01763;
         } else {
            return class01763;
         }
      }
   }

   @Override
   public int N(class01763[] var1, class01763 var2) {
      int i = 0;
      int j = 0;
      class04425 class04425x = this.N(var2.N, var2.y + 1, var2.L);
      class04425 class04425x = this.N(var2.N, var2.y, var2.L);
      if (this.u.N(class04425x) >= 0.0F && class04425x != class04425.field_21326) {
         j = class04995.y(Math.max(1.0F, this.u.method_49476()));
      }

      double d0 = this.L(new class07209(var2.N, var2.y, var2.L));

      for (class07211 class07211xx : class07221.field_11062) {
         class01763 class01763x = this.N(var2.N + class07211xx.P(), var2.y, var2.L + class07211xx.T(), j, d0, class07211xx, class04425x);
         this.P[class07211xx.u()] = class01763x;
         if (this.N(class01763x, var2)) {
            var1[i++] = class01763x;
         }
      }

      for (class07211 class07211x : class07221.field_11062) {
         class07211 class07211xx = class07211x.R();
         if (this.N(var2, this.P[class07211x.u()], this.P[class07211xx.u()])) {
            class01763 class01763 = this.N(
               var2.N + class07211x.P() + class07211xx.P(), var2.y, var2.L + class07211x.T() + class07211xx.T(), j, d0, class07211x, class04425x
            );
            if (this.N(class01763)) {
               var1[i++] = class01763;
            }
         }
      }

      return i;
   }

   protected boolean N(class01763 var1, @Nullable class01763 var2, @Nullable class01763 var3) {
      if (var3 == null || var2 == null || var3.y > var1.y || var2.y > var1.y) {
         return false;
      } else if (var2.E != class04425.field_26446 && var3.E != class04425.field_26446) {
         boolean flag = var3.E == class04425.field_10 && var2.E == class04425.field_10 && this.u.method_17681() < 0.5;
         return (var3.y < var1.y || var3.U >= 0.0F || flag) && (var2.y < var1.y || var2.U >= 0.0F || flag);
      } else {
         return false;
      }
   }

   protected boolean N(@Nullable class01763 var1) {
      if (var1 == null || var1.Z) {
         return false;
      } else {
         return var1.E == class04425.field_26446 ? false : var1.U >= 0.0F;
      }
   }

   private static boolean N(class04425 var0) {
      return var0 == class04425.field_10 || var0 == class04425.field_23 || var0 == class04425.field_8;
   }

   private boolean N(class00734 var1) {
      return this.m.computeIfAbsent(var1, var2 -> !this.L.N().method_8587(this.u, var1));
   }

   @Nullable
   private class01763 N(int var1, int var2, int var3, @Nullable class01763 var4) {
      var2--;

      while (var2 > this.u.method_73183().method_31607()) {
         class04425 class04425 = this.N(var1, var2, var3);
         if (class04425 != class04425.field_18) {
            return var4;
         }

         var4 = this.N(var1, var2, var3, class04425, this.u.N(class04425));
         var2--;
      }

      return var4;
   }

   @Nullable
   private class01763 N(int var1, int var2, int var3, int var4, double var5, class07211 var7, class04425 var8, class07218 var9) {
      class01763 class01763 = this.N(var1, var2 + 1, var3, var4 - 1, var5, var7, var8);
      if (class01763 == null) {
         return null;
      } else if (this.u.method_17681() >= 1.0F) {
         return class01763;
      } else if (class01763.E != class04425.field_7 && class01763.E != class04425.field_12) {
         return class01763;
      } else {
         double d0 = var1 - var7.P() + 0.5;
         double d1 = var3 - var7.T() + 0.5;
         double d2 = this.u.method_17681() / 2.0;
         class00734 class00734 = new class00734(
            d0 - d2,
            this.L(var9.N(d0, (double)(var2 + 1), d1)) + 0.001,
            d1 - d2,
            d0 + d2,
            this.u.method_17682() + this.L(var9.N((double)class01763.N, (double)class01763.y, (double)class01763.L)) - 0.002,
            d1 + d2
         );
         return this.N(class00734) ? null : class01763;
      }
   }

   private class01763 N(int var1, int var2, int var3, class04425 var4) {
      class01763 class01763 = this.L(var1, var2, var3);
      class01763.Z = true;
      class01763.E = var4;
      class01763.U = var4.N();
      return class01763;
   }

   @Override
   public class04604 N(double var1, double var3, double var5) {
      return this.y(var1, var3, var5);
   }

   private class01763 N(int var1, int var2, int var3, class04425 var4, float var5) {
      class01763 class01763 = this.L(var1, var2, var3);
      class01763.E = var4;
      class01763.U = Math.max(class01763.U, var5);
      return class01763;
   }
}
