package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.Map;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06127 extends class07796 {
   public static final MapCodec<class06127> N = y(class06127::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class06667 L = class06665.k;
   public static final class06667 u = class06665.b;
   private static final class00494 i = class00389.N(class00891.y(16.0, 0.0, 2.0), class00891.y(8.0, 2.0, 14.0));
   private static final Map<class07211, class00494> R = class00389.L(
      class00389.N(
         class00891.N(16.0, 10.0, 14.0, 1.0, 5.333333), class00891.N(16.0, 12.0, 16.0, 5.333333, 9.666667), class00891.N(16.0, 14.0, 18.0, 9.666667, 14.0), i
      )
   );
   private static final int M = 2;
   private static final class00494 B;

   public class06127(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false).y(u, false));
   }

   @Override
   protected class00494 z(class00500 var1) {
      return i;
   }

   private static void y(@Nullable class07438 var0, class07299 var1, class07209 var2, class00500 var3, class06584 var4) {
      class00394 class00394 = var1.method_8321(var2);
      if (class00394 instanceof class06119) {
         ((class06119)class00394).N(var4.y(1, var0));
         N(var0, var1, var2, var3, true);
         var1.method_8396(null, var2, class04909.Le, class04911.field_15245, 1.0F, 1.0F);
      }
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var4 == class07211.field_11036 && var1.L(L) ? 15 : 0;
   }

   private static void y(class07299 var0, class07209 var1, class00500 var2) {
      class02733 class02733 = class02752.N(var0, var2.L(y).b(), class07211.field_11036);
      var0.method_8452(var1.method_10074(), var2.i(), class02733);
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      class00494 class00494x;
      class00494 class00494x = class00494x = i;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class00494x);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00494x;
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(L) ? 15 : 0;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (var1.L(L)) {
         y(var2, var3, var1);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      N(var2, var3, var1, false);
   }

   @Nullable
   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      return !var1.L(u) ? null : super.N(var1, var2, var3);
   }

   private void N(class07299 var1, class07209 var2, class08036 var3) {
      class00394 class00394 = var1.method_8321(var2);
      if (class00394 instanceof class06119) {
         var3.method_17355((class06119)class00394);
         var3.method_7281(class01235.NG);
      }
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(B);
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var1.L(u)) {
         if (!var2.method_8608()) {
            this.N(var2, var3, var4);
         }

         return class07082.N;
      } else {
         return class07082.L;
      }
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var2.L(u)) {
         return class07082.R;
      } else if (var1.N(class01226.yj)) {
         return (class07082)(N(var5, var3, var4, var2, var1) ? class07082.N : class07082.i);
      } else {
         return (class07082)(var1.R() && var6 == class07050.field_5808 ? class07082.i : class07082.R);
      }
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      if (var1.L(u)) {
         class00394 class00394 = var2.method_8321(var3);
         if (class00394 instanceof class06119) {
            return ((class06119)class00394).M();
         }
      }

      return 0;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u);
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
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return R.get(var1.L(y));
   }

   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class06584 class06584 = var1.method_8041();
      class08036 class08036 = var1.method_8036();
      boolean flag = false;
      if (!class07299.method_8608() && class08036 != null && class08036.method_7338()) {
         class08983 class08983 = class06584.method_58694(class02484.NB);
         if (class08983 != null && class08983.N("Book")) {
            flag = true;
         }
      }

      return this.W().y(y, var1.method_8042().b()).y(u, flag);
   }

   @Override
   public MapCodec<class06127> N() {
      return N;
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, boolean var3) {
      var0.method_8652(var1, var2.y(L, var3), 3);
      y(var0, var1, var2);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2) {
      N(var0, var1, var2, true);
      var0.N(var1, var2.i(), 2);
      var0.N(1043, var1, 0);
   }

   public static void N(@Nullable class07049 var0, class07299 var1, class07209 var2, class00500 var3, boolean var4) {
      class00500 class00500 = var3.y(L, false).y(u, var4);
      var1.method_8652(var2, class00500, 3);
      var1.N(class01194.L, var2, class01164.N(var0, class00500));
      y(var1, var2, var3);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class06119(var1, var2);
   }

   public static boolean N(@Nullable class07438 var0, class07299 var1, class07209 var2, class00500 var3, class06584 var4) {
      if (!var3.L(u)) {
         if (!var1.method_8608()) {
            y(var0, var1, var2, var3, var4);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
