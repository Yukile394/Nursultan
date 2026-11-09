package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00650 extends class00891 implements class06084 {
   public static final MapCodec<class00650> N = y(class00650::new);
   public static final class06667 y = class06665.e;
   public static final class08064<class06008> L = class06665.r;
   public static final class08064<class06008> u = class06665.NN;
   public static final class08064<class06008> i = class06665.Ny;
   public static final class08064<class06008> R = class06665.NL;
   public static final Map<class07211, class08064<class06008>> M = ImmutableMap.copyOf(
      Maps.newEnumMap(Map.of(class07211.field_11043, u, class07211.field_11034, L, class07211.field_11035, i, class07211.field_11039, R))
   );
   public static final class06667 B = class06665.q;
   private final Function<class00500, class00494> Z;
   private final Function<class00500, class00494> O;
   private static final class00494 F = class00891.y(2.0, 0.0, 16.0);
   private static final Map<class07211, class00494> A = class00389.L(class00891.y(2.0, 16.0, 0.0, 9.0));
   private final Object2IntMap f = new Object2IntOpenHashMap();
   private class00494[] C;
   private class00494[] S;

   private int T(class00500 var1) {
      return this.f.computeIntIfAbsent(var1, var0 -> {
         int ix = 0;
         if (!class06008.field_22178.equals(var0.L(u))) {
            ix |= N(class07211.field_11043);
         }

         if (!class06008.field_22178.equals(var0.L(L))) {
            ix |= N(class07211.field_11034);
         }

         if (!class06008.field_22178.equals(var0.L(i))) {
            ix |= N(class07211.field_11035);
         }

         if (!class06008.field_22178.equals(var0.L(R))) {
            ix |= N(class07211.field_11039);
         }

         return ix;
      });
   }

   public class00650(class01362 var1) {
      super(var1);
      this.P(
         this.Q.y().y(y, true).y(u, class06008.field_22178).y(L, class06008.field_22178).y(i, class06008.field_22178).y(R, class06008.field_22178).y(B, false)
      );
      this.Z = this.N(16.0F, 14.0F);
      this.O = this.N(24.0F, 24.0F);
      this.N(var1, null);
   }

   private static class00500 U(class00500 var0) {
      boolean flag = false;
      if (var0.L(u) == class06008.field_22180) {
         var0 = var0.y(u, class06008.field_22179);
         flag = true;
      }

      if (var0.L(L) == class06008.field_22180) {
         var0 = var0.y(L, class06008.field_22179);
         flag = true;
      }

      if (var0.L(i) == class06008.field_22180) {
         var0 = var0.y(i, class06008.field_22179);
         flag = true;
      }

      if (var0.L(R) == class06008.field_22180) {
         var0 = var0.y(R, class06008.field_22179);
         flag = true;
      }

      if (flag) {
         var0 = var0.y(y, true);
      }

      return var0;
   }

   @Override
   public class00494 z(class00500 var1) {
      return var1.L(y) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) ? this.Z.apply(var1) : super.z(var1);
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(B) ? class04684.L.N(false) : super.u(var1);
   }

   private void y(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (var1.L(y) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(this.S[this.T(var1)]);
      }
   }

   @Override
   protected boolean y(class00500 var1) {
      return !var1.L(B);
   }

   private class00494[] y(float var1, float var2) {
      float fx = 4.0F;
      float f1 = 12.0F;
      float f2 = 5.0F;
      float f3 = 11.0F;
      class00494 class00494xxxx = class00891.N(4.0, 0.0, 4.0, 12.0, var1, 12.0);
      class00494 class00494x = class00891.N(5.0, 0.0, 0.0, 11.0, var2, 11.0);
      class00494 class00494xx = class00891.N(5.0, 0.0, 5.0, 11.0, var2, 16.0);
      class00494 class00494xxx = class00891.N(0.0, 0.0, 5.0, 11.0, var2, 11.0);
      class00494 class00494xxxx = class00891.N(5.0, 0.0, 5.0, 16.0, var2, 11.0);
      class00494[] aclass00494 = new class00494[]{
         class00389.N(),
         class00891.N(4.0, 0.0, 5.0, 12.0, var1, 16.0),
         class00891.N(0.0, 0.0, 4.0, 11.0, var1, 12.0),
         class00891.N(0.0, 0.0, 4.0, 12.0, var1, 16.0),
         class00891.N(4.0, 0.0, 0.0, 12.0, var1, 11.0),
         class00389.N(class00494xx, class00494x),
         class00891.N(0.0, 0.0, 0.0, 12.0, var1, 12.0),
         class00891.N(0.0, 0.0, 0.0, 12.0, var1, 16.0),
         class00891.N(5.0, 0.0, 4.0, 16.0, var1, 12.0),
         class00891.N(4.0, 0.0, 4.0, 16.0, var1, 16.0),
         class00389.N(class00494xxx, class00494xxxx),
         class00891.N(0.0, 0.0, 4.0, 16.0, var1, 16.0),
         class00891.N(4.0, 0.0, 0.0, 16.0, var1, 12.0),
         class00891.N(4.0, 0.0, 0.0, 16.0, var1, 16.0),
         class00891.N(0.0, 0.0, 0.0, 16.0, var1, 12.0),
         class00891.N(0.0, 0.0, 0.0, 16.0, var1, 16.0)
      };

      for (int ix = 0; ix < 16; ix++) {
         aclass00494[ix] = class00389.N(class00494xxxx, aclass00494[ix]);
      }

      return aclass00494;
   }

   private void y(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         var1.setReturnValue(U((class00500)var1.getReturnValue()));
      }
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : this.O.apply(var1);
   }

   private void N(class01362 var1, CallbackInfo var2) {
      this.C = this.y(24.0F, 24.0F);
      this.S = this.y(16.0F, 14.0F);
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         var1.setReturnValue(U((class00500)var1.getReturnValue()));
      }
   }

   private boolean N(class00500 var1, boolean var2, class07211 var3) {
      class00891 class00891 = var1.i();
      boolean flag = class00891 instanceof class07188 && class07188.N(var1, var3);
      boolean flag1;
      boolean flag2 = flag1 = var1.N(class01210.q) || !m(var1) && var2 || class00891 instanceof class07100 || flag;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag1);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag2;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(B)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      if (var5 == class07211.field_11033) {
         class00500 class00500xxxxx;
         class00500 class00500x = class00500xxxxx = super.N(var1, var2, var3, var4, var5, var6, var7, var8);
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class00500xxxxx);
         this.y(callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? (class00500)callbackinforeturnable.getReturnValue() : class00500x;
      } else if (var5 == class07211.field_11036) {
         class00500 class00500xxxx;
         class00500 class00500x = class00500xxxx = this.N(var2, var1, var6, var7);
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, class00500xxxx);
         this.y(callbackinforeturnable1);
         return callbackinforeturnable1.isCancelled() ? (class00500)callbackinforeturnable1.getReturnValue() : class00500x;
      } else {
         class00500 class00500xxx;
         class00500 class00500x = class00500xxx = this.N(var2, var4, var1, var6, var7, var5);
         CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true, class00500xxx);
         this.y(callbackinforeturnable2);
         return callbackinforeturnable2.isCancelled() ? (class00500)callbackinforeturnable2.getReturnValue() : class00500x;
      }
   }

   private static int N(class07211 var0) {
      return 1 << var0.u();
   }

   @Override
   public class00500 N(class06942 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209xxxxx = var1.method_8037();
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      class07209 class07209x = class07209xxxxx.method_10095();
      class07209 class07209xx = class07209xxxxx.method_10078();
      class07209 class07209xxx = class07209xxxxx.method_10072();
      class07209 class07209xxxx = class07209xxxxx.method_10067();
      class07209 class07209xxxxx = class07209xxxxx.method_10084();
      class00500 class00500xxxxxxx = class07299.method_8320(class07209x);
      class00500 class00500x = class07299.method_8320(class07209xx);
      class00500 class00500xx = class07299.method_8320(class07209xxx);
      class00500 class00500xxx = class07299.method_8320(class07209xxxx);
      class00500 class00500xxxx = class07299.method_8320(class07209xxxxx);
      boolean flag = this.N(class00500xxxxxxx, class00500xxxxxxx.L(class07299, class07209x, class07211.field_11035), class07211.field_11035);
      boolean flag1 = this.N(class00500x, class00500x.L(class07299, class07209xx, class07211.field_11039), class07211.field_11039);
      boolean flag2 = this.N(class00500xx, class00500xx.L(class07299, class07209xxx, class07211.field_11043), class07211.field_11043);
      boolean flag3 = this.N(class00500xxx, class00500xxx.L(class07299, class07209xxxx, class07211.field_11034), class07211.field_11034);
      class00500 class00500xxxxx = this.W().y(B, class04688.N() == class04684.L);
      class00500 class00500xxxxxx;
      class00500 class00500xxxxxxx = class00500xxxxxx = this.N(class07299, class00500xxxxx, class07209xxxxx, class00500xxxx, flag, flag1, flag2, flag3);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class00500xxxxxx);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00500)callbackinforeturnable.getReturnValue() : class00500xxxxxxx;
   }

   @Override
   public MapCodec<class00650> N() {
      return N;
   }

   private Function<class00500, class00494> N(float var1, float var2) {
      class00494 class00494 = class00891.y(8.0, 0.0, var1);
      byte b0 = 6;
      Map<class07211, class00494> map = class00389.L(class00891.N(6.0, 0.0, var2, 0.0, 11.0));
      Map<class07211, class00494> map1 = class00389.L(class00891.N(6.0, 0.0, var1, 0.0, 11.0));
      return this.N(var3x -> {
         class00494 class00494x = var3x.L(y) ? class00494 : class00389.N();

         for (Entry entry : M.entrySet()) {
            class00494x = class00389.N(class00494x, switch ((class06008)var3x.L((class08092)entry.getValue())) {
               case field_22178 -> class00389.N();
               case field_22179 -> (class00494)map.get(entry.getKey());
               case field_22180 -> (class00494)map1.get(entry.getKey());
            });
         }

         return class00494x;
      }, new class08092[]{B});
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : this.Z.apply(var1);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (var1.L(y) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(this.C[this.T(var1)]);
      }
   }

   private void N(class00500 var1, boolean var2, class07211 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14) && !Block1_14.isExceptBlockForAttachWithPiston(var1.i())) {
         var4.setReturnValue(false);
      }
   }

   private class06008 N(boolean var1, class00494 var2, class00494 var3) {
      if (var1) {
         return N(var2, var3) ? class06008.field_22180 : class06008.field_22179;
      } else {
         return class06008.field_22178;
      }
   }

   private class00500 N(class00500 var1, boolean var2, boolean var3, boolean var4, boolean var5, class00494 var6) {
      return var1.y(u, this.N(var2, var6, A.get(class07211.field_11043)))
         .y(L, this.N(var3, var6, A.get(class07211.field_11034)))
         .y(i, this.N(var4, var6, A.get(class07211.field_11035)))
         .y(R, this.N(var5, var6, A.get(class07211.field_11039)));
   }

   private boolean N(class00500 var1, class00500 var2, class00494 var3) {
      if (var2.i() instanceof class00650 && var2.L(y)) {
         return true;
      } else {
         class06008 class06008xxx = var1.L(u);
         class06008 class06008x = var1.L(i);
         class06008 class06008xx = var1.L(L);
         class06008 class06008xxx = var1.L(R);
         boolean flag = class06008x == class06008.field_22178;
         boolean flag1 = class06008xxx == class06008.field_22178;
         boolean flag2 = class06008xx == class06008.field_22178;
         boolean flag3 = class06008xxx == class06008.field_22178;
         if (flag3 && flag && flag1 && flag2 || flag3 != flag || flag1 != flag2) {
            return true;
         } else {
            return class06008xxx == class06008.field_22180 && class06008x == class06008.field_22180
                  || class06008xx == class06008.field_22180 && class06008xxx == class06008.field_22180
               ? false
               : var2.N(class01210.yL) || N(var3, F);
         }
      }
   }

   private class00500 N(class05487 var1, class00500 var2, class07209 var3, class00500 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      class00494 class00494 = var4.M(var1, var3).method_20538(class07211.field_11033);
      class00500 class00500 = this.N(var2, var5, var6, var7, var8, class00494);
      return class00500.y(y, this.N(class00500, var4, class00494));
   }

   private class00500 N(class05487 var1, class07209 var2, class00500 var3, class07209 var4, class00500 var5, class07211 var6) {
      class07211 class07211 = var6.b();
      boolean flag = var6 == class07211.field_11043 ? this.N(var5, var5.L(var1, var4, class07211), class07211) : N(var3, u);
      boolean flag1 = var6 == class07211.field_11034 ? this.N(var5, var5.L(var1, var4, class07211), class07211) : N(var3, L);
      boolean flag2 = var6 == class07211.field_11035 ? this.N(var5, var5.L(var1, var4, class07211), class07211) : N(var3, i);
      boolean flag3 = var6 == class07211.field_11039 ? this.N(var5, var5.L(var1, var4, class07211), class07211) : N(var3, R);
      class07209 class07209 = var2.method_10084();
      class00500 class00500 = var1.method_8320(class07209);
      return this.N(var1, var3, class07209, class00500, flag, flag1, flag2, flag3);
   }

   private class00500 N(class05487 var1, class00500 var2, class07209 var3, class00500 var4) {
      boolean flag = N(var2, u);
      boolean flag1 = N(var2, L);
      boolean flag2 = N(var2, i);
      boolean flag3 = N(var2, R);
      return this.N(var1, var2, var3, var4, flag, flag1, flag2, flag3);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      switch (var2) {
         case field_11300:
            return var1.y(u, var1.L(i)).y(i, var1.L(u));
         case field_11301:
            return var1.y(L, var1.L(R)).y(R, var1.L(L));
         default:
            return super.N(var1, var2);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      switch (var2) {
         case field_11464:
            return var1.y(u, var1.L(i)).y(L, var1.L(R)).y(i, var1.L(u)).y(R, var1.L(L));
         case field_11465:
            return var1.y(u, var1.L(L)).y(L, var1.L(i)).y(i, var1.L(R)).y(R, var1.L(u));
         case field_11463:
            return var1.y(u, var1.L(R)).y(L, var1.L(u)).y(i, var1.L(L)).y(R, var1.L(i));
         default:
            return var1;
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, u, L, R, i, B);
   }

   private static boolean N(class00500 var0, class08092<class06008> var1) {
      return var0.L(var1) != class06008.field_22178;
   }

   private static boolean N(class00494 var0, class00494 var1) {
      return !class00389.L(var1, var0, class07003.i);
   }
}
