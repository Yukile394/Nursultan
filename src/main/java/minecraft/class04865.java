package minecraft;

import Nursultan.class10285;
import com.google.common.base.Suppliers;
import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public final class class04865 extends class08088 {
   public static final MapCodec<class04865> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00765.N.fieldOf("biome_source").forGetter(var0x -> var0x.y), class05943.y.fieldOf("settings").forGetter(var0x -> var0x.R))
         .apply(var0, var0.stable(class04865::new))
   );
   private static final class00500 i = class00869.N.W();
   private final class03556<class05943> R;
   private final Supplier<class03421> M;
   private int B = Integer.MIN_VALUE;

   @Override
   public int M() {
      return this.R.N().R().L();
   }

   public class04865(class00765 var1, class03556<class05943> var2) {
      super(var1);
      this.R = var2;
      this.M = Suppliers.memoize(() -> N((class05943)var2.N()));
   }

   public class03556<class05943> B() {
      return this.R;
   }

   @Override
   public int i() {
      return this.R.N().R().u();
   }

   @Override
   protected MapCodec<? extends class08088> y() {
      return u;
   }

   private void y(class03001 var1, class04084 var2, class05324 var3, class08050 var4) {
      class01837 class01837 = var4.N_20(var4x -> this.N(var4x, var3, var1, var2));
      class04330 class04330 = class02999.N(var1.N(this.y), var4);
      var4.N(class04330, class01837.N(var2.N(), this.R.N().U()));
   }

   @Override
   public CompletableFuture<class08050> N(class04084 var1, class03001 var2, class05324 var3, class08050 var4) {
      return CompletableFuture.supplyAsync(() -> {
         this.y(var2, var1, var3, var4);
         return var4;
      }, class07536.B().N("init_biomes"));
   }

   private static class03421 N(class05943 var0) {
      class03430 class03430x = new class03430(-54, class00869.V.W());
      int ix = var0.E();
      class03430 class03430x = new class03430(ix, var0.B());
      return (var4, var5, var6) -> {
         if (class07529.Nd) {
            return var0x;
         } else {
            return var5 < Math.min(-54, ix) ? class03430x : class03430;
         }
      };
   }

   @Override
   public void N(List<String> var1, class04084 var2, class07209 var3) {
      DecimalFormat decimalformat = new DecimalFormat("0.000", DecimalFormatSymbols.getInstance(Locale.ROOT));
      class03866 class03866 = var2.N();
      class10285 class10285 = new class10285(var3.method_10263(), var3.method_10264(), var3.method_10260());
      double d0 = class03866.z().N(class10285);
      var1.add(
         "NoiseRouter T: "
            + decimalformat.format(class03866.i().N(class10285))
            + " V: "
            + decimalformat.format(class03866.R().N(class10285))
            + " C: "
            + decimalformat.format(class03866.M().N(class10285))
            + " E: "
            + decimalformat.format(class03866.B().N(class10285))
            + " D: "
            + decimalformat.format(class03866.Z().N(class10285))
            + " W: "
            + decimalformat.format(d0)
            + " PV: "
            + decimalformat.format(class03882.N((float)d0))
            + " PS: "
            + decimalformat.format(class03866.U().N(class10285))
            + " N: "
            + decimalformat.format(class03866.E().N(class10285))
      );
   }

   private OptionalInt N(class05474 var1, class04084 var2, int var3, int var4, @Nullable MutableObject<class01376> var5, @Nullable Predicate<class00500> var6) {
      class05967 class05967 = this.R.N().R().N(var1);
      int ix = class05967.N();
      int j = class05967.L();
      int k = class04995.y(j, ix);
      int l = class04995.y(class05967.u(), ix);
      if (l <= 0) {
         return OptionalInt.empty();
      } else {
         class00500[] aclass00500;
         if (var5 == null) {
            aclass00500 = null;
         } else {
            aclass00500 = new class00500[class05967.u()];
            var5.setValue(new class01376(j, aclass00500));
         }

         int i1 = class05967.y();
         int j1 = Math.floorDiv(var3, i1);
         int k1 = Math.floorDiv(var4, i1);
         int l1 = Math.floorMod(var3, i1);
         int i2 = Math.floorMod(var4, i1);
         int j2 = j1 * i1;
         int k2 = k1 * i1;
         double d0 = (double)l1 / i1;
         double d1 = (double)i2 / i1;
         class01837 class01837 = new class01837(1, var2, j2, k2, class05967, class03904.field_37076, this.R.N(), this.M.get(), class03001.N());
         class01837.R();
         class01837.N(0);

         for (int l2 = l - 1; l2 >= 0; l2--) {
            class01837.y(l2, 0);

            for (int i3 = ix - 1; i3 >= 0; i3--) {
               int j3 = (k + l2) * ix + i3;
               double d2 = (double)i3 / ix;
               class01837.N(j3, d2);
               class01837.y(var3, d0);
               class01837.L(var4, d1);
               class00500 class00500x = class01837.N();
               class00500 class00500x = class00500x == null ? this.R.N().M() : class00500x;
               if (aclass00500 != null) {
                  int k3 = l2 * ix + i3;
                  aclass00500[k3] = class00500x;
               }

               if (var6 != null && var6.test(class00500x)) {
                  class01837.M();
                  return OptionalInt.of(j3 + 1);
               }
            }
         }

         class01837.M();
         return OptionalInt.empty();
      }
   }

   @Override
   public void N(class01607 var1, class05324 var2, class04084 var3, class08050 var4) {
      if (!class07529.N(var4.R()) && !class07529.Nk) {
         class06057 class06057 = new class06057(this, var1);
         this.N(var4, class06057, var3, var2, var1.method_22385(), var1.method_30349().L(class04227.NA), class03001.N(var1));
      }
   }

   public void N(class08050 var1, class06057 var2, class04084 var3, class05324 var4, class05517 var5, class00751<class00780> var6, class03001 var7) {
      class01837 class01837 = var1.N_20(var4x -> this.N(var4x, var4, var7, var3));
      class05943 class05943 = this.R.N();
      var3.L().N(var3, var5, var6, class05943.m(), var2, var1, class01837, class05943.z());
   }

   @Override
   public class01376 N(int var1, int var2, class05474 var3, class04084 var4) {
      MutableObject mutableobject = new MutableObject();
      this.N(var3, var4, var1, var2, mutableobject, null);
      return (class01376)mutableobject.get();
   }

   @Override
   public int N(int var1, int var2, class07830 var3, class05474 var4, class04084 var5) {
      return this.N(var4, var5, var1, var2, null, var3.u()).orElse(var4.method_31607());
   }

   public boolean N(class05946<class05943> var1) {
      return this.R.N(var1);
   }

   @Override
   public void N(class01607 var1) {
      if (!this.R.N().N()) {
         class07321 class07321 = var1.L();
         class03556 class03556 = var1.i(class07321.W().method_33096(var1.method_31600()));
         class07836 class07836 = new class07836(new class06075(class04043.N()));
         class07836.N(var1.method_8412(), class07321.i(), class07321.R());
         class00803.N(var1, class03556, class07321, class07836);
      }
   }

   private class01837 N(class08050 var1, class05324 var2, class03001 var3, class04084 var4) {
      return class01837.N(var1, var4, class06051.N(var2, var1.R()), this.R.N(), this.M.get(), var3);
   }

   private class00500 N(class01837 var1, int var2, int var3, int var4, class00500 var5) {
      if (class07529.Nv && var4 >= 0 && var4 % 4 == 0) {
         int ix = var1.N(var2, var4) + 8;
         if (var3 == ix) {
            var5 = ix < this.R() ? class00869.Zc.W() : class00869.TM.W();
         }
      }

      return var5;
   }

   @Override
   public void N(class01607 var1, long var2, class04084 var4, class05517 var5, class05324 var6, class08050 var7) {
      if (!class07529.NY) {
         class05517 class05517 = var5.N((var2x, var3, var4x) -> this.y.method_38109(var2x, var3, var4x, var4.y()));
         class07836 class07836 = new class07836(new class06075(class04043.N()));
         byte b0 = 8;
         class07321 class07321x = var7.R();
         class01837 class01837 = var7.N_20(var4x -> this.N(var4x, var6, class03001.N(var1), var4));
         class03460 class03460 = class01837.Z();
         class06080 class06080 = new class06080(this, var1.method_30349(), var7.w(), class01837, var4, this.R.N().z());
         class03322 class03322 = ((class07361)var7).g();

         for (int ix = -8; ix <= 8; ix++) {
            for (int j = -8; j <= 8; j++) {
               class07321 class07321x = new class07321(class07321x.B + ix, class07321x.Z + j);
               Iterable iterable = var1.method_8392(class07321x.B, class07321x.Z)
                  .N(() -> this.N(this.y.method_38109(class01146.N(class07321.i()), 0, class01146.N(class07321.R()), var4.y())))
                  .N();
               int k = 0;

               for (Iterator iterator = iterable.iterator(); iterator.hasNext(); k++) {
                  class07829 class07829 = (class07829)((class03556)iterator.next()).N();
                  class07836.L(var2 + k, class07321x.B, class07321x.Z);
                  if (class07829.N(class07836)) {
                     class07829.N(class06080, var7, class05517::N, class07836, class03460, class07321x, class03322);
                  }
               }
            }
         }
      }
   }

   @Override
   public CompletableFuture<class08050> N(class03001 var1, class04084 var2, class05324 var3, class08050 var4) {
      class05967 class05967 = this.R.N().R().N(var4.w());
      int ix = class05967.L();
      int j = class04995.y(ix, class05967.N());
      int k = class04995.y(class05967.u(), class05967.N());
      return k <= 0 ? CompletableFuture.completedFuture(var4) : CompletableFuture.supplyAsync(() -> {
         int ixx = var4.method_31602(k * class05967.N() - 1 + ix);
         int jx = var4.method_31602(ix);
         HashSet hashset = Sets.newHashSet();

         for (int kx = ixx; kx >= jx; kx--) {
            class00554 class00554 = var4.y(kx);
            class00554.N();
            hashset.add(class00554);
         }

         class08050 class08050;
         try {
            class08050 = this.N(var1, var3, var2, var4, j, k);
         } finally {
            Iterator iterator = hashset.iterator();

            while (iterator.hasNext()) {
               ((class00554)iterator.next()).y();
            }
         }

         return class08050;
      }, class07536.B().N("wgen_fill_noise"));
   }

   private class08050 N(class03001 var1, class05324 var2, class04084 var3, class08050 var4, int var5, int var6) {
      class01837 class01837 = var4.N_20(var4x -> this.N(var4x, var2, var1, var3));
      class07841 class07841x = var4.N(class07830.field_13195);
      class07841 class07841x = var4.N(class07830.field_13194);
      class07321 class07321 = var4.R();
      int ix = class07321.i();
      int j = class07321.R();
      class03460 class03460 = class01837.Z();
      class01837.R();
      class07218 class07218 = new class07218();
      int k = class01837.z();
      int l = class01837.U();
      int i1 = 16 / k;
      int j1 = 16 / k;

      for (int k1 = 0; k1 < i1; k1++) {
         class01837.N(k1);

         for (int l1 = 0; l1 < j1; l1++) {
            int i2 = var4.method_32890() - 1;
            class00554 class00554 = var4.y(i2);

            for (int j2 = var6 - 1; j2 >= 0; j2--) {
               class01837.y(j2, l1);

               for (int k2 = l - 1; k2 >= 0; k2--) {
                  int l2 = (var5 + j2) * l + k2;
                  int i3 = l2 & 15;
                  int j3 = var4.method_31602(l2);
                  if (i2 != j3) {
                     i2 = j3;
                     class00554 = var4.y(j3);
                  }

                  double d0 = (double)k2 / l;
                  class01837.N(l2, d0);

                  for (int k3 = 0; k3 < k; k3++) {
                     int l3 = ix + k1 * k + k3;
                     int i4 = l3 & 15;
                     double d1 = (double)k3 / k;
                     class01837.y(l3, d1);

                     for (int j4 = 0; j4 < k; j4++) {
                        int k4 = j + l1 * k + j4;
                        int l4 = k4 & 15;
                        double d2 = (double)j4 / k;
                        class01837.L(k4, d2);
                        class00500 class00500 = class01837.N();
                        if (class00500 == null) {
                           class00500 = this.R.N().M();
                        }

                        class00500 = this.N(class01837, l3, l2, k4, class00500);
                        if (class00500 != i && !class07529.N(var4.R())) {
                           class00554.N(i4, i3, l4, class00500, false);
                           class07841x.N(i4, l2, l4, class00500);
                           class07841x.N(i4, l2, l4, class00500);
                           if (class03460.N() && !class00500.Y().W()) {
                              class07218.N(l3, l2, k4);
                              var4.u(class07218);
                           }
                        }
                     }
                  }
               }
            }
         }

         class01837.B();
      }

      class01837.M();
      return var4;
   }

   @Override
   public int R() {
      if (this.B == Integer.MIN_VALUE) {
         this.B = this.R.N().E();
      }

      return this.B;
   }
}
