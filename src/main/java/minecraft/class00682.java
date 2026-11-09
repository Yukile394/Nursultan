package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00682 extends class07862 {
   private final class00687 f = new class00687(this);
   private static final int C = 18000;
   private static final boolean S = false;
   private static final int x = 0;
   private static final class01325 D = class07078.yP.E().N(class03810.N().N(class03831.field_47743, 0.0F, class07078.yP.U() - 0.03125F, 0.0F)).N(0.5F);
   private boolean h = false;
   private int r = 0;

   @Override
   protected void Q() {
   }

   @Override
   protected class04891 method_5737() {
      if (this.method_24828()) {
         if (!this.method_5782()) {
            return class04909.kj;
         }

         this.A++;
         if (this.A > 5 && this.A % 3 == 0) {
            return class04909.kT;
         }

         if (this.A <= 5) {
            return class04909.kj;
         }
      }

      return class04909.kP;
   }

   @Override
   protected void method_5734(float var1) {
      if (this.method_24828()) {
         super.method_5734(0.3F);
      } else {
         super.method_5734(Math.min(0.1F, var1 * 25.0F));
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("SkeletonTrap", this.v());
      var1.N("SkeletonTrapTime", this.r);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.N("SkeletonTrap", false));
      this.r = var1.N("SkeletonTrapTime", 0);
   }

   public class00682(class07078<? extends class00682> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   protected class04891 s() {
      return this.method_5777(class01231.N) ? class04909.ks : class04909.kE;
   }

   public boolean v() {
      return this.h;
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return class07078.yP.N(var1, class06113.field_16466);
   }

   public void N(boolean var1) {
      if (var1 != this.h) {
         this.h = var1;
         if (var1) {
            this.e.N(1, this.f);
         } else {
            this.e.N(this.f);
         }
      }
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      return (class07082)(!this.I() ? class07082.i : super.N(var1, var2));
   }

   public static boolean N(class07078<? extends class07633> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return !class06113.N(var2) ? class07633.L(var0, var1, var2, var3, var4) : class06113.y(var2) || N(var1, var3);
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var1.setReturnValue(super.method_6120());
      }
   }

   @Override
   protected void N(class06069 var1) {
      this.method_5996(class05298.T).N(N(var1::U));
   }

   public static class05300 W() {
      return NK().N(class05298.n, 15.0).N(class05298.l, 0.2F);
   }

   @Override
   protected void Y() {
      if (this.method_5799()) {
         this.method_5783(class04909.kb, 0.4F, 1.0F);
      } else {
         super.Y();
      }
   }

   @Override
   public class04891 method_6002() {
      return class04909.kW;
   }

   @Override
   public class01325 method_55694(class01312 var1) {
      return this.method_6109() ? D : super.method_55694(var1);
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.v() && this.r++ >= 18000) {
         this.method_31472();
      }
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.km;
   }

   @Override
   public float method_6120() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueF() : 0.96F;
   }

   @Override
   public boolean method_56991(class07085 var1) {
      return true;
   }
}
