package minecraft;

import com.google.common.collect.Streams;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class02899 extends class01733 {
   private final String N;
   private final boolean y;

   public class02899(Schema var1, String var2, String var3, boolean var4) {
      super(var1, true, "Horse armor fix for " + var2, class06962.o, var2);
      this.N = var3;
      this.y = var4;
   }

   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      Optional optional = var1.get(this.N).result();
      if (optional.isPresent()) {
         Dynamic dynamic = (Dynamic)optional.get();
         Dynamic dynamic1 = var1.remove(this.N);
         if (this.y) {
            dynamic1 = dynamic1.update(
               "ArmorItems", var0 -> var0.createList(Streams.mapWithIndex(var0.asStream(), (var0x, var1x) -> var1x == 2L ? var0x.emptyMap() : var0x))
            );
            dynamic1 = dynamic1.update(
               "ArmorDropChances",
               var0 -> var0.createList(Streams.mapWithIndex(var0.asStream(), (var0x, var1x) -> var1x == 2L ? var0x.createFloat(0.085F) : var0x))
            );
         }

         dynamic1 = dynamic1.set("body_armor_item", dynamic);
         return dynamic1.set("body_armor_drop_chance", var1.createFloat(2.0F));
      } else {
         return var1;
      }
   }
}
