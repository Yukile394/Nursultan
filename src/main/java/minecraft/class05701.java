package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class05701 extends DataFix {
   private static final int N = 2;
   private static final int[] y = new int[]{0, 10, 50, 100, 150};

   public class05701(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private static Typed<?> y(Typed<?> var0, int var1) {
      int i = N(var1);
      return var0.update(DSL.remainderFinder(), var1x -> var1x.set("Xp", var1x.createInt(i)));
   }

   public static int N(int var0) {
      return y[class04995.N(var0 - 1, 0, y.length - 1)];
   }

   private static Typed<?> N(Typed<?> var0, int var1) {
      return var0.update(DSL.remainderFinder(), var1x -> var1x.update("VillagerData", var1xx -> var1xx.set("level", var1xx.createInt(var1))));
   }

   public TypeRewriteRule makeRule() {
      Type type = this.getInputSchema().getChoiceType(class06962.o, "minecraft:villager");
      OpticFinder opticfinder = DSL.namedChoice("minecraft:villager", type);
      OpticFinder opticfinder1 = type.findField("Offers");
      OpticFinder opticfinder2 = opticfinder1.type().findField("Recipes");
      OpticFinder opticfinder3 = ((ListType)opticfinder2.type()).getElement().finder();
      return this.fixTypeEverywhereTyped(
         "Villager level and xp rebuild",
         this.getInputSchema().getType(class06962.o),
         var5x -> var5x.updateTyped(
            opticfinder,
            type,
            var3xx -> {
               Dynamic dynamic = (Dynamic)var3xx.get(DSL.remainderFinder());
               int i = dynamic.get("VillagerData").get("level").asInt(0);
               Typed typed = var3xx;
               if (i == 0 || i == 1) {
                  int j = var3xx.getOptionalTyped(opticfinder1)
                     .flatMap(var1xxx -> var1xxx.getOptionalTyped(opticfinder2))
                     .map(var1xxx -> var1xxx.getAllTyped(opticfinder3).size())
                     .orElse(0);
                  i = class04995.N(j / 2, 1, 5);
                  if (i > 1) {
                     typed = N(var3xx, i);
                  }
               }

               Optional optional = dynamic.get("Xp").asNumber().result();
               if (optional.isEmpty()) {
                  typed = y(typed, i);
               }

               return typed;
            }
         )
      );
   }
}
