package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07123 extends class00891 implements class06084 {
   public static final MapCodec<class07123> N = y(class07123::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class06667 L = class06665.q;
   public static final Map<class07211, class00494> u = class00389.L(class00891.L(16.0, 13.0, 16.0));
   private static final Map i;
   private static final Map R;

   private Map L() {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         return i;
      } else {
         return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? R : u;
      }
   }

   public class07123(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false));
   }

   @Override
   public class00494 z(class00500 var1) {
      return !ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)
            && !ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)
         ? super.z(var1)
         : u.get(var1.L(y));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(L) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   private void N(class00500 var1, class05487 var2, class07209 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14)
         && Block1_14.isExceptBlockForAttachWithPiston(var2.method_8320(var3).i())) {
         var4.setReturnValue(false);
      }
   }

   @Override
   public MapCodec<class07123> N() {
      return N;
   }

   private boolean N(class07290 var1, class07209 var2, class07211 var3) {
      return var1.method_8320(var2).L(var1, var2, var3);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return (class00494)this.L().get(var1.L(y));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5.b() == var1.L(y) && !var1.N(var2, var4)) {
         return class00869.N.W();
      } else {
         if (var1.L(L)) {
            var3.N(var4, class04684.L, class04684.L.N(var2));
         }

         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      if (!var1.y()) {
         class00500 class00500x = var1.method_8045().method_8320(var1.method_8037().method_10093(var1.method_8038().b()));
         if (class00500x.N(this) && class00500x.L(y) == var1.method_8038()) {
            return null;
         }
      }

      class00500 class00500 = this.W();
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());

      for (class07211 class07211 : var1.i()) {
         if (class07211.z().L()) {
            class00500 = class00500.y(y, class07211.b());
            if (class00500.N((class05487)class07299, class07209)) {
               return class00500.y(L, class04688.N() == class04684.L);
            }
         }
      }

      return null;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07211 class07211 = var1.L(y);
      boolean flag;
      boolean flag1 = flag = this.N(var2, var3.method_10093(class07211.b()), class07211);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag1;
   }
}
