package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Arrays;
import java.util.UUID;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07036 extends class07796 implements class06084 {
   public static final class06667 N = class06665.q;
   private static final class00494 y = class00891.y(8.0, 0.0, 16.0);
   private final class05904 L;

   public class05904 L() {
      return this.L;
   }

   public class06889 T(class00500 var1) {
      return new class06889(0.5, 0.5, 0.5);
   }

   public class07036(class05904 var1, class01362 var2) {
      super(var2);
      this.L = var1;
   }

   public abstract float U(class00500 var1);

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(N) ? class04684.L.N(false) : super.u(var1);
   }

   private boolean y(class08036 var1, class07267 var2, boolean var3) {
      return Arrays.stream(var2.N(var3).y(var1.method_33793())).allMatch(var0 -> var0.equals(class05220.N) || var0.method_10851() instanceof class01751);
   }

   public static class05904 N(class00891 var0) {
      class05904 class05904;
      if (var0 instanceof class07036) {
         class05904 = ((class07036)var0).L();
      } else {
         class05904 = class05904.y;
      }

      return class05904;
   }

   public void N(class08036 var1, class07267 var2, boolean var3) {
      var2.N(var1.method_5667());
      var1.method_7311(var2, var3);
   }

   private boolean N(class08036 var1, class07267 var2) {
      UUID uuid = var2.Z();
      return uuid != null && !uuid.equals(var1.method_5667());
   }

   private void N(
      class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7, CallbackInfoReturnable var8
   ) {
      if (var3.method_8608()) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            var8.setReturnValue(class07082.N);
         } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
            class06584 class06584 = var5.method_5998(var6);
            boolean flag = (class06584.B() instanceof class06559 || class06584.N(class06570.vU) || class06584.N(class06570.vz)) && var5.method_7294();
            var8.setReturnValue(flag ? class07082.N : class07082.L);
         }
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_11911, class07267::N);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07267(var1, var2);
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, var5, var6, var7, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else if (var3.method_8321(var4) instanceof class07267 class07267) {
         class03568 class03568 = var1.B() instanceof class03568 class03568x ? class03568x : null;
         boolean flag1 = class03568 != null && var5.method_7294();
         if (var3 instanceof class04782 class04782) {
            if (flag1 && !class07267.z() && !this.N(var5, class07267)) {
               boolean flag = class07267.N(var5);
               if (class03568.N(class07267.N(flag), var5) && class03568.N(class04782, class07267, flag, var5)) {
                  class07267.N(class04782, var5, var4, flag);
                  var5.method_7259(class01235.L.y(var1.B()));
                  class04782.N(class01194.L, class07267.d(), class01164.N(var5, class07267.w()));
                  var1.N(1, var5);
                  return class07082.N;
               } else {
                  return class07082.R;
               }
            } else {
               return class07082.R;
            }
         } else {
            return !flag1 && !class07267.z() ? class07082.L : class07082.N;
         }
      } else {
         return class07082.i;
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2.method_8321(var3) instanceof class07267 class07267) {
         if (var2 instanceof class04782 class04782) {
            boolean flag = class07267.N(var4);
            boolean flag1 = class07267.N(class04782, var4, var3, flag);
            if (class07267.z()) {
               class04782.N(null, class07267.d(), class07267.U(), class04911.field_15245);
               return class07082.y;
            } else if (flag1) {
               return class07082.y;
            } else if (!this.N(var4, class07267) && var4.method_7294() && this.y(var4, class07267, flag)) {
               this.N(var4, class07267, flag);
               return class07082.y;
            } else {
               return class07082.i;
            }
         } else {
            class07536.y(new IllegalStateException("Expected to only call this on server"));
            return class07082.L;
         }
      } else {
         return class07082.i;
      }
   }

   @Override
   protected abstract MapCodec<? extends class07036> N();

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }

   @Override
   public class00500 N(class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8) {
      if (var1.L(N)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public boolean c_(class00500 var1) {
      return true;
   }
}
