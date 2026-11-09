package minecraft;

import Nursultan.class09174;
import Nursultan.class10759;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.interaction.container_clicking.IAbstractContainerMenu;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.hopper.InventoryHelper;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07482 implements IAbstractContainerMenu {
   private static final Logger N = LogUtils.getLogger();
   public static final int M = -999;
   public static final int B = 0;
   public static final int Z = 1;
   public static final int z = 2;
   public static final int U = 0;
   public static final int E = 1;
   public static final int W = 2;
   public static final int m = Integer.MAX_VALUE;
   public static final int P = 9;
   public static final int s = 18;
   private final class00743<class06584> y;
   public final class00743<class06937> T;
   private final List<class05865> L;
   private class06584 u;
   private final class00743<class00161> i;
   private final IntList R;
   private class00161 j;
   private int v;
   @Nullable
   private final class05851<?> n;
   public final int b;
   private int t;
   private int G;
   private final Set<class06937> l;
   private final List<class07508> d;
   @Nullable
   private class02723 w;
   private boolean k;
   private short Y = 0;

   public class06937 L(int var1) {
      return this.T.get(var1);
   }

   public static int L(@Nullable class06695 var0) {
      if (var0 == null) {
         return 0;
      } else {
         float f = 0.0F;
         int ix = 0;

         while (true) {
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
            N(var0, callbackinforeturnable);
            if (callbackinforeturnable.isCancelled()) {
               return callbackinforeturnable.getReturnValueI();
            }

            if (ix >= var0.method_5439()) {
               f /= var0.method_5439();
               return class04995.y(f, 0, 15);
            }

            class06584 class06584 = var0.method_5438(ix);
            if (!class06584.R()) {
               f += (float)class06584.c() / var0.a_(class06584);
            }

            ix++;
         }
      }
   }

   protected void L(class06695 var1, int var2, int var3) {
      this.y(var1, var2, var3);
      byte b0 = 4;
      byte b1 = 58;
      this.N(var1, var2, var3 + 58);
   }

   public class00743<class06584> L() {
      class00743 class00743 = class00743.method_10211();

      for (class06937 class06937 : this.T) {
         class00743.add(class06937.i());
      }

      return class00743;
   }

   public static int L(int var0, int var1) {
      return var0 & 3 | (var1 & 3) << 2;
   }

   public class06584 M() {
      return this.u;
   }

   protected class07482(@Nullable class05851<?> var1, int var2) {
      super();
      this.y = class00743.method_10211();
      this.T = class00743.method_10211();
      this.L = Lists.newArrayList();
      this.u = class06584.E;
      this.i = class00743.method_10211();
      this.R = new IntArrayList();
      this.j = class00161.N;
      this.t = -1;
      this.l = Sets.newHashSet();
      this.d = Lists.newArrayList();
      this.n = var1;
      this.b = var2;
   }

   public void B() {
      this.k = true;
   }

   public void Z() {
      this.k = false;
   }

   private void i(int var1, int var2) {
      if (!this.k) {
         if (this.R.getInt(var1) != var2) {
            this.R.set(var1, var2);
            if (this.w != null) {
               this.w.N(this, var1, var2);
            }
         }
      }
   }

   public void i() {
      for (int ix = 0; ix < this.T.size(); ix++) {
         class06584 class06584 = this.T.get(ix).i();
         this.N(ix, class06584, class06584::t);
      }

      for (int jx = 0; jx < this.L.size(); jx++) {
         class05865 class05865 = this.L.get(jx);
         if (class05865.L()) {
            this.u(jx, class05865.y());
         }
      }

      this.y();
   }

   public static int i(int var0) {
      return var0 & 3;
   }

   public int U() {
      this.v = this.v + 1 & 32767;
      return this.v;
   }

   public int z() {
      return this.v;
   }

   private void u(int var1, int var2) {
      Iterator<class07508> iterator = this.d.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(this, var1, var2);
      }
   }

   public static int u(int var0) {
      return var0 >> 2 & 3;
   }

   public void u() {
      for (int ix = 0; ix < this.T.size(); ix++) {
         class06584 class06584 = this.T.get(ix).i();
         Supplier supplier = Suppliers.memoize(class06584::t);
         this.N(ix, class06584, supplier);
         this.y(ix, class06584, supplier);
      }

      this.E();

      for (int jx = 0; jx < this.L.size(); jx++) {
         class05865 class05865 = this.L.get(jx);
         int kx = class05865.y();
         if (class05865.L()) {
            this.u(jx, kx);
         }

         this.i(jx, kx);
      }
   }

   public boolean y(class06937 var1) {
      return true;
   }

   private void y(int var1, int var2, class07510 var3, class08036 var4) {
      class08044 class08044 = var4.method_31548();
      if (var3 == class07510.field_7789) {
         int ix = this.G;
         this.G = i(var2);
         if ((ix != 1 || this.G != 2) && ix != this.G) {
            this.R();
         } else if (this.M().R()) {
            this.R();
         } else if (this.G == 0) {
            this.t = u(var2);
            if (N(this.t, var4)) {
               this.G = 1;
               this.l.clear();
            } else {
               this.R();
            }
         } else if (this.G == 1) {
            class06937 class06937xxxx = this.T.get(var1);
            class06584 class06584xxxxxxxxxx = this.M();
            if (N(class06937xxxx, class06584xxxxxxxxxx, true)
               && class06937xxxx.N(class06584xxxxxxxxxx)
               && (this.t == 2 || class06584xxxxxxxxxx.c() > this.l.size())
               && this.y(class06937xxxx)) {
               this.l.add(class06937xxxx);
            }
         } else if (this.G == 2) {
            if (!this.l.isEmpty()) {
               if (this.l.size() == 1) {
                  int i1 = this.l.iterator().next().u;
                  this.R();
                  this.y(i1, this.t, class07510.field_7790, var4);
                  return;
               }

               class06584 class06584xxxxxxx = this.M().t();
               if (class06584xxxxxxx.R()) {
                  this.R();
                  return;
               }

               int k1 = this.M().c();

               for (class06937 var10 : this.l) {
                  class06584 class06584x = this.M();
                  if (var10 != null
                     && N(var10, class06584x, true)
                     && var10.N(class06584x)
                     && (this.t == 2 || class06584x.c() >= this.l.size())
                     && this.y(var10)) {
                     int jx = var10.R() ? var10.i().c() : 0;
                     int kx = Math.min(class06584xxxxxxx.U(), var10.b_(class06584xxxxxxx));
                     int lx = Math.min(N(this.l, this.t, class06584xxxxxxx) + jx, kx);
                     k1 -= lx - jx;
                     var10.u(class06584xxxxxxx.L(lx));
                  }
               }

               class06584xxxxxxx.i(k1);
               this.N(class06584xxxxxxx);
            }

            this.R();
         } else {
            this.R();
         }
      } else if (this.G != 0) {
         this.R();
      } else if ((var3 == class07510.field_7790 || var3 == class07510.field_7794) && (var2 == 0 || var2 == 1)) {
         class05442 class05442 = var2 == 0 ? class05442.field_27013 : class05442.field_27014;
         if (var1 == -999) {
            if (!this.M().R()) {
               if (class05442 == class05442.field_27013) {
                  var4.method_7328(this.M(), true);
                  this.N(class06584.E);
               } else {
                  var4.method_7328(this.M().N(1), true);
               }
            }
         } else if (var3 == class07510.field_7794) {
            if (var1 < 0) {
               return;
            }

            class06937 class06937x = this.T.get(var1);
            if (!class06937x.N(var4)) {
               return;
            }

            class06584 class06584xxx = this.N(var4, var1);

            while (!class06584xxx.R() && class06584.y(class06937x.i(), class06584xxx)) {
               class06584xxx = this.N(var4, var1);
            }
         } else {
            if (var1 < 0) {
               return;
            }

            class06937 class06937x = this.T.get(var1);
            class06584 class06584xxxxxxxxxxxx = class06937x.i();
            class06584 class06584x = this.M();
            var4.method_33592(class06584x, class06937x.i(), class05442);
            if (!this.N(var4, class05442, class06937x, class06584xxxxxxxxxxxx, class06584x)) {
               if (class06584xxxxxxxxxxxx.R()) {
                  if (!class06584x.R()) {
                     int i3 = class05442 == class05442.field_27013 ? class06584x.c() : 1;
                     this.N(class06937x.y(class06584x, i3));
                  }
               } else if (class06937x.N(var4)) {
                  if (class06584x.R()) {
                     int j3 = class05442 == class05442.field_27013 ? class06584xxxxxxxxxxxx.c() : (class06584xxxxxxxxxxxx.c() + 1) / 2;
                     Optional<class06584> optional1 = class06937x.N(j3, Integer.MAX_VALUE, var4);
                     optional1.ifPresent(var3x -> {
                        this.N(var3x);
                        class06937.N(var4, var3x);
                     });
                  } else if (class06937x.N(class06584x)) {
                     if (class06584.L(class06584xxxxxxxxxxxx, class06584x)) {
                        int k3 = class05442 == class05442.field_27013 ? class06584x.c() : 1;
                        this.N(class06937x.y(class06584x, k3));
                     } else if (class06584x.c() <= class06937x.b_(class06584x)) {
                        this.N(class06584xxxxxxxxxxxx);
                        class06937x.u(class06584x);
                     }
                  } else if (class06584.L(class06584xxxxxxxxxxxx, class06584x)) {
                     Optional<class06584> optional = class06937x.N(class06584xxxxxxxxxxxx.c(), class06584x.U() - class06584x.c(), var4);
                     optional.ifPresent(var3x -> {
                        class06584xxxxxxxxxxx.M(var3x.c());
                        class06937.N(var4, var3x);
                     });
                  }
               }
            }

            class06937x.M();
         }
      } else if (var3 == class07510.field_7791 && (var2 >= 0 && var2 < 9 || var2 == 40)) {
         class06584 class06584xxxxxxxx = class08044.method_5438(var2);
         class06937 class06937x = this.T.get(var1);
         class06584 class06584x = class06937x.i();
         if (!class06584xxxxxxxx.R() || !class06584x.R()) {
            if (class06584xxxxxxxx.R()) {
               if (class06937x.N(var4)) {
                  class08044.method_5447(var2, class06584x);
                  class06937x.y(class06584x.c());
                  class06937x.u(class06584.E);
                  class06937x.N(var4, class06584x);
               }
            } else if (class06584x.R()) {
               if (class06937x.N(class06584xxxxxxxx)) {
                  int j2 = class06937x.b_(class06584xxxxxxxx);
                  if (class06584xxxxxxxx.c() > j2) {
                     class06937x.u(class06584xxxxxxxx.N(j2));
                  } else {
                     class08044.method_5447(var2, class06584.E);
                     class06937x.u(class06584xxxxxxxx);
                  }
               }
            } else if (class06937x.N(var4) && class06937x.N(class06584xxxxxxxx)) {
               int k2 = class06937x.b_(class06584xxxxxxxx);
               if (class06584xxxxxxxx.c() > k2) {
                  class06937x.u(class06584xxxxxxxx.N(k2));
                  class06937x.N(var4, class06584x);
                  if (!class08044.M(class06584x)) {
                     var4.method_7328(class06584x, true);
                  }
               } else {
                  class08044.method_5447(var2, class06584x);
                  class06937x.u(class06584xxxxxxxx);
                  class06937x.N(var4, class06584x);
               }
            }
         }
      } else if (var3 == class07510.field_7796 && var4.method_56992() && this.M().R() && var1 >= 0) {
         class06937 class06937x = this.T.get(var1);
         if (class06937x.R()) {
            class06584 class06584xxxxx = class06937x.i();
            this.N(class06584xxxxx.L(class06584xxxxx.U()));
         }
      } else if (var3 == class07510.field_7795 && this.M().R() && var1 >= 0) {
         class06937 class06937x = this.T.get(var1);
         int j1 = var2 == 0 ? 1 : class06937x.i().c();
         if (!var4.method_64271()) {
            return;
         }

         class06584 class06584xxxx = class06937x.y(j1, Integer.MAX_VALUE, var4);
         var4.method_7328(class06584xxxx, true);
         var4.method_61499(class06584xxxx);
         if (var2 == 1) {
            while (!class06584xxxx.R() && class06584.y(class06937x.i(), class06584xxxx)) {
               if (!var4.method_64271()) {
                  return;
               }

               class06584xxxx = class06937x.y(j1, Integer.MAX_VALUE, var4);
               var4.method_7328(class06584xxxx, true);
               var4.method_61499(class06584xxxx);
            }
         }
      } else if (var3 == class07510.field_7793 && var1 >= 0) {
         class06937 class06937xx = this.T.get(var1);
         class06584 class06584xxxxxx = this.M();
         if (!class06584xxxxxx.R() && (!class06937xx.R() || !class06937xx.N(var4))) {
            int l1 = var2 == 0 ? 0 : this.T.size() - 1;
            int i2 = var2 == 0 ? 1 : -1;

            for (int l2 = 0; l2 < 2; l2++) {
               for (int l3 = l1; l3 >= 0 && l3 < this.T.size() && class06584xxxxxx.c() < class06584xxxxxx.U(); l3 += i2) {
                  class06937 class06937xxx = this.T.get(l3);
                  if (class06937xxx.R() && N(class06937xxx, class06584xxxxxx, true) && class06937xxx.N(var4) && this.N(class06584xxxxxx, class06937xxx)) {
                     class06584 class06584x = class06937xxx.i();
                     if (l2 != 0 || class06584x.c() != class06584x.U()) {
                        class06584 class06584xx = class06937xxx.y(class06584x.c(), class06584xxxxxx.U() - class06584xxxxxx.c(), var4);
                        class06584xxxxxx.M(class06584xx.c());
                     }
                  }
               }
            }
         }
      }
   }

   public void y() {
      ArrayList arraylist = new ArrayList(this.T.size());
      int ix = 0;

      for (int jx = this.T.size(); ix < jx; ix++) {
         class06584 class06584x = this.T.get(ix).i();
         arraylist.add(class06584x.t());
         this.i.get(ix).N(class06584x);
      }

      class06584 class06584 = this.M();
      this.j.N(class06584);
      int kx = 0;

      for (int lx = this.L.size(); kx < lx; kx++) {
         this.R.set(kx, this.L.get(kx).y());
      }

      if (this.w != null) {
         this.w.N(this, arraylist, class06584.t(), this.R.toIntArray());
      }
   }

   public boolean y(int var1) {
      return var1 == -1 || var1 == -999 || var1 < this.T.size();
   }

   public void y(int var1, int var2) {
      this.L.get(var1).N(var2);
   }

   protected void y(class06695 var1, int var2, int var3) {
      for (int ix = 0; ix < 3; ix++) {
         for (int jx = 0; jx < 9; jx++) {
            this.N(new class06937(var1, jx + (ix + 1) * 9, var2 + jx * 18, var3 + ix * 18));
         }
      }
   }

   public void y(class06695 var1) {
      this.u();
   }

   public void y(class08036 var1) {
      if (var1 instanceof class04770) {
         class06584 class06584 = this.M();
         if (!class06584.R()) {
            N(var1, class06584);
            this.N(class06584.E);
         }
      }
   }

   public OptionalInt y(class06695 var1, int var2) {
      for (int ix = 0; ix < this.T.size(); ix++) {
         class06937 class06937 = this.T.get(ix);
         if (class06937.L == var1 && var2 == class06937.B()) {
            return OptionalInt.of(ix);
         }
      }

      return OptionalInt.empty();
   }

   public void y(class07508 var1) {
      this.d.remove(var1);
   }

   private void y(int var1, class06584 var2, java.util.function.Supplier<class06584> var3) {
      if (!this.k) {
         class00161 class00161 = this.i.get(var1);
         if (!class00161.y(var2)) {
            class00161.N(var2);
            if (this.w != null) {
               this.w.N(this, var1, (class06584)var3.get());
            }
         }
      }
   }

   public boolean y(class08036 var1, int var2) {
      return false;
   }

   private void E() {
      if (!this.k) {
         class06584 class06584 = this.M();
         if (!this.j.y(class06584)) {
            this.j.N(class06584);
            if (this.w != null) {
               this.w.N(this, class06584.t());
            }
         }
      }
   }

   public static boolean N(int var0, class08036 var1) {
      if (var0 == 0) {
         return true;
      } else {
         return var0 == 1 ? true : var0 == 2 && var1.method_56992();
      }
   }

   public static boolean N(@Nullable class06937 var0, class06584 var1, boolean var2) {
      boolean flag = var0 == null || !var0.R();
      return !flag && class06584.L(var1, var0.i()) ? var0.i().c() + (var2 ? 0 : var1.c()) <= var1.U() : flag;
   }

   private void N(class07482 var1, class06584 var2) {
      if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_17_1)) {
         this.u = var2;
      }
   }

   private static void N(class06695 var0, CallbackInfoReturnable var1) {
      if (var0 instanceof LithiumInventory lithiuminventory) {
         var1.setReturnValue(InventoryHelper.getLithiumStackList(lithiuminventory).getSignalStrength(var0));
      }
   }

   public void N(class06584 var1) {
      this.u = var1;
   }

   public void N_72(class07482 var1) {
      HashBasedTable hashbasedtable = HashBasedTable.create();

      for (int ix = 0; ix < var1.T.size(); ix++) {
         class06937 class06937x = var1.T.get(ix);
         hashbasedtable.put(class06937x.L, class06937x.B(), ix);
      }

      for (int jx = 0; jx < this.T.size(); jx++) {
         class06937 class06937 = this.T.get(jx);
         Integer integer = (Integer)hashbasedtable.get(class06937.L, class06937.B());
         if (integer != null) {
            this.y.set(jx, var1.y.get(integer));
            class00161 class00161x = var1.i.get(integer);
            class00161 class00161x = this.i.get(jx);
            if (class00161x instanceof class09174 class09174 && class00161x instanceof class09174) {
               ((class09174)class00161x).N(class09174);
            }
         }
      }
   }

   public static int N(@Nullable class00394 var0) {
      return var0 instanceof class06695 ? L((class06695)var0) : 0;
   }

   public static int N(Set<class06937> var0, int var1, class06584 var2) {
      return switch (var1) {
         case 0 -> class04995.y((float)var2.c() / var0.size());
         case 1 -> 1;
         case 2 -> var2.U();
         default -> var2.c();
      };
   }

   private void N(int var1, class06584 var2, java.util.function.Supplier<class06584> var3) {
      if (!class06584.N(this.y.get(var1), var2)) {
         class06584 class06584 = (class06584)var3.get();
         this.y.set(var1, class06584);
         Iterator<class07508> iterator = this.d.iterator();

         while (iterator.hasNext()) {
            iterator.next().N(this, var1, class06584);
         }
      }
   }

   public void N(class02723 var1) {
      this.w = var1;
      this.j = var1.N();
      this.i.replaceAll(var1x -> var1.N());
      this.y();
   }

   public void N(class07508 var1) {
      if (!this.d.contains(var1)) {
         this.d.add(var1);
         this.u();
      }
   }

   protected void N(class05845 var1) {
      for (int ix = 0; ix < var1.N(); ix++) {
         this.N(class05865.N(var1, ix));
      }
   }

   public void N(int var1, class06584 var2) {
      this.i.get(var1).N(var2);
   }

   public void N(int var1, class00176 var2) {
      if (var1 >= 0 && var1 < this.i.size()) {
         this.i.get(var1).N(var2);
      } else {
         N.debug("Incorrect slot index: {} available slots: {}", var1, this.i.size());
      }
   }

   public void N(class00176 var1) {
      this.j.N(var1);
   }

   protected static void N(class06695 var0, int var1) {
      int ix = var0.method_5439();
      if (ix < var1) {
         throw new IllegalArgumentException("Container size " + ix + " is smaller than expected " + var1);
      }
   }

   public class05851<?> N() {
      if (this.n == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.n;
      }
   }

   protected static boolean N(class05880 var0, class08036 var1, class00891 var2) {
      return var0.N((var2x, var3) -> !var2x.method_8320(var3).N(var2) ? false : var1.method_56093(var3, 4.0), true);
   }

   protected void N(class06695 var1, int var2, int var3) {
      for (int ix = 0; ix < 9; ix++) {
         this.N(new class06937(var1, ix, var2 + ix * 18, var3));
      }
   }

   protected static void N(class05845 var0, int var1) {
      int ix = var0.N();
      if (ix < var1) {
         throw new IllegalArgumentException("Container data count " + ix + " is smaller than expected " + var1);
      }
   }

   protected class06937 N(class06937 var1) {
      var1.u = this.T.size();
      this.T.add(var1);
      this.y.add(class06584.E);
      this.i.add(this.w != null ? this.w.N() : class00161.N);
      return var1;
   }

   protected class05865 N(class05865 var1) {
      this.L.add(var1);
      this.R.add(0);
      return var1;
   }

   private static void N(class08036 var0, class06584 var1) {
      boolean flag = var0.method_31481() && var0.method_35049() != class07062.field_27002;
      boolean flag1 = var0 instanceof class04770 && ((class04770)var0).method_14239();
      if (flag || flag1) {
         var0.method_7328(var1, false);
      } else if (var0 instanceof class04770) {
         var0.method_31548().B(var1);
      }
   }

   protected void N(class08036 var1, class06695 var2) {
      for (int ix = 0; ix < var2.method_5439(); ix++) {
         N(var1, var2.method_5441(ix));
      }
   }

   public void N(int var1, int var2, class06584 var3) {
      this.L(var1).i(var3);
      this.v = var2;
   }

   public void N(int var1, List<class06584> var2, class06584 var3) {
      for (int ix = 0; ix < var2.size(); ix++) {
         this.L(ix).i((class06584)var2.get(ix));
      }

      this.N(this, var3);
      this.v = var1;
   }

   public abstract boolean N(class08036 var1);

   protected boolean N(class06584 var1, int var2, int var3, boolean var4) {
      boolean flag = false;
      int ix = var2;
      if (var4) {
         ix = var3 - 1;
      }

      if (var1.E()) {
         while (!var1.R() && (var4 ? ix >= var2 : ix < var3)) {
            class06937 class06937x = this.T.get(ix);
            class06584 class06584x = class06937x.i();
            if (!class06584x.R() && class06584.L(var1, class06584x)) {
               int jx = class06584x.c() + var1.c();
               int kx = class06937x.b_(class06584x);
               if (jx <= kx) {
                  var1.i(0);
                  class06584x.i(jx);
                  class06937x.M();
                  flag = true;
               } else if (class06584x.c() < kx) {
                  var1.B(kx - class06584x.c());
                  class06584x.i(kx);
                  class06937x.M();
                  flag = true;
               }
            }

            if (var4) {
               ix--;
            } else {
               ix++;
            }
         }
      }

      if (!var1.R()) {
         if (var4) {
            ix = var3 - 1;
         } else {
            ix = var2;
         }

         while (var4 ? ix >= var2 : ix < var3) {
            class06937 class06937x = this.T.get(ix);
            class06584 class06584x = class06937x.i();
            if (class06584x.R() && class06937x.N(var1)) {
               int lx = class06937x.b_(var1);
               class06937x.u(var1.N(Math.min(var1.c(), lx)));
               class06937x.M();
               flag = true;
               break;
            }

            if (var4) {
               ix--;
            } else {
               ix++;
            }
         }
      }

      return flag;
   }

   private boolean N(class08036 var1, class05442 var2, class06937 var3, class06584 var4, class06584 var5) {
      class03767 class03767 = var1.method_73183().method_45162();
      return var5.N(class03767) && var5.N(var3, var2, var1) ? true : var4.N(class03767) && var4.N(var5, var3, var2, var1, this.W());
   }

   public void N(int var1, int var2, class07510 var3, class08036 var4) {
      try {
         this.y(var1, var2, var3, var4);
      } catch (Exception exception) {
         class07080 class07080 = class07080.N(exception, "Container click");
         class07074 class07074 = class07080.N("Click info");
         class07074.N("Menu Type", () -> this.n != null ? class04206.T.y(this.n).toString() : "<no type>");
         class07074.N("Menu Class", () -> this.getClass().getCanonicalName());
         class07074.N("Slot Count", this.T.size());
         class07074.N("Slot", var1);
         class07074.N("Button", var2);
         class07074.N("Type", var3);
         throw new class07878(class07080);
      }
   }

   public void N(int var1, int var2) {
      if (var1 >= 0 && var1 < this.T.size()) {
         class05462.N(this.T.get(var1).i(), var2);
      }
   }

   public abstract class06584 N(class08036 var1, int var2);

   public boolean N(class06584 var1, class06937 var2) {
      return true;
   }

   public short viaFabricPlus$getActionId() {
      return this.Y;
   }

   private class04803 W() {
      return new class10759(this);
   }

   protected void R() {
      this.G = 0;
      this.l.clear();
   }

   public short viaFabricPlus$incrementAndGetActionId() {
      return ++this.Y;
   }
}
