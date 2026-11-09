package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class class05488 extends DataFix {
   public class05488(Schema var1, boolean var2) {
      super(var1, var2);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.u);
      OpticFinder<?> opticfinder = type.findField("Level");
      return this.fixTypeEverywhereTyped("Leaves fix", type, var1x -> var1x.updateTyped(opticfinder, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> {
         Optional<IntStream> optional = var0xx.get("Biomes").asIntStreamOpt().result();
         if (optional.isEmpty()) {
            return var0xx;
         } else {
            int[] aint = optional.get().toArray();
            if (aint.length != 256) {
               return var0xx;
            } else {
               int[] aint1 = new int[1024];

               for (int i = 0; i < 4; i++) {
                  for (int j = 0; j < 4; j++) {
                     int k = (j << 2) + 2;
                     int l = (i << 2) + 2 << 4 | k;
                     aint1[i << 2 | j] = aint[l];
                  }
               }

               for (int i1 = 1; i1 < 64; i1++) {
                  System.arraycopy(aint1, 0, aint1, i1 * 16, 16);
               }

               return var0xx.set("Biomes", var0xx.createIntList(Arrays.stream(aint1)));
            }
         }
      })));
   }
}
