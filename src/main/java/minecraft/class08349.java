package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class class08349 extends DataFix {
   public class08349(Schema var1) {
      super(var1, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "ForcedChunkToTicketFix",
         this.getInputSchema().getType(class06962.z),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> var0x.update(
               "data",
               var1 -> var1.renameAndFixField(
                  "Forced",
                  "tickets",
                  var1x -> var1x.createList(
                     var1x.asLongStream()
                        .mapToObj(
                           var1xx -> var0x.emptyMap()
                              .set("type", var0x.createString("minecraft:forced"))
                              .set("level", var0x.createInt(31))
                              .set("ticks_left", var0x.createLong(0L))
                              .set("chunk_pos", var0x.createLong(var1xx))
                        )
                  )
               )
            )
         )
      );
   }
}
