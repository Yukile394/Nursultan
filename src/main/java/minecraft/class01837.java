package minecraft;

import Nursultan.class09524;
import Nursultan.class09525;
import Nursultan.class09526;
import Nursultan.class09528;
import Nursultan.class09530;
import Nursultan.class09531;
import Nursultan.class09533;
import Nursultan.class10285;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.Long2IntMap;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01837 implements class03875, class03912 {
   public final int N;
   public final int y;
   public final int L;
   private final int v;
   private final int n;
   final int u;
   final int i;
   public final List<class09526> R;
   public final List<class09531> M;
   private final Map<class03877, class03877> t = new HashMap<>();
   private final Long2IntMap G = new Long2IntOpenHashMap();
   private final class03460 l;
   private final class03877 d;
   private final class01828 w;
   private final class03001 k;
   private final class01836 Y;
   private final class01836 Q;
   private final class03874 O;
   private long g = class07321.L;
   private class03027 I = new class03027(1.0, 0.0);
   final int B;
   public final int Z;
   public final int z;
   public boolean U;
   public boolean E;
   private int J;
   public int W;
   private int o;
   public int m;
   public int P;
   public int s;
   public long T;
   public long b;
   public int j;
   private final class03912 q = new class09525(this);
   private long K;

   @Override
   public int L() {
      return this.W + this.P;
   }

   public void L(int var1, double var2) {
      this.s = var1 - this.o;
      this.T++;
      Iterator<class09526> iterator = this.R.iterator();

      while (iterator.hasNext()) {
         iterator.next().L(var2);
      }
   }

   public class03027 L(int var1, int var2) {
      long ix = class07321.u(var1, var2);
      if (this.g == ix) {
         return this.I;
      } else {
         this.g = ix;
         class03027 class03027 = this.k.N(var1, var2);
         this.I = class03027;
         return class03027;
      }
   }

   public void M() {
      if (!this.U) {
         throw new IllegalStateException("Staring interpolation twice");
      } else {
         this.U = false;
      }
   }

   public class01837(int var1, class04084 var2, int var3, int var4, class05967 var5, class03874 var6, class05943 var7, class03421 var8, class03001 var9) {
      super();
      this.Z = var5.y();
      this.z = var5.N();
      this.N = var1;
      this.y = class04995.y(var5.u(), this.z);
      this.L = class04995.y(var5.L(), this.z);
      this.v = Math.floorDiv(var3, this.Z);
      this.n = Math.floorDiv(var4, this.Z);
      this.R = Lists.newArrayList();
      this.M = Lists.newArrayList();
      this.u = class01146.N(var3);
      this.i = class01146.N(var4);
      this.B = class01146.N(var1 * this.Z);
      this.k = var9;
      this.O = var6;
      this.Y = new class01836(this, new class09528(this), false);
      this.Q = new class01836(this, new class09533(this), false);
      if (!var9.y()) {
         for (int ix = 0; ix <= this.B; ix++) {
            int jx = this.u + ix;
            int kx = class01146.L(jx);

            for (int lx = 0; lx <= this.B; lx++) {
               int i1 = class01146.L(this.i + lx);
               class03027 class03027 = var9.N(kx, i1);
               this.Y.N[ix + lx * this.Y.y] = class03027.N();
               this.Q.N[ix + lx * this.Q.y] = class03027.y();
            }
         }
      } else {
         Arrays.fill(this.Y.N, 1.0);
         Arrays.fill(this.Q.N, 0.0);
      }

      class03866 class03866x = var2.N();
      class03866 class03866x = class03866x.N(this::N);
      this.d = class03866x.U();
      if (!var7.y()) {
         this.l = class03460.N(var8);
      } else {
         int j1 = class01296.N(var3);
         int k1 = class01296.N(var4);
         this.l = class03460.N(this, new class07321(j1, k1), class03866x, var2.u(), var5.L(), var5.u(), var8);
      }

      ArrayList arraylist = new ArrayList();
      class03877 class03877 = class03865.i(class03865.N(class03866x.E(), class03904.field_37076)).N(this::N);
      arraylist.add(var2x -> this.l.N(var2x, class03877.N(var2x)));
      if (var7.L()) {
         arraylist.add(class03867.N(class03866x.W(), class03866x.m(), class03866x.P(), var2.i()));
      }

      this.w = new class01823(arraylist.toArray(new class01828[0]));
      this.N(var1, var2, var3, var4, var5, var6, var7, var8, var9, null);
   }

   public void B() {
      this.R.forEach(class09526::W);
   }

   public class03460 Z() {
      return this.l;
   }

   @Override
   public class03001 i() {
      return this.k;
   }

   public int U() {
      return this.z;
   }

   public int z() {
      return this.Z;
   }

   @Override
   public int u() {
      return this.o + this.s;
   }

   private class03877 y(class03877 var1) {
      if (var1 instanceof class03897 class03897) {
         return (class03877)(switch (class03897.i()) {
            case field_36562 -> new class09526(this, class03897.u());
            case field_36563 -> new class01836(this, class03897.u(), true);
            case field_36564 -> new class09530(class03897.u());
            case field_36565 -> new class09524(this, class03897.u());
            case field_36566 -> new class09531(this, class03897.u());
         });
      } else {
         if (this.k != class03001.N()) {
            if (var1 == class03884.field_36549) {
               return this.Y;
            }

            if (var1 == class03886.field_36551) {
               return this.Q;
            }
         }

         if (var1 == class03904.field_37076) {
            return this.O;
         } else {
            return var1 instanceof class03885 class03885 ? class03885.u().N() : var1;
         }
      }
   }

   @Override
   public int y() {
      return this.J + this.m;
   }

   public void y(int var1, int var2) {
      for (class09526 class09526 : this.R) {
         class09526.N(var1, var2);
      }

      this.E = true;
      this.W = (var1 + this.L) * this.z;
      this.o = (this.n + var2) * this.Z;
      this.b++;

      for (class09531 class09531 : this.M) {
         class09531.N.N(class09531.y, this);
      }

      this.b++;
      this.E = false;
   }

   public void y(int var1, double var2) {
      this.m = var1 - this.J;
      Iterator<class09526> iterator = this.R.iterator();

      while (iterator.hasNext()) {
         iterator.next().y(var2);
      }
   }

   public class01837 L(int var1) {
      int ix = Math.floorMod(var1, this.Z);
      int jx = Math.floorDiv(var1, this.Z);
      int kx = Math.floorMod(jx, this.Z);
      int lx = this.z - 1 - Math.floorDiv(jx, this.Z);
      this.m = kx;
      this.P = lx;
      this.s = ix;
      this.j = var1;
      return this;
   }

   private void N(class03866 var1, List var2, CallbackInfoReturnable var3) {
      ((MultiNoiseSamplerHooks)var3.getReturnValue()).fabric_setSeed(this.K);
   }

   protected class03877 N(class03877 var1) {
      return this.t.computeIfAbsent(var1, this::y);
   }

   private void N(
      int var1, class04084 var2, int var3, int var4, class05967 var5, class03874 var6, class05943 var7, class03421 var8, class03001 var9, CallbackInfo var10
   ) {
      this.K = var2.y().fabric_getSeed();
   }

   private void N(boolean var1, int var2) {
      this.J = var2 * this.Z;
      this.m = 0;

      for (int ix = 0; ix < this.N + 1; ix++) {
         int jx = this.n + ix;
         this.o = jx * this.Z;
         this.s = 0;
         this.b++;

         for (class09526 class09526 : this.R) {
            double[] adouble = (var1 ? class09526.N : class09526.y)[ix];
            class09526.N(adouble, this.q);
         }
      }

      this.b++;
   }

   private int N(long var1) {
      int ix = class00893.N(var1);
      int jx = class00893.y(var1);
      return class04995.N(this.d.N(new class10285(ix, 0, jx)));
   }

   public int N(int var1, int var2) {
      int ix = class01146.L(class01146.N(var1));
      int jx = class01146.L(class01146.N(var2));
      return this.G.computeIfAbsent(class00893.N(ix, jx), this::N);
   }

   public int N(int var1, int var2, int var3, int var4) {
      int ix = Integer.MIN_VALUE;

      for (int jx = var2; jx <= var4; jx += 4) {
         for (int kx = var1; kx <= var3; kx += 4) {
            int lx = this.N(kx, jx);
            if (lx > ix) {
               ix = lx;
            }
         }
      }

      return ix;
   }

   @Nullable
   public class00500 N() {
      return this.w.calculate(this);
   }

   public class03222 N(class03866 var1, List<class03229> var2) {
      class03222 class03222x;
      class03222 class03222x = class03222x = new class03222(
         var1.i().N(this::N), var1.R().N(this::N), var1.M().N(this::N), var1.B().N(this::N), var1.Z().N(this::N), var1.z().N(this::N), var2
      );
      this.N(var1, var2, new CallbackInfoReturnable("", false, class03222x));
      return class03222x;
   }

   public static class01837 N(class08050 var0, class04084 var1, class03874 var2, class05943 var3, class03421 var4, class03001 var5) {
      class05967 class05967 = var3.R().N(var0);
      class07321 class07321 = var0.R();
      int ix = 16 / class05967.y();
      return new class01837(ix, var1, class07321.i(), class07321.R(), class05967, var2, var3, var4, var5);
   }

   public void N(int var1, double var2) {
      this.P = var1 - this.W;
      Iterator<class09526> iterator = this.R.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var2);
      }
   }

   public void N(int var1) {
      this.N(false, this.v + var1 + 1);
      this.J = (this.v + var1) * this.Z;
   }

   @Override
   public void N(double[] var1, class03877 var2) {
      this.j = 0;

      for (int ix = this.z - 1; ix >= 0; ix--) {
         this.P = ix;

         for (int jx = 0; jx < this.Z; jx++) {
            this.m = jx;

            for (int kx = 0; kx < this.Z; kx++) {
               this.s = kx;
               var1[this.j++] = var2.N(this);
            }
         }
      }
   }

   public void R() {
      if (this.U) {
         throw new IllegalStateException("Staring interpolation twice");
      } else {
         this.U = true;
         this.T = 0L;
         this.N(true, this.v);
      }
   }
}
