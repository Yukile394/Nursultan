package minecraft;

import Nursultan.class10714;
import Nursultan.class10866;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.LinkedHashSet;
import org.jspecify.annotations.Nullable;

public class class01377 extends class07633 implements class01361 {
   private static final class01894 N = class01894.y("suffocating");
   private static final class07471 y = new class07471(N, -0.34F, class07463.field_6330);
   private static final float L = 0.35F;
   private static final float u = 0.55F;
   private static final class02131<Integer> i = class03289.N(class01377.class, class02154.y);
   private static final class02131<Boolean> R = class03289.N(class01377.class, class02154.U);
   private final class01332 M = new class01332(this.field_6011, i);
   @Nullable
   private class07960 B;

   @Override
   public class06889 method_24829(class07438 var1) {
      class06889[] aclass06889 = new class06889[]{
         method_24826(this.method_17681(), var1.method_17681(), var1.method_36454()),
         method_24826(this.method_17681(), var1.method_17681(), var1.method_36454() - 22.5F),
         method_24826(this.method_17681(), var1.method_17681(), var1.method_36454() + 22.5F),
         method_24826(this.method_17681(), var1.method_17681(), var1.method_36454() - 45.0F),
         method_24826(this.method_17681(), var1.method_17681(), var1.method_36454() + 45.0F)
      };
      LinkedHashSet linkedhashset = Sets.newLinkedHashSet();
      double d0 = this.method_5829().i;
      double d1 = this.method_5829().y - 0.5;
      class07218 class07218 = new class07218();

      for (class06889 class06889x : aclass06889) {
         class07218.N(this.method_23317() + class06889x.M, d0, this.method_23321() + class06889x.Z);

         for (double d2 = d0; d2 > d1; d2--) {
            linkedhashset.add(class07218.method_10062());
            class07218.N(class07211.field_11033);
         }
      }

      for (class07209 class07209 : linkedhashset) {
         if (!this.method_73183().method_8316(class07209).N(class01231.y)) {
            double d3 = this.method_73183().L(class07209);
            if (class05188.N(d3)) {
               class06889 class06889 = class06889.N(class07209, d3);
               UnmodifiableIterator<class01312> unmodifiableiterator = var1.method_24831().iterator();

               while (unmodifiableiterator.hasNext()) {
                  class01312 class01312 = (class01312)unmodifiableiterator.next();
                  class00734 class00734 = var1.method_24833(class01312);
                  if (class05188.N(this.method_73183(), var1, class00734.L(class06889))) {
                     var1.method_18380(class01312);
                     return class06889;
                  }
               }
            }
         }
      }

      return new class06889(this.method_23317(), this.method_5829().i, this.method_23321());
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (i.equals(var1) && this.method_73183().method_8608()) {
         this.M.N();
      }

      super.method_5674(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(i, 0);
      var1.N(R, false);
   }

   @Override
   public void method_5773() {
      if (this.v() && this.field_5974.y(140) == 0) {
         this.method_56078(class04909.Ys);
      } else if (this.Nk() && this.field_5974.y(60) == 0) {
         this.method_56078(class04909.YT);
      }

      if (!this.Nt()) {
         class00500 class00500x = this.method_73183().method_8320(this.method_24515());
         class00500 class00500x = this.method_43261();
         boolean flag = class00500x.N(class01210.yM) || class00500x.N(class01210.yM) || this.method_5861(class01231.y) > 0.0;
         class07049 class07049 = this.method_5854();
         boolean flag1 = class07049 instanceof class01377 && ((class01377)class07049).B();
         this.N(!flag || flag1);
      }

      super.method_5773();
      this.n();
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
      if (this.method_5771()) {
         this.method_38785();
      } else {
         super.method_5623(var1, var3, var4, var5);
      }
   }

   @Override
   protected float method_5867() {
      return this.field_5994 + 0.6F;
   }

   @Override
   public boolean method_5809() {
      return false;
   }

   @Nullable
   @Override
   public class07438 method_5642() {
      return (class07438)(this.Nz() && this.method_31483() instanceof class08036 class08036 && class08036.method_24518(class06570.sP)
         ? class08036
         : super.method_5642());
   }

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(this.method_5771() ? class04909.Yn : class04909.Yv, 1.0F, 1.0F);
   }

   @Override
   protected class06889 method_52533(class07049 var1, class01325 var2, float var3) {
      if (!this.method_73183().method_8608()) {
         return super.method_52533(var1, var2, var3);
      } else {
         float f = Math.min(0.25F, super.fields_3212a028292fd3c078969e3ee4c71d9e8_3.y());
         float f1 = super.fields_3212a028292fd3c078969e3ee4c71d9e8_3.L();
         float f2 = 0.12F * class04995.P(f1 * 1.5F) * 2.0F * f;
         return super.method_52533(var1, var2, var3).y(0.0, f2 * var3, 0.0);
      }
   }

   @Override
   protected boolean method_5818(class07049 var1) {
      return !this.method_5782() && !this.method_5777(class01231.y);
   }

   public class01377(class07078<? extends class01377> var1, class07299 var2) {
      super(var1, var2);
      this.field_23807 = true;
      this.N(class04425.field_18, -1.0F);
      this.N(class04425.field_14, 0.0F);
      this.N(class04425.field_9, 0.0F);
      this.N(class04425.field_3, 0.0F);
   }

   public boolean B() {
      return this.field_6011.N(R);
   }

   @Nullable
   @Override
   protected class04891 s() {
      return !this.Nk() && !this.v() ? class04909.YP : null;
   }

   @Override
   protected boolean c() {
      return true;
   }

