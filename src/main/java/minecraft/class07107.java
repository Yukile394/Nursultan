package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class class07107 {
   public static final class07134 N = N("angry_villager", false);
   public static final class07103<class07105> y = N("block", false, class07105::N, class07105::y);
   public static final class07103<class07105> L = N("block_marker", true, class07105::N, class07105::y);
   public static final class07134 u = N("bubble", false);
   public static final class07134 i = N("cloud", false);
   public static final class07134 R = N("copper_fire_flame", false);
   public static final class07134 M = N("crit", false);
   public static final class07134 B = N("damage_indicator", true);
   public static final class07103<class00473> Z = N("dragon_breath", false, class00473::N, class00473::y);
   public static final class07134 z = N("dripping_lava", false);
   public static final class07134 U = N("falling_lava", false);
   public static final class07134 E = N("landing_lava", false);
   public static final class07134 W = N("dripping_water", false);
   public static final class07134 m = N("falling_water", false);
   public static final class07103<class07138> P = N("dust", false, var0 -> class07138.L, var0 -> class07138.u);
   public static final class07103<class01162> s = N("dust_color_transition", false, var0 -> class01162.L, var0 -> class01162.u);
   public static final class07103<class00436> T = N("effect", false, class00436::N, class00436::y);
   public static final class07134 b = N("elder_guardian", true);
   public static final class07134 j = N("enchanted_hit", false);
   public static final class07134 v = N("enchant", false);
   public static final class07134 n = N("end_rod", false);
   public static final class07103<class02329> t = N("entity_effect", false, class02329::N, class02329::y);
   public static final class07134 G = N("explosion_emitter", true);
   public static final class07134 l = N("explosion", true);
   public static final class07134 d = N("gust", true);
   public static final class07134 w = N("small_gust", false);
   public static final class07134 k = N("gust_emitter_large", true);
   public static final class07134 Y = N("gust_emitter_small", true);
   public static final class07134 Q = N("sonic_boom", true);
   public static final class07103<class07105> O = N("falling_dust", false, class07105::N, class07105::y);
   public static final class07134 g = N("firework", false);
   public static final class07134 I = N("fishing", false);
   public static final class07134 J = N("flame", false);
   public static final class07134 o = N("infested", false);
   public static final class07134 q = N("cherry_leaves", false);
   public static final class07134 K = N("pale_oak_leaves", false);
   public static final class07103<class02329> V = N("tinted_leaves", false, class02329::N, class02329::y);
   public static final class07134 e = N("sculk_soul", false);
   public static final class07103<class01904> H = N("sculk_charge", true, var0 -> class01904.N, var0 -> class01904.y);
   public static final class07134 c = N("sculk_charge_pop", true);
   public static final class07134 X = N("soul_fire_flame", false);
   public static final class07134 a = N("soul", false);
   public static final class07103<class02329> p = N("flash", false, class02329::N, class02329::y);
   public static final class07134 F = N("happy_villager", false);
   public static final class07134 A = N("composter", false);
   public static final class07134 f = N("heart", false);
   public static final class07103<class00436> C = N("instant_effect", false, class00436::N, class00436::y);
   public static final class07103<class07092> S = N("item", false, class07092::N, class07092::y);
   public static final class07103<class01192> x = N("vibration", true, var0 -> class01192.N, var0 -> class01192.y);
   public static final class07103<class00303> D = N("trail", false, var0 -> class00303.N, var0 -> class00303.y);
   public static final class07134 h = N("item_slime", false);
   public static final class07134 r = N("item_cobweb", false);
   public static final class07134 NN = N("item_snowball", false);
   public static final class07134 Ny = N("large_smoke", false);
   public static final class07134 NL = N("lava", false);
   public static final class07134 Nu = N("mycelium", false);
   public static final class07134 Ni = N("note", false);
   public static final class07134 NR = N("poof", true);
   public static final class07134 NM = N("portal", false);
   public static final class07134 NB = N("rain", false);
   public static final class07134 NZ = N("smoke", false);
   public static final class07134 Nz = N("white_smoke", false);
   public static final class07134 NU = N("sneeze", false);
   public static final class07134 NE = N("spit", true);
   public static final class07134 NW = N("squid_ink", true);
   public static final class07134 Nm = N("sweep_attack", true);
   public static final class07134 NP = N("totem_of_undying", false);
   public static final class07134 Ns = N("underwater", false);
   public static final class07134 NT = N("splash", false);
   public static final class07134 Nb = N("witch", false);
   public static final class07134 Nj = N("bubble_pop", false);
   public static final class07134 Nv = N("current_down", false);
   public static final class07134 Nn = N("bubble_column_up", false);
   public static final class07134 Nt = N("nautilus", false);
   public static final class07134 NG = N("dolphin", false);
   public static final class07134 Nl = N("campfire_cosy_smoke", true);
   public static final class07134 Nd = N("campfire_signal_smoke", true);
   public static final class07134 Nw = N("dripping_honey", false);
   public static final class07134 Nk = N("falling_honey", false);
   public static final class07134 NY = N("landing_honey", false);
   public static final class07134 NQ = N("falling_nectar", false);
   public static final class07134 NO = N("falling_spore_blossom", false);
   public static final class07134 Ng = N("ash", false);
   public static final class07134 NI = N("crimson_spore", false);
   public static final class07134 NJ = N("warped_spore", false);
   public static final class07134 No = N("spore_blossom_air", false);
   public static final class07134 Nq = N("dripping_obsidian_tear", false);
   public static final class07134 NK = N("falling_obsidian_tear", false);
   public static final class07134 NV = N("landing_obsidian_tear", false);
   public static final class07134 Ne = N("reverse_portal", false);
   public static final class07134 NH = N("white_ash", false);
   public static final class07134 Nc = N("small_flame", false);
   public static final class07134 NX = N("snowflake", false);
   public static final class07134 Na = N("dripping_dripstone_lava", false);
   public static final class07134 Np = N("falling_dripstone_lava", false);
   public static final class07134 NF = N("dripping_dripstone_water", false);
   public static final class07134 NA = N("falling_dripstone_water", false);
   public static final class07134 Nf = N("glow_squid_ink", true);
   public static final class07134 NC = N("glow", true);
   public static final class07134 NS = N("wax_on", true);
   public static final class07134 Nx = N("wax_off", true);
   public static final class07134 ND = N("electric_spark", true);
   public static final class07134 Nh = N("scrape", true);
   public static final class07103<class03627> Nr = N("shriek", false, var0 -> class03627.N, var0 -> class03627.y);
   public static final class07134 yN = N("egg_crack", false);
   public static final class07134 yy = N("dust_plume", false);
   public static final class07134 yL = N("trial_spawner_detection", true);
   public static final class07134 yu = N("trial_spawner_detection_ominous", true);
   public static final class07134 yi = N("vault_connection", true);
   public static final class07103<class07105> yR = N("dust_pillar", false, class07105::N, class07105::y);
   public static final class07134 yM = N("ominous_spawning", true);
   public static final class07134 yB = N("raid_omen", false);
   public static final class07134 yZ = N("trial_omen", false);
   public static final class07103<class07105> yz = N("block_crumble", false, class07105::N, class07105::y);
   public static final class07134 yU = N("firefly", false);
   public static final Codec<class07126> yE = class04206.z.T().dispatch("type", class07126::method_10295, class07103::method_29138);
   public static final class02362<class04247, class07126> yW = class02389.N(class04227.NM).y(class07126::method_10295, class07103::method_56179);

   public class07107() {
      super();
   }

   private static <T extends class07126> class07103<T> N(
      String var0, boolean var1, Function<class07103<T>, MapCodec<T>> var2, Function<class07103<T>, class02362<? super class04247, T>> var3
   ) {
      return class00751.N(class04206.z, var0, new class07115<>(var1, var2, var3));
   }

   private static class07134 N(String var0, boolean var1) {
      return class00751.N(class04206.z, var0, new class07134(var1));
   }
}
