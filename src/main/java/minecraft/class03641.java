package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.function.Function;
import java.util.function.IntFunction;

public class class03641 extends class00955 {
   private final String L;
   private final IntFunction<String> u;

   public class03641(Schema var1, String var2, TypeReference var3, String var4, String var5, IntFunction<String> var6) {
      super(var1, false, var2, var3, var4);
      this.L = var5;
      this.u = var6;
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, String var1, String var2, Function<Dynamic<T>, Dynamic<T>> var3) {
      return var0.map(var4 -> {
         DynamicOps dynamicops = var0.getOps();
         Function function = var2xx -> ((Dynamic)var3.apply(new Dynamic(dynamicops, var2xx))).getValue();
         return dynamicops.get(var4, var1).map(var4x -> dynamicops.set(var4, var2, function.apply(var4x))).result().orElse(var4);
      });
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var1x -> N(
            var1x,
            this.L,
            "variant",
            var1xx -> (Dynamic)DataFixUtils.orElse(var1xx.asNumber().map(var2 -> var1xx.createString(this.u.apply(var2.intValue()))).result(), var1xx)
         )
      );
   }
}
