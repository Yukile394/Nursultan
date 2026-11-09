package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01451 extends class00741 {
   public static final MapCodec<class01451> N = y(class01451::new);
   private static final double y = 0.13;
   private static final double L = 0.08;
   private static final double i = 0.05;
   private static final int R = 20;
   private static final class00494 M = class00891.y(14.0, 0.0, 15.0);
   private static final class00494 B;

   private static boolean L(class07049 var0) {
      return var0 instanceof class07438 || var0 instanceof class07504 || var0 instanceof class00674 || var0 instanceof class00250;
   }

   private static double L(double var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueD() : (var0 - 0.08) * 0.98F;
   }

   public class01451(class01362 var1) {
      super(var1);
   }

   @Override
   public float Z() {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? 0.8F : super.Z();
   }

   @Override
   public float U() {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? 0.6F : super.U();
   }

   @Override
   public float z() {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? 1.0F : super.z();
   }

   private void u(class07049 var1) {
      class06889 class06889 = var1.method_18798();
      if (y(var1.method_18798().B) < -0.13) {
         double d0 = -0.05 / y(var1.method_18798().B);
         var1.method_18799(new class06889(class06889.M * d0, L(-0.05), class06889.Z * d0));
      } else {
         var1.method_18799(new class06889(class06889.M, L(-0.05), class06889.Z));
      }

      var1.method_38785();
   }

   public static void y(class07049 var0) {
      N(var0, 10);
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      class00494 class00494x;
      class00494 class00494x = class00494x = M;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class00494x);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00494x;
   }

   private static double y(double var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueD() : var0 / 0.98F + 0.08;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(B);
      }
   }

   private static void N(double var0, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
         var2.setReturnValue(var0);
      }
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6, CallbackInfo var7) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var7.cancel();
         if (this.N(var3, var4)) {
            this.N(var2, var4);
         }

         class06889 class06889 = var4.method_18798();
         var4.method_18799(new class06889(class06889.M * 0.4F, Math.max(-0.12F, class06889.B), class06889.Z * 0.4F));
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class07049 var4) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         double d0 = Math.abs(var4.method_18798().B);
         if (d0 < 0.1 && !var4.method_21749()) {
            double d1 = 0.4 + d0 * 0.2;
            var4.method_18799(var4.method_18798().u(d1, 1.0, d1));
         }
      } else {
         super.N(var1, var2, var3, var4);
      }
   }

   private boolean N(class07209 var1, class07049 var2) {
      if (var2.method_24828()) {
         return false;
      } else if (var2.method_23318() > var1.method_10264() + 0.9375 - 1.0E-7) {
         return false;
      } else if (y(var2.method_18798().B) >= -0.08) {
         return false;
      } else {
         double d0 = Math.abs(var1.method_10263() + 0.5 - var2.method_23317());
         double d1 = Math.abs(var1.method_10260() + 0.5 - var2.method_23321());
         double d2 = 0.4375 + var2.method_17681() / 2.0F;
         return d0 + 1.0E-7 > d2 || d1 + 1.0E-7 > d2;
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.N(var3, var4)) {
            this.N(var4, var3);
            this.u(var4);
            this.N(var2, var4);
         }

         super.N(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      var4.method_5783(class04909.Pd, 1.0F, 1.0F);
      if (!var1.method_8608()) {
         var1.method_8421(var4, (byte)54);
      }

      if (var4.method_5747(var5, 0.2F, var1.method_48963().E())) {
         var4.method_5783(this.q.M(), this.q.N() * 0.5F, this.q.y() * 0.75F);
      }
   }

   @Override
   public MapCodec<class01451> N() {
      return N;
   }

   private static void N(class07049 var0, int var1) {
      if (var0.method_73183().method_8608()) {
         class00500 class00500 = class00869.TM.W();

         for (int ix = 0; ix < var1; ix++) {
            var0.method_73183()
               .method_8406(new class07105(class07107.y, class00500), var0.method_23317(), var0.method_23318(), var0.method_23321(), 0.0, 0.0, 0.0);
         }
      }
   }

   public static void N(class07049 var0) {
      N(var0, 5);
   }

   private void N(class07299 var1, class07049 var2) {
      if (L(var2)) {
         if (var1.field_9229.y(5) == 0) {
            var2.method_5783(class04909.Pd, 1.0F, 1.0F);
         }

         if (!var1.method_8608() && var1.field_9229.y(5) == 0) {
            var1.method_8421(var2, (byte)53);
         }
      }
   }

   private void N(class07049 var1, class07209 var2) {
      if (var1 instanceof class04770 && var1.method_73183().N() % 20L == 0L) {
         class06912.e.N((class04770)var1, var1.method_73183().method_8320(var2));
      }
   }
}
