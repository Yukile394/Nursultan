package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributes;
import net.fabricmc.fabric.mixin.transfer.BucketItemAccessor;
import org.jspecify.annotations.Nullable;

public class class06913 extends class06581 implements class04799, BucketItemAccessor {
   private final class04651 N;

   public class06913(class04651 var1, class06573 var2) {
      super(var2);
      this.N = var1;
   }

   public static class06584 y(class06584 var0, class08036 var1) {
      return !var1.method_56992() ? new class06584(class06570.jU) : var0;
   }

   public class04651 N() {
      return this.N;
   }

   private class04891 N(class04891 var1) {
      return FluidVariantAttributes.getHandlerOrDefault(this.N).getEmptySound(FluidVariant.of(this.N)).orElse(var1);
   }

   private class06584 N(class06584 var1, class08036 var2, class06584 var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5) ? var3 : class05970.N(var1, var2, var3);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584xxxx = var2.method_5998(var3);
      class06183 class06183 = N(var1, var2, this.N == class04684.N ? class05835.field_1345 : class05835.field_1348);
      if (class06183.N() == class07113.field_1333) {
         return class07082.i;
      } else if (class06183.N() != class07113.field_1332) {
         return class07082.i;
      } else {
         class07209 class07209xx = class06183.u();
         class07211 class07211 = class06183.i();
         class07209 class07209x = class07209xx.method_10093(class07211);
         if (!var1.method_8505(var2, class07209xx) || !var2.method_7343(class07209x, class07211, class06584xxxx)) {
            return class07082.u;
         } else if (this.N == class04684.N) {
            class00500 class00500 = var1.method_8320(class07209xx);
            if (class00500.i() instanceof class00886 class00886) {
               class06584 class06584x = class00886.N(var2, var1, class07209xx, class00500);
               if (!class06584x.R()) {
                  var2.method_7259(class01235.L.y(this));
                  class00886.s_().ifPresent(var1x -> var2.method_5783(var1x, 1.0F, 1.0F));
                  var1.N(var2, class01194.d, class07209xx);
                  class06584 class06584xx = class05970.N(class06584xxxx, var2, class06584x);
                  if (!var1.method_8608()) {
                     class06912.U.N((class04770)var2, class06584x);
                  }

                  return class07082.N.N(class06584xx);
               }
            }

            return class07082.u;
         } else {
            class00500 class00500x = var1.method_8320(class07209xx);
            class07209 class07209xx = class00500x.i() instanceof class07132 && this.N == class04684.L ? class07209xx : class07209x;
            if (this.N(var2, var1, class07209xx, class06183)) {
               this.N(var2, var1, class06584xxxx, class07209xx);
               if (var2 instanceof class04770) {
                  class06912.w.N((class04770)var2, class07209xx, class06584xxxx);
               }

               var2.method_7259(class01235.L.y(this));
               class06584 class06584x = y(class06584xxxx, var2);
               class06584 class06584xx = this.N(class06584xxxx, var2, class06584x);
               return class07082.N.N(class06584xx);
            } else {
               return class07082.u;
            }
         }
      }
   }

   @Override
   public void N(@Nullable class07438 var1, class07299 var2, class06584 var3, class07209 var4) {
   }

   @Override
   public boolean N(@Nullable class07438 var1, class07299 var2, class07209 var3, @Nullable class06183 var4) {
      if (!(this.N instanceof class05787 class05787)) {
         return false;
      } else {
         class00500 class00500 = var2.method_8320(var3);
         class00891 class00891 = class00500.i();
         boolean flag = class00500.N(this.N);
         boolean flag1 = var1 != null && var1.method_5715();
         boolean flag2 = flag || class00891 instanceof class07132 class07132x && class07132x.N(var1, var2, var3, class00500, this.N);
         boolean flag3 = class00500.P() || flag2 && (!flag1 || var4 == null);
         if (!flag3) {
            return var4 != null && this.N(var1, var2, var4.u().method_10093(var4.i()), null);
         } else if (var2.method_75728().N(class00608.Y, var3) && this.N.N(class01231.N)) {
            int l = var3.method_10263();
            int i = var3.method_10264();
            int j = var3.method_10260();
            var2.method_8396(var1, var3, class04909.Uq, class04911.field_15245, 0.5F, 2.6F + (var2.field_9229.z() - var2.field_9229.z()) * 0.8F);

            for (int k = 0; k < 8; k++) {
               var2.method_8406(class07107.Ny, l + var2.field_9229.z(), i + var2.field_9229.z(), j + var2.field_9229.z(), 0.0, 0.0, 0.0);
            }

            return true;
         } else if (class00891 instanceof class07132 class07132x && this.N == class04684.L) {
            class07132x.N(var2, var3, class00500, class05787.N(false));
            this.N(var1, var2, var3);
            return true;
         } else {
            if (!var2.method_8608() && flag && !class00500.T()) {
               var2.N(var3, true);
            }

            if (!var2.method_8652(var3, this.N.M().B(), 11) && !class00500.Y().u()) {
               return false;
            } else {
               this.N(var1, var2, var3);
               return true;
            }
         }
      }
   }

   protected void N(@Nullable class07438 var1, class07284 var2, class07209 var3) {
      class04891 class04891 = this.N.N(class01231.y) ? class04909.uj : class04909.us;
      class04891 = this.N(class04891);
      var2.method_8396(var1, var3, class04891, class04911.field_15245, 1.0F, 1.0F);
      var2.N(var1, class01194.w, var3);
   }
}
