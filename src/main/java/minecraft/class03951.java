package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;

public class class03951 extends class00955 {
   private final Map<String, String> L;

   public class03951(Schema var1, String var2, TypeReference var3, String var4, Map<String, String> var5) {
      super(var1, false, var2, var3, var4);
      this.L = var5;
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var1x -> var1x.update(
            "variant",
            var1xx -> (Dynamic)DataFixUtils.orElse(var1xx.asString().map(var2 -> var1xx.createString(this.L.getOrDefault(var2, var2))).result(), var1xx)
         )
      );
   }
}
