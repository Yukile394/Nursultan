package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00637 extends class00891 {
   public static final MapCodec<class00637> N = y(class00637::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class06667 L = class06665.k;
   public static final class06667 u = class06665.N;
   protected static final int i = 1;
   protected static final int R = 42;
   private static final int M = 10;
   private static final Map<class07211, class00494> B = class00389.L(class00891.N(6.0, 0.0, 10.0, 10.0, 16.0));

   public class00637(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false).y(u, false));
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      if (!var1.L(L)) {
         return 0;
      } else {
         return var1.L(y) == var4 ? 15 : 0;
      }
   }

   private static void N(class00891 var0, class07299 var1, class07209 var2, class07211 var3) {
      class07211 class07211 = var3.b();
      class02733 class02733 = class02752.N(var1, class07211, class07211.field_11036);
      var1.method_8452(var2, var0, class02733);
      var1.method_8452(var2.method_10093(class07211), var0, class02733);
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(L) ? 15 : 0;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4) {
         boolean flag = var1.L(u);
         boolean flag1 = var1.L(L);
         if (flag || flag1) {
            N(var2, var3, var1, true, false, -1, null);
         }

         if (flag1) {
            N(this, var2, var3, var1.L(y));
         }
      }
   }

   private void N(class00500 var1, class05487 var2, class07209 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14)
         && Block1_14.isExceptBlockForAttachWithPiston(var2.method_8320(var3).i())) {
         var4.setReturnValue(false);
      }
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

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = this.W().y(L, false).y(u, false);
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211x : var1.i()) {
         if (class07211x.z().L()) {
            class07211 class07211x = class07211x.b();
            class00500 = class00500.y(y, class07211x);
            if (class00500.N((class05487)class07299, class07209)) {
               return class00500;
            }
         }
      }

      return null;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5.b() == var1.L(y) && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return B.get(var1.L(y));
   }

   @Override
   public MapCodec<class00637> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      N(var2, var3, var1, false, true, -1, null);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, boolean var3, boolean var4, int var5, @Nullable class00500 var6) {
      Optional optional = var2.u(y);
      if (optional.isPresent()) {
         class07211 class07211x = (class07211)optional.get();
         boolean flag = var2.u(u).orElse(false);
         boolean flag1 = var2.u(L).orElse(false);
         class00891 class00891 = var2.i();
         boolean flag2 = !var3;
         boolean flag3 = false;
         int ix = 0;
         class00500[] aclass00500 = new class00500[42];

         for (int j = 1; j < 42; j++) {
            class07209 class07209x = var1.method_10079(class07211x, j);
            class00500 class00500xxx = var0.method_8320(class07209x);
            if (class00500xxx.N(class00869.MG)) {
               if (class00500xxx.L(y) == class07211x.b()) {
                  ix = j;
               }
               break;
            }

            if (!class00500xxx.N(class00869.Ml) && j != var5) {
               aclass00500[j] = null;
               flag2 = false;
            } else {
               if (j == var5) {
                  class00500xxx = (class00500)MoreObjects.firstNonNull(var6, class00500xxx);
               }

               boolean flag4 = !class00500xxx.L(class00664.u);
               boolean flag5 = class00500xxx.L(class00664.y);
               flag3 |= flag4 && flag5;
               aclass00500[j] = class00500xxx;
               if (j == var5) {
                  var0.N(var1, class00891, 10);
                  flag2 &= flag4;
               }
            }
         }

         flag2 &= ix > 1;
         flag3 &= flag2;
         class00500 class00500x = class00891.W().L(u, flag2).L(L, flag3);
         if (ix > 0) {
            class07209 class07209x = var1.method_10079(class07211x, ix);
            class07211 class07211x = class07211x.b();
            var0.method_8652(class07209x, class00500x.y(y, class07211x), 3);
            N(class00891, var0, class07209x, class07211x);
            N(var0, class07209x, flag2, flag3, flag, flag1);
         }

         N(var0, var1, flag2, flag3, flag, flag1);
         if (!var3) {
            var0.method_8652(var1, class00500x.y(y, class07211x), 3);
            if (var4) {
               N(class00891, var0, var1, class07211x);
            }
         }

         if (flag != flag2) {
            for (int k = 1; k < ix; k++) {
               class07209 class07209x = var1.method_10079(class07211x, k);
               class00500 class00500xx = aclass00500[k];
               if (class00500xx != null) {
                  class00500 class00500xxx = var0.method_8320(class07209x);
                  if (class00500xxx.N(class00869.Ml) || class00500xxx.N(class00869.MG)) {
                     var0.method_8652(class07209x, class00500xx.L(u, flag2), 3);
                  }
               }
            }
         }
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      N(var1, var2, var3, false, false, -1, null);
   }

   private static void N(class07299 var0, class07209 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      if (var3 && !var5) {
         var0.method_8396(null, var1, class04909.OL, class04911.field_15245, 0.4F, 0.6F);
         var0.N(null, class01194.N, var1);
      } else if (!var3 && var5) {
         var0.method_8396(null, var1, class04909.Oy, class04911.field_15245, 0.4F, 0.5F);
         var0.N(null, class01194.i, var1);
      } else if (var2 && !var4) {
         var0.method_8396(null, var1, class04909.ON, class04911.field_15245, 0.4F, 0.7F);
         var0.N(null, class01194.y, var1);
      } else if (!var2 && var4) {
         var0.method_8396(null, var1, class04909.Ou, class04911.field_15245, 0.4F, 1.2F / (var0.field_9229.z() * 0.2F + 0.9F));
         var0.N(null, class01194.M, var1);
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07211 class07211 = var1.L(y);
      class07209 class07209 = var3.method_10093(class07211.b());
      class00500 class00500 = var2.method_8320(class07209);
      boolean flag;
      boolean flag1 = flag = class07211.z().L() && class00500.L(var2, class07209, class07211);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag1;
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
