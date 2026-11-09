package minecraft;

import Nursultan.class09956;
import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public abstract class class08005 extends class07049 implements class03244 {
   private static final boolean N = false;
   private static final boolean y = false;
   @Nullable
   protected class08372<class07049> i;
   private boolean L = false;
   private boolean u;
   private boolean R = false;
   @Nullable
   private class07049 M;

   public void L(@Nullable class07049 var1) {
      this.N(class08372.N(var1));
   }

   public class07049 P() {
      return (class07049)MoreObjects.firstNonNull(this.z(), this);
   }

   protected void T() {
      class06889 class06889 = this.method_18798();
      double d0 = class06889.Z();
      this.method_36457(N(this.field_6004, (float)(class04995.u(class06889.B, d0) * 180.0F / (float)Math.PI)));
      this.method_36456(N(this.field_5982, (float)(class04995.u(class06889.M, class06889.Z) * 180.0F / (float)Math.PI)));
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      class07049 class07049 = this.method_73183().method_8469(var1.W());
      if (class07049 != null) {
         this.L(class07049);
      }
   }

   @Override
   public class00381<class07280> method_18002(class01599 var1) {
      class07049 class07049 = this.z();
      return new class07276(this, var1, class07049 == null ? 0 : class07049.method_5628());
   }

   @Override
   public boolean method_36971(class04782 var1, class07209 var2) {
      class07049 class07049 = this.z();
      return class07049 instanceof class08036 ? class07049.method_36971(var1, var2) : class07049 == null || var1.method_64395().N(class07305.I);
   }

   @Override
   public void method_5773() {
      if (!this.R) {
         this.method_32875(class01194.V, this.z());
         this.R = true;
      }

      this.s();
      super.method_5773();
      this.u = false;
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (!this.method_64421(var2)) {
         this.method_5785();
      }

      return false;
   }

   @Override
   public int method_5806() {
      return 2;
   }

   @Override
   protected void method_5652(class08329 var1) {
      class08372.N(this.i, var1, "Owner");
      if (this.L) {
         var1.N("LeftOwner", true);
      }

      var1.N("HasBeenShot", this.R);
   }

   @Override
   public boolean method_5863() {
      return this.method_5864().N(class01217.q);
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.N(class08372.N(var1, "Owner"));
      this.L = var1.N("LeftOwner", false);
      this.R = var1.N("HasBeenShot", false);
   }

   @Override
   public float method_5871() {
      return this.method_5863() ? 1.0F : 0.0F;
   }

   @Override
   public void method_5700(boolean var1, class07209 var2) {
      double d0 = var1 ? -0.03 : 0.1;
      this.method_18799(this.method_18798().y(0.0, d0, 0.0));
      method_66250(this.method_73183(), var2);
   }

   @Override
   public void method_5764(boolean var1) {
      double d0 = var1 ? -0.03 : 0.06;
      this.method_18799(this.method_18798().y(0.0, d0, 0.0));
      this.method_38785();
   }

   @Override
   public void method_5878(class07049 var1) {
      super.method_5878(var1);
      if (var1 instanceof class08005 class08005) {
         this.i = class08005.i;
      }
   }

   public class08005(class07078<? extends class08005> var1, class07299 var2) {
      super(var1, var2);
   }

   protected void s() {
      if (!this.L && !this.u) {
         this.L = this.y();
         this.u = true;
      }
   }

   @Nullable
   @Override
   public class07049 z() {
      return class08372.N(this.i, this.method_73183());
   }

   protected boolean u(class07049 var1) {
      return this.i != null && this.i.y(var1);
   }

   private boolean y() {
      class07049 class07049 = this.z();
      if (class07049 != null) {
         class00734 class00734 = this.method_5829().y(this.method_18798()).M(1.0);
         return class07049.method_5668().method_24204().filter(class07042.B).noneMatch(var1x -> class00734.L(var1x.method_5829()));
      } else {
         return true;
      }
   }

   protected class04252 y(class07089 var1) {
      if (var1.N() == class07113.field_1331) {
         class06145 class06145 = (class06145)var1;
         class07049 class07049 = class06145.L();
         class04252 class04252x = class07049.method_56071(this);
         if (class04252x != class04252.N) {
            if (class07049 != this.M && this.N(class04252x, class07049, this.i, false)) {
               this.M = class07049;
            }

            return class04252x;
         }
      } else if (this.v_() && var1 instanceof class06183 && ((class06183)var1).M()) {
         class04252 class04252 = class04252.y;
         if (this.N(class04252, null, this.i, false)) {
            this.method_18799(this.method_18798().L(0.2));
            return class04252;
         }
      }

      this.N(var1);
      return class04252.N;
   }

   public class06889 y(double var1, double var3, double var5, float var7, float var8) {
      return new class06889(var1, var3, var5)
         .u()
         .y(this.field_5974.N(0.0, 0.0172275 * var8), this.field_5974.N(0.0, 0.0172275 * var8), this.field_5974.N(0.0, 0.0172275 * var8))
         .L((double)var7);
   }

   protected static float N(float var0, float var1) {
      while (var1 - var0 < -180.0F) {
         var0 -= 360.0F;
      }

      while (var1 - var0 >= 180.0F) {
         var0 += 360.0F;
      }

      return class04995.B(0.2F, var0, var1);
   }

   @class09956(
      N = "canHitEntity"
   )
   protected boolean N(class07049 var1) {
      if (!var1.method_49108()) {
         return false;
      } else {
         class07049 class07049 = this.z();
         return class07049 == null || this.L || !class07049.method_5794(var1);
      }
   }

   public boolean N(class04782 var1) {
      return this.method_5864().N(class01217.B) && var1.method_64395().N(class07305.e);
   }

   public static <T extends class08005> T N(T var0, class04782 var1, class06584 var2) {
      return N((T)var0, var1, var2, var0x -> {});
   }

   public void N(double var1, double var3, double var5, float var7, float var8) {
      class06889 class06889 = this.y(var1, var3, var5, var7, var8);
      this.method_18799(class06889);
      this.field_64356 = true;
      double d0 = class06889.Z();
      this.method_36456((float)(class04995.u(class06889.M, class06889.Z) * 180.0F / (float)Math.PI));
      this.method_36457((float)(class04995.u(class06889.B, d0) * 180.0F / (float)Math.PI));
      this.field_5982 = this.method_36454();
      this.field_6004 = this.method_36455();
   }

   public static <T extends class08005> T N(T var0, class04782 var1, class06584 var2, Consumer<T> var3) {
      var3.accept(var0);
      var1.method_8649(var0);
      var0.N(var1, var2);
      return (T)var0;
   }

   public void N(class04782 var1, class06584 var2) {
      class07323.N(var1, var2, this, var0 -> {});
      if (this instanceof class08007 class08007) {
         class06584 class06584 = class08007.method_59958();
         if (class06584 != null && !class06584.R() && !var2.B().equals(class06584.B())) {
            class07323.N(var1, class06584, this, class08007::N);
         }
      }
   }

   public void N(class07049 var1, float var2, float var3, float var4, float var5, float var6) {
      float f = -class04995.m(var3 * (float) (Math.PI / 180.0)) * class04995.P(var2 * (float) (Math.PI / 180.0));
      float f1 = -class04995.m((var2 + var4) * (float) (Math.PI / 180.0));
      float f2 = class04995.P(var3 * (float) (Math.PI / 180.0)) * class04995.P(var2 * (float) (Math.PI / 180.0));
      this.N(f, f1, f2, var5, var6);
      class06889 class06889 = var1.method_60478();
      this.method_18799(this.method_18798().y(class06889.M, var1.method_24828() ? 0.0 : class06889.B, class06889.Z));
   }

   public static <T extends class08005> T N(class08000<T> var0, class04782 var1, class06584 var2, class07438 var3, float var4, float var5, float var6) {
      return N((T)var0.create(var1, var3, var2), var1, var2, var4x -> var4x.N(var3, var3.method_36455(), var3.method_36454(), var4, var5, var6));
   }

   public static <T extends class08005> T N(
      class08000<T> var0, class04782 var1, class06584 var2, class07438 var3, double var4, double var6, double var8, float var10, float var11
   ) {
      return N((T)var0.create(var1, var3, var2), var1, var2, var8x -> var8x.N(var4, var6, var8, var10, var11));
   }

   public static <T extends class08005> T N(T var0, class04782 var1, class06584 var2, double var3, double var5, double var7, float var9, float var10) {
      return N((T)var0, var1, var2, var9x -> var0.N(var3, var5, var7, var9, var10));
   }

   protected void N(class06581 var1) {
   }

   protected void N(class07089 var1) {
      class07113 class07113 = var1.N();
      if (class07113 == class07113.field_1331) {
         class06145 class06145 = (class06145)var1;
         class07049 class07049 = class06145.L();
         if (class07049.method_5864().N(class01217.q) && class07049 instanceof class08005) {
            ((class08005)class07049).N(class04252.L, this.z(), this.i, true);
         }

         this.N(class06145);
         this.method_73183().method_32888(class01194.K, var1.y(), class01164.N(this, null));
      } else if (class07113 == class07113.field_1332) {
         class06183 class06183 = (class06183)var1;
         this.N(class06183);
         class07209 class07209 = class06183.u();
         this.method_73183().N(class01194.K, class07209, class01164.N(this, this.method_73183().method_8320(class07209)));
      }
   }

   protected void N(class06145 var1) {
   }

   protected void N(class06183 var1) {
      class00500 class00500 = this.method_73183().method_8320(var1.u());
      class00500.N(this.method_73183(), class00500, var1, this);
   }

   protected void N(@Nullable class08372<class07049> var1) {
      this.i = var1;
   }

   public boolean N(class04252 var1, @Nullable class07049 var2, @Nullable class08372<class07049> var3, boolean var4) {
      var1.deflect(this, var2, this.field_5974);
      if (!this.method_73183().method_8608()) {
         this.N(var3);
         this.a_(var4);
      }

      return true;
   }

   public DoubleDoubleImmutablePair a_(class07438 var1, class07072 var2) {
      double d0 = this.method_18798().M;
      double d1 = this.method_18798().Z;
      return DoubleDoubleImmutablePair.of(d0, d1);
   }

   protected void a_(boolean var1) {
   }

   protected boolean v_() {
      return false;
   }
}
