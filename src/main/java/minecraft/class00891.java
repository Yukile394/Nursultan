package minecraft;

import Nursultan.class09409;
import Nursultan.class11360;
import Nursultan.class11938;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import net.caffeinemc.mods.lithium.common.util.collections.Object2BooleanCacheTable;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00891 extends class01354 implements class07310, FabricBlock {
   public static final MapCodec<class00891> z = y(class00891::new);
   private static final Logger N = LogUtils.getLogger();
   private final class03529<class00891> y = class04206.i.R(this);
   public static final class00742<class00500> U = new class00742<>();
   private static final LoadingCache<class00494, Boolean> L = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new class00875());
   public static final int E = 1;
   public static final int W = 2;
   public static final int m = 4;
   public static final int P = 8;
   public static final int s = 16;
   public static final int T = 32;
   public static final int b = 64;
   public static final int j = 128;
   public static final int v = 256;
   public static final int n = 512;
   public static final int t = 260;
   public static final int G = 3;
   public static final int l = 11;
   public static final int d = 816;
   public static final float w = -1.0F;
   public static final float k = 0.0F;
   public static final int Y = 512;
   protected final class00507<class00891, class00500> Q;
   private class00500 u;
   @Nullable
   private class06581 i;
   private static final int R = 256;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<class09409>> M = ThreadLocal.withInitial(() -> {
      class00870 class00870 = new class00870(256, 0.25F);
      class00870.defaultReturnValue((byte)127);
      return class00870;
   });
   private static final Object2BooleanCacheTable B = new Object2BooleanCacheTable(512, var0 -> !class00389.L(class00389.y(), var0, class07003.M));

   public static boolean L(class07290 var0, class07209 var1) {
      return var0.method_8320(var1).N(var0, var1, class07211.field_11036, class01020.field_25824);
   }

   public static class00494 L(double var0, double var2, double var4) {
      return y(var0, var0, var2, var4);
   }

   public class05216 M() {
      return class00392.L(this.w());
   }

   @Override
   public class00891 P() {
      return this;
   }

   protected final void P(class00500 var1) {
      this.u = var1;
   }

   public class00891(class01362 var1) {
      super(var1);
      class00517 class00517 = new class00517<>(this);
      this.N(class00517);
      this.Q = class00517.N(class00891::W, class00500::new);
      this.P(this.Q.y());
      if (class07529.ND) {
         String sx = this.getClass().getSimpleName();
         if (!sx.endsWith("Block")) {
            N.error("Block classes should end with Block and {} doesn't.", sx);
         }
      }
   }

   @Override
   public String toString() {
      return "Block{" + class04206.i.i(this).M() + "}";
   }

   @Override
   public class06581 B() {
      if (this.i == null) {
         this.i = class06581.N(this);
      }

      return this.i;
   }

   public float Z() {
      return this.K;
   }

   @Deprecated
   public class03529<class00891> s() {
      return this.y;
   }

   public final class00500 s(class00500 var1) {
      class00500 class00500 = this.W();

      for (class08092 class08092 : var1.i().E().u()) {
         if (class00500.y(class08092)) {
            class00500 = N(var1, class00500, class08092);
         }
      }

      return class00500;
   }

   public boolean m() {
      return this.H;
   }

   public static boolean m(class00500 var0) {
      return var0.i() instanceof class07131
         || var0.N(class00869.ZX)
         || var0.N(class00869.iK)
         || var0.N(class00869.iV)
         || var0.N(class00869.Rq)
         || var0.N(class00869.Ro)
         || var0.N(class01210.NB);
   }

   public float U() {
      return this.e;
   }

   public float z() {
      return this.V;
   }

   public static void y(class00500 var0, class07299 var1, class07209 var2) {
      if (var1 instanceof class04782) {
         N(var0, (class04782)var1, var2, null).forEach(var2x -> N_21(var1, var2, var2x));
         var0.N((class04782)var1, var2, class06584.E, true);
      }
   }

   public static class00494 y(double var0, double var2, double var4, double var6) {
      double d0 = var2 / 2.0;
      return N(var0, 8.0 - d0, 8.0 + d0, var4, var6);
   }

   public static class00494 y(double var0, double var2, double var4) {
      return N(var0, var0, var2, var4);
   }

   public class00507<class00891, class00500> E() {
      return this.Q;
   }

   protected void N(class00517<class00891, class00500> var1) {
   }

   private static <T extends Comparable<T>> class00500 N(class00500 var0, class00500 var1, class08092<T> var2) {
      return var1.y(var2, var0.L(var2));
   }

   private void N(class07299 var1, class07209 var2, class00500 var3, class07438 var4, class06584 var5, CallbackInfo var6) {
      if (var1.method_8608()) {
         class11360 class11360 = class11360.N(var2, var3);
         class11938.L().L(class11360);
      }
   }

   protected void N(class07299 var1, class08036 var2, class07209 var3, class00500 var4) {
      var1.method_8444(var2, 2001, var3, W(var4));
   }

   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      this.N(var1, var4, var2, var3);
      if (var3.N(class01210.yZ) && var1 instanceof class04782) {
         class01514.N((class04782)var1, var4, false);
      }

      var1.N(class01194.R, var2, class01164.N(var4, var3));
      return var3;
   }

   public void N_4(class00500 var1, class07299 var2, class07209 var3, class00801 var4) {
   }

   public boolean N(class07307 var1) {
      return true;
   }

   private static <S extends class00522<?, S>, T extends Comparable<T>> S N(S var0, class08092<T> var1, Object var2) {
      return (S)var0.y(var1, (Comparable)var2);
   }

   protected void N(class04782 var1, class07209 var2, class06584 var3, class02142 var4) {
      int ix = class07323.y(var1, var3, var4.N(var1.method_8409()));
      if (ix > 0) {
         this.N(var1, var2, ix);
      }
   }

   public static boolean N(class00494 var0) {
      return B.get(var0);
   }

   protected Function<class00500, class00494> N(Function<class00500, class00494> var1) {
      return this.Q.N().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), var1))::get;
   }

   protected Function<class00500, class00494> N(Function<class00500, class00494> var1, class08092<?>... var2) {
      Map map = Arrays.stream(var2).collect(Collectors.toMap(var0 -> (class08092)var0, var0 -> var0.N().getFirst()));
      ImmutableMap immutablemap = this.Q
         .N()
         .stream()
         .filter(var1x -> map.entrySet().stream().allMatch(var1xx -> var1x.L((class08092)var1xx.getKey()) == var1xx.getValue()))
         .collect(ImmutableMap.toImmutableMap(Function.identity(), var1));
      return var2x -> {
         for (Entry entry : map.entrySet()) {
            var2x = N(var2x, (class08092)entry.getKey(), entry.getValue());
         }

         return (class00494)immutablemap.get(var2x);
      };
   }

   public static boolean N(class00500 var0, class00500 var1, class07211 var2) {
      class00494 class00494x = var1.N(var2.b());
      if (class00494x == class00389.y()) {
         return false;
      } else if (var0.N(var1, var2)) {
         return false;
      } else if (class00494x == class00389.N()) {
         return true;
      } else {
         class00494 class00494x = var0.N(var2);
         if (class00494x == class00389.N()) {
            return true;
         } else {
            class09409 class09409 = new class09409(class00494x, class00494x);
            Object2ByteLinkedOpenHashMap object2bytelinkedopenhashmap = M.get();
            byte b0 = object2bytelinkedopenhashmap.getAndMoveToFirst(class09409);
            if (b0 != 127) {
               return b0 != 0;
            } else {
               boolean flag = class00389.L(class00494x, class00494x, class07003.i);
               if (object2bytelinkedopenhashmap.size() == 256) {
                  object2bytelinkedopenhashmap.removeLastByte();
               }

               object2bytelinkedopenhashmap.putAndMoveToFirst(class09409, (byte)(flag ? 1 : 0));
               return flag;
            }
         }
      }
   }

   protected static boolean N(class04782 var0, class05946<class05074> var1, Function<class04160, class04162> var2, BiConsumer<class04782, class06584> var3) {
      class05074 class05074 = var0.method_8503().yd().N(var1);
      class04162 class04162 = (class04162)var2.apply(new class04160(var0));
      ObjectArrayList objectarraylist = class05074.N(class04162);
      if (!objectarraylist.isEmpty()) {
         objectarraylist.forEach(var2x -> var3.accept(var0, var2x));
         return true;
      } else {
         return false;
      }
   }

   protected static boolean N(
      class04782 var0,
      class05946<class05074> var1,
      class00500 var2,
      @Nullable class00394 var3,
      @Nullable class06584 var4,
      @Nullable class07049 var5,
      BiConsumer<class04782, class06584> var6
   ) {
      return N(var0, var1, var4x -> var4x.N(class06551.Z, var2).y(class06551.z, var3).y(class06551.y, var5).y(class06551.U, var4).N(class06925.t), var6);
   }

   public static void N(class00500 var0, class00500 var1, class07284 var2, class07209 var3, int var4, int var5) {
      if (var1 != var0) {
         if (var1.P()) {
            if (!var2.method_8608()) {
               var2.method_30093(var3, (var4 & 32) == 0, null, var5);
            }
         } else {
            var2.method_30092(var3, var1, var4 & -33, var5);
         }
      }
   }

   public static void N(class00500 var0, class00500 var1, class07284 var2, class07209 var3, int var4) {
      N(var0, var1, var2, var3, var4, 512);
   }

   public static List<class06584> N(class00500 var0, class04782 var1, class07209 var2, @Nullable class00394 var3) {
      class04160 class04160 = new class04160(var1).N(class06551.B, class06889.y(var2)).N(class06551.U, class06584.E).y(class06551.z, var3);
      return var0.N(class04160);
   }

   public void N_7(class07284 var1, class07209 var2, class00500 var3) {
   }

   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
   }

   public static boolean N(class00494 var0, class07211 var1) {
      return N(var0.method_20538(var1));
   }

   public static boolean N_6(class05487 var0, class07209 var1, class07211 var2) {
      class00500 class00500 = var0.method_8320(var1);
      return var2 == class07211.field_11033 && class00500.N(class01210.yU) ? false : class00500.N(var0, var1, var2, class01020.field_25823);
   }

   public static class00494[] N(int var0, IntFunction<class00494> var1) {
      return IntStream.rangeClosed(0, var0).mapToObj(var1).toArray(class00494[]::new);
   }

   public static class00494 N(double var0, double var2, double var4, double var6, double var8, double var10) {
      return class00389.N(var0 / 16.0, var2 / 16.0, var4 / 16.0, var6 / 16.0, var8 / 16.0, var10 / 16.0);
   }

   public static class00500 N_19(class00500 var0, class00500 var1, class07284 var2, class07209 var3) {
      class00494 class00494 = class00389.y(var0.M(var2, var3), var1.M(var2, var3), class07003.L).method_66507(var3);
      if (class00494.method_1110()) {
         return var1;
      } else {
         for (class07049 class07049 : var2.N_70(null, class00494.method_1107())) {
            double d0 = class00389.N(class07185.field_11052, class07049.method_5829().u(0.0, 1.0, 0.0), List.of(class00494), -1.0);
            class07049.method_45166(0.0, 1.0 + d0, 0.0);
         }

         return var1;
      }
   }

   public static class00891 N(@Nullable class06581 var0) {
      return var0 instanceof class06918 ? ((class06918)var0).L() : class00869.N;
   }

   public static class00500 N(int var0) {
      class00500 class00500 = U.N(var0);
      return class00500 == null ? class00869.N.W() : class00500;
   }

   public static class00494 N(double var0, double var2, double var4, double var6, double var8) {
      double d0 = var0 / 2.0;
      return N(8.0 - d0, var2, var6, 8.0 + d0, var4, var8);
   }

   public static class00494 N(double var0, double var2, double var4, double var6) {
      double d0 = var0 / 2.0;
      double d1 = var2 / 2.0;
      return N(8.0 - d0, var4, 8.0 - d1, 8.0 + d0, var6, 8.0 + d1);
   }

   public static class00494 N(double var0, double var2, double var4) {
      double d0 = var2 / 2.0;
      return N(var0, var4, 8.0 - d0, 8.0 + d0);
   }

   public static class00494 N(double var0) {
      return N(var0, var0, var0);
   }

   public void N(class07299 var1, class08036 var2, class07209 var3, class00500 var4, @Nullable class00394 var5, class06584 var6) {
      var2.method_7259(class01235.N.y(this));
      var2.method_7322(0.005F);
      N(var4, var1, var3, var5, var2, var6);
   }

   @Nullable
   public class00500 N(class06942 var1) {
      return this.W();
   }

   public void N(class07299 var1, class07209 var2, class00500 var3, class07049 var4) {
   }

   public void N_5(class04782 var1, class07209 var2, class07307 var3) {
   }

   public void N(class07290 var1, class07049 var2) {
      var2.method_18799(var2.method_18798().u(1.0, 0.0, 1.0));
   }

   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      var4.method_5747(var5, 1.0F, var4.method_48923().E());
   }

   @Override
   public MapCodec<? extends class00891> N() {
      return z;
   }

   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      this.N(var1, var2, var3, var4, var5, null);
   }

   private static void N(class07299 var0, Supplier<class00717> var1, class06584 var2) {
      if (var0 instanceof class04782 class04782 && !var2.R() && class04782.method_64395().N(class07305.u)) {
         class00717 class00717 = (class00717)var1.get();
         class00717.L();
         var0.method_8649(class00717);
      }
   }

   public static void N(class07299 var0, class07209 var1, class07211 var2, class06584 var3) {
      int ix = var2.P();
      int jx = var2.s();
      int kx = var2.T();
      double d0 = class07078.Nt.z() / 2.0;
      double d1 = class07078.Nt.U() / 2.0;
      double d2 = var1.method_10263() + 0.5 + (ix == 0 ? class04995.N(var0.field_9229, -0.25, 0.25) : ix * (0.5 + d0));
      double d3 = var1.method_10264() + 0.5 + (jx == 0 ? class04995.N(var0.field_9229, -0.25, 0.25) : jx * (0.5 + d1)) - d1;
      double d4 = var1.method_10260() + 0.5 + (kx == 0 ? class04995.N(var0.field_9229, -0.25, 0.25) : kx * (0.5 + d0));
      double d5 = ix == 0 ? class04995.N(var0.field_9229, -0.1, 0.1) : ix * 0.1;
      double d6 = jx == 0 ? class04995.N(var0.field_9229, 0.0, 0.1) : jx * 0.1 + 0.1;
      double d7 = kx == 0 ? class04995.N(var0.field_9229, -0.1, 0.1) : kx * 0.1;
      N(var0, () -> new class00717(var0, d2, d3, d4, var3, d5, d6, d7), var3);
   }

   public static void N(class00500 var0, class07284 var1, class07209 var2, @Nullable class00394 var3) {
      if (var1 instanceof class04782) {
         N(var0, (class04782)var1, var2, var3).forEach(var2x -> N_21((class04782)var1, var2, var2x));
         var0.N((class04782)var1, var2, class06584.E, true);
      }
   }

   public static void N(class00500 var0, class07299 var1, class07209 var2, @Nullable class00394 var3, @Nullable class07049 var4, class06584 var5) {
      if (var1 instanceof class04782) {
         N(var0, (class04782)var1, var2, var3, var4, var5).forEach(var2x -> N_21(var1, var2, var2x));
         var0.N((class04782)var1, var2, var5, true);
      }
   }

   public static void N_21(class07299 var0, class07209 var1, class06584 var2) {
      double d0 = class07078.Nt.U() / 2.0;
      double d1 = var1.method_10263() + 0.5 + class04995.N(var0.field_9229, -0.25, 0.25);
      double d2 = var1.method_10264() + 0.5 + class04995.N(var0.field_9229, -0.25, 0.25) - d0;
      double d3 = var1.method_10260() + 0.5 + class04995.N(var0.field_9229, -0.25, 0.25);
      N(var0, () -> new class00717(var0, d1, d2, d3, var2), var2);
   }

   public static List<class06584> N(class00500 var0, class04782 var1, class07209 var2, @Nullable class00394 var3, @Nullable class07049 var4, class06584 var5) {
      class04160 class04160 = new class04160(var1).N(class06551.B, class06889.y(var2)).N(class06551.U, var5).y(class06551.N, var4).y(class06551.z, var3);
      return var0.N(class04160);
   }

   protected void N(class04782 var1, class07209 var2, int var3) {
      if (var1.method_64395().N(class07305.u)) {
         class07057.N(var1, class06889.y(var2), var3);
      }
   }

   public static int W(@Nullable class00500 var0) {
      if (var0 == null) {
         return 0;
      } else {
         int ix = U.N(var0);
         return ix == -1 ? 0 : ix;
      }
   }

   public final class00500 W() {
      return this.u;
   }

   public float R() {
      return this.J;
   }

   public static class00500 a_(class00500 var0, class07284 var1, class07209 var2) {
      class00500 class00500 = var0;
      class07218 class07218 = new class07218();
      int ix = g.length;

      for (int jx = 0; jx < ix; jx++) {
         class07211 class07211 = g[jx];
         class07218.N(var2, class07211);
         class00500 = class00500.N(var1, var1, var2, class07211, class07218, var1.method_8320(class07218), var1.method_8409());
      }

      return class00500;
   }

   public boolean c_(class00500 var1) {
      return !var1.B() && !var1.T();
   }
}
