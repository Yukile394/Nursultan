package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public class class01633 extends DataFix {
   private static final Int2ObjectMap<String> N = class07536.N(new Int2ObjectOpenHashMap(), var0 -> {
      var0.put(1, "minecraft:speed");
      var0.put(2, "minecraft:slowness");
      var0.put(3, "minecraft:haste");
      var0.put(4, "minecraft:mining_fatigue");
      var0.put(5, "minecraft:strength");
      var0.put(6, "minecraft:instant_health");
      var0.put(7, "minecraft:instant_damage");
      var0.put(8, "minecraft:jump_boost");
      var0.put(9, "minecraft:nausea");
      var0.put(10, "minecraft:regeneration");
      var0.put(11, "minecraft:resistance");
      var0.put(12, "minecraft:fire_resistance");
      var0.put(13, "minecraft:water_breathing");
      var0.put(14, "minecraft:invisibility");
      var0.put(15, "minecraft:blindness");
      var0.put(16, "minecraft:night_vision");
      var0.put(17, "minecraft:hunger");
      var0.put(18, "minecraft:weakness");
      var0.put(19, "minecraft:poison");
      var0.put(20, "minecraft:wither");
      var0.put(21, "minecraft:health_boost");
      var0.put(22, "minecraft:absorption");
      var0.put(23, "minecraft:saturation");
      var0.put(24, "minecraft:glowing");
      var0.put(25, "minecraft:levitation");
      var0.put(26, "minecraft:luck");
      var0.put(27, "minecraft:unluck");
      var0.put(28, "minecraft:slow_falling");
      var0.put(29, "minecraft:conduit_power");
      var0.put(30, "minecraft:dolphins_grace");
      var0.put(31, "minecraft:bad_omen");
      var0.put(32, "minecraft:hero_of_the_village");
      var0.put(33, "minecraft:darkness");
   });
   private static final Set<String> y = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");

   private static <T> Dynamic<T> L(Dynamic<T> var0) {
      Dynamic dynamic = var0.emptyMap();
      Dynamic dynamic1 = N(var0, dynamic);
      if (!dynamic1.equals(dynamic)) {
         var0 = var0.set("stew_effects", var0.createList(Stream.of(dynamic1)));
      }

      return var0.remove("EffectId").remove("EffectDuration");
   }

   private TypeRewriteRule L() {
      Type<?> type = this.getInputSchema().getType(class06962.L);
      return this.fixTypeEverywhereTyped("PlayerMobEffectIdFix", type, var0 -> var0.update(DSL.remainderFinder(), class01633::R));
   }

   private static <T> Dynamic<T> M(Dynamic<T> var0) {
      Optional optional = var0.get("Effects").asStreamOpt().result().map(var1x -> var0.createList(var1x.map(class01633::y)));
      return var0.replaceField("Effects", "effects", optional);
   }

   public class01633(Schema var1) {
      super(var1, false);
   }

   private static <T> Dynamic<T> i(Dynamic<T> var0) {
      return y(var0, "Effects", "effects");
   }

   private static <T> Dynamic<T> u(Dynamic<T> var0) {
      return y(var0, "CustomPotionEffects", "custom_potion_effects");
   }

   private TypeRewriteRule u() {
      OpticFinder<Pair<String, String>> opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      Type<?> type = this.getInputSchema().getType(class06962.l);
      OpticFinder<?> opticfinder1 = type.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemStackMobEffectIdFix",
         type,
         var2x -> {
            Optional optional = var2x.getOptional(opticfinder);
            if (optional.isPresent()) {
               String s = (String)((Pair)optional.get()).getSecond();
               if (s.equals("minecraft:suspicious_stew")) {
                  return var2x.updateTyped(opticfinder1, var0x -> var0x.update(DSL.remainderFinder(), class01633::M));
               }

               if (y.contains(s)) {
                  return var2x.updateTyped(
                     opticfinder1, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> y(var0xx, "CustomPotionEffects", "custom_potion_effects"))
                  );
               }
            }

            return var2x;
         }
      );
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0, String var1, String var2) {
      Optional optional = var0.get(var1).asStreamOpt().result().map(var1x -> var0.createList(var1x.map(class01633::N)));
      return var0.replaceField(var1, var2, optional);
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0) {
      return N((Dynamic<T>)var0, (Dynamic<T>)var0);
   }

   private TypeRewriteRule y() {
      Type<?> type = this.getInputSchema().getType(class06962.o);
      return this.fixTypeEverywhereTyped("EntityMobEffectIdFix", type, var1x -> {
         var1x = this.N(var1x, class06962.o, "minecraft:mooshroom", class01633::L);
         var1x = this.N(var1x, class06962.o, "minecraft:arrow", class01633::u);
         var1x = this.N(var1x, class06962.o, "minecraft:area_effect_cloud", class01633::i);
         return var1x.update(DSL.remainderFinder(), class01633::R);
      });
   }

   private TypeRewriteRule N() {
      Type<?> type = this.getInputSchema().getType(class06962.G);
      return this.fixTypeEverywhereTyped("BlockEntityMobEffectIdFix", type, var1x -> {
         var1x = this.N(var1x, class06962.G, "minecraft:beacon", var0 -> {
            var0 = N(var0, "Primary", "primary_effect");
            return N(var0, "Secondary", "secondary_effect");
         });
         return var1x;
      });
   }

   private Typed<?> N(Typed<?> var1, TypeReference var2, String var3, Function<Dynamic<?>, Dynamic<?>> var4) {
      Type<?> type = this.getInputSchema().getChoiceType(var2, var3);
      Type<?> type1 = this.getOutputSchema().getChoiceType(var2, var3);
      return var1.updateTyped(DSL.namedChoice(var3, type), type1, var1x -> var1x.update(DSL.remainderFinder(), var4));
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, Dynamic<T> var1) {
      var1 = N(var0, "EffectId", var1, "id");
      Optional optional = var0.get("EffectDuration").result();
      return var1.replaceField("EffectDuration", "duration", optional);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, String var1, Dynamic<T> var2, String var3) {
      Optional optional = N(var0, var1);
      return var2.replaceField(var1, var3, optional);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0, String var1, String var2) {
      return N(var0, var1, var0, var2);
   }

   private static <T> Optional<Dynamic<T>> N(Dynamic<T> var0, String var1) {
      return var0.get(var1).asNumber().result().map(var0x -> (String)N.get(var0x.intValue())).map(var0::createString);
   }

   private static <T> Dynamic<T> N(Dynamic<T> var0) {
      var0 = N((Dynamic<T>)var0, "Id", "id");
      var0 = var0.renameField("Ambient", "ambient");
      var0 = var0.renameField("Amplifier", "amplifier");
      var0 = var0.renameField("Duration", "duration");
      var0 = var0.renameField("ShowParticles", "show_particles");
      var0 = var0.renameField("ShowIcon", "show_icon");
      Optional optional = var0.get("HiddenEffect").result().map(class01633::N);
      return var0.replaceField("HiddenEffect", "hidden_effect", optional);
   }

   private static Dynamic<?> R(Dynamic<?> var0) {
      return y(var0, "ActiveEffects", "active_effects");
   }

   protected TypeRewriteRule makeRule() {
      return TypeRewriteRule.seq(this.N(), new TypeRewriteRule[]{this.y(), this.L(), this.u()});
   }
}
