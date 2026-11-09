package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07804 extends class07204 {
   public static final MapCodec<class07804> N = y(class07804::new);
   public static final class08064<class07211> y = class07101.R;
   private static final Map<class07185, class00494> L = class00389.N(
      class00389.N(class00891.y(12.0, 0.0, 4.0), class00891.N(8.0, 10.0, 4.0, 5.0), class00891.N(4.0, 8.0, 5.0, 10.0), class00891.N(10.0, 16.0, 10.0, 16.0))
   );
   private static final class00392 u = class00392.L("container.repair");
   private static final float i = 2.0F;
   private static final int R = 40;
   private static final class00494 M;
   private static final class00494 B;
   private boolean Z;

   public class07804(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043));
   }

   @Nullable
   public static class00500 Z(class00500 var0) {
      if (var0.N(class00869.BK)) {
         return class00869.BV.W().y(y, var0.L(y));
      } else {
         return var0.N(class00869.BV) ? class00869.Be.W().y(y, var0.L(y)) : null;
      }
   }

   @Override
   protected class00494 z(class00500 var1) {
      this.Z = true;
      return super.z(var1);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public int N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(var2, var3).NU;
   }

   @Override
   public MapCodec<class07804> N() {
      return N;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ViaFabricPlusMixinPlugin.MORE_CULLING_PRESENT && this.Z) {
         this.Z = false;
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(var1.L(y).z() == class07185.field_11048 ? M : B);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : L.get(var1.L(y).z());
   }

   @Nullable
   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      return new class03965((var2x, var3x, var4) -> new class07497(var2x, var3x, class05880.N(var2, var3)), u);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608()) {
         var4.method_17355(var1.N(var2, var3));
         var4.method_7281(class01235.Ng);
      }

      return class07082.N;
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.method_8042().R());
   }

   @Override
   public class07072 N(class07049 var1) {
      return var1.method_48923().y(var1);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00701 var3) {
      if (!var3.method_5701()) {
         var1.N(1029, var2, 0);
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class00500 var4, class00701 var5) {
      if (!var5.method_5701()) {
         var1.N(1031, var2, 0);
      }
   }

   @Override
   protected void N(class00701 var1) {
      var1.N(2.0F, 40);
   }
}
