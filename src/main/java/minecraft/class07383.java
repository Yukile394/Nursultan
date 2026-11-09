package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class class07383 extends DataFix {
   private static final String[] N = (String[])DataFixUtils.make(new String[256], var0 -> {
      var0[1] = "Item";
      var0[2] = "XPOrb";
      var0[7] = "ThrownEgg";
      var0[8] = "LeashKnot";
      var0[9] = "Painting";
      var0[10] = "Arrow";
      var0[11] = "Snowball";
      var0[12] = "Fireball";
      var0[13] = "SmallFireball";
      var0[14] = "ThrownEnderpearl";
      var0[15] = "EyeOfEnderSignal";
      var0[16] = "ThrownPotion";
      var0[17] = "ThrownExpBottle";
      var0[18] = "ItemFrame";
      var0[19] = "WitherSkull";
      var0[20] = "PrimedTnt";
      var0[21] = "FallingSand";
      var0[22] = "FireworksRocketEntity";
      var0[23] = "TippedArrow";
      var0[24] = "SpectralArrow";
      var0[25] = "ShulkerBullet";
      var0[26] = "DragonFireball";
      var0[30] = "ArmorStand";
      var0[41] = "Boat";
      var0[42] = "MinecartRideable";
      var0[43] = "MinecartChest";
      var0[44] = "MinecartFurnace";
      var0[45] = "MinecartTNT";
      var0[46] = "MinecartHopper";
      var0[47] = "MinecartSpawner";
      var0[40] = "MinecartCommandBlock";
      var0[50] = "Creeper";
      var0[51] = "Skeleton";
      var0[52] = "Spider";
      var0[53] = "Giant";
      var0[54] = "Zombie";
      var0[55] = "Slime";
      var0[56] = "Ghast";
      var0[57] = "PigZombie";
      var0[58] = "Enderman";
      var0[59] = "CaveSpider";
      var0[60] = "Silverfish";
      var0[61] = "Blaze";
      var0[62] = "LavaSlime";
      var0[63] = "EnderDragon";
      var0[64] = "WitherBoss";
      var0[65] = "Bat";
      var0[66] = "Witch";
      var0[67] = "Endermite";
      var0[68] = "Guardian";
      var0[69] = "Shulker";
      var0[90] = "Pig";
      var0[91] = "Sheep";
      var0[92] = "Cow";
      var0[93] = "Chicken";
      var0[94] = "Squid";
      var0[95] = "Wolf";
      var0[96] = "MushroomCow";
      var0[97] = "SnowMan";
      var0[98] = "Ozelot";
      var0[99] = "VillagerGolem";
      var0[100] = "EntityHorse";
      var0[101] = "Rabbit";
      var0[120] = "Villager";
      var0[200] = "EnderCrystal";
   });

   public class07383(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Schema schema = this.getInputSchema();
      Type<?> type = schema.getType(class06962.l);
      OpticFinder<Pair<String, String>> opticfinder = DSL.fieldFinder("id", DSL.named(class06962.K.typeName(), class00622.N()));
      OpticFinder<String> opticfinder1 = DSL.fieldFinder("id", DSL.string());
      OpticFinder<?> opticfinder2 = type.findField("tag");
      OpticFinder<?> opticfinder3 = opticfinder2.type().findField("EntityTag");
      OpticFinder opticfinder4 = DSL.typeFinder(schema.getTypeRaw(class06962.o));
      return this.fixTypeEverywhereTyped(
         "ItemSpawnEggFix",
         type,
         var5x -> {
            Optional optional = var5x.getOptional(opticfinder);
            if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:spawn_egg")) {
               Dynamic<?> dynamic = (Dynamic<?>)var5x.get(DSL.remainderFinder());
               short short1 = dynamic.get("Damage").asShort((short)0);
               Optional optional1 = var5x.getOptionalTyped(opticfinder2)
                  .flatMap(var1xx -> var1xx.getOptionalTyped(opticfinder3))
                  .flatMap(var1xx -> var1xx.getOptionalTyped(opticfinder4))
                  .flatMap(var1xx -> var1xx.getOptional(opticfinder1));
               Typed<?> typed = var5x;
               String s = N[short1 & 255];
               if (s != null && (optional1.isEmpty() || !Objects.equals(optional1.get(), s))) {
                  Typed typed1 = var5x.getOrCreateTyped(opticfinder2);
                  Dynamic<?> dynamic1 = (Dynamic<?>)DataFixUtils.orElse(
                     typed1.getOptionalTyped(opticfinder3).map(var0x -> (Dynamic)var0x.write().getOrThrow()), dynamic.emptyMap()
                  );
                  dynamic1 = dynamic1.set("id", dynamic1.createString(s));
                  typed = var5x.set(opticfinder2, class02269.N(typed1, opticfinder3, dynamic1));
               }

               if (short1 != 0) {
                  dynamic = dynamic.set("Damage", dynamic.createShort((short)0));
                  typed = typed.set(DSL.remainderFinder(), dynamic);
               }

               return typed;
            } else {
               return var5x;
            }
         }
      );
   }
}
