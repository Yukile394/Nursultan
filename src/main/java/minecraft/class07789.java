package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07789 extends class07101 implements class07190 {
   public static final MapCodec<class07789> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06563.field_41600.fieldOf("color").forGetter(class07789::y), t()).apply(var0, class07789::new)
   );
   public static final class08064<class06637> y = class06665.yM;
   public static final class06667 L = class06665.l;
   private static final Map<class07211, class00494> u = class07536.N(() -> {
      class00494 class00494 = class00891.N(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      class00494 class00494x = class00389.N(class00494, class01372.field_64511);
      return class00389.L(class00389.N(class00891.y(16.0, 3.0, 9.0), class00494, class00494x));
   });
   private final class06563 i;
   private static final class00494 M;
   private boolean B;

   public class07789(class06563 var1, class01362 var2) {
      super(var2);
      this.i = var1;
      this.P(this.Q.y().y(y, class06637.field_12557).y(L, false));
   }

   public static class07211 U(class00500 var0) {
      class07211 class07211 = var0.L(R);
      return var0.L(y) == class06637.field_12560 ? class07211.b() : class07211;
   }

   @Override
   public class00494 z(class00500 var1) {
      this.B = true;
      return super.z(var1);
   }

   private void y(class07049 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
         var2.cancel();
      }
   }

   private static boolean y(class07290 var0, class07209 var1) {
      return var0.method_8320(var1.method_10074()).i() instanceof class07789;
   }

   private static int[][] y(class07211 var0, class07211 var1) {
      return new int[][]{
         {var1.P(), var1.T()},
         {var1.P() - var0.P(), var1.T() - var0.T()},
         {var1.P() - var0.P() * 2, var1.T() - var0.T() * 2},
         {-var0.P() * 2, -var0.T() * 2},
         {-var1.P() - var0.P() * 2, -var1.T() - var0.T() * 2},
         {-var1.P() - var0.P(), -var1.T() - var0.T()},
         {-var1.P(), -var1.T()},
         {-var1.P() + var0.P(), -var1.T() + var0.T()},
         {var0.P(), var0.T()},
         {var1.P() + var0.P(), var1.T() + var0.T()}
      };
   }

   public class06563 y() {
      return this.i;
   }

   public static class05992 E(class00500 var0) {
      return (class06637)var0.L(y) == class06637.field_12560 ? class05992.field_21784 : class05992.field_21785;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      super.N(var1, var2, var3, var4, var5);
      if (!var1.method_8608()) {
         class07209 class07209 = var2.method_10093(var3.L(R));
         var1.method_8652(class07209, var3.y(y, class06637.field_12560), 3);
         var1.method_8408(var2, class00869.N);
         var3.N(var1, var2, 3);
      }
   }

   @Override
   protected long N(class00500 var1, class07209 var2) {
      class07209 class07209 = var2.method_10079(var1.L(R), var1.L(y) == class06637.field_12560 ? 0 : 1);
      return class04995.y(class07209.method_10263(), var2.method_10264(), class07209.method_10260());
   }

   private static int[][] N(class07211 var0, class07211 var1) {
      return (int[][])ArrayUtils.addAll(y(var0, var1), N(var0));
   }

   private void N(class07049 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var2.cancel();
         class06889 class06889 = var1.method_18798();
         if (class06889.B < 0.0) {
            double d0 = var1 instanceof class07438 ? 1.0 : 0.8;
            var1.method_18800(class06889.M, Math.min(-class06889.B * 0.75 * d0, 0.75), class06889.Z);
         }
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ViaFabricPlusMixinPlugin.MORE_CULLING_PRESENT && this.B) {
         this.B = false;
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)
         || ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(M);
      }
   }

   @Override
   public MapCodec<class07789> N() {
      return N;
   }

   private static int[][] N(class07211 var0) {
      return new int[][]{{0, 0}, {-var0.P(), -var0.T()}};
   }

   @Override
   public void N(class07290 var1, class07049 var2) {
      if (var2.method_21750()) {
         super.N(var1, var2);
      } else {
         this.N(var2);
      }
   }

   private void N(class07049 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.y(var1, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            class06889 class06889 = var1.method_18798();
            if (class06889.B < 0.0) {
               double d0 = var1 instanceof class07438 ? 1.0 : 0.8;
               var1.method_18800(class06889.M, -class06889.B * 0.66F * d0, class06889.Z);
            }
         }
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == N(var1.L(y), var1.L(R))) {
         return var7.N(this) && var7.L(y) != var1.L(y) ? var1.y(L, var7.L(L)) : class00869.N.W();
      } else {
         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   private static class07211 N(class06637 var0, class07211 var1) {
      return var0 == class06637.field_12557 ? var1 : var1.b();
   }

   @Nullable
   public static class07211 N(class07290 var0, class07209 var1) {
      class00500 class00500 = var0.method_8320(var1);
      return class00500.i() instanceof class07789 ? class00500.L(R) : null;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2.method_8608()) {
         return class07082.y;
      } else {
         if (var1.L(y) != class06637.field_12560) {
            var3 = var3.method_10093(var1.L(R));
            var1 = var2.method_8320(var3);
            if (!var1.N(this)) {
               return class07082.L;
            }
         }

         class00586 class00586 = var2.method_75728().N(class00608.Q, var3);
         if (class00586.u()) {
            class00586.i().ifPresent(var1x -> var4.method_7353(var1x, true));
            var2.method_8650(var3, false);
            class07209 class07209 = var3.method_10093(var1.L(R).b());
            if (var2.method_8320(class07209).N(this)) {
               var2.method_8650(class07209, false);
            }

            class06889 class06889 = var3.method_46558();
            var2.method_46407(null, var2.method_48963().N(class06889), null, class06889, 5.0F, true, class07328.field_40889);
            return class07082.y;
         } else if (var1.L(L)) {
            if (!this.N(var2, var3)) {
               var4.method_7353(class00392.L("block.minecraft.bed.occupied"), true);
            }

            return class07082.y;
         } else {
            var4.method_7269(var3).ifLeft(var1x -> {
               if (var1x.N() != null) {
                  var4.method_7353(var1x.N(), true);
               }
            });
            return class07082.y;
         }
      }
   }

   private boolean N(class07299 var1, class07209 var2) {
      List list = var1.N(class08041.class, new class00734(var2), class07438::method_6113);
      if (list.isEmpty()) {
         return false;
      } else {
         ((class08041)list.get(0)).method_18400();
         return true;
      }
   }

   @Override
   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      super.N(var1, var2, var3, var4, var5 * 0.5);
   }

   private static Optional<class06889> N(class07078<?> var0, class07322 var1, class07209 var2, class07211 var3, class07211 var4) {
      int[][] aint = y(var3, var4);
      Optional optional = N(var0, var1, var2, aint, true);
      if (optional.isPresent()) {
         return optional;
      } else {
         class07209 class07209 = var2.method_10074();
         Optional optional1 = N(var0, var1, class07209, aint, true);
         if (optional1.isPresent()) {
            return optional1;
         } else {
            int[][] aint1 = N(var3);
            Optional optional2 = N(var0, var1, var2, aint1, true);
            if (optional2.isPresent()) {
               return optional2;
            } else {
               Optional optional3 = N(var0, var1, var2, aint, false);
               if (optional3.isPresent()) {
                  return optional3;
               } else {
                  Optional optional4 = N(var0, var1, class07209, aint, false);
                  return optional4.isPresent() ? optional4 : N(var0, var1, var2, aint1, false);
               }
            }
         }
      }
   }

   private static Optional<class06889> N(class07078<?> var0, class07322 var1, class07209 var2, int[][] var3, boolean var4) {
      class07218 class07218 = new class07218();

      for (int[] aint : var3) {
         class07218.N(var2.method_10263() + aint[0], var2.method_10264(), var2.method_10260() + aint[1]);
         class06889 class06889 = class05188.N(var0, var1, class07218, var4);
         if (class06889 != null) {
            return Optional.of(class06889);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(R, y, L);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00387(var1, var2, this.i);
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      if (!var1.method_8608() && var4.method_66324()) {
         class06637 class06637 = var3.L(y);
         if (class06637 == class06637.field_12557) {
            class07209 class07209 = var2.method_10093(N(class06637, var3.L(R)));
            class00500 class00500 = var1.method_8320(class07209);
            if (class00500.N(this) && class00500.L(y) == class06637.field_12560) {
               var1.method_8652(class07209, class00869.N.W(), 35);
               var1.method_8444(var4, 2001, class07209, class00891.W(class00500));
            }
         }
      }

      return super.N(var1, var2, var3, var4);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class07211 class07211 = var1.method_8042();
      class07209 class07209 = var1.method_8037().method_10093(class07211);
      class07299 class07299 = var1.method_8045();
      return class07299.method_8320(class07209).N(var1) && class07299.method_8621().N(class07209) ? this.W().y(R, class07211) : null;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : u.get(U(var1).b());
   }

   public static Optional<class06889> N(class07078<?> var0, class07322 var1, class07209 var2, class07211 var3, float var4) {
      class07211 class07211x = var3.R();
      class07211 class07211x = class07211x.N(var4) ? class07211x.b() : class07211x;
      if (y(var1, var2)) {
         return N(var0, var1, var2, var3, class07211x);
      } else {
         int[][] aint = N(var3, class07211x);
         Optional optional = N(var0, var1, var2, aint, true);
         return optional.isPresent() ? optional : N(var0, var1, var2, aint, false);
      }
   }
}
