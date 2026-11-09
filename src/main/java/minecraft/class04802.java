package minecraft;

import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.client.rendering.ModelLayersAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class04802 implements ModelLayersAccessor {
   private static final String ip = "main";
   private static final Set<class01134> iF = Sets.newHashSet();
   public static final class01134 N = N("boat/acacia");
   public static final class01134 y = N("chest_boat/acacia");
   public static final class01134 L = N("allay");
   public static final class01134 u = N("armadillo");
   public static final class01134 i = N("armadillo_baby");
   public static final class01134 R = N("armor_stand");
   public static final class08118<class01134> M = y("armor_stand");
   public static final class01134 B = N("armor_stand_small");
   public static final class08118<class01134> Z = y("armor_stand_small");
   public static final class01134 z = N("arrow");
   public static final class01134 U = N("axolotl");
   public static final class01134 E = N("axolotl_baby");
   public static final class01134 W = N("chest_boat/bamboo");
   public static final class01134 m = N("boat/bamboo");
   public static final class01134 P = N("standing_banner");
   public static final class01134 s = N("standing_banner", "flag");
   public static final class01134 T = N("wall_banner");
   public static final class01134 b = N("wall_banner", "flag");
   public static final class01134 j = N("bat");
   public static final class01134 v = N("bed_foot");
   public static final class01134 n = N("bed_head");
   public static final class01134 t = N("bee");
   public static final class01134 G = N("bee_baby");
   public static final class01134 l = N("bee_stinger");
   public static final class01134 d = N("bell");
   public static final class01134 w = N("boat/birch");
   public static final class01134 k = N("chest_boat/birch");
   public static final class01134 Y = N("blaze");
   public static final class01134 Q = N("boat", "water_patch");
   public static final class01134 O = N("bogged");
   public static final class08118<class01134> g = y("bogged");
   public static final class01134 I = N("bogged", "outer");
   public static final class01134 J = N("book");
   public static final class01134 o = N("breeze");
   public static final class01134 q = N("breeze", "wind");
   public static final class01134 K = N("breeze", "eyes");
   public static final class01134 V = N("camel");
   public static final class01134 e = N("camel_baby");
   public static final class01134 H = N("camel", "saddle");
   public static final class01134 c = N("camel_baby", "saddle");
   public static final class01134 X = N("camel_husk", "saddle");
   public static final class01134 a = N("camel_husk_baby", "saddle");
   public static final class01134 p = N("cat");
   public static final class01134 F = N("cat_baby");
   public static final class01134 A = N("cat_baby", "collar");
   public static final class01134 f = N("cat", "collar");
   public static final class01134 C = N("cave_spider");
   public static final class01134 S = N("boat/cherry");
   public static final class01134 x = N("chest_boat/cherry");
   public static final class01134 D = N("chest");
   public static final class01134 h = N("chest_minecart");
   public static final class01134 r = N("chicken");
   public static final class01134 NN = N("chicken_baby");
   public static final class01134 Ny = N("cod");
   public static final class01134 NL = N("cold_chicken");
   public static final class01134 Nu = N("cold_chicken_baby");
   public static final class01134 Ni = N("cold_cow");
   public static final class01134 NR = N("cold_cow_baby");
   public static final class01134 NM = N("cold_pig");
   public static final class01134 NB = N("cold_pig_baby");
   public static final class01134 NZ = N("command_block_minecart");
   public static final class01134 Nz = N("conduit", "cage");
   public static final class01134 NU = N("conduit", "eye");
   public static final class01134 NE = N("conduit", "shell");
   public static final class01134 NW = N("conduit", "wind");
   public static final class01134 Nm = N("copper_golem");
   public static final class01134 NP = N("copper_golem", "eyes");
   public static final class01134 Ns = N("copper_golem_running");
   public static final class01134 NT = N("copper_golem_sitting");
   public static final class01134 Nb = N("copper_golem_star");
   public static final class01134 Nj = N("zombie_nautilus_coral");
   public static final class01134 Nv = N("cow");
   public static final class01134 Nn = N("cow_baby");
   public static final class01134 Nt = N("creaking");
   public static final class01134 NG = N("creaking", "eyes");
   public static final class01134 Nl = N("creeper");
   public static final class01134 Nd = N("creeper", "armor");
   public static final class01134 Nw = N("creeper_head");
   public static final class01134 Nk = N("boat/dark_oak");
   public static final class01134 NY = N("chest_boat/dark_oak");
   public static final class01134 NQ = N("decorated_pot_base");
   public static final class01134 NO = N("decorated_pot_sides");
   public static final class01134 Ng = N("dolphin");
   public static final class01134 NI = N("dolphin_baby");
   public static final class01134 NJ = N("donkey");
   public static final class01134 No = N("donkey_baby");
   public static final class01134 Nq = N("donkey", "saddle");
   public static final class01134 NK = N("donkey_baby", "saddle");
   public static final class01134 NV = N("double_chest_left");
   public static final class01134 Ne = N("double_chest_right");
   public static final class01134 NH = N("dragon_skull");
   public static final class01134 Nc = N("drowned");
   public static final class01134 NX = N("drowned_baby");
   public static final class08118<class01134> Na = y("drowned_baby");
   public static final class01134 Np = N("drowned_baby", "outer");
   public static final class08118<class01134> NF = y("drowned");
   public static final class01134 NA = N("drowned", "outer");
   public static final class01134 Nf = N("elder_guardian");
   public static final class01134 NC = N("elytra");
   public static final class01134 NS = N("elytra_baby");
   public static final class01134 Nx = N("enderman");
   public static final class01134 ND = N("endermite");
   public static final class01134 Nh = N("ender_dragon");
   public static final class01134 Nr = N("end_crystal");
   public static final class01134 yN = N("evoker");
   public static final class01134 yy = N("evoker_fangs");
   public static final class01134 yL = N("fox");
   public static final class01134 yu = N("fox_baby");
   public static final class01134 yi = N("frog");
   public static final class01134 yR = N("furnace_minecart");
   public static final class01134 yM = N("ghast");
   public static final class01134 yB = N("giant");
   public static final class08118<class01134> yZ = y("giant");
   public static final class01134 yz = N("glow_squid");
   public static final class01134 yU = N("glow_squid_baby");
   public static final class01134 yE = N("goat");
   public static final class01134 yW = N("goat_baby");
   public static final class01134 ym = N("guardian");
   public static final class01134 yP = N("happy_ghast");
   public static final class01134 ys = N("happy_ghast_baby");
   public static final class01134 yT = N("happy_ghast_harness");
   public static final class01134 yb = N("happy_ghast_baby_harness");
   public static final class01134 yj = N("happy_ghast_ropes");
   public static final class01134 yv = N("happy_ghast_baby_ropes");
   public static final class01134 yn = N("hoglin");
   public static final class01134 yt = N("hoglin_baby");
   public static final class01134 yG = N("hopper_minecart");
   public static final class01134 yl = N("horse");
   public static final class01134 yd = N("horse_armor");
   public static final class01134 yw = N("horse", "saddle");
   public static final class01134 yk = N("horse_baby");
   public static final class01134 yY = N("horse_armor_baby");
   public static final class01134 yQ = N("horse_baby", "saddle");
   public static final class01134 yO = N("husk");
   public static final class01134 yg = N("husk_baby");
   public static final class08118<class01134> yI = y("husk_baby");
   public static final class08118<class01134> yJ = y("husk");
   public static final class01134 yo = N("illusioner");
   public static final class01134 yq = N("iron_golem");
   public static final class01134 yK = N("boat/jungle");
   public static final class01134 yV = N("chest_boat/jungle");
   public static final class01134 ye = N("leash_knot");
   public static final class01134 yH = N("llama");
   public static final class01134 yc = N("llama_baby");
   public static final class01134 yX = N("llama_baby", "decor");
   public static final class01134 ya = N("llama", "decor");
   public static final class01134 yp = N("llama_spit");
   public static final class01134 yF = N("magma_cube");
   public static final class01134 yA = N("boat/mangrove");
   public static final class01134 yf = N("chest_boat/mangrove");
   public static final class01134 yC = N("minecart");
   public static final class01134 yS = N("mooshroom");
   public static final class01134 yx = N("mooshroom_baby");
   public static final class01134 yD = N("mule");
   public static final class01134 yh = N("mule_baby");
   public static final class01134 yr = N("mule", "saddle");
   public static final class01134 LN = N("mule_baby", "saddle");
   public static final class01134 Ly = N("nautilus");
   public static final class01134 LL = N("nautilus_baby");
   public static final class01134 Lu = N("nautilus", "saddle");
   public static final class01134 Li = N("nautilus_armor");
   public static final class01134 LR = N("boat/oak");
   public static final class01134 LM = N("chest_boat/oak");
   public static final class01134 LB = N("ocelot");
   public static final class01134 LZ = N("ocelot_baby");
   public static final class01134 Lz = N("boat/pale_oak");
   public static final class01134 LU = N("chest_boat/pale_oak");
   public static final class01134 LE = N("panda");
   public static final class01134 LW = N("panda_baby");
   public static final class01134 Lm = N("parched");
   public static final class08118<class01134> LP = y("parched");
   public static final class01134 Ls = N("parched", "outer");
   public static final class01134 LT = N("parrot");
   public static final class01134 Lb = N("phantom");
   public static final class01134 Lj = N("pig");
   public static final class01134 Lv = N("piglin");
   public static final class01134 Ln = N("piglin_baby");
   public static final class08118<class01134> Lt = y("piglin_baby");
   public static final class01134 LG = N("piglin_brute");
   public static final class08118<class01134> Ll = y("piglin_brute");
   public static final class01134 Ld = N("piglin_head");
   public static final class08118<class01134> Lw = y("piglin");
   public static final class01134 Lk = N("pig_baby");
   public static final class01134 LY = N("pig_baby", "saddle");
   public static final class01134 LQ = N("pig", "saddle");
   public static final class01134 LO = N("pillager");
   public static final class01134 Lg = N("player");
   public static final class01134 LI = N("player", "cape");
   public static final class01134 LJ = N("player", "ears");
   public static final class01134 Lo = N("player_head");
   public static final class08118<class01134> Lq = y("player");
   public static final class01134 LK = N("player_slim");
   public static final class08118<class01134> LV = y("player_slim");
   public static final class01134 Le = N("spin_attack");
   public static final class01134 LH = N("polar_bear");
   public static final class01134 Lc = N("polar_bear_baby");
   public static final class01134 LX = N("pufferfish_big");
   public static final class01134 La = N("pufferfish_medium");
   public static final class01134 Lp = N("pufferfish_small");
   public static final class01134 LF = N("rabbit");
   public static final class01134 LA = N("rabbit_baby");
   public static final class01134 Lf = N("ravager");
   public static final class01134 LC = N("salmon");
   public static final class01134 LS = N("salmon_large");
   public static final class01134 Lx = N("salmon_small");
   public static final class01134 LD = N("sheep");
   public static final class01134 Lh = N("sheep_baby");
   public static final class01134 Lr = N("sheep_baby", "wool");
   public static final class01134 uN = N("sheep", "wool");
   public static final class01134 uy = N("sheep", "wool_undercoat");
   public static final class01134 uL = N("sheep_baby", "wool_undercoat");
   public static final class01134 uu = N("shield");
   public static final class01134 ui = N("shulker");
   public static final class01134 uR = N("shulker_box");
   public static final class01134 uM = N("shulker_bullet");
   public static final class01134 uB = N("silverfish");
   public static final class01134 uZ = N("skeleton");
   public static final class01134 uz = N("skeleton_horse");
   public static final class01134 uU = N("skeleton_horse_baby");
   public static final class01134 uE = N("skeleton_horse", "saddle");
   public static final class01134 uW = N("skeleton_horse_baby", "saddle");
   public static final class08118<class01134> um = y("skeleton");
   public static final class01134 uP = N("skeleton_skull");
   public static final class01134 us = N("slime");
   public static final class01134 uT = N("slime", "outer");
   public static final class01134 ub = N("sniffer");
   public static final class01134 uj = N("sniffer_baby");
   public static final class01134 uv = N("snow_golem");
   public static final class01134 un = N("spawner_minecart");
   public static final class01134 ut = N("spider");
   public static final class01134 uG = N("boat/spruce");
   public static final class01134 ul = N("chest_boat/spruce");
   public static final class01134 ud = N("squid");
   public static final class01134 uw = N("squid_baby");
   public static final class01134 uk = N("stray");
   public static final class08118<class01134> uY = y("stray");
   public static final class01134 uQ = N("stray", "outer");
   public static final class01134 uO = N("strider");
   public static final class01134 ug = N("strider", "saddle");
   public static final class01134 uI = N("strider_baby");
   public static final class01134 uJ = N("strider_baby", "saddle");
   public static final class01134 uo = N("tadpole");
   public static final class01134 uq = N("tnt_minecart");
   public static final class01134 uK = N("trader_llama");
   public static final class01134 uV = N("trader_llama_baby");
   public static final class01134 ue = N("trident");
   public static final class01134 uH = N("tropical_fish_large");
   public static final class01134 uc = N("tropical_fish_large", "pattern");
   public static final class01134 uX = N("tropical_fish_small");
   public static final class01134 ua = N("tropical_fish_small", "pattern");
   public static final class01134 up = N("turtle");
   public static final class01134 uF = N("turtle_baby");
   public static final class01134 uA = N("undead_horse_armor");
   public static final class01134 uf = N("undead_horse_baby_armor");
   public static final class01134 uC = N("vex");
   public static final class01134 uS = N("villager");
   public static final class01134 ux = N("villager_no_hat");
   public static final class01134 uD = N("villager_baby");
   public static final class01134 uh = N("villager_baby_no_hat");
   public static final class01134 ur = N("vindicator");
   public static final class01134 iN = N("wandering_trader");
   public static final class01134 iy = N("warden");
   public static final class01134 iL = N("warden", "bioluminescent");
   public static final class01134 iu = N("warden", "pulsating_spots");
   public static final class01134 ii = N("warden", "tendrils");
   public static final class01134 iR = N("warden", "heart");
   public static final class01134 iM = N("warm_cow");
   public static final class01134 iB = N("warm_cow_baby");
   public static final class01134 iZ = N("wind_charge");
   public static final class01134 iz = N("witch");
   public static final class01134 iU = N("wither");
   public static final class01134 iE = N("wither", "armor");
   public static final class01134 iW = N("wither_skeleton");
   public static final class08118<class01134> im = y("wither_skeleton");
   public static final class01134 iP = N("wither_skeleton_skull");
   public static final class01134 is = N("wither_skull");
   public static final class01134 iT = N("wolf");
   public static final class01134 ib = N("wolf_armor");
   public static final class01134 ij = N("wolf_baby");
   public static final class01134 iv = N("wolf_baby_armor");
   public static final class01134 in = N("zoglin");
   public static final class01134 it = N("zoglin_baby");
   public static final class01134 iG = N("zombie");
   public static final class01134 il = N("zombie_baby");
   public static final class08118<class01134> id = y("zombie_baby");
   public static final class01134 iw = N("zombie_head");
   public static final class01134 ik = N("zombie_horse");
   public static final class01134 iY = N("zombie_horse_baby");
   public static final class01134 iQ = N("zombie_horse", "saddle");
   public static final class01134 iO = N("zombie_horse_baby", "saddle");
   public static final class08118<class01134> ig = y("zombie");
   public static final class01134 iI = N("zombie_villager");
   public static final class01134 iJ = N("zombie_villager_no_hat");
   public static final class01134 io = N("zombie_villager_baby");
   public static final class01134 iq = N("zombie_villager_baby_no_hat");
   public static final class08118<class01134> iK = y("zombie_villager_baby");
   public static final class08118<class01134> iV = y("zombie_villager");
   public static final class01134 ie = N("zombified_piglin");
   public static final class01134 iH = N("zombified_piglin_baby");
   public static final class08118<class01134> ic = y("zombified_piglin_baby");
   public static final class08118<class01134> iX = y("zombified_piglin");
   public static final class01134 ia = N("zombie_nautilus");

   public class04802() {
      super();
   }

   private static void y(class05904 var0, CallbackInfoReturnable var1) {
      if (var0.y().indexOf(58) != -1) {
         class01894 class01894 = class01894.N(var0.y());
         var1.setReturnValue(new class01134(class01894.R("sign/wall/"), "main"));
      }
   }

   public static class01134 y(class05904 var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      y(var0, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class01134)callbackinforeturnable.getReturnValue() : y("sign/wall/" + var0.y(), "main");
   }

   private static class01134 y(String var0, String var1) {
      return new class01134(class01894.y(var0), var1);
   }

   private static class08118<class01134> y(String var0) {
      return new class08118<>(N(var0, "helmet"), N(var0, "chestplate"), N(var0, "leggings"), N(var0, "boots"));
   }

   private static void N(class05904 var0, class02019 var1, CallbackInfoReturnable var2) {
      if (var0.y().indexOf(58) != -1) {
         class01894 class01894 = class01894.N(var0.y());
         var2.setReturnValue(new class01134(class01894.N((UnaryOperator<String>)(var1x -> "hanging_sign/" + var1x + "/" + var1.method_15434())), "main"));
      }
   }

   private static class01134 N(String var0) {
      return N(var0, "main");
   }

   public static class01134 N(class05904 var0, class02019 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? (class01134)callbackinforeturnable.getReturnValue()
         : y("hanging_sign/" + var0.y() + "/" + var1.method_15434(), "main");
   }

   public static class01134 N(class05904 var0) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var0, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class01134)callbackinforeturnable.getReturnValue() : y("sign/standing/" + var0.y(), "main");
   }

   public static Stream<class01134> N() {
      return iF.stream();
   }

   private static class01134 N(String var0, String var1) {
      class01134 class01134 = y(var0, var1);
      if (!iF.add(class01134)) {
         throw new IllegalStateException("Duplicate registration for " + class01134);
      } else {
         return class01134;
      }
   }

   private static void N(class05904 var0, CallbackInfoReturnable var1) {
      if (var0.y().indexOf(58) != -1) {
         class01894 class01894 = class01894.N(var0.y());
         var1.setReturnValue(new class01134(class01894.R("sign/standing/"), "main"));
      }
   }
}
