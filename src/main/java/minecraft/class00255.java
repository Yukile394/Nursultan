package minecraft;

import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class00255 extends class02479 {
   public static final Escaper N = Escapers.builder().addEscape('"', "\\\"").addEscape('\\', "\\\\").build();

   public class00255(Schema var1) {
      super(var1, "LockComponentPredicateFix", "minecraft:lock");
   }

   @Nullable
   public static <T> Dynamic<T> y(Dynamic<T> var0) {
      Optional<String> optional = var0.asString().result();
      if (optional.isEmpty()) {
         return null;
      } else if (optional.get().isEmpty()) {
         return null;
      } else {
         Dynamic dynamic = var0.createString("\"" + N.escape(optional.get()) + "\"");
         Dynamic dynamic1 = var0.emptyMap().set("minecraft:custom_name", dynamic);
         return var0.emptyMap().set("components", dynamic1);
      }
   }

   @Nullable
   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      return y(var1);
   }
}
