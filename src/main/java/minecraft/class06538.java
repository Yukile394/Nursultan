package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

class class06538 implements HookFunction {
   class06538() {
      super();
   }

   public <T> T apply(DynamicOps<T> var1, T var2) {
      Dynamic dynamic = new Dynamic(var1, var2);
      return (T)((Dynamic)DataFixUtils.orElse(
            dynamic.get("CriteriaType")
               .get()
               .result()
               .flatMap(
                  var1x -> {
                     Optional<String> optional = var1x.get("type").asString().result();
                     Optional<String> optional1 = var1x.get("id").asString().result();
                     if (optional.isPresent() && optional1.isPresent()) {
                        String s = optional.get();
                        return s.equals("_special")
                           ? Optional.of(dynamic.createString(optional1.get()))
                           : Optional.of(var1x.createString(class06534.y(s) + ":" + class06534.y(optional1.get())));
                     } else {
                        return Optional.empty();
                     }
                  }
               )
               .map(var1x -> dynamic.set("CriteriaName", var1x).remove("CriteriaType")),
            dynamic
         ))
         .getValue();
   }
}
