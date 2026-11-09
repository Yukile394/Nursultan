package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06999 extends class00891 {
   public static final MapCodec<class06999> N = y(class06999::new);
   public static final int y = 8;
   public static final class08071 L = class06665.NK;
   private static final class00494[] i = class00891.N(8, var0 -> class00891.y(16.0, 0.0, var0 * 2));
   public static final int u = 5;
   private static final class00494[] R;

   @Override
   protected class00494 L(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return i[var1.L(L)];
   }

   public class06999(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 1));
   }

   @Override
   protected class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      return i[var1.L(L)];
   }

   @Override
   protected float y(class00500 var1, class07290 var2, class07209 var3) {
      return var1.L(L) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var2.method_8314(class00772.field_9282, var3) > 11) {
         y(var1, var2, var3);
         var2.method_8650(var3, false);
      }
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : i[var1.L(L) - 1];
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037());
      if (class00500.N(this)) {
         int ix = class00500.L(L);
         return class00500.y(L, Math.min(8, ix + 1));
      } else {
         return super.N(var1);
      }
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      int ix = var1.L(L);
      if (!var2.method_8041().N(this.B()) || ix >= 8) {
         return ix == 1;
      } else {
         return var2.y() ? var2.method_8038() == class07211.field_11036 : true;
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   public MapCodec<class06999> N() {
      return N;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return var2 == class08791.field_50 ? var1.L(L) < 5 : false;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return i[var1.L(L)];
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(R[var1.L(L) - 1]);
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500 = var2.method_8320(var3.method_10074());
      if (class00500.N(class01210.LJ)) {
         return false;
      } else {
         return class00500.N(class01210.Lo)
            ? true
            : class00891.N(class00500.M(var2, var3.method_10074()), class07211.field_11036) || class00500.N(this) && class00500.L(L) == 8;
      }
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }
}
