package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

class class05821 {
   private final class01199<Dynamic<?>> u = class01199.L(32);
   private final List<Dynamic<?>> i;
   private final Dynamic<?> R;
   private final boolean M;
   final Int2ObjectMap<IntList> N = new Int2ObjectLinkedOpenHashMap();
   final IntList y = new IntArrayList();
   public final int L;
   private final Set<Dynamic<?>> B = Sets.newIdentityHashSet();
   private final int[] Z = new int[4096];

   public class05821(Dynamic<?> var1) {
      super();
      this.i = Lists.newArrayList();
      this.R = var1;
      this.L = var1.get("Y").asInt(0);
      this.M = var1.get("Blocks").result().isPresent();
   }

   public int y(int var1) {
      if (!this.M) {
         return var1;
      } else {
         ByteBuffer bytebuffer = (ByteBuffer)this.R.get("Blocks").asByteBufferOpt().result().get();
         class05829 class05829x = this.R
            .get("Data")
            .asByteBufferOpt()
            .map(var0 -> new class05829(DataFixUtils.toArray(var0)))
            .result()
            .orElseGet(class05829::new);
         class05829 class05829x = this.R
            .get("Add")
            .asByteBufferOpt()
            .map(var0 -> new class05829(DataFixUtils.toArray(var0)))
            .result()
            .orElseGet(class05829::new);
         this.B.add(class05830.j);
         class05819.N(this.u, class05830.j);
         this.i.add(class05830.j);

         for (int ix = 0; ix < 4096; ix++) {
            int j = ix & 15;
            int k = ix >> 8 & 15;
            int l = ix >> 4 & 15;
            int i1 = class05829x.N(j, k, l) << 12 | (bytebuffer.get(ix) & 255) << 4 | class05829x.N(j, k, l);
            if (class05830.y.get(i1 >> 4)) {
               this.N(i1 >> 4, ix);
            }

            if (class05830.N.get(i1 >> 4)) {
               int j1 = class05819.N(j == 0, j == 15, l == 0, l == 15);
               if (j1 == 0) {
                  this.y.add(ix);
               } else {
                  var1 |= j1;
               }
            }

            this.N(ix, class05803.y(i1));
         }

         return var1;
      }
   }

   private void N(int var1, int var2) {
      Object object = (IntList)this.N.get(var1);
      if (object == null) {
         object = new IntArrayList();
         this.N.put(var1, object);
      }

      object.add(var2);
   }

   public Dynamic<?> N() {
      Dynamic<?> dynamic = this.R;
      if (!this.M) {
         return dynamic;
      } else {
         dynamic = dynamic.set("Palette", dynamic.createList(this.i.stream()));
         int ix = Math.max(4, DataFixUtils.ceillog2(this.B.size()));
         class05945 class05945 = new class05945(ix, 4096);

         for (int j = 0; j < this.Z.length; j++) {
            class05945.N(j, this.Z[j]);
         }

         dynamic = dynamic.set("BlockStates", dynamic.createLongList(Arrays.stream(class05945.N())));
         dynamic = dynamic.remove("Blocks");
         dynamic = dynamic.remove("Data");
         return dynamic.remove("Add");
      }
   }

   public Dynamic<?> N(int var1) {
      if (var1 >= 0 && var1 <= 4095) {
         Dynamic<?> dynamic = this.u.N(this.Z[var1]);
         return dynamic == null ? class05830.j : dynamic;
      } else {
         return class05830.j;
      }
   }

   public void N(int var1, Dynamic<?> var2) {
      if (this.B.add(var2)) {
         this.i.add("%%FILTER_ME%%".equals(class05819.N(var2)) ? class05830.j : var2);
      }

      this.Z[var1] = class05819.N(this.u, var2);
   }
}
