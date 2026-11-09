package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;

public class class05814 extends DataFix {
   public class05814(Schema var1) {
      super(var1, true);
   }

   private static <T> Dynamic<T> N(DynamicOps<T> var0, String var1, String var2) {
      return "minecraft:commandblock_minecart".equals(var2) ? new Dynamic(var0, var0.createString(var1)) : class03731.N(var0, var1);
   }

   private static <T> Typed<?> N(Typed<?> var0, Type<?> var1, OpticFinder<String> var2, OpticFinder<String> var3, Type<T> var4) {
      Optional optional = var0.getOptional(var3);
      if (optional.isEmpty()) {
         return class02269.N(var1, var0);
      } else if (((String)optional.get()).isEmpty()) {
         return class07536.N(var0, var1, var0x -> var0x.remove("CustomName"));
      } else {
         String s = var0.getOptional(var2).orElse("");
         Dynamic dynamic = N(var0.getOps(), (String)optional.get(), s);
         return var0.set(var3, class07536.N(var4, dynamic));
      }
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getType(class06962.o);
      Type type1 = this.getOutputSchema().getType(class06962.o);
      OpticFinder opticfinder = DSL.fieldFinder("id", class00622.N());
      OpticFinder opticfinder1 = type.findField("CustomName");
      Type type2 = type1.findFieldType("CustomName");
      return this.fixTypeEverywhereTyped("EntityCustomNameToComponentFix", type, type1, var4x -> N(var4x, type1, opticfinder, opticfinder1, type2));
   }
}
