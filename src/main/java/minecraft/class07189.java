package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07189 extends class05982<class07281> implements class06084 {
   public static final MapCodec<class07189> N = y(class07189::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class06667 L = class06665.q;
   private static final class00494 u = class00891.y(14.0, 0.0, 14.0);
   private static final class00392 i = class00392.L("container.enderchest");
   private static final class00494 R;

   public class07189(class01362 var1) {
      super(var1, () -> class00404.field_11901);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false));
   }

   @Override
   public class00494 z(class00500 var1) {
      return !ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_2)
            && !ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)
         ? super.z(var1)
         : u;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(L) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(L)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   public MapCodec<class07189> N() {
      return N;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_2)) {
         var5.setReturnValue(class00389.y());
      } else if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(R);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class07281) {
         ((class07281)class00394).N();
      }
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07281(var1, var2);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      class06940 class06940 = var4.method_7274();
      if (class06940 != null && var2.method_8321(var3) instanceof class07281 class07281) {
         class07209 class07209 = var3.method_10084();
         if (var2.method_8320(class07209).u(var2, class07209)) {
            return class07082.N;
         } else {
            if (var2 instanceof class04782 class04782) {
               class06940.N(class07281);
               var4.method_17355(new class03965((var1x, var2x, var3x) -> class07490.N(var1x, var2x, class06940), i));
               var4.method_7281(class01235.NE);
               class01514.N(class04782, var4, true);
            }

            return class07082.N;
         }
      } else {
         return class07082.N;
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return this.W().y(y, var1.method_8042().b()).y(L, class04688.N() == class04684.L);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : u;
   }

   @Override
   public class06025<? extends class00379> N(class00500 var1, class07299 var2, class07209 var3, boolean var4) {
      return class06029::y;
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      for (int ix = 0; ix < 3; ix++) {
         int j = var4.y(2) * 2 - 1;
         int k = var4.y(2) * 2 - 1;
         double d0 = var3.method_10263() + 0.5 + 0.25 * j;
         double d1 = var3.method_10264() + var4.z();
         double d2 = var3.method_10260() + 0.5 + 0.25 * k;
         double d3 = var4.z() * j;
         double d4 = (var4.z() - 0.5) * 0.125;
         double d5 = var4.z() * k;
         var2.method_8406(class07107.NM, d0, d1, d2, d3, d4, d5);
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() ? N(var3, class00404.field_11901, class07281::N) : null;
   }
}
