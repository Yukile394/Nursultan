package minecraft;

import Nursultan.class09883;
import Nursultan.class09886;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.longs.Long2FloatOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import net.caffeinemc.mods.lithium.common.util.Pos.ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02756 implements class07307 {
   private static final class01284 N = new class01284();
   private static final int y = 16;
   private static final float L = 2.0F;
   private final boolean u;
   private final class07302 i;
   private final class04782 R;
   private final class06889 M;
   @Nullable
   private final class07049 B;
   private final float Z;
   private final class07072 z;
   private final class01284 U;
   private final Map<class08036, class06889> E;
   private static final HashSet W = new HashSet(0);
   private final class07218 m = new class07218();
   private int P = Integer.MIN_VALUE;
   private int s = Integer.MIN_VALUE;
   private class08050 T;
   private boolean b;
   private LongOpenHashSet j;
   private Long2ReferenceOpenHashMap v;
   private Long2FloatOpenHashMap n;
   private int t;
   private int G;
   private static final class06183 l = class06183.N(null, null, null);

   @Nullable
   @Override
   public class07438 L() {
      return class07307.N(this.B);
   }

   private static BiFunction L(class07049 var0) {
      return new class09883(var0);
   }

   private int L(List var1) {
      return this.j.size();
   }

   @Override
   public boolean M() {
      if (this.i != class07302.field_47331) {
         return false;
      } else {
         return this.B != null && this.B.method_5864() == class07078.n ? this.R.method_64395().N(class07305.I) : true;
      }
   }

   private void P() {
      if (!(this.Z < 1.0E-5F)) {
         float f = this.Z * 2.0F;
         int ix = class04995.N(this.M.M - f - 1.0);
         int jx = class04995.N(this.M.M + f + 1.0);
         int k = class04995.N(this.M.B - f - 1.0);
         int lx = class04995.N(this.M.B + f + 1.0);
         int i1 = class04995.N(this.M.Z - f - 1.0);
         int j1 = class04995.N(this.M.Z + f + 1.0);

         for (class07049 class07049 : this.R.N_70(this.B, new class00734(ix, k, i1, jx, lx, j1))) {
            if (!class07049.method_5659(this)) {
               double d0 = Math.sqrt(class07049.method_5707(this.M)) / f;
               if (!(d0 > 1.0)) {
                  class06889 class06889x = (class07049 instanceof class00674 ? class07049.method_73189() : class07049.method_33571()).u(this.M).u();
                  boolean flag = this.U.N(this, class07049);
                  float f1 = this.U.N(class07049);
                  float f2 = !flag && f1 == 0.0F ? 0.0F : N(this.M, class07049);
                  if (flag) {
                     class07049.method_64397(this.R, this.z, this.U.N(this, class07049, f2));
                  }

                  double d1 = class07049 instanceof class07438 class07438 ? class07438.method_45325(class05298.U) : 0.0;
                  double d2 = (1.0 - d0) * f2 * f1 * (1.0 - d1);
                  class06889 class06889x = class06889x.L(d2);
                  class07049.method_60491(class06889x);
                  if (class07049.method_5864().N(class01217.q) && class07049 instanceof class08005) {
                     ((class08005)class07049).L(this.z.u());
                  } else if (class07049 instanceof class08036 class08036
                     && !class08036.method_7325()
                     && (!class08036.method_68878() || !class08036.method_31549().y)) {
                     this.E.put(class08036, class06889x);
                  }

                  class07049.method_56918(this.B);
               }
            }
         }
      }
   }

   public class02756(
      class04782 var1,
      @Nullable class07049 var2,
      @Nullable class07072 var3,
      @Nullable class01284 var4,
      class06889 var5,
      float var6,
      boolean var7,
      class07302 var8
   ) {
      super();
      this.E = new HashMap<>();
      this.R = var1;
      this.B = var2;
      this.Z = var6;
      this.M = var5;
      this.u = var7;
      this.i = var8;
      this.z = var3 == null ? var1.method_48963().N(this) : var3;
      this.U = var4 == null ? this.y(var2) : var4;
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   @Override
   public boolean B() {
      boolean flag = this.R.method_64395().N(class07305.I);
      boolean flag1 = this.B == null || this.B.method_5864() != class07078.n && this.B.method_5864() != class07078.ya;
      return flag ? flag1 : this.i.N() && flag1;
   }

   public int Z() {
      this.R.N(this.B, class01194.G, this.M);
      List<class07209> list = this.m();
      this.P();
      if (this.s()) {
         class04643 class04643 = class08700.N();
         class04643.N("explosion_blocks");
         this.N(list);
         class04643.L();
      }

      if (this.u) {
         this.y(list);
      }

      return this.L(list);
   }

   @Override
   public float i() {
      return this.Z;
   }

   private boolean s() {
      return this.i != class07302.field_40878;
   }

   private List<class07209> m() {
      HashSet hashset1 = this.W();
      if (hashset1 == null) {
         throw new NullPointerException("@Redirect constructor handler net/minecraft/class_9892::skipNewHashSet returned null for java.util.HashSet");
      } else {
         HashSet hashset = hashset1;
         byte b0 = 16;

         for (int ix = 0; ix < this.N(16); ix++) {
            for (int jx = 0; jx < 16; jx++) {
               for (int k = 0; k < 16; k++) {
                  if (ix == 0 || ix == 15 || jx == 0 || jx == 15 || k == 0 || k == 15) {
                     double d0 = ix / 15.0F * 2.0F - 1.0F;
                     double d1 = jx / 15.0F * 2.0F - 1.0F;
                     double d2 = k / 15.0F * 2.0F - 1.0F;
                     double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                     d0 /= d3;
                     d1 /= d3;
                     d2 /= d3;
                     float f = this.Z * (0.7F + this.R.field_9229.z() * 0.6F);
                     double d4 = this.M.M;
                     double d5 = this.M.B;
                     double d6 = this.M.Z;

                     for (float f1 = 0.3F; f > 0.0F; f -= 0.22500001F) {
                        class07209 class07209 = class07209.method_49637(d4, d5, d6);
                        class00500 class00500 = this.R.method_8320(class07209);
                        class04688 class04688 = this.R.method_8316(class07209);
                        if (!this.R.method_24794(class07209)) {
                           break;
                        }

                        Optional<Float> optional = this.U.N(this, this.R, class07209, class00500, class04688);
                        if (optional.isPresent()) {
                           f -= (optional.get() + 0.3F) * 0.3F;
                        }

                        if (f > 0.0F && this.U.N(this, this.R, class07209, class00500, f)) {
                           hashset.add(class07209);
                        }

                        d4 += d0 * 0.3F;
                        d5 += d1 * 0.3F;
                        d6 += d2 * 0.3F;
                     }
                  }
               }
            }
         }

         ObjectArrayList objectarraylist;
         ObjectArrayList objectarraylist1 = objectarraylist = new ObjectArrayList(hashset);
         this.N(new CallbackInfoReturnable("", false, objectarraylist));
         return objectarraylist1;
      }
   }

   public class07072 U() {
      return this.z;
   }

   public Map<class08036, class06889> z() {
      return this.E;
   }

   @Nullable
   @Override
   public class07049 u() {
      return this.B;
   }

   private class01284 y(@Nullable class07049 var1) {
      return (class01284)(var1 == null ? N : new class01260(var1));
   }

   @Override
   public class07302 y() {
      return this.i;
   }

   private void y(List<class07209> var1) {
      for (class07209 class07209 : var1) {
         if (this.R.field_9229.y(3) == 0 && this.R.method_8320(class07209).P() && this.R.method_8320(class07209.method_10074()).t()) {
            this.R.method_8501(class07209, class05989.y(this.R, class07209));
         }
      }
   }

   public boolean E() {
      return this.Z < 2.0F || !this.s();
   }

   private float N(float var1, int var2, int var3, int var4, LongOpenHashSet var5) {
      long ix = class07209.method_10064(var2, var3, var4);
      float f = this.n.get(ix);
      if (f >= 0.0F) {
         this.N(var1, f, ix, (class00500)this.v.get(ix), var2, var3, var4, var5);
         return f;
      } else {
         class07218 class07218 = this.m.N(var2, var3, var4);
         int jx = ChunkCoord.fromBlockCoord(var2);
         int k = ChunkCoord.fromBlockCoord(var4);
         if (this.P != jx || this.s != k) {
            this.T = this.R.method_8497(jx, k);
            this.P = jx;
            this.s = k;
         }

         class00500 class00500;
         float f1;
         Optional<Float> optional;
         label26: {
            class08050 class08050 = this.T;
            class00500 = class00869.N.W();
            f1 = 0.0F;
            if (class08050 != null) {
               class00554 class00554 = class08050.u()[SectionYIndex.fromBlockCoord(class08050, var3)];
               if (class00554 != null && !class00554.L()) {
                  class00500 = class00554.N(var2 & 15, var3 & 15, var4 & 15);
                  if (class00500.i() != class00869.N) {
                     class04688 class04688 = class00500.Y();
                     optional = this.U.N(this, this.R, class07218, class00500, class04688);
                     break label26;
                  }
               }
            }

            optional = this.U.N(this, this.R, class07218, class00869.N.W(), class04684.N.M());
         }

         if (optional.isPresent()) {
            f1 = (optional.get() + 0.3F) * 0.3F;
         }

         this.v.put(ix, class00500);
         this.n.put(ix, f1);
         this.N(var1, f1, ix, class00500, var2, var3, var4, var5);
         return f1;
      }
   }

   private void N(float var1, float var2, long var3, class00500 var5, int var6, int var7, int var8, LongOpenHashSet var9) {
      float f = var1 - var2;
      if (f > 0.0F) {
         this.j.add(var3);
         if (this.b || !var5.P()) {
            class07218 class07218 = this.m.N(var6, var7, var8);
            if (this.U.N(this, this.R, class07218, var5, f)) {
               var9.add(var3);
            }
         }
      }
   }

   private void N(class06069 var1, double var2, double var4, double var6, LongOpenHashSet var8) {
      double d0 = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
      double d1 = var2 / d0 * 0.3;
      double d2 = var4 / d0 * 0.3;
      double d3 = var6 / d0 * 0.3;
      float f = this.Z * (0.7F + var1.z() * 0.6F);
      double d4 = this.M.N();
      double d5 = this.M.y();
      double d6 = this.M.L();
      int ix = Integer.MIN_VALUE;
      int jx = Integer.MIN_VALUE;
      int k = Integer.MIN_VALUE;
      float f1 = 0.0F;
      int lx = this.t;

      for (int i1 = this.G; f > 0.0F; d6 += d3) {
         int j1 = class04995.N(d4);
         int k1 = class04995.N(d5);
         int l1 = class04995.N(d6);
         float f2;
         if (ix == j1 && jx == k1 && k == l1) {
            f2 = f1;
         } else {
            if (k1 < lx || k1 > i1 || j1 < -30000000 || l1 < -30000000 || j1 >= 30000000 || l1 >= 30000000) {
               return;
            }

            f2 = this.N(f, j1, k1, l1, var8);
            ix = j1;
            jx = k1;
            k = l1;
            f1 = f2;
         }

         f -= f2;
         f -= 0.22500001F;
         d4 += d1;
         d5 += d2;
      }
   }

   private void N(List<class07209> var1) {
      ArrayList arraylist = new ArrayList();
      class07536.L(var1, this.R.field_9229);

      for (class07209 class07209 : var1) {
         this.R.method_8320(class07209).N(this.R, class07209, this, (var1x, var2x) -> N(arraylist, var1x, var2x));
      }

      for (class09886 class09886 : arraylist) {
         class00891.N_21(this.R, class09886.N, class09886.y);
      }
   }

   private static class06183 N(class07299 var0, class05862 var1, LocalRef var2) {
      return class07290.N(var1.y(), var1.N(), var1, (BiFunction<class05862, class07209, class06183>)var2.get(), var0x -> l);
   }

   private static class05862 N(class06889 var0, class06889 var1, class05849 var2, class05835 var3, class07049 var4, LocalRef var5) {
      class05862 class05862 = (class05862)var5.get();
      if (class05862 == null) {
         class05862 = new class05862(var0, var1, var2, var3, var4);
         var5.set(class05862);
      } else {
         class05862.lithium$setFrom(var0);
      }

      return class05862;
   }

   private static void N(class06889 var0, class07049 var1, CallbackInfoReturnable var2, LocalRef var3) {
      var3.set(L(var1));
   }

   private void N(
      class04782 var1, class07049 var2, class07072 var3, class01284 var4, class06889 var5, float var6, boolean var7, class07302 var8, CallbackInfo var9
   ) {
      this.t = this.R.method_31607();
      this.G = this.R.method_31600();
      boolean flag = this.u;
      if (!flag && this.R.method_27983() == class07299.field_25181 && this.R.method_40134().N(class04057.L)) {
         float f = 8 + (int)(6.0F * this.Z);
         byte b0 = 0;
         byte b1 = 0;
         if (f > Math.abs(this.M.M - b0) && f > Math.abs(this.M.Z - b1)) {
            flag = true;
         }
      }

      this.b = flag;
      this.j = new LongOpenHashSet();
      this.v = new Long2ReferenceOpenHashMap();
      this.n = new Long2FloatOpenHashMap();
      this.n.defaultReturnValue(-1.0F);
   }

   private static void N(List<class09886> var0, class06584 var1, class07209 var2) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         ((class09886)iterator.next()).N(var1);
         if (var1.R()) {
            return;
         }
      }

      var0.add(new class09886(var2, var1));
   }

   @Override
   public class04782 N() {
      return this.R;
   }

   public void N(CallbackInfoReturnable var1) {
      LongOpenHashSet longopenhashset = new LongOpenHashSet(0);
      class06069 class06069 = this.R.field_9229;

      for (int ix = 0; ix < 16; ix++) {
         boolean flag = ix == 0 || ix == 15;
         double d0 = ix / 15.0F * 2.0F - 1.0F;

         for (int jx = 0; jx < 16; jx++) {
            boolean flag1 = jx == 0 || jx == 15;
            double d1 = jx / 15.0F * 2.0F - 1.0F;
            int k = !flag && !flag1 ? 15 : 1;

            for (int lx = 0; lx < 16; lx += k) {
               double d2 = lx / 15.0F * 2.0F - 1.0F;
               this.N(class06069, d0, d1, d2, longopenhashset);
            }
         }
      }

      List list = (List)var1.getReturnValue();
      LongIterator longiterator = longopenhashset.iterator();

      while (longiterator.hasNext()) {
         list.add(class07209.method_10092(longiterator.nextLong()));
      }

      this.v = null;
      this.n = null;
   }

   public static float N(class06889 var0, class07049 var1) {
      LocalRefImpl localrefimpl1 = new LocalRefImpl();
      localrefimpl1.init(null);
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(null);
      N(var0, var1, null, localrefimpl);
      class00734 class00734 = var1.method_5829();
      double d0 = 1.0 / ((class00734.u - class00734.N) * 2.0 + 1.0);
      double d1 = 1.0 / ((class00734.i - class00734.y) * 2.0 + 1.0);
      double d2 = 1.0 / ((class00734.R - class00734.L) * 2.0 + 1.0);
      double d3 = (1.0 - Math.floor(1.0 / d0) * d0) / 2.0;
      double d4 = (1.0 - Math.floor(1.0 / d2) * d2) / 2.0;
      if (!(d0 < 0.0) && !(d1 < 0.0) && !(d2 < 0.0)) {
         int ix = 0;
         int jx = 0;

         for (double d5 = 0.0; d5 <= 1.0; d5 += d0) {
            for (double d6 = 0.0; d6 <= 1.0; d6 += d1) {
               for (double d7 = 0.0; d7 <= 1.0; d7 += d2) {
                  double d8 = class04995.u(d5, class00734.N, class00734.u);
                  double d9 = class04995.u(d6, class00734.y, class00734.i);
                  double d10 = class04995.u(d7, class00734.L, class00734.R);
                  class06889 class06889 = new class06889(d8 + d3, d9, d10 + d4);
                  class07299 class07299 = var1.method_73183();
                  class05862 class05862 = N(class06889, var0, class05849.field_17558, class05835.field_1348, var1, localrefimpl1);
                  if (class05862 == null) {
                     throw new NullPointerException(
                        "@Redirect constructor handler net/minecraft/class_9892::reuseClipContext returned null for net.minecraft.class_3959"
                     );
                  }

                  if (N(class07299, class05862, localrefimpl).N() == class07113.field_1333) {
                     ix++;
                  }

                  jx++;
               }
            }
         }

         return (float)ix / jx;
      } else {
         return 0.0F;
      }
   }

   public int N(int var1) {
      return 0;
   }

   public HashSet W() {
      return W;
   }

   @Override
   public class06889 R() {
      return this.M;
   }
}
