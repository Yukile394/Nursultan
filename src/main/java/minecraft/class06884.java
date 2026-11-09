package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06884 extends class00891 {
   public static final MapCodec<class06884> N = y(class06884::new);
   public static final class08064<class08075> y = class06665.Ni;
   public static final class08064<class08075> L = class06665.Nu;
   public static final class08064<class08075> u = class06665.NR;
   public static final class08064<class08075> i = class06665.NM;
   public static final class08071 R = class06665.ND;
   public static final Map<class07211, class08064<class08075>> M = ImmutableMap.copyOf(
      Maps.newEnumMap(Map.of(class07211.field_11043, y, class07211.field_11034, L, class07211.field_11035, u, class07211.field_11039, i))
   );
   private static final int[] B = class07536.N(new int[16], var0 -> {
      for (int ix = 0; ix <= 15; ix++) {
         float fx = ix / 15.0F;
         float f1 = fx * 0.6F + (fx > 0.0F ? 0.4F : 0.3F);
         float f2 = class04995.N(fx * fx * 0.7F - 0.5F, 0.0F, 1.0F);
         float f3 = class04995.N(fx * fx * 0.6F - 0.7F, 0.0F, 1.0F);
         var0[ix] = class02566.N(1.0F, f1, f2, f3);
      }
   });
   private static final float Z = 0.2F;
   private final Function<class00500, class00494> O;
   private final class00500 F;
   private final class02761 A;
   private boolean f;
   private final class00494 C = class00389.N(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0);

   private void L(class07299 var1, class07209 var2) {
      for (class07211 class07211x : class07221.field_11062) {
         this.y(var1, var2.method_10093(class07211x));
      }

      for (class07211 class07211 : class07221.field_11062) {
         class07209 class07209 = var2.method_10093(class07211);
         if (var1.method_8320(class07209).u(var1, class07209)) {
            this.y(var1, class07209.method_10084());
         } else {
            this.y(var1, class07209.method_10074());
         }
      }
   }

   private class07211[] L() {
      return DirectionConstants.ALL;
   }

   private static boolean T(class00500 var0) {
      return var0.L(y).N() && var0.L(u).N() && var0.L(L).N() && var0.L(i).N();
   }

   public class06884(class01362 var1) {
      super(var1);
      this.A = new class02738(this);
      this.f = true;
      this.P(this.Q.y().y(y, class08075.field_12687).y(L, class08075.field_12687).y(u, class08075.field_12687).y(i, class08075.field_12687).y(R, 0));
      this.O = this.y();
      this.F = this.W().y(y, class08075.field_12689).y(L, class08075.field_12689).y(u, class08075.field_12689).y(i, class08075.field_12689);
   }

   private static boolean b(class00500 var0) {
      return !var0.L(y).N() && !var0.L(u).N() && !var0.L(L).N() && !var0.L(i).N();
   }

   protected static boolean U(class00500 var0) {
      return N(var0, null);
   }

   private class07211[] u() {
      return DirectionConstants.ALL;
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return !this.f ? 0 : var1.N(var2, var3, var4);
   }

   public static int y(int var0) {
      return B[var0];
   }

   private Function<class00500, class00494> y() {
      boolean flag = true;
      byte b0 = 10;
      class00494 class00494 = class00891.y(10.0, 0.0, 1.0);
      Map<class07211, class00494> map = class00389.L(class00891.N(10.0, 0.0, 1.0, 0.0, 8.0));
      Map<class07211, class00494> map1 = class00389.L(class00891.y(10.0, 16.0, 0.0, 1.0));
      return this.N(var3x -> {
         class00494 class00494x = class00494;

         for (Entry entry : M.entrySet()) {
            class00494x = switch ((class08075)var3x.L((class08092)entry.getValue())) {
               case field_12686 -> class00389.N(class00494x, map.get(entry.getKey()), map1.get(entry.getKey()));
               case field_12689 -> class00389.N(class00494x, map.get(entry.getKey()));
               case field_12687 -> class00494x;
            };
         }

         return class00494x;
      }, new class08092[]{R});
   }

   private void y(class07299 var1, class07209 var2) {
      if (var1.method_8320(var2).N(this)) {
         var1.method_8408(var2, this);

         for (class07211 class07211 : this.u()) {
            var1.method_8408(var2.method_10093(class07211), this);
         }
      }
   }

   private class00500 y(class07290 var1, class00500 var2, class07209 var3) {
      boolean flag = !var1.method_8320(var3.method_10084()).u(var1, var3);

      for (class07211 class07211 : class07221.field_11062) {
         if (!var2.L(M.get(class07211)).N()) {
            class08075 class08075 = this.N(var1, var3, class07211, flag);
            var2 = var2.y(M.get(class07211), class08075);
         }
      }

      return var2;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      int ix = var1.L(R);
      if (ix != 0) {
         for (class07211 class07211 : class07221.field_11062) {
            class08075 class08075 = var1.L(M.get(class07211));
            switch (class08075) {
               case field_12686:
                  N(var2, var4, var3, B[ix], class07211, class07211.field_11036, -0.5F, 0.5F);
               case field_12689:
                  N(var2, var4, var3, B[ix], class07211.field_11033, class07211, 0.0F, 0.5F);
                  break;
               case field_12687:
               default:
                  N(var2, var4, var3, B[ix], class07211.field_11033, class07211, 0.0F, 0.3F);
            }
         }
      }
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      switch (var2) {
         case field_11464:
            return var1.y(y, var1.L(u)).y(L, var1.L(i)).y(u, var1.L(y)).y(i, var1.L(L));
         case field_11465:
            return var1.y(y, var1.L(L)).y(L, var1.L(u)).y(u, var1.L(i)).y(i, var1.L(y));
         case field_11463:
            return var1.y(y, var1.L(i)).y(L, var1.L(y)).y(u, var1.L(L)).y(i, var1.L(u));
         default:
            return var1;
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var5.setReturnValue(this.C);
      }
   }

   protected static boolean N(class00500 var0, @Nullable class07211 var1) {
      if (var0.N(class00869.Lf)) {
         return true;
      } else if (var0.N(class00869.iH)) {
         class07211 class07211 = var0.L(class06859.R);
         return class07211 == var1 || class07211.b() == var1;
      } else {
         return var0.N(class00869.EV) ? var1 == var0.L(class06869.y) : var0.j() && var1 != null;
      }
   }

   private static void N(class07299 var0, class06069 var1, class07209 var2, int var3, class07211 var4, class07211 var5, float var6, float var7) {
      float fx = var7 - var6;
      if (!(var1.z() >= 0.2F * fx)) {
         float f1 = 0.4375F;
         float f2 = var6 + fx * var1.z();
         double d0 = 0.5 + 0.4375F * var4.P() + f2 * var5.P();
         double d1 = 0.5 + 0.4375F * var4.s() + f2 * var5.s();
         double d2 = 0.5 + 0.4375F * var4.T() + f2 * var5.T();
         var0.method_8406(new class07138(var3, 1.0F), var2.method_10263() + d0, var2.method_10264() + d1, var2.method_10260() + d2, 0.0, 0.0, 0.0);
      }
   }

   private void N(class07299 var1, class07209 var2, CallbackInfoReturnable var3) {
      var3.setReturnValue(RedstoneWirePowerCalculations.getNeighborBlockSignal(this, this.A, var1, var2));
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5, CallbackInfoReturnable var6) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         var6.setReturnValue(class07082.i);
      }
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      switch (var2) {
         case field_11300:
            return var1.y(y, var1.L(u)).y(u, var1.L(y));
         case field_11301:
            return var1.y(L, var1.L(i)).y(i, var1.L(L));
         default:
            return super.N(var1, var2);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u, i, R);
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, var5, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else if (!var4.method_31549().i) {
         return class07082.i;
      } else {
         if (T(var1) || b(var1)) {
            class00500 class00500 = T(var1) ? this.W() : this.F;
            class00500 = class00500.y(R, var1.L(R));
            class00500 = this.N(var2, class00500, var3);
            if (class00500 != var1) {
               var2.method_8652(var3, class00500, 3);
               this.N(var2, var3, var1, class00500);
               return class07082.N;
            }
         }

         return class07082.i;
      }
   }

   private void N(class07299 var1, class07209 var2, class00500 var3, class00500 var4) {
      class02733 class02733 = class02752.N(var1, null, class07211.field_11036);

      for (class07211 class07211 : class07221.field_11062) {
         class07209 class07209 = var2.method_10093(class07211);
         if (var3.L(M.get(class07211)).N() != var4.L(M.get(class07211)).N() && var1.method_8320(class07209).u(var1, class07209)) {
            var1.method_8508(class07209, var4.i(), class07211.b(), class02752.N(class02733, class07211));
         }
      }
   }

   @Override
   protected void N(class00500 var1, class07284 var2, class07209 var3, int var4, int var5) {
      class07218 class07218 = new class07218();

      for (class07211 class07211 : class07221.field_11062) {
         if (var1.L(M.get(class07211)) != class08075.field_12687 && !var2.method_8320(class07218.N(var3, class07211)).N(this)) {
            class07218.N(class07211.field_11033);
            if (var2.method_8320(class07218).N(this)) {
               class07209 class07209x = class07218.method_10093(class07211.b());
               var2.method_42308(class07211.b(), class07218, class07209x, var2.method_8320(class07209x), var4, var5);
            }

            class07218.N(var3, class07211).N(class07211.field_11036);
            class00500 class00500 = var2.method_8320(class07218);
            if (class00500.N(this)) {
               class07209 class07209 = class07218.method_10093(class07211.b());
               var2.method_42308(class07211.b(), class07218, class07209, var2.method_8320(class07209), var4, var5);
            }
         }
      }
   }

   public final class08075 N(class07290 var1, class07209 var2, class07211 var3) {
      return this.N(var1, var2, var3, !var1.method_8320(var2.method_10084()).u(var1, var2));
   }

   private class08075 N(class07290 var1, class07209 var2, class07211 var3, boolean var4) {
      class07209 class07209 = var2.method_10093(var3);
      class00500 class00500 = var1.method_8320(class07209);
      if (var4 && (class00500.i() instanceof class00624 || this.N(var1, class07209, class00500)) && U(var1.method_8320(class07209.method_10084()))) {
         return class00500.L(var1, class07209, var3.b()) ? class08075.field_12686 : class08075.field_12689;
      } else {
         return !N(class00500, var3) && (class00500.u(var1, class07209) || !U(var1.method_8320(class07209.method_10074())))
            ? class08075.field_12687
            : class08075.field_12689;
      }
   }

   @Override
   public MapCodec<class06884> N() {
      return N;
   }

   private boolean N(class07290 var1, class07209 var2, class00500 var3) {
      return var3.L(var1, var2, class07211.field_11036) || var3.N(class00869.Bf);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : this.O.apply(var1);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.N(var1.method_8045(), this.F, var1.method_8037());
   }

   private class00500 N(class07290 var1, class00500 var2, class07209 var3) {
      boolean flag = b(var2);
      var2 = this.y(var1, this.W().y(R, var2.L(R)), var3);
      if (flag && b(var2)) {
         return var2;
      } else {
         boolean flag1 = var2.L(y).N();
         boolean flag2 = var2.L(u).N();
         boolean flag3 = var2.L(L).N();
         boolean flag4 = var2.L(i).N();
         boolean flag5 = !flag1 && !flag2;
         boolean flag6 = !flag3 && !flag4;
         if (!flag4 && flag5) {
            var2 = var2.y(i, class08075.field_12689);
         }

         if (!flag3 && flag5) {
            var2 = var2.y(L, class08075.field_12689);
         }

         if (!flag1 && flag6) {
            var2 = var2.y(y, class08075.field_12689);
         }

         if (!flag2 && flag6) {
            var2 = var2.y(u, class08075.field_12689);
         }

         return var2;
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11033) {
         return !this.N(var2, var6, var7) ? class00869.N.W() : var1;
      } else if (var5 == class07211.field_11036) {
         return this.N(var2, var1, var4);
      } else {
         class08075 class08075 = this.N(var2, var4, var5);
         return class08075.N() == var1.L(M.get(var5)).N() && !T(var1)
            ? var1.y(M.get(var5), class08075)
            : this.N(var2, this.F.y(R, var1.L(R)).y(M.get(var5), class08075), var4);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4) {
         for (class07211 class07211 : this.L()) {
            var2.method_8408(var3.method_10093(class07211), this);
         }

         this.N(var2, var3, var1, null, false);
         this.L(var2, var3);
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608()) {
         if (var4 != this || !N(var2)) {
            if (var1.N((class05487)var2, var3)) {
               this.N(var2, var3, var1, var5, false);
            } else {
               y(var1, var2, var3);
               var2.method_8650(var3, false);
            }
         }
      }
   }

   private static boolean N(class07299 var0) {
      return var0.method_45162().y(class03794.L);
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      if (this.f && var4 != class07211.field_11033) {
         int ix = var1.L(R);
         if (ix == 0) {
            return 0;
         } else {
            return var4 != class07211.field_11036 && !this.N(var2, var1, var3).L(M.get(var4.b())).N() ? 0 : ix;
         }
      } else {
         return 0;
      }
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i()) && !var2.method_8608()) {
         this.N(var2, var3, var1, null, true);

         for (class07211 class07211 : class07221.field_11064) {
            var2.method_8408(var3.method_10093(class07211), this);
         }

         this.L(var2, var3);
      }
   }

   public int N(class07299 var1, class07209 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueI();
      } else {
         this.f = false;
         int ix = var1.m(var2);
         this.f = true;
         return ix;
      }
   }

   private void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class02733 var4, boolean var5) {
      if (N(var1)) {
         new class02732(this).N(var1, var2, var3, var4, var5);
      } else {
         this.A.N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      class00500 class00500 = var2.method_8320(class07209);
      return this.N(var2, class07209, class00500);
   }

   @Override
   protected boolean i_(class00500 var1) {
      return this.f;
   }
}
