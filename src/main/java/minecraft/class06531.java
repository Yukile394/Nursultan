package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

class class06531 implements HookFunction {
   class06531() {
      super();
   }

   public <T> T apply(DynamicOps<T> var1, T var2) {
      Dynamic dynamic = new Dynamic(var1, var2);
      return (T)((Dynamic)DataFixUtils.orElse(
            dynamic.get("CriteriaName")
               .asString()
               .result()
               .map(var0 -> {
                  int i = var0.indexOf(58);
                  if (i < 0) {
                     return Pair.of("_special", var0);
                  } else {
                     try {
                        class01894 class01894x = class01894.N(var0.substring(0, i), '.');
                        class01894 class01894x = class01894.N(var0.substring(i + 1), '.');
                        return Pair.of(class01894x.toString(), class01894x.toString());
                     } catch (Exception exception) {
                        return Pair.of("_special", var0);
                     }
                  }
               })
               .map(
                  var1x -> dynamic.set(
                     "CriteriaType",
                     dynamic.createMap(
                        ImmutableMap.of(
                           dynamic.createString("type"),
                           dynamic.createString((String)var1x.getFirst()),
                           dynamic.createString("id"),
                           dynamic.createString((String)var1x.getSecond())
                        )
                     )
                  )
               ),
            dynamic
         ))
         .getValue();
   }
}
