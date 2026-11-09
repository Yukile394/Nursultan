package minecraft;

import Nursultan.class10714;
import Nursultan.class10750;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class07654 extends class07876 implements class07650 {
   private static final class02131<Integer> R = class03289.N(class07654.class, class02154.y);
   private static final Predicate<class07079> M = new class07616();
   static final Map<class07078<?>, class04891> N = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put(class07078.T, class04909.tb);
      var0.put(class07078.j, class04909.tj);
      var0.put(class07078.v, class04909.tv);
      var0.put(class07078.G, class04909.tn);
      var0.put(class07078.d, class04909.tA);
      var0.put(class07078.o, class04909.tt);
      var0.put(class07078.q, class04909.tG);
      var0.put(class07078.X, class04909.tl);
      var0.put(class07078.p, class04909.td);
      var0.put(class07078.f, class04909.tw);
      var0.put(class07078.A, class04909.tk);
      var0.put(class07078.x, class04909.tY);
      var0.put(class07078.NB, class04909.tQ);
      var0.put(class07078.NZ, class04909.vk);
      var0.put(class07078.Nm, class04909.tO);
      var0.put(class07078.NP, class04909.tg);
      var0.put(class07078.Nb, class04909.tI);
      var0.put(class07078.Nj, class04909.tJ);
      var0.put(class07078.Ng, class04909.to);
      var0.put(class07078.NS, class04909.tK);
      var0.put(class07078.ND, class04909.tq);
      var0.put(class07078.Nr, class04909.tV);
      var0.put(class07078.yN, class04909.te);
      var0.put(class07078.yy, class04909.tH);
      var0.put(class07078.yB, class04909.tc);
      var0.put(class07078.yU, class04909.tX);
      var0.put(class07078.yW, class04909.ta);
      var0.put(class07078.ym, class04909.tp);
      var0.put(class07078.ys, class04909.tF);
      var0.put(class07078.yG, class04909.tA);
      var0.put(class07078.yk, class04909.tf);
      var0.put(class07078.yV, class04909.tC);
      var0.put(class07078.yH, class04909.tS);
      var0.put(class07078.yX, class04909.tx);
      var0.put(class07078.yp, class04909.tD);
      var0.put(class07078.yF, class04909.th);
      var0.put(class07078.yA, class04909.tr);
      var0.put(class07078.yS, class04909.GN);
      var0.put(class07078.yx, class04909.Gy);
      var0.put(class07078.yD, class04909.GL);
      var0.put(class07078.yh, class04909.Gu);
      var0.put(class07078.yr, class04909.Gi);
   });
   public float y;
   public float L;
   public float u;
   public float i;
   private float p = 1.0F;
   private float F = 1.0F;
   private boolean A;
   @Nullable
   private class07209 f;

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.Nq);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(R, class07648.field_57614.field_41557);
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15254;
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_5679(var1, var2)) {
         return false;
      } else {
         this.Z(false);
         return super.method_64397(var1, var2, var3);
      }
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
   }

   @Override
   protected void method_5801() {
      this.method_5783(class04909.ts, 0.15F, 1.0F);
      this.F = this.field_28627 + this.L / 2.0F;
   }

   @Override
   protected boolean method_5776() {
      return this.field_28627 > this.F;
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.GR, 0.15F, 1.0F);
   }

   @Override
   public boolean method_5810() {
      return true;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Variant", class07648.field_56653, this.m());
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.Nq ? method_66651(var1, this.m()) : super.method_58694(var1);
   }

   @Override
   public boolean method_6109() {
      return false;
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class07648>N("Variant", class07648.field_56653).orElse(class07648.field_57614));
   }

   public class07654(class07078<? extends class07654> var1, class07299 var2) {
      super(var1, var2);
      this.q = new class07460(this, 10, false);
      this.N(class04425.field_9, -1.0F);
      this.N(class04425.field_3, -1.0F);
      this.N(class04425.field_21516, -1.0F);
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.n, 6.0).N(class05298.m, 0.4F).N(class05298.l, 0.2F).N(class05298.u, 3.0);
   }

   @Nullable
   @Override
   public class04891 s() {
      return N(this.method_73183(), this.method_73183().field_9229);
   }

   private void n() {
      this.i = this.y;
      this.u = this.L;
      this.L = this.L + (!this.method_24828() && !this.method_5765() ? 4 : -1) * 0.3F;
      this.L = class04995.N(this.L, 0.0F, 1.0F);
      if (!this.method_24828() && this.p < 1.0F) {
         this.p = 1.0F;
      }

      this.p *= 0.9F;
      class06889 class06889 = this.method_18798();
      if (!this.method_24828() && class06889.B < 0.0) {
         this.method_18799(class06889.u(1.0, 0.6, 1.0));
      }

      this.y = this.y + this.p * 2.0F;
   }

   public class07648 m() {
      return class07648.N(this.field_6011.N(R));
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return null;
   }

   @Override
   public boolean y() {
      return !this.method_24828();
   }

   public static boolean N(class07078<class07654> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.LT) && N(var1, var3);
   }

   public static float N(class06069 var0) {
      return (var0.z() - var0.z()) * 0.2F + 1.0F;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.N(class07536.N((class07648[])class07648.values(), var1.method_8409()));
      if (var4 == null) {
         var4 = new class10714(false);
      }

      return super.N(var1, var2, var3, (class07446)var4);
   }

   @Override
   protected class07623 N(class07299 var1) {
      class07991 class07991 = new class07991(this, var1);
      class07991.y(false);
      class07991.N(true);
      return class07991;
   }

   private void N(class07648 var1) {
      this.field_6011.N(R, var1.field_41557);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (!this.NQ() && class06584.N(class01226.yR)) {
         this.N(var1, var2, class06584);
         if (!this.method_5701()) {
            this.method_73183()
               .method_43128(
                  null,
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  class04909.tP,
                  this.method_5634(),
                  1.0F,
                  1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.2F
               );
         }

         if (!this.method_73183().method_8608()) {
            if (this.field_5974.y(10) == 0) {
               this.u(var1);
               this.method_73183().method_8421(this, (byte)7);
            } else {
               this.method_73183().method_8421(this, (byte)6);
            }
         }

         return class07082.N;
      } else if (!class06584.N(class01226.yM)) {
         if (!this.y() && this.NQ() && this.L((class07438)var1)) {
            if (!this.method_73183().method_8608()) {
               this.Z(!this.NJ());
            }

            return class07082.N;
         } else {
            return super.N(var1, var2);
         }
      } else {
         this.N(var1, var2, class06584);
         this.method_6092(new class07055(class07047.j, 900));
         if (var1.method_68878() || !this.method_5655()) {
            this.method_64419(this.method_48923().N(var1), Float.MAX_VALUE);
         }

         return class07082.N;
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return false;
   }

   private static class04891 N(class07078<?> var0) {
      return N.getOrDefault(var0, class04909.tW);
   }

   public static class04891 N(class07299 var0, class06069 var1) {
      if (var0.y() != class07086.field_5801 && var1.y(1000) == 0) {
         ArrayList arraylist = Lists.newArrayList(N.keySet());
         return N((class07078<?>)arraylist.get(var1.y(arraylist.size())));
      } else {
         return class04909.tW;
      }
   }

   @Override
   public boolean N(class07633 var1) {
      return false;
   }

   public static boolean N(class07299 var0, class07049 var1) {
      if (var1.method_5805() && !var1.method_5701() && var0.field_9229.y(2) == 0) {
         List<class07079> list = var0.N(class07079.class, var1.method_5829().M(20.0), M);
         if (!list.isEmpty()) {
            class07079 class07079 = list.get(var0.field_9229.y(list.size()));
            if (!class07079.method_5701()) {
               class04891 class04891 = N(class07079.method_5864());
               var0.method_43128(null, var1.method_23317(), var1.method_23318(), var1.method_23321(), class04891, var1.method_5634(), 0.7F, N(var0.field_9229));
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean W() {
      return this.A;
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.5F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.Nq) {
         this.N(method_66651(class02484.Nq, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   @Override
   protected void l_() {
      this.e.N(0, new class10750(this, 1.25));
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07962(this, class08036.class, 8.0F));
      this.e.N(2, new class07958(this));
      this.e.N(2, new class07444(this, 1.0, 5.0F, 1.0F));
      this.e.N(2, new class07638(this, 1.0));
      this.e.N(3, new class07967(this));
      this.e.N(3, new class07457(this, 1.0, 3.0F, 7.0F));
   }

   @Override
   protected boolean NV() {
      return true;
   }

   @Override
   public void method_6006(class07209 var1, boolean var2) {
      this.f = var1;
      this.A = var2;
   }

   @Override
   public void method_6087(class07049 var1) {
      if (!(var1 instanceof class08036)) {
         super.method_6087(var1);
      }
   }

   @Override
   public class04891 method_6002() {
      return class04909.tm;
   }

   @Override
   public void method_6007() {
      if (this.f == null || !this.f.method_19769(this.method_73189(), 3.46) || !this.method_73183().method_8320(this.f).N(class00869.iG)) {
         this.A = false;
         this.f = null;
      }

      if (this.method_73183().field_9229.y(400) == 0) {
         N(this.method_73183(), this);
      }

      super.method_6007();
      this.n();
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.tT;
   }

   @Override
   public float method_6017() {
      return N(this.field_5974);
   }
}
