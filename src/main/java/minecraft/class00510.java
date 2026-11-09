package minecraft;

import java.util.Iterator;
import java.util.List;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00510 extends class00394 {
   private static final int y = 2;
   private static final double L = 0.01;
   public static final double N = 0.51;
   private static final class00500 u = class00869.N.W();
   private static final float i = 0.0F;
   private static final boolean R = false;
   private static final boolean M = false;
   private class00500 B = u;
   private class07211 Z;
   private boolean m = false;
   private boolean P = false;
   private static final ThreadLocal<class07211> s = ThreadLocal.withInitial(() -> null);
   private float T = 0.0F;
   private float b = 0.0F;
   private long j;
   private int v;
   private static final class00494[] n = m();

   public float L(float var1) {
      return this.Z.s() * this.i(this.N(var1));
   }

   public class07211 L() {
      return this.Z;
   }

   public class00500 M() {
      return this.B;
   }

   public class00510(class07209 var1, class00500 var2) {
      super(class00404.field_11897, var1, var2);
   }

   public class00510(class07209 var1, class00500 var2, class00500 var3, class07211 var4, boolean var5, boolean var6) {
      this(var1, var2);
      this.B = var3;
      this.Z = var4;
      this.m = var5;
      this.P = var6;
   }

   public void B() {
      if (this.z != null && (this.b < 1.0F || this.z.method_8608())) {
         this.T = 1.0F;
         this.b = this.T;
         this.z.method_8544(this.U);
         this.r_();
         if (this.z.method_8320(this.U).N(class00869.LN)) {
            class00500 class00500;
            if (this.P) {
               class00500 = class00869.N.W();
            } else {
               class00500 = class00891.a_(this.B, this.z, this.U);
            }

            this.z.method_8652(this.U, class00500, 3);
            this.z.method_8492(this.U, class00500.i(), class02752.N(this.z, this.Z(), null));
         }
      }
   }

   public class07211 Z() {
      return this.m ? this.Z : this.Z.b();
   }

   private float i(float var1) {
      return this.m ? var1 - 1.0F : 1.0F - var1;
   }

   private static class00494[] m() {
      float[] afloat = new float[]{0.0F, 0.5F, 1.0F};
      class07211[] aclass07211 = class07211.values();
      class00494[] aclass00494 = new class00494[afloat.length * aclass07211.length];

      for (class07211 class07211 : aclass07211) {
         class00494 class00494x = class00869.yq.W().y(class00513.L, true).y(class00513.y, class07211).M(null, null);

         for (float f : afloat) {
            boolean flag = f < 0.25F;
            class00494 class00494x = class00869.yK
               .W()
               .y(class00483.y, class07211)
               .y(class00483.u, flag)
               .M(null, null)
               .method_1096(class07211.P() * f, class07211.s() * f, class07211.T() * f);
            aclass00494[N(f, class07211)] = class00389.N(class00494x, class00494x);
         }
      }

      return aclass00494;
   }

   private class00500 U() {
      return !this.N() && this.u() && this.B.i() instanceof class00513
         ? class00869.yK
            .W()
            .y(class00483.u, this.T > 0.25F)
            .y(class00483.L, this.B.N(class00869.yd) ? class08083.field_12634 : class08083.field_12637)
            .y(class00483.y, this.B.L(class00513.y))
         : this.B;
   }

   public long z() {
      return this.j;
   }

   public float u(float var1) {
      return this.Z.T() * this.i(this.N(var1));
   }

   public boolean u() {
      return this.P;
   }

   private static void y(class07299 var0, class07209 var1, float var2, class00510 var3) {
      if (var3.E()) {
         class07211 class07211 = var3.R();
         if (class07211.z().L()) {
            double d0 = var3.B.M(var0, var1).method_1105(class07185.field_11052);
            class00734 class00734 = N(var1, new class00734(0.0, d0, 0.0, 1.0, 1.5000010000000001, 1.0), var3);
            double d1 = var2 - var3.T;

            for (class07049 class07049 : var0.method_8333((class07049)null, class00734, var2x -> N(class00734, var2x, var1))) {
               N(class07211, class07049, d1, class07211);
            }
         }
      }
   }

   public float y(float var1) {
      return this.Z.P() * this.i(this.N(var1));
   }

   private boolean E() {
      return this.B.N(class00869.TM);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("blockState", class00500.N, this.B);
      var1.N("facing", class07211.field_57037, this.Z);
      var1.N("progress", this.b);
      var1.N("extending", this.m);
      var1.N("source", this.P);
   }

   private static int N(float var0, class07211 var1) {
      return var0 != 0.0F && var0 != 0.5F && var0 != 1.0F ? -1 : (int)(2.0F * var0) + 3 * var1.L();
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class00510 var3) {
      var3.j = var0.N();
      var3.b = var3.T;
      if (var3.b >= 1.0F) {
         if (var0.method_8608() && var3.v < 5) {
            var3.v++;
         } else {
            var0.method_8544(var1);
            var3.r_();
            if (var0.method_8320(var1).N(class00869.LN)) {
               class00500 class00500 = class00891.a_(var3.B, var0, var1);
               if (class00500.P()) {
                  var0.method_8652(var1, var3.B, 340);
                  class00891.N(var3.B, class00500, var0, var1, 3);
               } else {
                  if (class00500.y(class06665.q) && class00500.L(class06665.q)) {
                     class00500 = class00500.y(class06665.q, false);
                  }

                  var0.method_8652(var1, class00500, 67);
                  var0.method_8492(var1, class00500.i(), class02752.N(var0, var3.Z(), null));
               }
            }
         }
      } else {
         float f = var3.T + 0.5F;
         N(var0, var1, f, var3);
         y(var0, var1, f, var3);
         var3.T = f;
         if (var3.T >= 1.0F) {
            var3.T = 1.0F;
         }
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.B = var1.<class00500>N("blockState", class00500.N).orElse(u);
      this.Z = var1.<class07211>N("facing", class07211.field_57037).orElse(class07211.field_11033);
      this.T = var1.N("progress", 0.0F);
      this.b = this.T;
      this.m = var1.N("extending", false);
      this.P = var1.N("source", false);
   }

   private void N(class07290 var1, class07209 var2, CallbackInfoReturnable var3, class00494 var4, class07211 var5, class00500 var6, float var7) {
      float f = Math.abs(var7);
      if (f == 0.0F || f == 0.5F || f == 1.0F) {
         if (!this.m && this.P && this.B.i() instanceof class00513) {
            int ix = N(var7, this.Z);
            var3.setReturnValue(n[ix]);
         } else {
            class00494 class00494x = var6.M(var1, var2);
            class00494 class00494x = N(class00494x, f, var7 < 0.0F ? this.Z.b() : this.Z);
            var3.setReturnValue(class00494x);
         }
      }
   }

   private static class00494 N(class00494 var0, float var1, class07211 var2) {
      class00494 class00494 = var0.lithium$getOffsetSimplifiedShape(var1, var2);
      if (class00494 == null) {
         class00494 = var0.method_1096(var2.P() * var1, var2.s() * var1, var2.T() * var1).method_1097();
         var0.lithium$setShape(var1, var2, class00494);
      }

      return class00494;
   }

   @Override
   public void N(class07299 var1) {
      super.N(var1);
      if (var1.N_51(class04227.Z).N(this.B.i().s().B()).isEmpty()) {
         this.B = class00869.N.W();
      }
   }

   public class00494 N(class07290 var1, class07209 var2) {
      class00494 class00494;
      if (!this.m && this.P && this.B.i() instanceof class00513) {
         class00494 = this.B.y(class00513.L, true).M(var1, var2);
      } else {
         class00494 = class00389.N();
      }

      class07211 class07211 = s.get();
      if (this.T < 1.0 && class07211 == this.R()) {
         return class00494;
      } else {
         class00500 class00500;
         if (this.u()) {
            class00500 = class00869.yK.W().y(class00483.y, this.Z).y(class00483.u, this.m != 1.0F - this.T < 0.25F);
         } else {
            class00500 = this.B;
         }

         float f = this.i(this.T);
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.N(var1, var2, callbackinforeturnable, class00494, class07211, class00500, f);
         if (callbackinforeturnable.isCancelled()) {
            return (class00494)callbackinforeturnable.getReturnValue();
         } else {
            double d0 = this.Z.P() * f;
            double d1 = this.Z.s() * f;
            double d2 = this.Z.T() * f;
            return class00389.N(class00494, class00500.M(var1, var2).method_1096(d0, d1, d2));
         }
      }
   }

   private static boolean N(class00734 var0, class07049 var1, class07209 var2) {
      return var1.method_5657() == class04641.field_15974
         && var1.method_24828()
         && (
            var1.method_51849(var2)
               || var1.method_23317() >= var0.N && var1.method_23317() <= var0.u && var1.method_23321() >= var0.L && var1.method_23321() <= var0.R
         );
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   private static void N(class07211 var0, class07049 var1, double var2, class07211 var4) {
      s.set(var0);
      class06889 class06889 = var1.method_73189();
      var1.method_5784(class07451.field_6310, new class06889(var2 * var4.P(), var2 * var4.s(), var2 * var4.T()));
      var1.method_64166(class06889, var1.method_73189());
      var1.method_68259();
      s.set(null);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void N(class07299 var0, class07209 var1, float var2, class00510 var3) {
      class07211 class07211 = var3.R();
      double d0 = var2 - var3.T;
      class00494 class00494 = var3.U().M(var0, var1);
      if (!class00494.method_1110()) {
         class00734 class00734xxx = N(var1, class00494.method_1107(), var3);
         List<class07049> list = var0.N_70(null, class01437.N(class00734xxx, class07211, d0).y(class00734xxx));
         if (!list.isEmpty()) {
            List<class00734> list1 = class00494.method_1090();
            boolean flag = var3.B.N(class00869.Zc);
            Iterator<class07049> iterator = list.iterator();

            while (true) {
               class07049 class07049;
               while (true) {
                  if (!iterator.hasNext()) {
                     return;
                  }

                  class07049 = iterator.next();
                  if (class07049.method_5657() != class04641.field_15975) {
                     if (!flag) {
                        break;
                     }

                     if (!(class07049 instanceof class04770)) {
                        class06889 class06889 = class07049.method_18798();
                        double d1 = class06889.M;
                        double d2 = class06889.B;
                        double d3 = class06889.Z;
                        switch (class07211.z()) {
                           case field_11048:
                              d1 = class07211.P();
                              break;
                           case field_11052:
                              d2 = class07211.s();
                              break;
                           case field_11051:
                              d3 = class07211.T();
                        }

                        class07049.method_18800(d1, d2, d3);
                        break;
                     }
                  }
               }

               double d4 = 0.0;

               for (class00734 class00734x : list1) {
                  class00734 class00734xx = class01437.N(N(var1, class00734x, var3), class07211, d0);
                  class00734 class00734xxx = class07049.method_5829();
                  if (class00734xx.L(class00734xxx)) {
                     d4 = Math.max(d4, N(class00734xx, class07211, class00734xxx));
                     if (d4 >= d0) {
                        break;
                     }
                  }
               }

               if (!(d4 <= 0.0)) {
                  d4 = Math.min(d4, d0) + 0.01;
                  N(class07211, class07049, d4, class07211);
                  if (!var3.m && var3.P) {
                     N(var1, class07049, class07211, d0);
                  }
               }
            }
         }
      }
   }

   public float N(float var1) {
      if (var1 > 1.0F) {
         var1 = 1.0F;
      }

      return class04995.B(var1, this.b, this.T);
   }

   public boolean N() {
      return this.m;
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
      this.B();
   }

   private static class00734 N(class07209 var0, class00734 var1, class00510 var2) {
      double d0 = var2.i(var2.T);
      return var1.u(var0.method_10263() + d0 * var2.Z.P(), var0.method_10264() + d0 * var2.Z.s(), var0.method_10260() + d0 * var2.Z.T());
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static double N(class00734 var0, class07211 var1, class00734 var2) {
      switch (var1) {
         case field_11034:
            return var0.u - var2.N;
         case field_11039:
            return var2.u - var0.N;
         case field_11036:
         default:
            return var0.i - var2.y;
         case field_11033:
            return var2.i - var0.y;
         case field_11035:
            return var0.R - var2.L;
         case field_11043:
            return var2.R - var0.L;
      }
   }

   private static void N(class07209 var0, class07049 var1, class07211 var2, double var3) {
      class00734 class00734x = var1.method_5829();
      class00734 class00734x = class00389.y().method_1107().N(var0);
      if (class00734x.L(class00734x)) {
         class07211 class07211 = var2.b();
         double d0 = N(class00734x, class07211, class00734x) + 0.01;
         double d1 = N(class00734x, class07211, class00734x.N(class00734x)) + 0.01;
         if (Math.abs(d0 - d1) < 0.01) {
            d0 = Math.min(d0, var3) + 0.01;
            N(var2, var1, d0, class07211);
         }
      }
   }

   public class07211 R() {
      return this.m ? this.Z : this.Z.b();
   }
}
