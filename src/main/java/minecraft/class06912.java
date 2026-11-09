package minecraft;

import com.mojang.serialization.Codec;

public class class06912 {
   public static final Codec<class06583<?>> N = class04206.NU.T();
   public static final class00852 y = N("impossible", new class00852());
   public static final class00832 L = N("player_killed_entity", new class00832());
   public static final class00832 u = N("entity_killed_player", new class00832());
   public static final class00822 i = N("enter_block", new class00822());
   public static final class00835 R = N("inventory_changed", new class00835());
   public static final class00812 M = N("recipe_unlocked", new class00812());
   public static final class00827 B = N("player_hurt_entity", new class00827());
   public static final class00842 Z = N("entity_hurt_player", new class00842());
   public static final class00762 z = N("enchanted_item", new class00762());
   public static final class00813 U = N("filled_bucket", new class00813());
   public static final class00775 E = N("brewed_potion", new class00775());
   public static final class00769 W = N("construct_beacon", new class00769());
   public static final class07661 m = N("used_ender_eye", new class07661());
   public static final class07702 P = N("summoned_entity", new class07702());
   public static final class00796 s = N("bred_animals", new class00796());
   public static final class07658 T = N("location", new class07658());
   public static final class07658 b = N("slept_in_bed", new class07658());
   public static final class00781 j = N("cured_zombie_villager", new class00781());
   public static final class07706 v = N("villager_trade", new class07706());
   public static final class00847 n = N("item_durability_changed", new class00847());
   public static final class00823 t = N("levitation", new class00823());
   public static final class00790 G = N("changed_dimension", new class00790());
   public static final class07658 l = N("tick", new class07658());
   public static final class07674 d = N("tame_animal", new class07674());
   public static final class05890 w = N("placed_block", new class05890());
   public static final class00766 k = N("consume_item", new class00766());
   public static final class00776 Y = N("effects_changed", new class00776());
   public static final class07694 Q = N("used_totem", new class07694());
   public static final class00839 O = N("nether_travel", new class00839());
   public static final class00846 g = N("fishing_rod_hooked", new class00846());
   public static final class00797 I = N("channeled_lightning", new class00797());
   public static final class07705 J = N("shot_crossbow", new class07705());
   public static final class07574 o = N("spear_mobs", new class07574());
   public static final class00856 q = N("killed_by_arrow", new class00856());
   public static final class07658 K = N("hero_of_the_village", new class07658());
   public static final class07658 V = N("voluntary_exile", new class07658());
   public static final class05922 e = N("slide_down_block", new class05922());
   public static final class05895 H = N("bee_nest_destroyed", new class05895());
   public static final class04954 c = N("target_hit", new class04954());
   public static final class05890 X = N("item_used_on_block", new class05890());
   public static final class04258 a = N("default_block_use", new class04258());
   public static final class04280 p = N("any_block_use", new class04280());
   public static final class05962 F = N("player_generates_container_loot", new class05962());
   public static final class05189 A = N("thrown_item_picked_up_by_entity", new class05189());
   public static final class05189 f = N("thrown_item_picked_up_by_player", new class05189());
   public static final class01265 C = N("player_interacted_with_entity", new class01265());
   public static final class01265 S = N("player_sheared_equipment", new class01265());
   public static final class04566 x = N("started_riding", new class04566());
   public static final class04554 D = N("lightning_strike", new class04554());
   public static final class04561 h = N("using_item", new class04561());
   public static final class00839 r = N("fall_from_height", new class00839());
   public static final class00839 NN = N("ride_entity_in_lava", new class00839());
   public static final class00832 Ny = N("kill_mob_near_sculk_catalyst", new class00832());
   public static final class05890 NL = N("allay_drop_item_on_block", new class05890());
   public static final class07658 Nu = N("avoid_vibration", new class07658());
   public static final class03471 Ni = N("recipe_crafted", new class03471());
   public static final class03471 NR = N("crafter_recipe_crafted", new class03471());
   public static final class02181 NM = N("fall_after_explosion", new class02181());

   public class06912() {
      super();
   }

   public static <T extends class06583<?>> T N(String var0, T var1) {
      return class00751.N(class04206.NU, var0, (T)var1);
   }

   public static class06583<?> N(class00751<class06583<?>> var0) {
      return y;
   }
}
