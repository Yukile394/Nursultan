package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;

public class class07371 {
   private static final Logger u = LogUtils.getLogger();
   public static final class07371 N = new class07371(class00515.field_12294);
   private static final String i = "Indices";
   private static final class00758[] R = class00758.values();
   private static final Codec<List<class04306<class00891>>> M = class04306.N(class04206.i.T().orElse(class00869.N)).listOf();
   private static final Codec<List<class04306<class04651>>> B = class04306.N(class04206.L.T().orElse(class04684.N)).listOf();
   private final EnumSet<class00758> Z = EnumSet.noneOf(class00758.class);
   private final List<class04306<class00891>> z = Lists.newArrayList();
   private final List<class04306<class04651>> U = Lists.newArrayList();
   private final int[][] E;
   static final Map<class00891, class07347> y = new IdentityHashMap<>();
   static final Set<class07347> L = Sets.newHashSet();

   public class07371 L() {
      return this == N ? N : new class07371(this);
   }

   private class07371(class07371 var1) {
      super();
      this.Z.addAll(var1.Z);
      this.z.addAll(var1.z);
      this.U.addAll(var1.U);
      this.E = new int[var1.E.length][];

      for (int ix = 0; ix < var1.E.length; ix++) {
         int[] aint = var1.E[ix];
         this.E[ix] = aint != null ? IntArrays.copy(aint) : null;
      }
   }

   public class07371(class07001 var1, class05474 var2) {
      this(var2);
      var1.W("Indices").ifPresent(var1x -> {
         for (int j = 0; j < this.E.length; j++) {
            this.E[j] = var1x.U(String.valueOf(j)).orElse(null);
         }
      });
      int ix = var1.y("Sides", 0);

      for (class00758 class00758 : class00758.values()) {
         if ((ix & 1 << class00758.ordinal()) != 0) {
            this.Z.add(class00758);
         }
      }

      var1.<Collection<? extends E>>N_15("neighbor_block_ticks", M).ifPresent(this.z::addAll);
      var1.<Collection<? extends E>>N_15("neighbor_fluid_ticks", B).ifPresent(this.U::addAll);
   }

   private class07371(class05474 var1) {
      super();
      this.E = new int[var1.method_32890()][];
   }

   private void y(class00570 var1) {
      class07218 class07218x = new class07218();
      class07218 class07218x = new class07218();
      class07321 class07321 = var1.R();
      class07299 class07299 = var1.J();

      for (int ix = 0; ix < this.E.length; ix++) {
         class00554 class00554 = var1.y(ix);
         int[] aint = this.E[ix];
         this.E[ix] = null;
         if (aint != null && aint.length > 0) {
            class07211[] aclass07211 = class07211.values();
            class07348<class00500> class07348 = class00554.B();
            int j = class01296.L(var1.method_31604(ix));

            for (int k : aint) {
               int l = k & 15;
               int i1 = k >> 8 & 15;
               int j1 = k >> 4 & 15;
               class07218x.N(class07321.i() + l, j + i1, class07321.R() + j1);
               class00500 class00500x = class07348.N(k);
               class00500 class00500x = class00500x;

               for (class07211 class07211 : aclass07211) {
                  class07218x.N(class07218x, class07211);
                  if (class01296.N(class07218x.method_10263()) == class07321.B && class01296.N(class07218x.method_10260()) == class07321.Z) {
                     class00500x = N(class00500x, class07211, class07299, class07218x, class07218x);
                  }
               }

               class00891.N(class00500x, class00500x, class07299, class07218x, 18);
            }
         }
      }

      for (int k1 = 0; k1 < this.E.length; k1++) {
         if (this.E[k1] != null) {
            u.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{class07299.method_31604(k1), class07321.B, class07321.Z});
         }

         this.E[k1] = null;
      }
   }

   public class07001 y() {
      class07001 class07001x = new class07001();
      class07001 class07001x = new class07001();

      for (int ix = 0; ix < this.E.length; ix++) {
         String var4 = String.valueOf(ix);
         if (this.E[ix] != null && this.E[ix].length != 0) {
            class07001x.N(var4, this.E[ix]);
         }
      }

      if (!class07001x.z()) {
         class07001x.N("Indices", class07001x);
      }

      int j = 0;

      for (class00758 class00758 : this.Z) {
         j |= 1 << class00758.ordinal();
      }

      class07001x.N("Sides", (byte)j);
      if (!this.z.isEmpty()) {
         class07001x.N("neighbor_block_ticks", M, this.z);
      }

      if (!this.U.isEmpty()) {
         class07001x.N("neighbor_fluid_ticks", B, this.U);
      }

      return class07001x;
   }

   public boolean N() {
      int[][] aint = this.E;
      int ix = aint.length;

      for (int j = 0; j < ix; j++) {
         if (aint[j] != null) {
            return false;
         }
      }

      return this.Z.isEmpty();
   }

   private static class00500 N(class00500 var0, class07211 var1, class07284 var2, class07209 var3, class07209 var4) {
      return y.getOrDefault(var0.i(), class07355.field_12962).N(var0, var1, var2.method_8320(var4), var2, var3, var4);
   }

   private static void N(class00570 var0, class00758 var1) {
      class07299 class07299 = var0.J();
      if (var0.b().Z.remove(var1)) {
         Set<class07211> set = var1.N();
         boolean flag = false;
         byte b0 = 15;
         boolean flag1 = set.contains(class07211.field_11034);
         boolean flag2 = set.contains(class07211.field_11039);
         boolean flag3 = set.contains(class07211.field_11035);
         boolean flag4 = set.contains(class07211.field_11043);
         boolean flag5 = set.size() == 1;
         class07321 class07321 = var0.R();
         int ix = class07321.i() + (!flag5 || !flag4 && !flag3 ? (flag2 ? 0 : 15) : 1);
         int j = class07321.i() + (!flag5 || !flag4 && !flag3 ? (flag2 ? 0 : 15) : 14);
         int k = class07321.R() + (!flag5 || !flag1 && !flag2 ? (flag4 ? 0 : 15) : 1);
         int l = class07321.R() + (!flag5 || !flag1 && !flag2 ? (flag4 ? 0 : 15) : 14);
         class07211[] aclass07211 = class07211.values();
         class07218 class07218 = new class07218();

         for (class07209 class07209 : class07209.method_10094(ix, class07299.method_31607(), k, j, class07299.method_31600(), l)) {
            class00500 class00500x = class07299.method_8320(class07209);
            class00500 class00500x = class00500x;

            for (class07211 class07211 : aclass07211) {
               class07218.N(class07209, class07211);
               class00500x = N(class00500x, class07211, class07299, class07209, class07218);
            }

            class00891.N(class00500x, class00500x, class07299, class07209, 18);
         }
      }
   }

   public void N(class00570 var1) {
      this.y(var1);

      for (class00758 class00758 : R) {
         N(var1, class00758);
      }

      class07299 class07299 = var1.J();
      this.z.forEach(var1x -> {
         class00891 class00891 = var1x.N() == class00869.N ? class07299.method_8320(var1x.y()).i() : var1x.N();
         class07299.N(var1x.y(), class00891, var1x.L(), var1x.u());
      });
      this.U.forEach(var1x -> {
         class04651 class04651 = var1x.N() == class04684.N ? class07299.method_8316(var1x.y()).N() : var1x.N();
         class07299.N(var1x.y(), class04651, var1x.L(), var1x.u());
      });
      L.forEach(var1x -> var1x.N(class07299));
   }
}
