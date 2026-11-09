package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.stream.LongStream;

public class class05067 extends DataFix {
   private static final int N = 6;
   private static final int y = 16;
   private static final int L = 16;
   private static final int u = 4096;
   private static final int i = 9;
   private static final int R = 256;

   public class05067(Schema var1) {
      super(var1, false);
   }

   private static Typed<?> N(OpticFinder<?> var0, OpticFinder<?> var1, OpticFinder<List<Pair<String, Dynamic<?>>>> var2, Typed<?> var3) {
      return var3.updateTyped(
         var0,
         var2x -> var2x.updateTyped(
            var1,
            var1xx -> {
               int ix = var1xx.getOptional(var2).map(var0xxx -> Math.max(4, DataFixUtils.ceillog2(var0xxx.size()))).orElse(0);
               return ix != 0 && !class04995.i(ix)
                  ? var1xx.update(DSL.remainderFinder(), var1xxx -> var1xxx.update("BlockStates", var2xx -> N(var1xxx, var2xx, 4096, ix)))
                  : var1xx;
            }
         )
      );
   }

   private static Dynamic<?> N(Dynamic<?> var0, Dynamic<?> var1, int var2, int var3) {
      long[] along = var1.asLongStream().toArray();
      long[] along1 = N(var2, var3, along);
      return var0.createLongList(LongStream.of(along1));
   }

   public static long[] N(int var0, int var1, long[] var2) {
      int ix = var2.length;
      if (ix == 0) {
         return var2;
      } else {
         long j = (1L << var1) - 1L;
         int k = 64 / var1;
         long[] along = new long[(var0 + k - 1) / k];
         int l = 0;
         int i1 = 0;
         long j1 = 0L;
         int k1 = 0;
         long l1 = var2[0];
         long i2 = ix > 1 ? var2[1] : 0L;

         for (int j2 = 0; j2 < var0; j2++) {
            int k2 = j2 * var1;
            int l2 = k2 >> 6;
            int i3 = (j2 + 1) * var1 - 1 >> 6;
            int j3 = k2 ^ l2 << 6;
            if (l2 != k1) {
               l1 = i2;
               i2 = l2 + 1 < ix ? var2[l2 + 1] : 0L;
               k1 = l2;
            }

            long k3;
            if (l2 == i3) {
               k3 = l1 >>> j3 & j;
            } else {
               int l3 = 64 - j3;
               k3 = (l1 >>> j3 | i2 << l3) & j;
            }

            int i4 = i1 + var1;
            if (i4 >= 64) {
               along[l++] = j1;
               j1 = k3;
               i1 = var1;
            } else {
               j1 |= k3 << i1;
               i1 = i4;
            }
         }

         if (j1 != 0L) {
            along[l] = j1;
         }

         return along;
      }
   }

   private Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> var0.update("Heightmaps", var1x -> var1x.updateMapValues(var1xx -> var1xx.mapSecond(var1xxx -> N(var0, var1xxx, 256, 9))))
      );
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      Type<?> type1 = type.findFieldType("Level");
      OpticFinder opticfinder = DSL.fieldFinder("Level", type1);
      OpticFinder<?> opticfinder1 = opticfinder.type().findField("Sections");
      OpticFinder opticfinder2 = DSL.typeFinder(((ListType)opticfinder1.type()).getElement());
      Type<Pair<String, Dynamic<?>>> type2 = DSL.named(class06962.d.typeName(), DSL.remainderType());
      OpticFinder opticfinder3 = DSL.fieldFinder("Palette", DSL.list(type2));
      return this.fixTypeEverywhereTyped(
         "BitStorageAlignFix",
         type,
         this.getOutputSchema().getType(class06962.u),
         var5 -> var5.updateTyped(opticfinder, var4xx -> this.N(N(opticfinder1, opticfinder2, opticfinder3, var4xx)))
      );
   }
}
