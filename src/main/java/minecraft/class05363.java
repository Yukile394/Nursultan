package minecraft;

import Nursultan.class09305;
import Nursultan.class09316;
import Nursultan.class09329;
import Nursultan.class11938;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import java.util.Arrays;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05363 implements class00023 {
   private static final float N = 4.0F;
   private static final Vector3f y = new Vector3f(0.0F, 0.0F, -1.0F);
   private static final Vector3f L = new Vector3f(0.0F, 1.0F, 0.0F);
   private static final Vector3f u = new Vector3f(-1.0F, 0.0F, 0.0F);
   private boolean i;
   private class07299 R;
   private class07049 M;
   private class06889 B = class06889.L;
   private final class07218 Z = new class07218();
   private final Vector3f z = new Vector3f(y);
   private final Vector3f U = new Vector3f(L);
   private final Vector3f E = new Vector3f(u);
   private float W;
   private float m;
   private final Quaternionf P = new Quaternionf();
   private boolean s;
   private float T;
   private float b;
   private float j;
   private final class00579 v = new class00579();

   public void L() {
      this.N(null);
      if (this.M != null) {
         this.b = this.T;
         this.T = this.T + (this.M.method_5751() - this.T) * 0.5F;
         class00579 class00579 = this.v;
         class07299 class07299 = this.R;
         this.y(null);
         class00579.N(class07299, this.B);
      }
   }

   public Quaternionf M() {
      return this.P;
   }

   public Vector3fc P() {
      return this.U;
   }

   public void T() {
      this.R = null;
      this.M = null;
      this.v.N();
      this.i = false;
   }

   public class05363() {
      super();
   }

   public class07049 B() {
      return this.M;
   }

   public boolean Z() {
      return this.i;
   }

   public float i() {
      return this.W;
   }

   public float b() {
      return this.j;
   }

   public Vector3fc s() {
      return this.E;
   }

   public Vector3fc m() {
      return this.z;
   }

   public class00579 U() {
      return this.v;
   }

   public boolean z() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.s;
   }

   public class07209 u() {
      return this.Z;
   }

   private void y(CallbackInfo var1) {
      if (VisualSettings.INSTANCE.sneakInstantly.isEnabled()) {
         this.T = this.b = this.M.method_5751();
      }
   }

   @Override
   public class06889 y() {
      return this.B;
   }

   public class05343 E() {
      class06202 class06202 = class06202.Nq();
      double d0 = (double)class06202.Nt().U() / class06202.Nt().E();
      double d1 = Math.tan(((class05630)class06202.i_7).Nw().method_41753().intValue() * (float) (Math.PI / 180.0) / 2.0) * 0.05F;
      double d2 = d1 * d0;
      class06889 class06889xx = new class06889(this.z).L(0.05F);
      class06889 class06889x = new class06889(this.E).L(d2);
      class06889 class06889xx = new class06889(this.U).L(d1);
      return new class05343(class06889xx, class06889x, class06889xx);
   }

   public void N(class07299 var1, class07049 var2, boolean var3, boolean var4, float var5) {
      this.i = true;
      this.R = var1;
      this.M = var2;
      this.s = var3;
      this.j = var5;
      if (var2.method_5765() && var2.method_5854() instanceof class07518 class07518 && class07518.N() instanceof class02726 class02726 && class02726.P()) {
         class06889 class06889 = class07518.method_52538(var2)
            .u(class07518.method_73189())
            .u(var2.method_55668(class07518))
            .i(new class06889(0.0, class04995.B(var5, this.b, this.T), 0.0));
         this.N(var2.method_5705(var5), var2.method_5695(var5));
         this.N(class02726.i(var5).i(class06889));
      } else {
         this.N(var2.method_5705(var5), var2.method_5695(var5));
         this.N(
            class04995.u((double)var5, var2.field_6014, var2.method_23317()),
            class04995.u((double)var5, var2.field_6036, var2.method_23318()) + class04995.B(var5, this.b, this.T),
            class04995.u((double)var5, var2.field_5969, var2.method_23321())
         );
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.N(var1, var2, var3, var4, var5, callbackinfo);
         if (callbackinfo.isCancelled()) {
            return;
         }
      }

      if (var3) {
         if (var4) {
            this.N(this.m + 180.0F, -this.W);
         }

         float f2 = 4.0F;
         float f3 = 1.0F;
         if (var2 instanceof class07438 class07438) {
            f3 = class07438.method_55693();
            f2 = (float)class07438.method_45325(class05298.z);
         }

         float f4 = f3;
         float f = f2;
         if (var2.method_5765() && var2.method_5854() instanceof class07438 class07438x) {
            f4 = class07438x.method_55693();
            f = (float)class07438x.method_45325(class05298.z);
         }

         float f1 = Math.max(f3 * f2, f4 * f);
         this.N(-this.N(this, f1), 0.0F, 0.0F);
      } else if (var2 instanceof class07438 && ((class07438)var2).method_6113()) {
         class07211 class07211 = ((class07438)var2).method_18401();
         this.N(class07211 != null ? class07211.U() - 180.0F : 0.0F, 0.0F);
         this.N(0.0F, 0.3F, 0.0F);
      }
   }

   private void N(class07299 var1, class07049 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      class09316 class09316 = class09316.N(
         var2.method_5705(var5),
         var2.method_5695(var5),
         class04995.u((double)var5, var2.field_6014, var2.method_23317()),
         class04995.u((double)var5, var2.field_6036, var2.method_23318()) + class04995.B(var5, this.b, this.T),
         class04995.u((double)var5, var2.field_5969, var2.method_23321())
      );
      class11938.L().L(class09316);
      if (class09316.y()) {
         var6.cancel();
      }

      this.N(class09316.i(), class09316.M());
      this.N(class09316.R(), class09316.L(), class09316.u());
   }

   public final float N(float var1) {
      float f = 0.1F;

      for (int ix = 0; ix < 8; ix++) {
         float f1 = (ix & 1) * 2 - 1;
         float f2 = (ix >> 1 & 1) * 2 - 1;
         float f3 = (ix >> 2 & 1) * 2 - 1;
         class06889 class06889x = this.B.y(f1 * 0.1F, f2 * 0.1F, f3 * 0.1F);
         class06889 class06889x = class06889x.i(new class06889(this.z).L((double)(-var1)));
         class06183 class06183 = this.R.N(new class05862(class06889x, class06889x, class05849.field_23142, class05835.field_1348, this.M));
         if (class06183.N() != class07113.field_1333) {
            float f4 = (float)class06183.y().M(this.B);
            if (f4 < class04995.z(var1)) {
               var1 = class04995.N(f4);
            }
         }
      }

      return var1;
   }

   private void N(CallbackInfoReturnable var1) {
      class09305 class09305 = class09305.y(this.s);
      class11938.L().L(class09305);
      var1.setReturnValue(class09305.N());
   }

   private float N(class05363 var1, float var2) {
      class09329 class09329 = class09329.y(var2);
      class11938.L().L(class09329);
      var2 = class09329.y();
      return !class09329.N() ? var2 : var1.N(var2);
   }

   public void N(CallbackInfo var1) {
      if (SodiumExtraClientMod.options().extraSettings.instantSneak && this.M != null) {
         this.T = this.M.method_5751();
      }
   }

   protected void N(double var1, double var3, double var5) {
      this.N(new class06889(var1, var3, var5));
   }

   protected void N(float var1, float var2) {
      this.W = var2;
      this.m = var1;
      this.P.rotationYXZ((float) Math.PI - var1 * (float) (Math.PI / 180.0), -var2 * (float) (Math.PI / 180.0), 0.0F);
      y.rotate(this.P, this.z);
      L.rotate(this.P, this.U);
      u.rotate(this.P, this.E);
   }

   @Override
   public float N() {
      return class04995.R(this.R());
   }

   protected void N(float var1, float var2, float var3) {
      Vector3f vector3f = new Vector3f(var3, var2, -var1).rotate(this.P);
      this.N(new class06889(this.B.M + vector3f.x, this.B.B + vector3f.y, this.B.Z + vector3f.z));
   }

   protected void N(class06889 var1) {
      this.B = var1;
      this.Z.N(var1.M, var1.B, var1.Z);
   }

   public class04798 W() {
      if (!this.i) {
         return class04798.field_27888;
      } else {
         class04688 class04688x = this.R.method_8316(this.Z);
         if (class04688x.N(class01231.N) && this.B.B < this.Z.method_10264() + class04688x.N(this.R, this.Z)) {
            return class04798.field_27886;
         } else {
            class05343 class05343 = this.E();

            for (class06889 class06889x : Arrays.asList(class05343.N, class05343.N(), class05343.y(), class05343.L(), class05343.u())) {
               class06889 class06889x = this.B.i(class06889x);
               class07209 class07209 = class07209.method_49638(class06889x);
               class04688 class04688x = this.R.method_8316(class07209);
               if (class04688x.N(class01231.y)) {
                  if (class06889x.B <= class04688x.N(this.R, class07209) + class07209.method_10264()) {
                     return class04798.field_27885;
                  }
               } else if (this.R.method_8320(class07209).N(class00869.ba)) {
                  return class04798.field_27887;
               }
            }

            return class04798.field_27888;
         }
      }
   }

   public float R() {
      return this.m;
   }
}
