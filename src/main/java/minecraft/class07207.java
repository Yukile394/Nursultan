package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07207 extends class07796 implements class02234 {
   public static final MapCodec<class07207> N = y(class07207::new);
   private static final class00494 y = class00891.y(16.0, 6.0, 12.0);
   private static final class00494 L;
   private static final class00494 u;

   public class07207(class01362 var1) {
      super(var1);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      double d0 = var3.method_10263() + var4.U();
      double d1 = var3.method_10264() + 0.8;
      double d2 = var3.method_10260() + var4.U();
      var2.method_8406(class07107.NZ, d0, d1, d2, 0.0, 0.0, 0.0);
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return class06584.E;
   }

   @Nullable
   @Override
   public class01032 N(class04782 var1, class07049 var2, class07209 var3) {
      class05042 class05042 = var1.method_74854();
      boolean flag = var1.method_27983() == class07299.field_25181;
      class05946<class07299> class05946 = flag ? class05042.N() : class07299.field_25181;
      class07209 class07209 = flag ? class05042.y() : class04782.field_25144;
      class04782 class04782 = var1.method_8503().N(class05946);
      if (class04782 == null) {
         return null;
      } else {
         class06889 class06889 = class07209.method_61082();
         float f;
         float f1;
         Set<class06681> set;
         if (!flag) {
            class02611.N(class04782, class07209.method_49638(class06889).method_10074(), true);
            f = class07211.field_11039.U();
            f1 = 0.0F;
            set = class06681.N(class06681.field_54094, Set.of(class06681.field_12397));
            if (var2 instanceof class04770) {
               class06889 = class06889.N(0.0, 1.0, 0.0);
            }
         } else {
            f = class05042.u();
            f1 = class05042.i();
            set = class06681.N(class06681.field_54094, class06681.field_40711);
            if (var2 instanceof class04770) {
               return ((class04770)var2).method_60590(false, class01032.N);
            }

            class06889 = var2.method_14245(class04782, class07209).method_61082();
         }

         return new class01032(class04782, class06889, class06889.L, f, f1, set, class01032.y.N(class01032.L));
      }
   }

   @Override
   protected boolean N(class00500 var1, class04651 var2) {
      return false;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var5.setReturnValue(L);
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
         var5.setReturnValue(u);
      }
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07279(var1, var2);
   }

   @Override
   public MapCodec<class07207> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : y;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class07049 var4) {
      return var1.R(var2, var3);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var4.method_5822(false)) {
         if (!var2.method_8608() && var2.method_27983() == class07299.field_25181 && var4 instanceof class04770 class04770 && !class04770.field_13969) {
            class04770.method_60594();
         } else {
            var4.method_60697(this, var3);
         }
      }
   }

   @Override
   protected class06898 d_(class00500 var1) {
      return class06898.field_11455;
   }
}
