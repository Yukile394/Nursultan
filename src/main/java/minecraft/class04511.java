package minecraft;

import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04511 extends class04507<class00690, class08805> {
   public static final class01894 N;
   private static final class01894 y;
   private static final class01894 L;
   private static final class01894 u;
   private static final class07311 i;
   private static final class07311 R;
   private static final class07311 M;
   private static final class07311 B;
   private static final float Z;
   private final class02155 z;
   private static final NamespacedId U;
   private static int E;

   public class04511(class04832 var1) {
      super(var1);
      this.field_4673 = 0.5F;
      this.z = new class02155(var1.N(class04802.Nh));
   }

   protected boolean method_62406(class00690 var1) {
      return false;
   }

   private static void N(CallbackInfo var0) {
      if (E != 0) {
         CapturedRenderingState.INSTANCE.setCurrentEntity(E);
         E = 0;
      }
   }

   private static void N(float var0, float var1, float var2, float var3, class01421 var4, class01237 var5, int var6, CallbackInfo var7) {
      if (WorldRenderingSettings.INSTANCE.getEntityIds() != null) {
         E = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
         CapturedRenderingState.INSTANCE.setCurrentEntity(WorldRenderingSettings.INSTANCE.getEntityIds().applyAsInt(U));
      }
   }

   public static void N(float var0, float var1, float var2, float var3, class01421 var4, class01237 var5, int var6) {
      float f = class04995.N(var0 * var0 + var2 * var2);
      float f1 = class04995.N(var0 * var0 + var1 * var1 + var2 * var2);
      N(var0, var1, var2, var3, var4, var5, var6, null);
      var4.N();
      var4.N(0.0F, 2.0F, 0.0F);
      var4.N(class02058.u.rotation((float)(-Math.atan2(var2, var0)) - (float) (Math.PI / 2)));
      var4.N(class02058.y.rotation((float)(-Math.atan2(f, var1)) - (float) (Math.PI / 2)));
      float f2 = 0.0F - var3 * 0.01F;
      float f3 = f1 / 32.0F - var3 * 0.01F;
      var5.N(
         var4,
         B,
         (var4x, var5x) -> {
            byte b0 = 8;
            float fx = 0.0F;
            float f1x = 0.75F;
            float f2x = 0.0F;

            for (int ix = 1; ix <= 8; ix++) {
               float f3x = class04995.m(ix * (float) (Math.PI * 2) / 8.0F) * 0.75F;
               float f4 = class04995.P(ix * (float) (Math.PI * 2) / 8.0F) * 0.75F;
               float f5 = ix / 8.0F;
               var5x.N(var4x, fx * 0.2F, f1x * 0.2F, 0.0F)
                  .method_39415(-16777216)
                  .method_22913(f2x, f2)
                  .method_22922(class01384.u)
                  .method_60803(var6)
                  .y(var4x, 0.0F, -1.0F, 0.0F);
               var5x.N(var4x, fx, f1x, f1).method_39415(-1).method_22913(f2x, f3).method_22922(class01384.u).method_60803(var6).y(var4x, 0.0F, -1.0F, 0.0F);
               var5x.N(var4x, f3x, f4, f1).method_39415(-1).method_22913(f5, f3).method_22922(class01384.u).method_60803(var6).y(var4x, 0.0F, -1.0F, 0.0F);
               var5x.N(var4x, f3x * 0.2F, f4 * 0.2F, 0.0F)
                  .method_39415(-16777216)
                  .method_22913(f5, f2)
                  .method_22922(class01384.u)
                  .method_60803(var6)
                  .y(var4x, 0.0F, -1.0F, 0.0F);
               fx = f3x;
               f1x = f4;
               f2x = f5;
            }
         }
      );
      var4.y();
      N(null);
   }

   private static void N(class01421 var0, float var1, class01237 var2, class07311 var3) {
      var2.N(
         var0,
         var3,
         (var1x, var2x) -> {
            float f = Math.min(var1 > 0.8F ? (var1 - 0.8F) / 0.2F : 0.0F, 1.0F);
            int ix = class02566.N(1.0F - f, 1.0F, 1.0F, 1.0F);
            int j = 16711935;
            class06069 class06069 = class06069.y(432L);
            Vector3f vector3f = new Vector3f();
            Vector3f vector3f1 = new Vector3f();
            Vector3f vector3f2 = new Vector3f();
            Vector3f vector3f3 = new Vector3f();
            Quaternionf quaternionf = new Quaternionf();
            int k = class04995.y((var1 + var1 * var1) / 2.0F * 60.0F);

            for (int l = 0; l < k; l++) {
               quaternionf.rotationXYZ(class06069.z() * (float) (Math.PI * 2), class06069.z() * (float) (Math.PI * 2), class06069.z() * (float) (Math.PI * 2))
                  .rotateXYZ(
                     class06069.z() * (float) (Math.PI * 2),
                     class06069.z() * (float) (Math.PI * 2),
                     class06069.z() * (float) (Math.PI * 2) + var1 * (float) (Math.PI / 2)
                  );
               var1x.N(quaternionf);
               float f1 = class06069.z() * 20.0F + 5.0F + f * 10.0F;
               float f2 = class06069.z() * 2.0F + 1.0F + f * 2.0F;
               vector3f1.set(-Z * f2, f1, -0.5F * f2);
               vector3f2.set(Z * f2, f1, -0.5F * f2);
               vector3f3.set(0.0F, f1, f2);
               var2x.N(var1x, vector3f).method_39415(ix);
               var2x.N(var1x, vector3f1).method_39415(16711935);
               var2x.N(var1x, vector3f2).method_39415(16711935);
               var2x.N(var1x, vector3f).method_39415(ix);
               var2x.N(var1x, vector3f2).method_39415(16711935);
               var2x.N(var1x, vector3f3).method_39415(16711935);
               var2x.N(var1x, vector3f).method_39415(ix);
               var2x.N(var1x, vector3f3).method_39415(16711935);
               var2x.N(var1x, vector3f1).method_39415(16711935);
            }
         }
      );
   }

   public void method_3936(class08805 var1, class01421 var2, class01237 var3, class06959 var4) {
      var2.N();
      float f = var1.N(7).y();
      float f1 = (float)(var1.N(5).N() - var1.N(10).N());
      var2.N(class02058.u.N(-f));
      var2.N(class02058.y.N(f1 * 10.0F));
      var2.N(0.0F, 0.0F, 1.0F);
      var2.y(-1.0F, -1.0F, 1.0F);
      var2.N(0.0F, -1.501F, 0.0F);
      int ix = class01384.N(0.0F, var1.L);
      if (var1.y > 0.0F) {
         int j = class02566.y(var1.y / 200.0F);
         var3.N(0).N(this.z, var1, var2, class06851.s(y), var1.G, class01384.u, j, null, var1.l, null);
         var3.N(1).N(this.z, var1, var2, R, var1.G, ix, -1, null, var1.l, null);
      } else {
         var3.N(0).N(this.z, var1, var2, i, var1.G, ix, -1, null, var1.l, null);
      }

      var3.N(this.z, var1, var2, M, var1.G, class01384.u, var1.l, null);
      if (var1.y > 0.0F) {
         float f2 = var1.y / 200.0F;
         var2.N();
         var2.N(0.0F, -1.0F, -2.0F);
         N(var2, f2, var3, class06851.W());
         N(var2, f2, var3, class06851.m());
         var2.y();
      }

      var2.y();
      if (var1.u != null) {
         N((float)var1.u.M, (float)var1.u.B, (float)var1.u.Z, var1.P, var2, var3, var1.G);
      }

      super.method_3936(var1, var2, var3, var4);
   }

   public void method_62354(class00690 var1, class08805 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = class04995.B(var3, var1.i, var1.R);
      var2.y = var1.B > 0 ? var1.B + var3 : 0.0F;
      var2.L = var1.fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0;
      class00676 class00676 = var1.W;
      if (class00676 != null) {
         class06889 class06889 = class00676.method_30950(var3).y(0.0, class03127.N(class00676.N + var3), 0.0);
         var2.u = class06889.u(var1.method_30950(var3));
      } else {
         var2.u = null;
      }

      class00699 class00699 = var1.W().N();
      var2.i = class00699 == class00702.u || class00699 == class00702.i;
      var2.R = class00699.N();
      class07209 class07209 = var1.method_73183().N(class07830.field_13203, class06403.N(var1.M()));
      var2.M = class07209.method_19770(var1.method_73189());
      var2.B = var1.method_29504() ? 0.0F : var3;
      var2.Z.N(var1.y);
   }

   public class08805 method_55269() {
      return new class08805();
   }
}
