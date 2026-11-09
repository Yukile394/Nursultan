package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07652 extends class07633 {
   private static final class01325 N = class07078.J.E().N(0.5F).y(0.665F);

   @Override
   protected void method_5712(class07209 var1, class00500 var2) {
      this.method_5783(class04909.BU, 0.15F, 1.0F);
   }

   public class07652(class07078<? extends class07652> var1, class07299 var2) {
      super(var1, var2);
   }

   public static class05300 B() {
      return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, 0.2F);
   }

   @Override
   protected class04891 s() {
      return class04909.BM;
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class06584 class06584x = var1.method_5998(var2);
         if (class06584x.N(class06570.jU) && !this.method_6109()) {
            var1.method_5783(class04909.Bz, 1.0F, 1.0F);
            class06584 class06584x = class05970.N(class06584x, var1, class06570.jT.E());
            var1.method_6122(var2, class06584x);
            return class07082.N;
         } else {
            return super.N(var1, var2);
         }
      }
   }

   private void N(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) && var1.method_31549().u) {
         var3.setReturnValue(super.N(var1, var2));
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return var1.N(class01226.Ng);
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07427(this));
      this.e.N(1, new class07993(this, 2.0));
      this.e.N(2, new class07434(this, 1.0));
      this.e.N(3, new class07960(this, 1.25, var0 -> var0.N(class01226.Ng), false));
      this.e.N(4, new class07459(this, 1.25));
      this.e.N(5, new class07957(this, 1.0));
      this.e.N(6, new class07962(this, class08036.class, 6.0F));
      this.e.N(7, new class07956(this));
   }

   @Override
   public class04891 method_6002() {
      return class04909.BB;
   }

   @Override
   public float method_6107() {
      return 0.4F;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? N : super.method_55694(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.BZ;
   }
}
