package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.Set;
import org.slf4j.Logger;

public class class01367 extends class01350 {
   private static final Logger y = LogUtils.getLogger();
   private static final Set<String> L = Sets.newHashSet();
   private static final Set<String> u = Sets.newHashSet();
   private static final Set<String> i = Sets.newHashSet();
   private static final Set<String> R = Sets.newHashSet();
   private static final Set<String> M = Sets.newHashSet();
   private static final Set<String> B = Sets.newHashSet();

   public static Dynamic<?> L(Dynamic<?> var0) {
      return L(var0, "UUID", "UUID").orElse(var0);
   }

   private static Dynamic<?> M(Dynamic<?> var0) {
      return L(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> P(Dynamic<?> var0) {
      return (Dynamic<?>)DataFixUtils.orElse(var0.get("OwnerUUID").result().map(var1 -> var0.remove("OwnerUUID").set("Owner", var1)), var0);
   }

   public class01367(Schema var1) {
      super(var1, class06962.o);
   }

   private static Dynamic<?> B(Dynamic<?> var0) {
      var0 = y(var0, "Owner", "Owner").orElse(var0);
      return y(var0, "Target", "Target").orElse(var0);
   }

   private static Dynamic<?> Z(Dynamic<?> var0) {
      var0 = y(var0, "Owner", "Owner").orElse(var0);
      return y(var0, "Thrower", "Thrower").orElse(var0);
   }

   private static Dynamic<?> i(Dynamic<?> var0) {
      return L(var0, "OwnerUUID", "Owner").orElse(var0);
   }

   private static Dynamic<?> m(Dynamic<?> var0) {
      return y(var0).update("Leash", var0x -> L(var0x, "UUID", "UUID").orElse(var0x));
   }

   private static Dynamic<?> U(Dynamic<?> var0) {
      return N(var0, "HurtBy", "HurtBy").orElse(var0);
   }

   private static Dynamic<?> z(Dynamic<?> var0) {
      return (Dynamic<?>)DataFixUtils.orElse(
         var0.get("TrustedUUIDs").result().map(var1 -> var0.createList(var1.asStream().map(var0xx -> (Dynamic)N((Dynamic<?>)var0xx).orElseGet(() -> {
            y.warn("Trusted contained invalid data.");
            return (Dynamic<?>)var0xx;
         })))).map(var1 -> var0.remove("TrustedUUIDs").set("Trusted", var1)), var0
      );
   }

   private static Dynamic<?> u(Dynamic<?> var0) {
      return var0.update(
         "Brain", var0x -> var0x.update("memories", var0xx -> var0xx.update("minecraft:angry_at", var0xxx -> N(var0xxx, "value", "value").orElseGet(() -> {
            y.warn("angry_at has no value.");
            return var0xxx;
         })))
      );
   }

   public static Dynamic<?> y(Dynamic<?> var0) {
      return var0.update(
         "Attributes",
         var1 -> var0.createList(
            var1.asStream()
               .map(
                  var0xx -> var0xx.update(
                     "Modifiers",
                     var1x -> var0xx.createList(var1x.asStream().map(var0xxxx -> (Dynamic)L((Dynamic<?>)var0xxxx, "UUID", "UUID").orElse((Dynamic<?>)var0xxxx)))
                  )
               )
         )
      );
   }

   private static Dynamic<?> E(Dynamic<?> var0) {
      Dynamic<?> dynamic = W(var0);
      return N(dynamic, "OwnerUUID", "Owner").orElse(dynamic);
   }

   private static Dynamic<?> W(Dynamic<?> var0) {
      Dynamic<?> dynamic = m(var0);
      return L(dynamic, "LoveCause", "LoveCause").orElse(dynamic);
   }

   private static Dynamic<?> R(Dynamic<?> var0) {
      return L(var0, "ConversionPlayer", "ConversionPlayer").orElse(var0);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityUUIDFixes", this.getInputSchema().getType(this.N), var1 -> {
         var1 = var1.update(DSL.remainderFinder(), class01367::L);

         for (String s : L) {
            var1 = this.N(var1, s, class01367::E);
         }

         for (String s1 : u) {
            var1 = this.N(var1, s1, class01367::E);
         }

         for (String s2 : i) {
            var1 = this.N(var1, s2, class01367::W);
         }

         for (String s3 : R) {
            var1 = this.N(var1, s3, class01367::m);
         }

         for (String s4 : M) {
            var1 = this.N(var1, s4, class01367::y);
         }

         for (String s5 : B) {
            var1 = this.N(var1, s5, class01367::P);
         }

         var1 = this.N(var1, "minecraft:bee", class01367::U);
         var1 = this.N(var1, "minecraft:zombified_piglin", class01367::U);
         var1 = this.N(var1, "minecraft:fox", class01367::z);
         var1 = this.N(var1, "minecraft:item", class01367::Z);
         var1 = this.N(var1, "minecraft:shulker_bullet", class01367::B);
         var1 = this.N(var1, "minecraft:area_effect_cloud", class01367::M);
         var1 = this.N(var1, "minecraft:zombie_villager", class01367::R);
         var1 = this.N(var1, "minecraft:evoker_fangs", class01367::i);
         return this.N(var1, "minecraft:piglin", class01367::u);
      });
   }

