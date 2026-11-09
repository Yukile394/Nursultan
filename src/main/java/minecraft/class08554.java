package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;

public class class08554 extends DataFix {
   private static final List<String> N = List.of(
      "minecraft:banner_patterns",
      "minecraft:bees",
      "minecraft:block_entity_data",
      "minecraft:block_state",
      "minecraft:bundle_contents",
      "minecraft:charged_projectiles",
      "minecraft:container",
      "minecraft:container_loot",
      "minecraft:firework_explosion",
      "minecraft:fireworks",
      "minecraft:instrument",
      "minecraft:map_id",
      "minecraft:painting/variant",
      "minecraft:pot_decorations",
      "minecraft:potion_contents",
      "minecraft:tropical_fish/pattern",
      "minecraft:written_book_content"
   );

   public class08554(Schema var1) {
      super(var1, true);
   }

   private static Dynamic<?> N(Dynamic<?> var0, String var1, Set<String> var2) {
      return N(var0, var1, var2, UnaryOperator.identity());
   }

   private static Typed<?> N(Typed<?> var0, OpticFinder<?> var1, OpticFinder<?> var2, Type<?> var3, Type<?> var4) {
      HashSet hashset = new HashSet();
      var0 = N(var0, var1, var3, "minecraft:can_place_on", hashset);
      var0 = N(var0, var2, var4, "minecraft:can_break", hashset);
      return var0.update(
         DSL.remainderFinder(),
         var1x -> {
            var1x = N(var1x, "minecraft:trim", hashset);
            var1x = N(var1x, "minecraft:unbreakable", hashset);
            var1x = N(var1x, "minecraft:dyed_color", "rgb", hashset);
            var1x = N(var1x, "minecraft:attribute_modifiers", "modifiers", hashset);
            var1x = N(var1x, "minecraft:enchantments", "levels", hashset);
            var1x = N(var1x, "minecraft:stored_enchantments", "levels", hashset);
            var1x = N(var1x, "minecraft:jukebox_playable", "song", hashset);
            boolean flag = var1x.get("minecraft:hide_tooltip").result().isPresent();
            var1x = var1x.remove("minecraft:hide_tooltip");
            boolean flag1 = var1x.get("minecraft:hide_additional_tooltip").result().isPresent();
            var1x = var1x.remove("minecraft:hide_additional_tooltip");
            if (flag1) {
               for (String s : N) {
                  if (var1x.get(s).result().isPresent()) {
                     hashset.add(s);
                  }
               }
            }

            return hashset.isEmpty() && !flag
               ? var1x
               : var1x.set(
                  "minecraft:tooltip_display",
                  var1x.createMap(
                     Map.of(
                        var1x.createString("hide_tooltip"),
                        var1x.createBoolean(flag),
                        var1x.createString("hidden_components"),
                        var1x.createList(hashset.stream().map(var1x::createString))
                     )
                  )
               );
         }
      );
   }

   private static Dynamic<?> N(Dynamic<?> var0, String var1, Set<String> var2, UnaryOperator<Dynamic<?>> var3) {
      return var0.update(var1, var3x -> {
         if (!var3x.get("show_in_tooltip").asBoolean(true)) {
            var2.add(var1);
         }

         return var3.apply(var3x.remove("show_in_tooltip"));
      });
   }

   private static Typed<?> N(Typed<?> var0, OpticFinder<?> var1, Type<?> var2, String var3, Set<String> var4) {
      return var0.updateTyped(var1, var2, var3x -> class07536.N(var3x, var2, var2xx -> {
         OptionalDynamic optionaldynamic = var2xx.get("predicates");
         if (optionaldynamic.result().isEmpty()) {
            return var2xx;
         } else {
            if (!var2xx.get("show_in_tooltip").asBoolean(true)) {
               var4.add(var3);
            }

            return (Dynamic)optionaldynamic.result().get();
         }
      }));
   }

   private static Dynamic<?> N(Dynamic<?> var0, String var1, String var2, Set<String> var3) {
      return N(var0, var1, var3, var1x -> (Dynamic)DataFixUtils.orElse(var1x.get(var2).result(), var1x));
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.k);
      Type<?> type1 = this.getOutputSchema().getType(class06962.k);
      OpticFinder<?> opticfinder = type.findField("minecraft:can_place_on");
      OpticFinder<?> opticfinder1 = type.findField("minecraft:can_break");
      Type<?> type2 = type1.findFieldType("minecraft:can_place_on");
      Type<?> type3 = type1.findFieldType("minecraft:can_break");
      return this.fixTypeEverywhereTyped("TooltipDisplayComponentFix", type, type1, var4x -> N(var4x, opticfinder, opticfinder1, type2, type3));
   }
}
