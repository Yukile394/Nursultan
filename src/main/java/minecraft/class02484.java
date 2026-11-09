package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class class02484 {
   static final class02911 N = new class02911(512);
   public static final class02477<class02837> y = N("custom_data", var0 -> var0.N(class02837.L));
   public static final class02477<Integer> L = N("max_stack_size", var0 -> var0.N(class06338.N(1, 99)).N(class02389.B));
   public static final class02477<Integer> u = N("max_damage", var0 -> var0.N(class06338.b).N(class02389.B));
   public static final class02477<Integer> i = N("damage", var0 -> var0.N(class06338.T).L().N(class02389.B));
   public static final class02477<class06244> R = N("unbreakable", var0 -> var0.N(class06244.field_51563).N(class06244.field_55626));
   public static final class02477<class08153> M = N("use_effects", var0 -> var0.N(class08153.y).N(class08153.L));
   public static final class02477<class00392> B = N("custom_name", var0 -> var0.N(class03748.N).N(class03748.y).N());
   public static final class02477<Float> Z = N("minimum_attack_charge", var0 -> var0.N(class06338.N(0.0F, 1.0F)).N(class02389.E));
   public static final class02477<class02204<class03689>> z = N(
      "damage_type", var0 -> var0.N(class02204.N(class04227.yN, class03689.y)).N(class02204.N(class04227.yN, class03689.L))
   );
   public static final class02477<class00392> U = N("item_name", var0 -> var0.N(class03748.N).N(class03748.y).N());
   public static final class02477<class01894> E = N("item_model", var0 -> var0.N(class01894.N).N(class01894.y).N());
   public static final class02477<class02848> W = N("lore", var0 -> var0.N(class02848.L).N(class02848.u).N());
   public static final class02477<class06495> m = N("rarity", var0 -> var0.N(class06495.field_50001).N(class06495.field_50003));
   public static final class02477<class02710> P = N("enchantments", var0 -> var0.N(class02710.y).N(class02710.L).N());
   public static final class02477<class03220> s = N("can_place_on", var0 -> var0.N(class03220.N).N(class03220.y).N());
   public static final class02477<class03220> T = N("can_break", var0 -> var0.N(class03220.N).N(class03220.y).N());
   public static final class02477<class02833> b = N("attribute_modifiers", var0 -> var0.N(class02833.y).N(class02833.L).N());
   public static final class02477<class02845> j = N("custom_model_data", var0 -> var0.N(class02845.y).N(class02845.L));
   public static final class02477<class08562> v = N("tooltip_display", var0 -> var0.N(class08562.N).N(class08562.y).N());
   public static final class02477<Integer> n = N("repair_cost", var0 -> var0.N(class06338.T).N(class02389.B));
   public static final class02477<class06244> t = N("creative_slot_lock", var0 -> var0.N(class06244.field_55626));
   public static final class02477<Boolean> G = N("enchantment_glint_override", var0 -> var0.N(Codec.BOOL).N(class02389.y));
   public static final class02477<class06244> l = N("intangible_projectile", var0 -> var0.N(class06244.field_51563));
   public static final class02477<class05349> d = N("food", var0 -> var0.N(class05349.N).N(class05349.y).N());
   public static final class02477<class08209> w = N("consumable", var0 -> var0.N(class08209.y).N(class08209.L).N());
   public static final class02477<class08197> k = N("use_remainder", var0 -> var0.N(class08197.N).N(class08197.y).N());
   public static final class02477<class08208> Y = N("use_cooldown", var0 -> var0.N(class08208.N).N(class08208.y).N());
   public static final class02477<class08721> Q = N("damage_resistant", var0 -> var0.N(class08721.N).N(class08721.y).N());
   public static final class02477<class02197> O = N("tool", var0 -> var0.N(class02197.N).N(class02197.y).N());
   public static final class02477<class08609> g = N("weapon", var0 -> var0.N(class08609.y).N(class08609.L).N());
   public static final class02477<class06543> I = N("attack_range", var0 -> var0.N(class06543.N).N(class06543.y).N());
   public static final class02477<class02766> J = N("enchantable", var0 -> var0.N(class02766.N).N(class02766.y).N());
   public static final class02477<class08725> o = N("equippable", var0 -> var0.N(class08725.N).N(class08725.y).N());
   public static final class02477<class02764> q = N("repairable", var0 -> var0.N(class02764.N).N(class02764.y).N());
   public static final class02477<class06244> K = N("glider", var0 -> var0.N(class06244.field_51563).N(class06244.field_55626));
   public static final class02477<class01894> V = N("tooltip_style", var0 -> var0.N(class01894.N).N(class01894.y).N());
   public static final class02477<class08723> e = N("death_protection", var0 -> var0.N(class08723.N).N(class08723.y).N());
   public static final class02477<class08576> H = N("blocks_attacks", var0 -> var0.N(class08576.N).N(class08576.y).N());
   public static final class02477<class08172> c = N("piercing_weapon", var0 -> var0.N(class08172.N).N(class08172.y).N());
   public static final class02477<class08174> X = N("kinetic_weapon", var0 -> var0.N(class08174.y).N(class08174.L).N());
   public static final class02477<class08186> a = N("swing_animation", var0 -> var0.N(class08186.y).N(class08186.L));
   public static final class02477<class02710> p = N("stored_enchantments", var0 -> var0.N(class02710.y).N(class02710.L).N());
   public static final class02477<class02816> F = N("dyed_color", var0 -> var0.N(class02816.N).N(class02816.y));
   public static final class02477<class02716> A = N("map_color", var0 -> var0.N(class02716.N).N(class02716.y));
   public static final class02477<class02265> f = N("map_id", var0 -> var0.N(class02265.N).N(class02265.y));
   public static final class02477<class02719> C = N("map_decorations", var0 -> var0.N(class02719.y).N());
   public static final class02477<class02705> S = N("map_post_processing", var0 -> var0.N(class02705.field_49356));
   public static final class02477<class02820> x = N("charged_projectiles", var0 -> var0.N(class02820.y).N(class02820.L).N());
   public static final class02477<class02830> D = N("bundle_contents", var0 -> var0.N(class02830.y).N(class02830.L).N());
   public static final class02477<class06517> h = N("potion_contents", var0 -> var0.N(class06517.L).N(class06517.u).N());
   public static final class02477<Float> r = N("potion_duration_scale", var0 -> var0.N(class06338.n).N(class02389.E).N());
   public static final class02477<class02692> NN = N("suspicious_stew_effects", var0 -> var0.N(class02692.L).N(class02692.u).N());
   public static final class02477<class02699> Ny = N("writable_book_content", var0 -> var0.N(class02699.i).N(class02699.R).N());
   public static final class02477<class02706> NL = N("written_book_content", var0 -> var0.N(class02706.Z).N(class02706.z).N());
   public static final class02477<class03254> Nu = N("trim", var0 -> var0.N(class03254.N).N(class03254.y).N());
   public static final class02477<class02847> Ni = N("debug_stick_state", var0 -> var0.N(class02847.y).N());
   public static final class02477<class08983<class07078<?>>> NR = N("entity_data", var0 -> var0.N(class08983.N(class07078.N)).N(class08983.N(class07078.y)));
   public static final class02477<class02837> NM = N("bucket_entity_data", var0 -> var0.N(class02837.L).N(class02837.u));
   public static final class02477<class08983<class00404<?>>> NB = N(
      "block_entity_data", var0 -> var0.N(class08983.N(class04206.U.T())).N(class08983.N(class02389.N(class04227.i)))
   );
   public static final class02477<class08582> NZ = N("instrument", var0 -> var0.N(class08582.N).N(class08582.y).N());
   public static final class02477<class08551> Nz = N("provides_trim_material", var0 -> var0.N(class08551.N).N(class08551.y).N());
   public static final class02477<class08213> NU = N("ominous_bottle_amplifier", var0 -> var0.N(class08213.u).N(class08213.i));
   public static final class02477<class02232> NE = N("jukebox_playable", var0 -> var0.N(class02232.N).N(class02232.y));
   public static final class02477<class03530<class00412>> NW = N(
      "provides_banner_patterns", var0 -> var0.N(class03530.y(class04227.NF)).N(class03530.L(class04227.NF)).N()
   );
   public static final class02477<List<class05946<class06521<?>>>> Nm = N("recipes", var0 -> var0.N(class06521.M.listOf()).N());
   public static final class02477<class02687> NP = N("lodestone_tracker", var0 -> var0.N(class02687.N).N(class02687.y).N());
   public static final class02477<class02827> Ns = N("firework_explosion", var0 -> var0.N(class02827.L).N(class02827.u).N());
   public static final class02477<class02813> NT = N("fireworks", var0 -> var0.N(class02813.y).N(class02813.L).N());
   public static final class02477<class02689> Nb = N("profile", var0 -> var0.N(class02689.N).N(class02689.y).N());
   public static final class02477<class01894> Nj = N("note_block_sound", var0 -> var0.N(class01894.N).N(class01894.y));
   public static final class02477<class02708> Nv = N("banner_patterns", var0 -> var0.N(class02708.u).N(class02708.i).N());
   public static final class02477<class06563> Nn = N("base_color", var0 -> var0.N(class06563.field_41600).N(class06563.field_49259));
   public static final class02477<class03490> Nt = N("pot_decorations", var0 -> var0.N(class03490.y).N(class03490.L).N());
   public static final class02477<class02854> NG = N("container", var0 -> var0.N(class02854.y).N(class02854.L).N());
   public static final class02477<class02841> Nl = N("block_state", var0 -> var0.N(class02841.y).N(class02841.L).N());
   public static final class02477<class08588> Nd = N("bees", var0 -> var0.N(class08588.N).N(class08588.y).N());
   public static final class02477<class07044> Nw = N("lock", var0 -> var0.N(class07044.y));
   public static final class02477<class02720> Nk = N("container_loot", var0 -> var0.N(class02720.N));
   public static final class02477<class03556<class04891>> NY = N("break_sound", var0 -> var0.N(class04891.y).N(class04891.u).N());
   public static final class02477<class03556<class05660>> NQ = N("villager/variant", var0 -> var0.N(class05660.B).N(class05660.Z));
   public static final class02477<class03556<class02505>> NO = N("wolf/variant", var0 -> var0.N(class02505.L).N(class02505.u));
   public static final class02477<class03556<class08519>> Ng = N("wolf/sound_variant", var0 -> var0.N(class08519.L).N(class08519.u));
   public static final class02477<class06563> NI = N("wolf/collar", var0 -> var0.N(class06563.field_41600).N(class06563.field_49259));
   public static final class02477<class01319> NJ = N("fox/variant", var0 -> var0.N(class01319.field_41548).N(class01319.field_55960));
   public static final class02477<class07861> No = N("salmon/size", var0 -> var0.N(class07861.field_52473).N(class07861.field_55967));
   public static final class02477<class07648> Nq = N("parrot/variant", var0 -> var0.N(class07648.field_41555).N(class07648.field_55965));
   public static final class02477<class07892> NK = N("tropical_fish/pattern", var0 -> var0.N(class07892.field_41578).N(class07892.field_55969));
   public static final class02477<class06563> NV = N("tropical_fish/base_color", var0 -> var0.N(class06563.field_41600).N(class06563.field_49259));
   public static final class02477<class06563> Ne = N("tropical_fish/pattern_color", var0 -> var0.N(class06563.field_41600).N(class06563.field_49259));
   public static final class02477<class07631> NH = N("mooshroom/variant", var0 -> var0.N(class07631.field_41549).N(class07631.field_55962));
   public static final class02477<class07897> Nc = N("rabbit/variant", var0 -> var0.N(class07897.field_41568).N(class07897.field_55966));
   public static final class02477<class03556<class08642>> NX = N("pig/variant", var0 -> var0.N(class08642.L).N(class08642.u));
   public static final class02477<class03556<class08403>> Na = N("cow/variant", var0 -> var0.N(class08403.L).N(class08403.u));
   public static final class02477<class02204<class08423>> Np = N(
      "chicken/variant", var0 -> var0.N(class02204.N(class04227.NS, class08423.L)).N(class02204.N(class04227.NS, class08423.u))
   );
   public static final class02477<class02204<class07589>> NF = N(
      "zombie_nautilus/variant", var0 -> var0.N(class02204.N(class04227.Nx, class07589.L)).N(class02204.N(class04227.Nx, class07589.u))
   );
   public static final class02477<class03556<class04068>> NA = N("frog/variant", var0 -> var0.N(class04068.L).N(class04068.u));
   public static final class02477<class05289> Nf = N("horse/variant", var0 -> var0.N(class05289.field_41595).N(class05289.field_55972));
   public static final class02477<class03556<class00693>> NC = N("painting/variant", var0 -> var0.N(class00693.L).N(class00693.u));
   public static final class02477<class00704> NS = N("llama/variant", var0 -> var0.N(class00704.field_41590).N(class00704.field_55971));
   public static final class02477<class05541> Nx = N("axolotl/variant", var0 -> var0.N(class05541.field_41585).N(class05541.field_55970));
   public static final class02477<class03556<class03648>> ND = N("cat/variant", var0 -> var0.N(class03648.L).N(class03648.u));
   public static final class02477<class06563> Nh = N("cat/collar", var0 -> var0.N(class06563.field_41600).N(class06563.field_49259));
   public static final class02477<class06563> Nr = N("sheep/color", var0 -> var0.N(class06563.field_41600).N(class06563.field_49259));
   public static final class02477<class06563> yN = N("shulker/color", var0 -> var0.N(class06563.field_41600).N(class06563.field_49259));
   public static final class02695 yy = class02695.N()
      .N(L, 64)
      .N(W, class02848.N)
      .N(P, class02710.N)
      .N(n, 0)
      .N(M, class08153.N)
      .N(b, class02833.N)
      .N(m, class06495.field_8906)
      .N(NY, class04909.sI)
      .N(v, class08562.L)
      .N(a, class08186.N)
      .N();

   public class02484() {
      super();
   }

   public static class02477<?> N(class00751<class02477<?>> var0) {
      return y;
   }

   private static <T> class02477<T> N(String var0, UnaryOperator<class02472<T>> var1) {
      return class00751.N(class04206.NW, var0, var1.apply(class02477.N()).y());
   }
}
