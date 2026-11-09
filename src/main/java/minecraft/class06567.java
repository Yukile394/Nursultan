package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06567 extends class06581 implements class02661 {
   public class06567(class06573 var1) {
      super(var1);
   }

   @Override
   public void N(class08005 var1, double var2, double var4, double var6, float var8, float var9) {
   }

   @Override
   public class02649 N() {
      return class02649.N().N((var0, var1) -> class06758.N(var0, 1.0, class06889.L)).N(6.6666665F).y(1.0F).N(1018).N();
   }

   private void N(class06501 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4) && var1.method_8045().method_8608()) {
         var2.setReturnValue(class07082.N);
      }
   }

   @Override
   public class08005 N(class07299 var1, class00737 var2, class06584 var3, class07211 var4) {
      class06069 class06069 = var1.method_8409();
      double d0 = class06069.N((double)var4.P(), 0.11485000000000001);
      double d1 = class06069.N((double)var4.s(), 0.11485000000000001);
      double d2 = class06069.N((double)var4.T(), 0.11485000000000001);
      class06889 class06889 = new class06889(d0, d1, d2);
      class08029 class08029 = new class08029(var1, var2.N(), var2.y(), var2.L(), class06889.u());
      class08029.N(var3);
      return class08029;
   }

   private void N(class07299 var1, class07209 var2) {
      class06069 class06069 = var1.method_8409();
      var1.method_8396(null, var2, class04909.Ul, class04911.field_15245, 1.0F, (class06069.z() - class06069.z()) * 0.2F + 1.0F);
   }

   @Override
   public class07082 N(class06501 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class07299 class07299 = var1.method_8045();
         class07209 class07209 = var1.method_8037();
         class00500 class00500 = class07299.method_8320(class07209);
         boolean flag = false;
         if (!class05847.T(class00500) && !class05440.v(class00500) && !class05467.v(class00500)) {
            class07209 = class07209.method_10093(var1.method_8038());
            if (class05989.N(class07299, class07209, var1.method_8042())) {
               this.N(class07299, class07209);
               class07299.method_8501(class07209, class05989.y(class07299, class07209));
               class07299.N(var1.method_8036(), class01194.Z, class07209);
               flag = true;
            }
         } else {
            this.N(class07299, class07209);
            class07299.method_8501(class07209, class00500.y(class06665.n, true));
            class07299.N(var1.method_8036(), class01194.L, class07209);
            flag = true;
         }

         if (flag) {
            var1.method_8041().B(1);
            return class07082.N;
         } else {
            return class07082.u;
         }
      }
   }
}
