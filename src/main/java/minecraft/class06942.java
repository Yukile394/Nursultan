package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06942 extends class06501 {
   private final class07209 y;
   protected boolean N = true;

   public class07211 L() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class07211)callbackinforeturnable.getReturnValue() : class07211.N(this.method_8036())[0];
   }

   public class06942(class08036 var1, class07050 var2, class06584 var3, class06183 var4) {
      this(var1.method_73183(), var1, var2, var3, var4);
   }

   public class06942(class07299 var1, @Nullable class08036 var2, class07050 var3, class06584 var4, class06183 var5) {
      super(var1, var2, var3, var4, var5);
      this.y = var5.u().method_10093(var5.i());
      this.N = var1.method_8320(var5.u()).N(this);
   }

   public class06942(class06501 var1) {
      this(var1.method_8045(), var1.method_8036(), var1.method_20287(), var1.method_8041(), var1.method_30344());
   }

   public class07211[] i() {
      class07211[] aclass07211 = class07211.N(this.method_8036());
      if (this.N) {
         return aclass07211;
      } else {
         class07211 class07211 = this.method_8038();
         int i = 0;

         while (i < aclass07211.length && aclass07211[i] != class07211.b()) {
            i++;
         }

         if (i > 0) {
            System.arraycopy(aclass07211, 0, aclass07211, 1, i);
            aclass07211[0] = class07211.b();
         }

         return aclass07211;
      }
   }

   public class07211 u() {
      return class07211.N(this.method_8036(), class07185.field_11052);
   }

   private void y(CallbackInfoReturnable var1) {
      if (!var1.getReturnValueZ() && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var1.setReturnValue(
            ViaFabricPlusMappingDataLoader.getBlockMaterial(this.method_8045().method_8320(this.method_8037()).i()).equals("decoration")
               && class00891.N(this.method_8041().B()).equals(class00869.BK)
         );
      }
   }

   public boolean y() {
      return this.N;
   }

   private void N(CallbackInfoReturnable var1) {
      class08036 class08036 = this.method_8036();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         class07209 class07209 = this.method_8037();
         double d0 = ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_10) ? 0.5 : 0.0;
         if (Math.abs(class08036.method_23317() - (class07209.method_10263() + d0)) < 2.0
            && Math.abs(class08036.method_23321() - (class07209.method_10260() + d0)) < 2.0) {
            double d1 = class08036.method_23318() + class08036.method_18381(class08036.method_18376());
            if (d1 - class07209.method_10264() > 2.0) {
               var1.setReturnValue(class07211.field_11033);
               return;
            }

            if (class07209.method_10264() - d1 > 0.0) {
               var1.setReturnValue(class07211.field_11036);
               return;
            }
         }

         var1.setReturnValue(class08036.method_5735());
      }
   }

   public static class06942 N(class06942 var0, class07209 var1, class07211 var2) {
      return new class06942(
         var0.method_8045(),
         var0.method_8036(),
         var0.method_20287(),
         var0.method_8041(),
         new class06183(
            new class06889(var1.method_10263() + 0.5 + var2.P() * 0.5, var1.method_10264() + 0.5 + var2.s() * 0.5, var1.method_10260() + 0.5 + var2.T() * 0.5),
            var2,
            var1,
            false
         )
      );
   }

   public boolean N() {
      boolean flag;
      boolean flag1 = flag = this.N || this.method_8045().method_8320(this.method_8037()).N(this);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
      this.y(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag1;
   }

   @Override
   public class07209 method_8037() {
      return this.N ? super.method_8037() : this.y;
   }
}
