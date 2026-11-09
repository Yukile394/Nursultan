package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class02210 extends DataFix {
   private static final Map<UUID, String> N = ImmutableMap.builder()
      .put(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "minecraft:creative_mode_block_range")
      .put(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "minecraft:creative_mode_entity_range")
      .put(UUID.fromString("91AEAA56-376B-4498-935B-2F7F68070635"), "minecraft:effect.speed")
      .put(UUID.fromString("7107DE5E-7CE8-4030-940E-514C1F160890"), "minecraft:effect.slowness")
      .put(UUID.fromString("AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3"), "minecraft:effect.haste")
      .put(UUID.fromString("55FCED67-E92A-486E-9800-B47F202C4386"), "minecraft:effect.mining_fatigue")
      .put(UUID.fromString("648D7064-6A60-4F59-8ABE-C2C23A6DD7A9"), "minecraft:effect.strength")
      .put(UUID.fromString("C0105BF3-AEF8-46B0-9EBC-92943757CCBE"), "minecraft:effect.jump_boost")
      .put(UUID.fromString("22653B89-116E-49DC-9B6B-9971489B5BE5"), "minecraft:effect.weakness")
      .put(UUID.fromString("5D6F0BA2-1186-46AC-B896-C61C5CEE99CC"), "minecraft:effect.health_boost")
      .put(UUID.fromString("EAE29CF0-701E-4ED6-883A-96F798F3DAB5"), "minecraft:effect.absorption")
      .put(UUID.fromString("03C3C89D-7037-4B42-869F-B146BCB64D2E"), "minecraft:effect.luck")
      .put(UUID.fromString("CC5AF142-2BD2-4215-B636-2605AED11727"), "minecraft:effect.unluck")
      .put(UUID.fromString("6555be74-63b3-41f1-a245-77833b3c2562"), "minecraft:evil")
      .put(UUID.fromString("1eaf83ff-7207-4596-b37a-d7a07b3ec4ce"), "minecraft:powder_snow")
      .put(UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), "minecraft:sprinting")
      .put(UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0"), "minecraft:attacking")
      .put(UUID.fromString("766bfa64-11f3-11ea-8d71-362b9e155667"), "minecraft:baby")
      .put(UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F"), "minecraft:covered")
      .put(UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174"), "minecraft:suffocating")
      .put(UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E"), "minecraft:drinking")
      .put(UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836"), "minecraft:baby")
      .put(UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718"), "minecraft:attacking")
      .put(UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"), "minecraft:armor.boots")
      .put(UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"), "minecraft:armor.leggings")
      .put(UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"), "minecraft:armor.chestplate")
      .put(UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"), "minecraft:armor.helmet")
      .put(UUID.fromString("C1C72771-8B8E-BA4A-ACE0-81A93C8928B2"), "minecraft:armor.body")
      .put(UUID.fromString("b572ecd2-ac0c-4071-abde-9594af072a37"), "minecraft:enchantment.fire_protection")
      .put(UUID.fromString("40a9968f-5c66-4e2f-b7f4-2ec2f4b3e450"), "minecraft:enchantment.blast_protection")
      .put(UUID.fromString("07a65791-f64d-4e79-86c7-f83932f007ec"), "minecraft:enchantment.respiration")
      .put(UUID.fromString("60b1b7db-fffd-4ad0-817c-d6c6a93d8a45"), "minecraft:enchantment.aqua_affinity")
      .put(UUID.fromString("11dc269a-4476-46c0-aff3-9e17d7eb6801"), "minecraft:enchantment.depth_strider")
      .put(UUID.fromString("87f46a96-686f-4796-b035-22e16ee9e038"), "minecraft:enchantment.soul_speed")
      .put(UUID.fromString("b9716dbd-50df-4080-850e-70347d24e687"), "minecraft:enchantment.soul_speed")
      .put(UUID.fromString("92437d00-c3a7-4f2e-8f6c-1f21585d5dd0"), "minecraft:enchantment.swift_sneak")
      .put(UUID.fromString("5d3d087b-debe-4037-b53e-d84f3ff51f17"), "minecraft:enchantment.sweeping_edge")
      .put(UUID.fromString("3ceb37c0-db62-46b5-bd02-785457b01d96"), "minecraft:enchantment.efficiency")
      .put(UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF"), "minecraft:base_attack_damage")
      .put(UUID.fromString("FA233E1C-4180-4865-B01B-BCCE9785ACA3"), "minecraft:base_attack_speed")
      .build();
   private static final Map<String, String> y = Map.of(
      "Random spawn bonus",
      "minecraft:random_spawn_bonus",
      "Random zombie-spawn bonus",
      "minecraft:zombie_random_spawn_bonus",
      "Leader zombie bonus",
      "minecraft:leader_zombie_bonus",
      "Zombie reinforcement callee charge",
      "minecraft:reinforcement_callee_charge",
      "Zombie reinforcement caller charge",
      "minecraft:reinforcement_caller_charge"
   );

   private static Dynamic<?> L(Dynamic<?> var0) {
      return var0.renameField("Name", "id")
         .renameField("Base", "base")
         .renameAndFixField(
            "Modifiers",
            "modifiers",
            var1 -> (Dynamic)DataFixUtils.orElse(
               var1.asStreamOpt().result().map(var0xx -> var0xx.map(class02210::N)).map(class02210::N).map(var0::createList), var1
            )
         );
   }

   public class02210(Schema var1) {
      super(var1, false);
   }

   private static Stream<Dynamic<?>> y(Stream<Dynamic<?>> var0) {
      Object2ObjectArrayMap object2objectarraymap = new Object2ObjectArrayMap();
      var0.forEach(var1x -> {
         UUID uuid = N(var1x.get("uuid").asIntStream().toArray());
         String s = var1x.get("name").asString("");
         String s1 = uuid != null ? N.get(uuid) : null;
         String s2 = y.get(s);
         if (s1 != null) {
            var1x = var1x.set("id", var1x.createString(s1));
            object2objectarraymap.put(s1, var1x.remove("uuid").remove("name"));
         } else if (s2 != null) {
            Dynamic dynamic = (Dynamic)object2objectarraymap.get(s2);
            if (dynamic == null) {
               var1x = var1x.set("id", var1x.createString(s2));
               object2objectarraymap.put(s2, var1x.remove("uuid").remove("name"));
            } else {
               double d0 = dynamic.get("amount").asDouble(0.0);
               double d1 = var1x.get("amount").asDouble(0.0);
               object2objectarraymap.put(s2, dynamic.set("amount", var1x.createDouble(d0 + d1)));
            }
         } else {
            String s3 = "minecraft:" + (uuid != null ? uuid.toString().toLowerCase(Locale.ROOT) : "unknown");
            var1x = var1x.set("id", var1x.createString(s3));
            object2objectarraymap.put(s3, var1x.remove("uuid").remove("name"));
         }
      });
      return object2objectarraymap.values().stream();
   }

   private static Dynamic<?> y(Dynamic<?> var0) {
      return var0.update(
         "minecraft:attribute_modifiers",
         var0x -> var0x.update(
            "modifiers", var0xx -> (Dynamic)DataFixUtils.orElse(var0xx.asStreamOpt().result().map(class02210::N).map(var0xx::createList), var0xx)
         )
      );
   }

   @Nullable
   public static UUID N(int[] var0) {
      return var0.length != 4 ? null : new UUID((long)var0[0] << 32 | var0[1] & 4294967295L, (long)var0[2] << 32 | var0[3] & 4294967295L);
   }

   private static Dynamic<?> N(Dynamic<?> var0) {
      return var0.renameField("UUID", "uuid")
         .renameField("Name", "name")
         .renameField("Amount", "amount")
         .renameAndFixField("Operation", "operation", var0x -> {
            return var0x.createString(switch (var0x.asInt(0)) {
               case 0 -> "add_value";
               case 1 -> "add_multiplied_base";
               case 2 -> "add_multiplied_total";
               default -> "invalid";
            });
         });
   }

   private static Typed<?> N(Typed<?> var0) {
      return var0.update(
         DSL.remainderFinder(),
         var0x -> var0x.renameAndFixField(
            "Attributes",
            "attributes",
            var0xx -> (Dynamic)DataFixUtils.orElse(var0xx.asStreamOpt().result().map(var0xxx -> var0xxx.map(class02210::L)).map(var0xx::createList), var0xx)
         )
      );
   }

   private static Stream<Dynamic<?>> N(Stream<?> var0) {
      return y((Stream<Dynamic<?>>)var0);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> type = this.getInputSchema().getType(class06962.l);
      OpticFinder<?> opticfinder = type.findField("components");
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "AttributeIdFix (ItemStack)", type, var1x -> var1x.updateTyped(opticfinder, var0x -> var0x.update(DSL.remainderFinder(), class02210::y))
         ),
         new TypeRewriteRule[]{
            this.fixTypeEverywhereTyped("AttributeIdFix (Entity)", this.getInputSchema().getType(class06962.o), class02210::N),
            this.fixTypeEverywhereTyped("AttributeIdFix (Player)", this.getInputSchema().getType(class06962.L), class02210::N)
         }
      );
   }
}
