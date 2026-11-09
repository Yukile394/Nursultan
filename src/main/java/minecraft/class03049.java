package minecraft;

import Nursultan.class10949;
import Nursultan.class10977;
import Nursultan.class11394;
import Nursultan.class11938;
import com.google.common.base.MoreObjects;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixinterface.ItemInHandInterface;
import net.irisshaders.iris.pathways.HandRenderer;
import org.joml.Vector4f;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class03049 implements ItemInHandInterface {
   private static final class07311 N = class06851.n(class01894.y("textures/map/map_background.png"));
   private static final class07311 y = class06851.n(class01894.y("textures/map/map_background_checkerboard.png"));
   private static final float L = -0.4F;
   private static final float u = 0.2F;
   private static final float i = -0.2F;
   private static final float R = -0.6F;
   private static final float M = 0.56F;
   private static final float B = -0.52F;
   private static final float Z = -0.72F;
   private static final float z = 45.0F;
   private static final float U = -80.0F;
   private static final float E = -20.0F;
   private static final float W = -20.0F;
   private static final float m = 10.0F;
   private static final float P = 90.0F;
   private static final float s = 30.0F;
   private static final float T = 0.6F;
   private static final float b = -0.5F;
   private static final float j = 0.0F;
   private static final double v = 27.0;
   private static final float n = 0.8F;
   private static final float t = 0.1F;
   private static final float G = -0.3F;
   private static final float l = 0.4F;
   private static final float d = -0.4F;
   private static final float w = 70.0F;
   private static final float k = -20.0F;
   private static final float Y = -0.6F;
   private static final float Q = 0.8F;
   private static final float O = 0.8F;
   private static final float g = -0.75F;
   private static final float I = -0.9F;
   private static final float J = 45.0F;
   private static final float o = -1.0F;
   private static final float q = 3.6F;
   private static final float K = 3.5F;
   private static final float V = 5.6F;
   private static final int e = 200;
   private static final int H = -135;
   private static final int c = 120;
   private static final float X = -0.4F;
   private static final float a = -0.2F;
   private static final float p = 0.0F;
   private static final float F = 0.04F;
   private static final float A = -0.72F;
   private static final float f = -1.2F;
   private static final float C = -0.5F;
   private static final float S = 45.0F;
   private static final float x = -85.0F;
   private static final float D = 45.0F;
   private static final float h = 92.0F;
   private static final float r = -41.0F;
   private static final float NN = 0.3F;
   private static final float Ny = -1.1F;
   private static final float NL = 0.45F;
   private static final float Nu = 20.0F;
   private static final float Ni = 0.38F;
   private static final float NR = -0.5F;
   private static final float NM = -0.5F;
   private static final float NB = 0.0F;
   private static final float NZ = 0.0078125F;
   private static final int Nz = 7;
   private static final int NU = 128;
   private static final int NE = 128;
   private static final float NW = 0.0F;
   private static final float Nm = 0.0F;
   private static final float NP = 0.04F;
   private static final float Ns = 0.0F;
   private static final float NT = 0.004F;
   private static final float Nb = 0.0F;
   private static final float Nj = 0.2F;
   private static final float Nv = 0.1F;
   private final class06202 Nn;
   private final class08270 Nt = new class08270();
   private class06584 NG = class06584.E;
   private class06584 Nl = class06584.E;
   private float Nd;
   private float Nw;
   private float Nk;
   private float NY;
   private final class01781 NQ;
   private final class08943 NO;
   private HandRenderer Ng;
   private class11394 NI;
   private class10949 NJ;

   private void L(
      class04477 var1,
      float var2,
      float var3,
      class07050 var4,
      float var5,
      class06584 var6,
      float var7,
      class01421 var8,
      class01237 var9,
      int var10,
      CallbackInfo var11
   ) {
      this.NJ = class10949.N(new Vector4f(0.0F, 0.0F, 0.0F, 1.0F), new Vector4f(0.0F, 0.0F, 0.0F, 1.0F));
      class11938.L().L(this.NJ);
      Vector4f vector4f = this.N(var1, var4) == class07070.field_6183 ? this.NJ.y() : this.NJ.N();
      var8.N(vector4f.x(), vector4f.y(), vector4f.z());
   }

   public class03049(class06202 var1, class01781 var2, class08943 var3) {
      super();
      this.Nn = var1;
      this.NQ = var2;
      this.NO = var3;
   }

   private void i(
      class04477 var1,
      float var2,
      float var3,
      class07050 var4,
      float var5,
      class06584 var6,
      float var7,
      class01421 var8,
      class01237 var9,
      int var10,
      CallbackInfo var11
   ) {
      this.N(var1, var4, var5, var8);
   }

   private void u(
      class04477 var1,
      float var2,
      float var3,
      class07050 var4,
      float var5,
      class06584 var6,
      float var7,
      class01421 var8,
      class01237 var9,
      int var10,
      CallbackInfo var11
   ) {
      if (this.NJ != null) {
         Vector4f vector4f = this.N(var1, var4) == class07070.field_6183 ? this.NJ.y() : this.NJ.N();
         var8.y(vector4f.w(), vector4f.w(), vector4f.w());
      }
   }

   private static class03070 y(class04453 var0) {
      class06584 class06584 = var0.method_6030();
      class07050 class07050 = var0.method_6058();
      if (!class06584.N(class06570.sx) && !class06584.N(class06570.dw)) {
         return class07050 == class07050.field_5808 && N(var0.method_6079()) ? class03070.field_28385 : class03070.field_28384;
      } else {
         return class03070.N(class07050);
      }
   }

   private void y(class01421 var1, class07070 var2, float var3) {
      int ix = var2 == class07070.field_6183 ? 1 : -1;
      var1.N(ix * 0.56F, -0.52F + var3 * -0.6F, -0.72F);
   }

   private void y(
      class04477 var1,
      float var2,
      float var3,
      class07050 var4,
      float var5,
      class06584 var6,
      float var7,
      class01421 var8,
      class01237 var9,
      int var10,
      CallbackInfo var11
   ) {
      if (!class11938.u().S().N(var4)) {
         var11.cancel();
      }
   }

   private float y(class04453 var1, float var2) {
      return this.NI.N();
   }

   private void N(
      class04477 var1,
      float var2,
      float var3,
      class07050 var4,
      float var5,
      class06584 var6,
      float var7,
      class01421 var8,
      class01237 var9,
      int var10,
      CallbackInfo var11
   ) {
      if (Iris.isPackInUseQuick()) {
         if (HandRenderer.INSTANCE.isRenderingSolid() && HandRenderer.INSTANCE.isHandTranslucent(var4)) {
            var11.cancel();
         } else if (!HandRenderer.INSTANCE.isRenderingSolid() && !HandRenderer.INSTANCE.isHandTranslucent(var4)) {
            var11.cancel();
         }
      }
   }

   private boolean N(class08133 var1) {
      return this.Ng == null;
   }

   private void N(class01422 var1, Operation var2) {
      if (this.Ng == null) {
         var2.call(new Object[]{var1});
      } else {
         this.Ng.endRender();
      }
   }

   private void N(class03049 var1, float var2, class01421 var3, int var4, class07070 var5, LocalFloatRef var6) {
      this.N(var1, var2, var3, var4, var5, var6.get());
   }

   private void N(CallbackInfo var1) {
      class06584 class06584x = ((class04453)this.Nn.T_4).method_6047();
      if (this.NG.B() == class06584x.B() && !this.NG.B().allowComponentsUpdateAnimation((class04453)this.Nn.T_4, class07050.field_5808, this.NG, class06584x)) {
         this.NG = class06584x;
      }

      class06584 class06584x = ((class04453)this.Nn.T_4).method_6079();
      if (this.Nl.B() == class06584x.B() && !this.Nl.B().allowComponentsUpdateAnimation((class04453)this.Nn.T_4, class07050.field_5810, this.Nl, class06584x)) {
         this.Nl = class06584x;
      }
   }

   private void N(float var1, class01421 var2, class01237 var3, class04453 var4, int var5, CallbackInfo var6) {
      this.NI = class11394.N(var4.method_36454(), var4.method_36455());
      class11938.L().L(this.NI);
   }

   private class07070 N(class04477 var1, class07050 var2) {
      return var2 == class07050.field_5808 ? var1.method_6068() : var1.method_6068().N();
   }

   private float N(class04453 var1, float var2) {
      return this.NI.y();
   }

   private void N(
      class04477 var1,
      float var2,
      float var3,
      class07050 var4,
      float var5,
      class06584 var6,
      float var7,
      class01421 var8,
      class01237 var9,
      int var10,
      CallbackInfo var11,
      class06509 var12
   ) {
      if (var12 == class06509.field_8953 || var12 == class06509.field_8949) {
         this.N(var1, var4, var5, var8);
      }
   }

   private void N(class03049 var1, float var2, class01421 var3, int var4, class07070 var5, float var6) {
      var3.N(-var4 * 0.56F, 0.52F + var6 * 0.6F, 0.72F);
      class10977 class10977 = class10977.N(var5, var3, var2, 0.0F);
      class11938.L().L(class10977);
      if (!class10977.y()) {
         var3.N(var4 * 0.56F, -0.52F + var6 * -0.6F, -0.72F);
         this.N(var2, var3, var4, var5);
      }
   }

   private void N(class04477 var1, class07050 var2, float var3, class01421 var4) {
      if (VisualSettings.INSTANCE.swingHandOnItemUse.isEnabled()) {
         class07070 class07070 = var2 == class07050.field_5808 ? var1.method_6068() : var1.method_6068().N();
         this.N(var4, class07070, var3);
      }
   }

   private void N(class01421 var1, class01237 var2, int var3, class06584 var4) {
      var1.N(class02058.u.N(180.0F));
      var1.N(class02058.R.N(180.0F));
      var1.y(0.38F, 0.38F, 0.38F);
      var1.N(-0.5F, -0.5F, 0.0F);
      var1.y(0.0078125F, 0.0078125F, 0.0078125F);
      class02265 class02265 = var4.method_58694(class02484.f);
      class07769 class07769 = class06548.N(class02265, (class03448)this.Nn.T_3);
      class07311 class07311 = class07769 == null ? N : y;
      var2.N(var1, class07311, (var1x, var2x) -> {
         var2x.N(var1x, -7.0F, 135.0F, 0.0F).method_39415(-1).method_22913(0.0F, 1.0F).method_60803(var3);
         var2x.N(var1x, 135.0F, 135.0F, 0.0F).method_39415(-1).method_22913(1.0F, 1.0F).method_60803(var3);
         var2x.N(var1x, 135.0F, -7.0F, 0.0F).method_39415(-1).method_22913(1.0F, 0.0F).method_60803(var3);
         var2x.N(var1x, -7.0F, -7.0F, 0.0F).method_39415(-1).method_22913(0.0F, 0.0F).method_60803(var3);
      });
      if (class07769 != null) {
         class01083 class01083 = this.Nn.yR();
         class01083.N(class02265, class07769, this.Nt);
         class01083.N(this.Nt, var1, var2, false, var3);
      }
   }

   private void N(class01421 var1, class01237 var2, int var3, float var4, float var5, class07070 var6) {
      boolean flag = var6 != class07070.field_6182;
      float fx = flag ? 1.0F : -1.0F;
      float f1 = class04995.N(var5);
      float f2 = -0.3F * class04995.m(f1 * (float) Math.PI);
      float f3 = 0.4F * class04995.m(f1 * (float) (Math.PI * 2));
      float f4 = -0.4F * class04995.m(var5 * (float) Math.PI);
      var1.N(fx * (f2 + 0.64000005F), f3 + -0.6F + var4 * -0.6F, f4 + -0.71999997F);
      var1.N(class02058.u.N(fx * 45.0F));
      float f5 = class04995.m(var5 * var5 * (float) Math.PI);
      float f6 = class04995.m(f1 * (float) Math.PI);
      var1.N(class02058.u.N(fx * f6 * 70.0F));
      var1.N(class02058.R.N(fx * f5 * -20.0F));
      class04453 class04453 = (class04453)this.Nn.T_4;
      var1.N(fx * -1.0F, 3.6F, 3.5F);
      var1.N(class02058.R.N(fx * 120.0F));
      var1.N(class02058.y.N(200.0F));
      var1.N(class02058.u.N(fx * -135.0F));
      var1.N(fx * 5.6F, 0.0F, 0.0F);
      class08287<class04477> class08287 = this.NQ.N(class04453);
      class01894 class01894 = class04453.Z().N().y();
      if (flag) {
         class08287.N(var1, var2, var3, class01894, class04453.method_74091(class08030.field_7570));
      } else {
         class08287.y(var1, var2, var3, class01894, class04453.method_74091(class08030.field_7568));
      }
   }

   private void N(class01421 var1, float var2, class07070 var3, class06584 var4, class08036 var5) {
      float fx = var5.method_6014() - var2 + 1.0F;
      float f1 = fx / var4.N((class07438)var5);
      if (f1 < 0.8F) {
         float f2 = class04995.L(class04995.P(fx / 4.0F * (float) Math.PI) * 0.1F);
         var1.N(0.0F, f2, 0.0F);
      }

      float f3 = 1.0F - (float)Math.pow(f1, 27.0);
      int ix = var3 == class07070.field_6183 ? 1 : -1;
      var1.N(f3 * 0.6F * ix, f3 * -0.5F, f3 * 0.0F);
      var1.N(class02058.u.N(ix * f3 * 90.0F));
      var1.N(class02058.y.N(f3 * 10.0F));
      var1.N(class02058.R.N(ix * f3 * 30.0F));
   }

   private void N(class01421 var1, float var2, class07070 var3, class08036 var4) {
      float fx = var4.method_6014() % 10 - var2 + 1.0F;
      float f1 = 1.0F - fx / 10.0F;
      float f2 = -90.0F;
      float f3 = 60.0F;
      float f4 = 150.0F;
      float f5 = -15.0F;
      byte b0 = 2;
      float f6 = -15.0F + 75.0F * class04995.P(f1 * 2.0F * (float) Math.PI);
      if (var3 != class07070.field_6183) {
         var1.N(0.1, 0.83, 0.35);
         var1.N(class02058.y.N(-80.0F));
         var1.N(class02058.u.N(-90.0F));
         var1.N(class02058.y.N(f6));
         var1.N(-0.3, 0.22, 0.35);
      } else {
         var1.N(-0.25, 0.22, 0.35);
         var1.N(class02058.y.N(-80.0F));
         var1.N(class02058.u.N(90.0F));
         var1.N(class02058.R.N(0.0F));
         var1.N(class02058.y.N(f6));
      }
   }

   private void N(class01421 var1, class07070 var2, float var3) {
      int ix = var2 == class07070.field_6183 ? 1 : -1;
      float fx = class04995.m(var3 * var3 * (float) Math.PI);
      var1.N(class02058.u.N(ix * (45.0F + fx * -20.0F)));
      float f1 = class04995.m(class04995.N(var3) * (float) Math.PI);
      var1.N(class02058.R.N(ix * f1 * -20.0F));
      var1.N(class02058.y.N(f1 * -80.0F));
      var1.N(class02058.u.N(ix * -45.0F));
   }

   public void N(class07438 var1, class06584 var2, class03662 var3, class01421 var4, class01237 var5, int var6) {
      if (!var2.R()) {
         class08898 class08898 = new class08898();
         this.NO.N(class08898, var2, var3, var1.method_73183(), var1, var1.method_5628() + var3.ordinal());
         class08898.N(var4, var5, var6, class01384.u, 0);
      }
   }

   private float N(float var1) {
      float fx = 1.0F - var1 / 45.0F + 0.1F;
      fx = class04995.N(fx, 0.0F, 1.0F);
      return -class04995.P(fx * (float) Math.PI) * 0.5F + 0.5F;
   }

   private void N(class01421 var1, class01237 var2, int var3, class07070 var4) {
      class08287<class04477> class08287 = this.NQ.N((class04453)this.Nn.T_4);
      var1.N();
      float fx = var4 == class07070.field_6183 ? 1.0F : -1.0F;
      var1.N(class02058.u.N(92.0F));
      var1.N(class02058.y.N(45.0F));
      var1.N(class02058.R.N(fx * -41.0F));
      var1.N(fx * 0.3F, -1.1F, 0.45F);
      class01894 class01894 = ((class04453)this.Nn.T_4).Z().N().y();
      if (var4 == class07070.field_6183) {
         class08287.N(var1, var2, var3, class01894, ((class04453)this.Nn.T_4).method_74091(class08030.field_7570));
      } else {
         class08287.y(var1, var2, var3, class01894, ((class04453)this.Nn.T_4).method_74091(class08030.field_7568));
      }

      var1.y();
   }

   private void N(class01421 var1, class01237 var2, int var3, float var4, class07070 var5, float var6, class06584 var7) {
      float fx = var5 == class07070.field_6183 ? 1.0F : -1.0F;
      var1.N(fx * 0.125F, -0.125F, 0.0F);
      if (!((class04453)this.Nn.T_4).method_5767()) {
         var1.N();
         var1.N(class02058.R.N(fx * 10.0F));
         this.N(var1, var2, var3, var4, var6, var5);
         var1.y();
      }

      var1.N();
      var1.N(fx * 0.51F, -0.08F + var4 * -1.2F, -0.75F);
      float f1 = class04995.N(var6);
      float f2 = class04995.m(f1 * (float) Math.PI);
      float f3 = -0.5F * f2;
      float f4 = 0.4F * class04995.m(f1 * (float) (Math.PI * 2));
      float f5 = -0.3F * class04995.m(var6 * (float) Math.PI);
      var1.N(fx * f3, f4 - 0.3F * f2, f5);
      var1.N(class02058.y.N(f2 * -45.0F));
      var1.N(class02058.u.N(fx * f2 * -30.0F));
      this.N(var1, var2, var3, var7);
      var1.y();
   }

   private void N(class01421 var1, class01237 var2, int var3, float var4, float var5, float var6) {
      float fx = class04995.N(var6);
      float f1 = -0.2F * class04995.m(var6 * (float) Math.PI);
      float f2 = -0.4F * class04995.m(fx * (float) Math.PI);
      var1.N(0.0F, -f1 / 2.0F, f2);
      float f3 = this.N(var4);
      var1.N(0.0F, 0.04F + var5 * -1.2F + f3 * -0.5F, -0.72F);
      var1.N(class02058.y.N(f3 * -85.0F));
      if (!((class04453)this.Nn.T_4).method_5767()) {
         var1.N();
         var1.N(class02058.u.N(90.0F));
         this.N(var1, var2, var3, class07070.field_6183);
         this.N(var1, var2, var3, class07070.field_6182);
         var1.y();
      }

      float f4 = class04995.m(fx * (float) Math.PI);
      var1.N(class02058.y.N(f4 * 20.0F));
      var1.y(2.0F, 2.0F, 2.0F);
      this.N(var1, var2, var3, this.NG);
   }

   private void N(float var1, class01421 var2, int var3, class07070 var4) {
      float fx = -0.4F * class04995.m(class04995.N(var1) * (float) Math.PI);
      float f1 = 0.2F * class04995.m(class04995.N(var1) * (float) (Math.PI * 2));
      float f2 = -0.2F * class04995.m(var1 * (float) Math.PI);
      var2.N(var3 * fx, f1, f2);
      this.N(var2, var4, var1);
   }

   public void N(class07050 var1) {
      if (var1 == class07050.field_5808) {
         this.Nd = 0.0F;
      } else {
         this.Nk = 0.0F;
      }
   }

   private boolean N(class06584 var1, class06584 var2) {
      return class06584.N(var1, var2, class02477::i) ? true : !this.NO.N(var2);
   }

   public void N() {
      this.N(null);
      this.Nw = this.Nd;
      this.NY = this.Nk;
      class04453 class04453 = (class04453)this.Nn.T_4;
      class06584 class06584x = class04453.method_6047();
      class06584 class06584x = class04453.method_6079();
      if (this.N(this.NG, class06584x)) {
         this.NG = class06584x;
      }

      if (this.N(this.Nl, class06584x)) {
         this.Nl = class06584x;
      }

      if (class04453.n()) {
         this.Nd = class04995.N(this.Nd - 0.4F, 0.0F, 1.0F);
         this.Nk = class04995.N(this.Nk - 0.4F, 0.0F, 1.0F);
      } else {
         float fx = class04453.method_75194(1.0F);
         float f1 = this.NG != class06584x ? 0.0F : fx * fx * fx;
         float f2 = this.Nl != class06584x ? 0.0F : 1.0F;
         this.Nd = this.Nd + class04995.N(f1 - this.Nd, -0.4F, 0.4F);
         this.Nk = this.Nk + class04995.N(f2 - this.Nk, -0.4F, 0.4F);
      }

      if (this.Nd < 0.1F) {
         this.NG = class06584x;
      }

      if (this.Nk < 0.1F) {
         this.Nl = class06584x;
      }
   }

   public void N(float var1, class01421 var2, class01237 var3, class04453 var4, int var5) {
      this.N(var1, var2, var3, var4, var5, null);
      float fx = var4.method_6055(var1);
      class07050 class07050 = (class07050)MoreObjects.firstNonNull(var4.fields_0212a028292fd3c078969e3ee4c71d9e8_6, class07050.field_5808);
      float f1 = var4.method_61414(var1);
      class03070 class03070 = N(var4);
      float f2 = class04995.B(var1, (Float)var4.B_0, (Float)var4.u_1);
      float f3 = class04995.B(var1, (Float)var4.u_2, (Float)var4.u_0);
      var2.N(class02058.y.N((this.y(var4, var1) - f2) * 0.1F));
      var2.N(class02058.u.N((this.N(var4, var1) - f3) * 0.1F));
      if (class03070.field_28387) {
         float f4 = class07050 == class07050.field_5808 ? fx : 0.0F;
         float f5 = this.NO.y(this.NG) * (1.0F - class04995.B(var1, this.Nw, this.Nd));
         this.N(var4, var1, f1, class07050.field_5808, f4, this.NG, f5, var2, var3, var5);
      }

      if (class03070.field_28388) {
         float f6 = class07050 == class07050.field_5810 ? fx : 0.0F;
         float f7 = this.NO.y(this.Nl) * (1.0F - class04995.B(var1, this.NY, this.Nk));
         this.N(var4, var1, f1, class07050.field_5810, f6, this.Nl, f7, var2, var3, var5);
      }

      class08133 class08133 = ((class03386)this.Nn.i_5).L();
      if (this.N(class08133)) {
         class08133.N();
      }

      class01422 class01422 = this.Nn.Ne().L();
      this.N(class01422, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_4597$class_4598]");
         ((class01422)var0[0]).u();
         return (Void)null;
      });
   }

   static class03070 N(class04453 var0) {
      class06584 class06584x = var0.method_6047();
      class06584 class06584x = var0.method_6079();
      boolean flag = class06584x.N(class06570.sx) || class06584x.N(class06570.sx);
      boolean flag1 = class06584x.N(class06570.dw) || class06584x.N(class06570.dw);
      if (!flag && !flag1) {
         return class03070.field_28384;
      } else if (var0.method_6115()) {
         return y(var0);
      } else {
         return N(class06584x) ? class03070.field_28385 : class03070.field_28384;
      }
   }

   private void N(
      class04477 var1, float var2, float var3, class07050 var4, float var5, class06584 var6, float var7, class01421 var8, class01237 var9, int var10
   ) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.y(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            if (!var1.method_31550()) {
               boolean flag = var4 == class07050.field_5808;
               class07070 class07070 = flag ? var1.method_6068() : var1.method_6068().N();
               var8.N();
               if (var6.R()) {
                  if (flag && !var1.method_5767()) {
                     this.N(var8, var9, var10, var7, var5, class07070);
                  }
               } else if (var6.L(class02484.f)) {
                  if (flag && this.Nl.R()) {
                     this.N(var8, var9, var10, var3, var7, var5);
                  } else {
                     this.N(var8, var9, var10, var7, class07070, var5, var6);
                  }
               } else if (var6.N(class06570.dw)) {
                  this.y(var8, class07070, var7);
                  boolean flag1 = class06593.u(var6);
                  boolean flag2 = class07070 == class07070.field_6183;
                  int ix = flag2 ? 1 : -1;
                  if (var1.method_6115() && var1.method_6014() > 0 && var1.method_6058() == var4 && !flag1) {
                     var8.N(ix * -0.4785682F, -0.094387F, 0.05731531F);
                     var8.N(class02058.y.N(-11.935F));
                     var8.N(class02058.u.N(ix * 65.3F));
                     var8.N(class02058.R.N(ix * -9.785F));
                     float fx = var6.N((class07438)var1) - (var1.method_6014() - var2 + 1.0F);
                     float f1 = fx / class06593.y(var6, var1);
                     if (f1 > 1.0F) {
                        f1 = 1.0F;
                     }

                     if (f1 > 0.1F) {
                        float f2 = class04995.m((fx - 0.1F) * 1.3F);
                        float f3 = f1 - 0.1F;
                        float f4 = f2 * f3;
                        var8.N(f4 * 0.0F, f4 * 0.004F, f4 * 0.0F);
                     }

                     var8.N(f1 * 0.0F, f1 * 0.0F, f1 * 0.04F);
                     var8.y(1.0F, 1.0F, 1.0F + f1 * 0.2F);
                     var8.N(class02058.L.N(ix * 45.0F));
                  } else {
                     this.N(var5, var8, ix, class07070);
                     if (flag1 && var5 < 0.001F && flag) {
                        var8.N(ix * -0.641864F, 0.0F, 0.0F);
                        var8.N(class02058.u.N(ix * 10.0F));
                     }
                  }

                  this.N(var1, var6, flag2 ? class03662.field_4322 : class03662.field_4321, var8, var9, var10);
               } else {
                  boolean flag3 = class07070 == class07070.field_6183;
                  int jx = flag3 ? 1 : -1;
                  this.L(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
                  if (var1.method_6115() && var1.method_6014() > 0 && var1.method_6058() == var4) {
                     class06509 class06509 = var6.G();
                     if (!class06509.y()) {
                        this.y(var8, class07070, var7);
                        this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null, class06509);
                     }

                     switch (class06509) {
                        case field_8952:
                        default:
                           break;
                        case field_8950:
                        case field_8946:
                           this.N(var8, var2, class07070, var6, var1);
                           this.y(var8, class07070, var7);
                           this.i(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
                           break;
                        case field_8949:
                           if (!(var6.B() instanceof class06493)) {
                              var8.N(jx * -0.14142136F, 0.08F, 0.14142136F);
                              var8.N(class02058.y.N(-102.25F));
                              var8.N(class02058.u.N(jx * 13.365F));
                              var8.N(class02058.R.N(jx * 78.05F));
                           }
                           break;
                        case field_8953:
                           var8.N(jx * -0.2785682F, 0.18344387F, 0.15731531F);
                           var8.N(class02058.y.N(-13.935F));
                           var8.N(class02058.u.N(jx * 35.3F));
                           var8.N(class02058.R.N(jx * -9.785F));
                           float f7 = var6.N((class07438)var1) - (var1.method_6014() - var2 + 1.0F);
                           float f9 = f7 / 20.0F;
                           f9 = (f9 * f9 + f9 * 2.0F) / 3.0F;
                           if (f9 > 1.0F) {
                              f9 = 1.0F;
                           }

                           if (f9 > 0.1F) {
                              float f11 = class04995.m((f7 - 0.1F) * 1.3F);
                              float f13 = f9 - 0.1F;
                              float f15 = f11 * f13;
                              var8.N(f15 * 0.0F, f15 * 0.004F, f15 * 0.0F);
                           }

                           var8.N(f9 * 0.0F, f9 * 0.0F, f9 * 0.04F);
                           var8.y(1.0F, 1.0F, 1.0F + f9 * 0.2F);
                           var8.N(class02058.L.N(jx * 45.0F));
                           break;
                        case field_63380:
                           var8.N(jx * -0.5F, 0.7F, 0.1F);
                           var8.N(class02058.y.N(-55.0F));
                           var8.N(class02058.u.N(jx * 35.3F));
                           var8.N(class02058.R.N(jx * -9.785F));
                           float f6 = var6.N((class07438)var1) - (var1.method_6014() - var2 + 1.0F);
                           float f8 = f6 / 10.0F;
                           if (f8 > 1.0F) {
                              f8 = 1.0F;
                           }

                           if (f8 > 0.1F) {
                              float f10 = class04995.m((f6 - 0.1F) * 1.3F);
                              float f12 = f8 - 0.1F;
                              float f14 = f10 * f12;
                              var8.N(f14 * 0.0F, f14 * 0.004F, f14 * 0.0F);
                           }

                           var8.N(0.0F, 0.0F, f8 * 0.2F);
                           var8.y(1.0F, 1.0F, 1.0F + f8 * 0.2F);
                           var8.N(class02058.L.N(jx * 45.0F));
                           break;
                        case field_42717:
                           this.N(var8, var2, class07070, var1);
                           break;
                        case field_55494:
                           this.N(var5, var8, jx, class07070);
                           break;
                        case field_8951:
                           var8.N(jx * 0.56F, -0.52F, -0.72F);
                           float f5 = var6.N((class07438)var1) - (var1.method_6014() - var2 + 1.0F);
                           class06733.N(var1.method_75879(var2), var8, f5, class07070, var6);
                     }
                  } else if (var1.method_6123()) {
                     this.y(var8, class07070, var7);
                     var8.N(jx * -0.4F, 0.8F, 0.3F);
                     var8.N(class02058.u.N(jx * 65.0F));
                     var8.N(class02058.R.N(jx * -85.0F));
                  } else {
                     this.y(var8, class07070, var7);
                     switch (var6.e().N()) {
                        case field_63398:
                        default:
                           break;
                        case field_63399:
                           LocalFloatRefImpl localfloatrefimpl = new LocalFloatRefImpl();
                           localfloatrefimpl.init(var7);
                           this.N(this, var5, var8, jx, class07070, localfloatrefimpl);
                           var7 = localfloatrefimpl.dispose();
                           break;
                        case field_63400:
                           class06733.N(var5, var8, jx, class07070);
                     }
                  }

                  class03662 class03662 = flag3 ? class03662.field_4322 : class03662.field_4321;
                  this.u(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
                  this.R(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, null);
                  this.N(var1, var6, class03662, var8, var9, var10);
               }

               var8.y();
            }
         }
      }
   }

   private static boolean N(class06584 var0) {
      return var0.N(class06570.dw) && class06593.u(var0);
   }

   public void iris$renderHandsWithCustomRenderer(HandRenderer var1, float var2, class01421 var3, class04790 var4, @Nullable class04453 var5, int var6) {
      this.Ng = var1;
      this.N(var2, var3, var4, var5, var6);
      this.Ng = null;
   }

   private void R(
      class04477 var1,
      float var2,
      float var3,
      class07050 var4,
      float var5,
      class06584 var6,
      float var7,
      class01421 var8,
      class01237 var9,
      int var10,
      CallbackInfo var11
   ) {
      if (VisualSettings.INSTANCE.tiltItemPositions.isEnabled() && !(var6.B() instanceof class06918)) {
         int ix = (var4 == class07050.field_5808 ? var1.method_6068() : var1.method_6068().N()) == class07070.field_6183 ? 1 : -1;
         float fx = 0.8819767F;
         var8.y(0.8819767F, 0.8819767F, 0.8819767F);
         var8.N(ix * -0.084F, 0.059F, 0.08F);
         var8.N(class02058.u.N(ix * 5.0F));
      }
   }
}
