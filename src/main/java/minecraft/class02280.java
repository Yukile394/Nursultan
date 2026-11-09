package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class02280 extends class00955 {
   private static final String L = "minecraft:wolf";
   private static final String u = "minecraft:generic.max_health";

   public class02280(Schema var1) {
      super(var1, false, "FixWolfHealth", class06962.o, "minecraft:wolf");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> {
            MutableBoolean mutableboolean = new MutableBoolean(false);
            var0 = var0.update(
               "Attributes",
               var1x -> var1x.createList(
                  var1x.asStream()
                     .map(var1xx -> "minecraft:generic.max_health".equals(class00622.N(var1xx.get("Name").asString(""))) ? var1xx.update("Base", var1xxx -> {
                        if (var1xxx.asDouble(0.0) == 20.0) {
                           mutableboolean.setTrue();
                           return var1xxx.createDouble(40.0);
                        } else {
                           return var1xxx;
                        }
                     }) : var1xx)
               )
            );
            if (mutableboolean.isTrue()) {
               var0 = var0.update("Health", var0x -> var0x.createFloat(var0x.asFloat(0.0F) * 2.0F));
            }

            return var0;
         }
      );
   }
}
