package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06587 extends class06581 implements class02661 {
   public static final byte[] N = new byte[]{1, 2, 3};
   public static final double y = 0.15;

   public class06587(class06573 var1) {
      super(var1);
   }

   private static class06889 N(class07210 var0, class07211 var1) {
      return var0.N().y(var1.P() * 0.5000099999997474, var1.s() * 0.5000099999997474, var1.T() * 0.5000099999997474);
   }

   private void N(class06501 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5)) {
         var2.setReturnValue(class07082.N);
      }
   }

   private boolean N(class08036 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_11) && var1.method_6128();
   }

   @Override
   public class07082 N(class06501 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class07299 class07299 = var1.method_8045();
         class08036 class08036 = var1.method_8036();
         if (class08036 != null && class08036.method_6128()) {
            return class07082.i;
         } else {
            if (class07299 instanceof class04782 class04782) {
               class06584 class06584 = var1.method_8041();
               class06889 class06889 = var1.method_17698();
               class07211 class07211 = var1.method_8038();
               class08005.N(
                  new class08006(
                     class07299,
                     var1.method_8036(),
                     class06889.M + class07211.P() * 0.15,
                     class06889.B + class07211.s() * 0.15,
                     class06889.Z + class07211.T() * 0.15,
                     class06584
                  ),
                  class04782,
                  class06584
               );
               class06584.B(1);
            }

            return class07082.N;
         }
      }
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      if (this.N(var2)) {
         class06584 class06584 = var2.method_5998(var3);
         if (var1 instanceof class04782 class04782) {
            if (var2.method_70988(null)) {
               var1.method_43129(null, var2, class04909.Tu, class04911.field_15254, 1.0F, 1.0F);
            }

            class08005.N(new class08006(var1, class06584, var2), class04782, class06584);
            class06584.N(1, var2);
            var2.method_7259(class01235.L.y(this));
         }

         return class07082.N;
      } else {
         return class07082.i;
      }
   }

   @Override
   public class08005 N(class07299 var1, class00737 var2, class06584 var3, class07211 var4) {
      return new class08006(var1, var3.L(1), var2.N(), var2.y(), var2.L(), true);
   }

   @Override
   public class02649 N() {
      return class02649.N().N(class06587::N).N(1.0F).y(0.5F).N(1004).N();
   }
}
