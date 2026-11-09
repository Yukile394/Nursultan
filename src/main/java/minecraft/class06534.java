package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class class06534 extends class00622 {
   public static final String y = "_special";
   protected static final HookFunction L = new class06531();
   protected static final HookFunction u = new class06538();

   public class06534(int var1, Schema var2) {
      super(var1, var2);
   }

   public static String y(String var0) {
      class01894 class01894 = class01894.L(var0);
      return class01894 != null ? class01894.y() + "." + class01894.N() : var0;
   }

   protected static Map<String, Supplier<TypeTemplate>> N(Schema var0) {
      Supplier supplier = () -> DSL.optionalFields("id", class06962.K.in(var0));
      Supplier supplier1 = () -> DSL.optionalFields("id", class06962.q.in(var0));
      Supplier supplier2 = () -> DSL.optionalFields("id", class06962.I.in(var0));
      HashMap hashmap = Maps.newHashMap();
      hashmap.put("minecraft:mined", supplier1);
      hashmap.put("minecraft:crafted", supplier);
      hashmap.put("minecraft:used", supplier);
      hashmap.put("minecraft:broken", supplier);
      hashmap.put("minecraft:picked_up", supplier);
      hashmap.put("minecraft:dropped", supplier);
      hashmap.put("minecraft:killed", supplier2);
      hashmap.put("minecraft:killed_by", supplier2);
      hashmap.put("minecraft:custom", (Supplier)() -> DSL.optionalFields("id", DSL.constType(N())));
      hashmap.put("_special", (Supplier)() -> DSL.optionalFields("id", DSL.constType(DSL.string())));
      return hashmap;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      Supplier supplier = () -> DSL.compoundList(class06962.K.in(var1), DSL.constType(DSL.intType()));
      var1.registerType(
         false,
         class06962.B,
         () -> DSL.optionalFields(
            "stats",
            DSL.optionalFields(
               new Pair[]{
                  Pair.of("minecraft:mined", DSL.compoundList(class06962.q.in(var1), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:crafted", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:used", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:broken", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:picked_up", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:dropped", (TypeTemplate)supplier.get()),
                  Pair.of("minecraft:killed", DSL.compoundList(class06962.I.in(var1), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:killed_by", DSL.compoundList(class06962.I.in(var1), DSL.constType(DSL.intType()))),
                  Pair.of("minecraft:custom", DSL.compoundList(DSL.constType(N()), DSL.constType(DSL.intType())))
               }
            )
         )
      );
      Map map = N(var1);
      var1.registerType(
         false,
         class06962.c,
         () -> DSL.hook(DSL.optionalFields("CriteriaType", DSL.taggedChoiceLazy("type", DSL.string(), map), "DisplayName", class06962.O.in(var1)), L, u)
      );
   }
}
