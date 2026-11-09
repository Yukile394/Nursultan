package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class08822 extends class02479 {
   private static final Optional<String> N = Optional.of("\"\"");

   private static <T> boolean L(Dynamic<T> var0) {
      return N(var0, "components", var0x -> N(var0x, "minecraft:custom_name", var0xx -> var0xx.asString().result().equals(N)));
   }

   public class08822(Schema var1) {
      super(var1, "InvalidLockComponentPredicateFix", "minecraft:lock");
   }

   @Nullable
   public static <T> Dynamic<T> y(Dynamic<T> var0) {
      return L(var0) ? null : var0;
   }

   @Nullable
   @Override
   protected <T> Dynamic<T> N(Dynamic<T> var1) {
      return y(var1);
   }

   private static <T> boolean N(Dynamic<T> var0, String var1, Predicate<Dynamic<T>> var2) {
      Optional optional = var0.getMapValues().result();
      return !optional.isEmpty() && ((Map)optional.get()).size() == 1 ? var0.get(var1).result().filter(var2).isPresent() : false;
   }
}
