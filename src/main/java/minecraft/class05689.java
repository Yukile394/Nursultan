package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;

public class class05689 extends class00955 {
   public class05689(Schema var1, boolean var2) {
      super(var1, var2, "OminousBannerBlockEntityRenameFix", class06962.G, "minecraft:banner");
   }

   @Override
   protected Typed<?> N(Typed<?> var1) {
      OpticFinder<?> opticfinder = var1.getType().findField("CustomName");
      OpticFinder opticfinder1 = DSL.typeFinder(this.getInputSchema().getType(class06962.O));
      return var1.updateTyped(
         opticfinder,
         var1x -> var1x.update(
            opticfinder1,
            var0x -> var0x.mapSecond(
               var0xx -> var0xx.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"")
            )
         )
      );
   }
}
