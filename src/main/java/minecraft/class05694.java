package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class05694 extends class03952 {
   public class05694(Schema var1) {
      super(var1, "OminousBannerRenameFix", var0 -> var0.equals("minecraft:white_banner"));
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return class07536.N(var1, var1.getType(), this::N);
   }

   private <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.update(
         "display",
         var0 -> var0.update(
            "Name",
            var0x -> {
               Optional<String> optional = var0x.asString().result();
               return optional.isPresent()
                  ? var0x.createString(
                     optional.get().replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"")
                  )
                  : var0x;
            }
         )
      );
   }
}
