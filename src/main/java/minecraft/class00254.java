package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class00254 extends DataFix {
   private static boolean L(String var0) {
      return N(var0) || y(var0);
   }

   public class00254(Schema var1) {
      super(var1, true);
   }

   private static String i(String var0) {
      return switch (var0) {
         case "spruce" -> "minecraft:spruce_chest_boat";
         case "birch" -> "minecraft:birch_chest_boat";
         case "jungle" -> "minecraft:jungle_chest_boat";
         case "acacia" -> "minecraft:acacia_chest_boat";
         case "cherry" -> "minecraft:cherry_chest_boat";
         case "dark_oak" -> "minecraft:dark_oak_chest_boat";
         case "mangrove" -> "minecraft:mangrove_chest_boat";
         case "bamboo" -> "minecraft:bamboo_chest_raft";
         default -> "minecraft:oak_chest_boat";
      };
   }

   private static String u(String var0) {
      return switch (var0) {
         case "spruce" -> "minecraft:spruce_boat";
         case "birch" -> "minecraft:birch_boat";
         case "jungle" -> "minecraft:jungle_boat";
         case "acacia" -> "minecraft:acacia_boat";
         case "cherry" -> "minecraft:cherry_boat";
         case "dark_oak" -> "minecraft:dark_oak_boat";
         case "mangrove" -> "minecraft:mangrove_boat";
         case "bamboo" -> "minecraft:bamboo_raft";
         default -> "minecraft:oak_boat";
      };
   }

   private static boolean y(String var0) {
      return var0.equals("minecraft:chest_boat");
   }

   private static boolean N(String var0) {
      return var0.equals("minecraft:boat");
   }

   public TypeRewriteRule makeRule() {
      OpticFinder<String> opticfinder = DSL.fieldFinder("id", class00622.N());
      Type<?> type = this.getInputSchema().getType(class06962.o);
      Type<?> type1 = this.getOutputSchema().getType(class06962.o);
      return this.fixTypeEverywhereTyped("BoatSplitFix", type, type1, var2x -> {
         Optional optional = var2x.getOptional(opticfinder);
         if (optional.isPresent() && L((String)optional.get())) {
            Optional<String> optional1 = ((Dynamic)var2x.getOrCreate(DSL.remainderFinder())).get("Type").asString().result();
            String s;
            if (y((String)optional.get())) {
               s = optional1.map(class00254::i).orElse("minecraft:oak_chest_boat");
            } else {
               s = optional1.map(class00254::u).orElse("minecraft:oak_boat");
            }

            return class02269.N(type1, var2x).update(DSL.remainderFinder(), var0x -> var0x.remove("Type")).set(opticfinder, s);
         } else {
            return class02269.N(type1, var2x);
         }
      });
   }
}
