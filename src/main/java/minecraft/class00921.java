package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.UUID;

public class class00921 extends DataFix {
   public class00921(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "EntityStringUuidFix",
         this.getInputSchema().getType(class06962.o),
         var0 -> var0.update(
            DSL.remainderFinder(),
            var0x -> {
               Optional optional = var0x.get("UUID").asString().result();
               if (optional.isPresent()) {
                  UUID uuid = UUID.fromString((String)optional.get());
                  return var0x.remove("UUID")
                     .set("UUIDMost", var0x.createLong(uuid.getMostSignificantBits()))
                     .set("UUIDLeast", var0x.createLong(uuid.getLeastSignificantBits()));
               } else {
                  return var0x;
               }
            }
         )
      );
   }
}
