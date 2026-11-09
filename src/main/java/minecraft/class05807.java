package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;

public class class05807 extends DataFix {
   private static final Set<String> N = Sets.newHashSet(
      new String[]{
         "ArmorStand",
         "Bat",
         "Blaze",
         "CaveSpider",
         "Chicken",
         "Cow",
         "Creeper",
         "EnderDragon",
         "Enderman",
         "Endermite",
         "EntityHorse",
         "Ghast",
         "Giant",
         "Guardian",
         "LavaSlime",
         "MushroomCow",
         "Ozelot",
         "Pig",
         "PigZombie",
         "Rabbit",
         "Sheep",
         "Shulker",
         "Silverfish",
         "Skeleton",
         "Slime",
         "SnowMan",
         "Spider",
         "Squid",
         "Villager",
         "VillagerGolem",
         "Witch",
         "WitherBoss",
         "Wolf",
         "Zombie"
      }
   );

   public class05807(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public Dynamic<?> N(Dynamic<?> var1) {
      Optional<Number> optional = var1.get("HealF").asNumber().result();
      Optional<Number> optional1 = var1.get("Health").asNumber().result();
      float f;
      if (optional.isPresent()) {
         f = optional.get().floatValue();
         var1 = var1.remove("HealF");
      } else {
         if (!optional1.isPresent()) {
            return var1;
         }

         f = optional1.get().floatValue();
      }

      return var1.set("Health", var1.createFloat(f));
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityHealthFix", this.getInputSchema().getType(class06962.o), var1 -> var1.update(DSL.remainderFinder(), this::N));
   }
}
