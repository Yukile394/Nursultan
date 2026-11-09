package minecraft;

import Nursultan.class10714;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07883 extends class02735 {
   public float N;
   public float y;
   public float L;
   public float u;
   public float i;
   public float R;
   public float M;
   public float B;
   private float X;
   private float a;
   private float p;
   class06889 Z = class06889.L;

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (super.method_64397(var1, var2, var3) && this.method_6065() != null) {
         this.v();
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28632;
   }

   @Override
   public double method_7490() {
      return 0.08;
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 19) {
         this.i = 0.0F;
      } else {
         super.method_5711(var1);
      }
   }

   public class07883(class07078<? extends class07883> var1, class07299 var2) {
      super(var1, var2);
      this.field_5974.N(this.method_5628());
      this.a = 1.0F / (this.field_5974.z() + 1.0F) * 0.2F;
   }

   public static class05300 B() {
      return class07079.H().N(class05298.n, 10.0);
   }

   @Override
   protected class04891 s() {
      return class04909.Qb;
   }

   public boolean m() {
      return this.Z.B() > 1.0E-5F;
   }

   @Override
   public boolean g() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : true;
   }

   private void v() {
      this.method_56078(this.E());
      class06889 class06889xx = this.y(new class06889(0.0, -1.0, 0.0)).y(this.method_23317(), this.method_23318(), this.method_23321());

      for (int ix = 0; ix < 30; ix++) {
         class06889 class06889x = this.y(new class06889(this.field_5974.z() * 0.6 - 0.3, -1.0, this.field_5974.z() * 0.6 - 0.3));
         float f = this.method_6109() ? 0.1F : 0.3F;
         class06889 class06889xx = class06889x.L((double)(f + this.field_5974.z() * 2.0F));
         ((class04782)this.method_73183())
            .method_65096(this.W(), class06889xx.M, class06889xx.B + 0.5, class06889xx.Z, 0, class06889xx.M, class06889xx.B, class06889xx.Z, 0.1F);
      }
   }

   private class06889 y(class06889 var1) {
      class06889 class06889 = var1.N(this.y * (float) (Math.PI / 180.0));
      return class06889.y(-super.fields_4212a028292fd3c078969e3ee4c71d9e8_1 * (float) (Math.PI / 180.0));
   }

   @Nullable
   @Override
   public class07077 y(class04782 var1, class07077 var2) {
      return class07078.yw.N(var1, class06113.field_16466);
   }

   protected class04891 E() {
      return class04909.Qn;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class07446 class07446 = Objects.requireNonNullElseGet(var4, () -> new class10714(0.05F));
      return super.N(var1, var2, var3, class07446);
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
         var1.setReturnValue(false);
      }
   }

   protected class07126 W() {
      return class07107.NW;
   }

   @Override
   protected void l_() {
      this.e.N(0, new class07889(this));
      this.e.N(1, new class07900(this));
   }

   @Override
   public class04891 method_6002() {
      return class04909.Qj;
   }

   @Override
   public float method_6107() {
      return 0.4F;
   }

   @Override
   public void method_6007() {
      super.method_6007();
      this.y = this.N;
      this.u = this.L;
      this.R = this.i;
      this.B = this.M;
      this.i = this.i + this.a;
      if (this.i > Math.PI * 2) {
         if (this.method_73183().method_8608()) {
            this.i = (float) (Math.PI * 2);
         } else {
            this.i -= (float) (Math.PI * 2);
            if (this.field_5974.y(10) == 0) {
               this.a = 1.0F / (this.field_5974.z() + 1.0F) * 0.2F;
            }

            this.method_73183().method_8421(this, (byte)19);
         }
      }

      if (this.method_5799()) {
         if (this.i < (float) Math.PI) {
            float f = this.i / (float) Math.PI;
            this.M = class04995.m(f * f * (float) Math.PI) * (float) Math.PI * 0.25F;
            if (f > 0.75) {
               if (this.method_66247()) {
                  this.method_18799(this.Z);
               }

               this.p = 1.0F;
            } else {
               this.p *= 0.8F;
            }
         } else {
            this.M = 0.0F;
            if (this.method_66247()) {
               this.method_18799(this.method_18798().L(0.9));
            }

            this.p *= 0.99F;
         }

         class06889 class06889 = this.method_18798();
         double d0 = class06889.Z();
         super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = super.fields_4212a028292fd3c078969e3ee4c71d9e8_0
            + (-((float)class04995.u(class06889.M, class06889.Z)) * (180.0F / (float)Math.PI) - super.fields_4212a028292fd3c078969e3ee4c71d9e8_0) * 0.1F;
         this.method_36456(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
         this.L = this.L + (float) Math.PI * this.p * 1.5F;
         this.N = this.N + (-((float)class04995.u(d0, class06889.B)) * (180.0F / (float)Math.PI) - this.N) * 0.1F;
      } else {
         this.M = class04995.L(class04995.m(this.i)) * (float) Math.PI * 0.25F;
         if (!this.method_73183().method_8608()) {
            double d1 = this.method_18798().B;
            if (this.method_6059(class07047.d)) {
               d1 = 0.05 * (this.method_6112(class07047.d).i() + 1);
            } else {
               d1 -= this.method_56989();
            }

            this.method_18800(0.0, d1 * 0.98F, 0.0);
         }

         this.N = this.N + (-90.0F - this.N) * 0.02F;
      }
   }

   @Override
   public void method_6091(class06889 var1) {
      this.method_5784(class07451.field_6308, this.method_18798());
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Qv;
   }
}