   private void n() {
      if (this.method_5771()) {
         if (class06092.N(this).N(class07117.u, this.method_24515(), true)
            && !this.method_73183().method_8316(this.method_24515().method_10084()).N(class01231.y)) {
            this.method_24830(true);
         } else {
            this.method_18799(this.method_18798().L(0.5).y(0.0, 0.05, 0.0));
         }
      }
   }

   public static class05300 m() {
      return class07633.Ne().N(class05298.l, 0.175F);
   }

   private boolean v() {
      return this.B != null && this.B.U();
   }

   @Override
   protected class07623 N(class07299 var1) {
      return new class01335(this, var1);
   }

   public static boolean N(class07078<class01377> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      class07218 class07218 = var3.method_25503();

      do {
         class07218.N(class07211.field_11036);
      } while (var1.method_8316(class07218).N(class01231.y));

      return var1.method_8320(class07218).P();
   }

   private class07446 N(class01001 var1, class07052 var2, class07079 var3, @Nullable class07446 var4) {
      var3.method_5808(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), 0.0F);
      var3.N(var1, var2, class06113.field_16460, var4);
      var3.method_5873(this, true, false);
      return new class10714(0.0F);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (this.method_6109()) {
         return super.N(var1, var2, var3, (class07446)var4);
      } else {
         class06069 class06069 = var1.method_8409();
         if (class06069.y(30) == 0) {
            class07079 class07079 = class07078.LN.N(var1.method_8410(), class06113.field_16460);
            if (class07079 != null) {
               var4 = this.N(var1, var2, class07079, new class10866(class08004.N(class06069), false));
               class07079.method_5673(class07085.field_6173, new class06584(class06570.sP));
               this.method_5673(class07085.field_55946, new class06584(class06570.PF));
               this.N(class07085.field_55946);
            }
         } else if (class06069.y(10) == 0) {
            class07077 class07077 = class07078.yY.N(var1.method_8410(), class06113.field_16460);
            if (class07077 != null) {
               class07077.u(-24000);
               var4 = this.N(var1, var2, class07077, null);
            }
         } else {
            var4 = new class10714(0.5F);
         }

         return super.N(var1, var2, var3, (class07446)var4);
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      boolean flag = this.N(var1.method_5998(var2));
      if (!flag && this.Nz() && !this.method_5782() && !var1.method_21823()) {
         if (!this.method_73183().method_8608()) {
            var1.method_5804(this);
         }

         return class07082.N;
      } else {
         class07082 class07082 = super.N(var1, var2);
         if (!class07082.N()) {
            class06584 class06584 = var1.method_5998(var2);
            return (class07082)(this.method_63623(class06584, class07085.field_55946) ? class06584.N(var1, this, var2) : class07082.i);
         } else {
            if (flag && !this.method_5701()) {
               this.method_73183()
                  .method_43128(
                     null,
                     this.method_23317(),
                     this.method_23318(),
                     this.method_23321(),
                     class04909.Yt,
                     this.method_5634(),
                     1.0F,
                     1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.2F
                  );
            }

            return class07082;
         }
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.yL);
   }

   @Nullable
   public class01377 y(class04782 var1, class07077 var2) {
      return class07078.yY.N(var1, class06113.field_16466);
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      if (var2.method_8320(var1).Y().N(class01231.y)) {
         return 10.0F;
      } else {
         return this.method_5771() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Override
   public boolean N(class05487 var1) {
      return var1.method_8606(this);
   }

   public void N(boolean var1) {
      this.field_6011.N(R, var1);
      class07469 class07469 = this.method_5996(class05298.l);
      if (class07469 != null) {
         if (var1) {
            class07469.N(y);
         } else {
            class07469.L(N);
         }
      }
   }

   @Override
   public boolean W() {
      return this.M.N(this.method_59922());
   }

   @Override
   public class06889 ac_() {
      return new class06889(0.0, 0.6F * this.method_5751(), this.method_17681() * 0.4F);
   }

   @Override
   protected void l_() {
      this.e.N(1, new class07993(this, 1.65));
      this.e.N(2, new class07434(this, 1.0));
      this.B = new class07960(this, 1.4, var0 -> var0.N(class01226.yu), false);
      this.e.N(3, this.B);
      this.e.N(4, new class01363(this, 1.0));
      this.e.N(5, new class07459(this, 1.0));
      this.e.N(7, new class07978(this, 1.0, 60));
      this.e.N(8, new class07962(this, class08036.class, 8.0F));
      this.e.N(8, new class07956(this));
      this.e.N(9, new class07962(this, class01377.class, 8.0F));
   }

   @Override
   public float method_49485(class08036 var1) {
      return (float)(this.method_45325(class05298.l) * (this.B() ? 0.35F : 0.55F) * this.M.L());
   }

   @Override
   public class04891 method_6002() {
      return class04909.Yb;
   }

   @Override
   public void method_49481(class08036 var1, class06889 var2) {
      this.method_5710(var1.method_36454(), var1.method_36455() * 0.5F);
      float f = this.method_36454();
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = f;
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = f;
      this.field_5982 = f;
      this.M.y();
      super.method_49481(var1, var2);
   }

   @Override
   public boolean method_26319(class04688 var1) {
      return var1.N(class01231.y);
   }

   @Override
   public boolean method_29503() {
      return true;
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return var1 == class07085.field_55946 || super.method_63626(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Yj;
   }

   @Override
   public class03556<class04891> method_66667(class07085 var1, class06584 var2, class08725 var3) {
      return (class03556<class04891>)(var1 == class07085.field_55946 ? class04909.YG : super.method_66667(var1, var2, var3));
   }

   @Override
   public class06889 method_49482(class08036 var1, class06889 var2) {
      return new class06889(0.0, 0.0, 1.0);
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return var1 != class07085.field_55946 ? super.method_56991(var1) : this.method_5805() && !this.method_6109();
   }
}
