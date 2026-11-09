package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.IntStream;

public class class08412 extends DataFix {
   private static final long N = 32L;
   private static final long y = 4294967295L;

   public class08412(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "ChunkTicketUnpackPosFix",
         this.getInputSchema().getType(class06962.z),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> var0x.update(
               "data",
               var0xx -> var0xx.update("tickets", var0xxx -> var0xxx.createList(var0xxx.asStream().map(var0xxxx -> var0xxxx.update("chunk_pos", var0xxxxx -> {
                  long i = var0xxxxx.asLong(0L);
                  int j = (int)(i & 4294967295L);
                  int k = (int)(i >>> 32 & 4294967295L);
                  return var0xxxxx.createIntList(IntStream.of(j, k));
               }))))
            )
         )
      );
   }
}
