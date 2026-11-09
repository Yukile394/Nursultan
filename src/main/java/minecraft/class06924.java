package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.List;
import java.util.function.Predicate;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06924 extends class06577 {
   public static final int N = 20;
   public static final int y = 15;

   public class06924(class06573 var1) {
      super(var1);
   }

   @Override
   public int y() {
      return 15;
   }

   @Override
   public class06509 y(class06584 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class06509)callbackinforeturnable.getReturnValue() : class06509.field_8953;
   }

   private void y(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_7tob1_7_3)) {
         var1.setReturnValue(class06509.field_8952);
      }
   }

   @Override
   public Predicate<class06584> N() {
      return L;
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_7tob1_7_3)) {
         var1.setReturnValue(0);
      }
   }

   private void N(class07299 var1, class08036 var2, class07050 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_7tob1_7_3)) {
         class06584 class06584 = var2.method_18808(var2.method_5998(var3));
         if (class06584.R()) {
            var4.setReturnValue(class07082.u);
         } else {
            class06584.B(1);
            var4.setReturnValue(class07082.i);
         }
      }
   }

   @Override
   public boolean N(class06584 var1, class07299 var2, class07438 var3, int var4) {
      if (!(var3 instanceof class08036 class08036)) {
         return false;
      } else {
         class06584 class06584 = class08036.method_18808(var1);
         if (class06584.R()) {
            return false;
         } else {
            float f = N(this.N(var1, var3) - var4);
            if (f < 0.1) {
               return false;
            } else {
               List<class06584> list = N(var1, class06584, class08036);
               if (var2 instanceof class04782 class04782 && !list.isEmpty()) {
                  this.N(class04782, class08036, class08036.method_6058(), var1, list, f * 3.0F, 1.0F, f == 1.0F, null);
               }

               var2.method_43128(
                  null,
                  class08036.method_23317(),
                  class08036.method_23318(),
                  class08036.method_23321(),
                  class04909.NK,
                  class04911.field_15248,
                  1.0F,
                  1.0F / (var2.method_8409().z() * 0.4F + 1.2F) + f * 0.5F
               );
               class08036.method_7259(class01235.L.y(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void N(class07438 var1, class08005 var2, int var3, float var4, float var5, float var6, @Nullable class07438 var7) {
      var2.N(var1, var1.method_36455(), var1.method_36454() + var6, 0.0F, var4, var5);
   }

   public static float N(int var0) {
      float f = var0 / 20.0F;
      f = (f * f + f * 2.0F) / 3.0F;
      if (f > 1.0F) {
         f = 1.0F;
      }

      return f;
   }

   @Override
   public int N(class06584 var1, class07438 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueI() : 72000;
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class06584 class06584 = var2.method_5998(var3);
         boolean flag = !var2.method_18808(class06584).R();
         if (!var2.method_56992() && !flag) {
            return class07082.u;
         } else {
            var2.method_6019(var3);
            return class07082.L;
         }
      }
   }
}