   static {
      L.add("minecraft:donkey");
      L.add("minecraft:horse");
      L.add("minecraft:llama");
      L.add("minecraft:mule");
      L.add("minecraft:skeleton_horse");
      L.add("minecraft:trader_llama");
      L.add("minecraft:zombie_horse");
      u.add("minecraft:cat");
      u.add("minecraft:parrot");
      u.add("minecraft:wolf");
      i.add("minecraft:bee");
      i.add("minecraft:chicken");
      i.add("minecraft:cow");
      i.add("minecraft:fox");
      i.add("minecraft:mooshroom");
      i.add("minecraft:ocelot");
      i.add("minecraft:panda");
      i.add("minecraft:pig");
      i.add("minecraft:polar_bear");
      i.add("minecraft:rabbit");
      i.add("minecraft:sheep");
      i.add("minecraft:turtle");
      i.add("minecraft:hoglin");
      R.add("minecraft:bat");
      R.add("minecraft:blaze");
      R.add("minecraft:cave_spider");
      R.add("minecraft:cod");
      R.add("minecraft:creeper");
      R.add("minecraft:dolphin");
      R.add("minecraft:drowned");
      R.add("minecraft:elder_guardian");
      R.add("minecraft:ender_dragon");
      R.add("minecraft:enderman");
      R.add("minecraft:endermite");
      R.add("minecraft:evoker");
      R.add("minecraft:ghast");
      R.add("minecraft:giant");
      R.add("minecraft:guardian");
      R.add("minecraft:husk");
      R.add("minecraft:illusioner");
      R.add("minecraft:magma_cube");
      R.add("minecraft:pufferfish");
      R.add("minecraft:zombified_piglin");
      R.add("minecraft:salmon");
      R.add("minecraft:shulker");
      R.add("minecraft:silverfish");
      R.add("minecraft:skeleton");
      R.add("minecraft:slime");
      R.add("minecraft:snow_golem");
      R.add("minecraft:spider");
      R.add("minecraft:squid");
      R.add("minecraft:stray");
      R.add("minecraft:tropical_fish");
      R.add("minecraft:vex");
      R.add("minecraft:villager");
      R.add("minecraft:iron_golem");
      R.add("minecraft:vindicator");
      R.add("minecraft:pillager");
      R.add("minecraft:wandering_trader");
      R.add("minecraft:witch");
      R.add("minecraft:wither");
      R.add("minecraft:wither_skeleton");
      R.add("minecraft:zombie");
      R.add("minecraft:zombie_villager");
      R.add("minecraft:phantom");
      R.add("minecraft:ravager");
      R.add("minecraft:piglin");
      M.add("minecraft:armor_stand");
      B.add("minecraft:arrow");
      B.add("minecraft:dragon_fireball");
      B.add("minecraft:firework_rocket");
      B.add("minecraft:fireball");
      B.add("minecraft:llama_spit");
      B.add("minecraft:small_fireball");
      B.add("minecraft:snowball");
      B.add("minecraft:spectral_arrow");
      B.add("minecraft:egg");
      B.add("minecraft:ender_pearl");
      B.add("minecraft:experience_bottle");
      B.add("minecraft:potion");
      B.add("minecraft:trident");
      B.add("minecraft:wither_skull");
   }
}
