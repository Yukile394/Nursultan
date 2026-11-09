package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07784 extends class00891 implements class00873 {
   public static final MapCodec<class07784> N = y(class07784::new);
   private static final class00494 O = class00891.y(6.0, 0.0, 16.0);
   private static final class00494 F = class00891.y(10.0, 0.0, 16.0);
   private static final class00494 A = class00891.y(3.0, 0.0, 16.0);
   public static final class08071 y = class06665.Nn;
   public static final class08064<class06662> L = class06665.ys;
   public static final class08071 u = class06665.Nh;
   public static final int i = 16;
   public static final int R = 0;
   public static final int M = 1;
   public static final int B = 0;
   public static final int Z = 1;
   private static final class00494 f;
   private static final class00494 C;

   public class07784(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, 0).y(L, class06662.field_12469).y(u, 0));
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : A.method_64034(var1.N(var3));
   }

   protected int y(class07290 var1, class07209 var2) {
      int ix = 0;

      while (ix < 16 && var1.method_8320(var2.method_10087(ix + 1)).N(class00869.mx)) {
         ix++;
      }

      return ix;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(u) == 0) {
         if (var4.y(3) == 0 && var2.R(var3.method_10084()) && var2.method_22335(var3.method_10084(), 0) >= 9) {
            int ix = this.y(var2, var3) + 1;
            if (ix < 16) {
               this.N(var1, var2, var3, var4, ix);
            }
         }
      }
   }

   @Override
   protected boolean y(class00500 var1) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      int ix = this.N(var1, var3);
      int j = this.y(var1, var3);
      int k = ix + j + 1;
      int l = 1 + var2.y(2);

      for (int i1 = 0; i1 < l; i1++) {
         class07209 class07209 = var3.method_10086(ix);
         class00500 class00500 = var1.method_8320(class07209);
         if (k >= 16 || class00500.L(u) == 1 || !var1.R(class07209.method_10084())) {
            return;
         }

         this.N(class00500, var1, class07209, var2, k);
         ix++;
         k++;
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      int ix = this.N(var1, var2);
      int j = this.y(var1, var2);
      return ix + j + 1 < 16 && var1.method_8320(var2.method_10086(ix)).L(u) != 1;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!var1.N(var2, var4)) {
         var3.N(var4, this, 1);
      }

      return var5 == class07211.field_11036 && var7.N(class00869.mx) && var7.L(y) > var1.L(y)
         ? var1.N(y)
         : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   protected void N(class00500 var1, class07299 var2, class07209 var3, class06069 var4, int var5) {
      class00500 class00500x = var2.method_8320(var3.method_10074());
      class07209 class07209 = var3.method_10087(2);
      class00500 class00500x = var2.method_8320(class07209);
      class06662 class06662 = class06662.field_12469;
      if (var5 >= 1) {
         if (!class00500x.N(class00869.mx) || class00500x.L(L) == class06662.field_12469) {
            class06662 = class06662.field_12466;
         } else if (class00500x.N(class00869.mx) && class00500x.L(L) != class06662.field_12469) {
            class06662 = class06662.field_12468;
            if (class00500x.N(class00869.mx)) {
               var2.method_8652(var3.method_10074(), class00500x.y(L, class06662.field_12466), 3);
               var2.method_8652(class07209, class00500x.y(L, class06662.field_12469), 3);
            }
         }
      }

      int ix = var1.L(y) != 1 && !class00500x.N(class00869.mx) ? 0 : 1;
      int j = (var5 < 11 || !(var4.z() < 0.25F)) && var5 != 15 ? 0 : 1;
      var2.method_8652(var3.method_10084(), this.W().y(y, ix).y(L, class06662).y(u, j), 3);
   }

   protected int N(class07290 var1, class07209 var2) {
      int ix = 0;

      while (ix < 16 && var1.method_8320(var2.method_10086(ix + 1)).N(class00869.mx)) {
         ix++;
      }

      return ix;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         class00494 class00494 = var1.L(y) == Z ? C : f;
         var5.setReturnValue(class00494.method_64034(var1.N(var3)));
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.N(var2, var3)) {
         var2.N(var3, true);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? (class00494)callbackinforeturnable.getReturnValue()
         : (var1.L(L) == class06662.field_12468 ? F : O).method_64034(var1.N(var3));
   }

   @Override
   public MapCodec<class07784> N() {
      return N;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      if (!var1.method_8045().method_8316(var1.method_8037()).W()) {
         return null;
      } else {
         class00500 class00500x = var1.method_8045().method_8320(var1.method_8037().method_10074());
         if (class00500x.N(class01210.NV)) {
            if (class00500x.N(class00869.mS)) {
               return this.W().y(y, 0);
            } else if (class00500x.N(class00869.mx)) {
               int ix = class00500x.L(y) > 0 ? 1 : 0;
               return this.W().y(y, ix);
            } else {
               class00500 class00500x = var1.method_8045().method_8320(var1.method_8037().method_10084());
               return class00500x.N(class00869.mx) ? this.W().y(y, class00500x.L(y)) : class00869.mS.W();
            }
         } else {
            return null;
         }
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10074()).N(class01210.NV);
   }

   @Override
   protected boolean a_(class00500 var1, class07290 var2, class07209 var3) {
      return false;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.L(u) == 0;
   }
}
