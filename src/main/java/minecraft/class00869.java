package minecraft;

import com.google.common.collect.UnmodifiableIterator;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00869 {
   private static final class01340 ty = (var0, var1x, var2x) -> {
      class00394 class00394 = var1x.method_8321(var2x);
      return class00394 instanceof class07278 ? ((class07278)class00394).U() : true;
   };
   private static final class01340 tL = (var0, var1x, var2x) -> !var0.L(class00513.L);
   public static final class00891 N = N("air", class07662::new, class01362.N().s().y().M().W());
   public static final class00891 y = N("stone", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 L = N("granite", class01362.N().N(class04689.U).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 u = N("polished_granite", class01362.N().N(class04689.U).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 i = N("diorite", class01362.N().N(class04689.P).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 R = N("polished_diorite", class01362.N().N(class04689.P).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 M = N("andesite", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 B = N("polished_andesite", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 Z = N("grass_block", class00725::new, class01362.N().N(class04689.y).i().u(0.6F).N(class07752.u));
   public static final class00891 z = N("dirt", class01362.N().N(class04689.U).u(0.5F).N(class07752.L));
   public static final class00891 U = N("coarse_dirt", class01362.N().N(class04689.U).u(0.5F).N(class07752.L));
   public static final class00891 E = N("podzol", class06994::new, class01362.N().N(class04689.q).u(0.5F).N(class07752.L));
   public static final class00891 W = N("cobblestone", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 m = N("oak_planks", class01362.N().N(class04689.m).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 P = N("spruce_planks", class01362.N().N(class04689.q).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 s = N("birch_planks", class01362.N().N(class04689.L).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 T = N("jungle_planks", class01362.N().N(class04689.U).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 b = N("acacia_planks", class01362.N().N(class04689.s).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 j = N("cherry_planks", class01362.N().N(class04689.V).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.ND).Z());
   public static final class00891 v = N("dark_oak_planks", class01362.N().N(class04689.k).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 n = N("pale_oak_wood", class07004::new, class01362.N().N(class04689.E).N(class08089.field_12651).u(2.0F).N(class07752.y).Z());
   public static final class00891 t = N("pale_oak_planks", class01362.N().N(class04689.P).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 G = N("mangrove_planks", class01362.N().N(class04689.Q).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 l = N("bamboo_planks", class01362.N().N(class04689.j).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.NS).Z());
   public static final class00891 d = N("bamboo_mosaic", class01362.N().N(class04689.j).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.NS).Z());
   public static final class00891 w = N(
      "oak_sapling", var0 -> new class07013(class03707.y, var0), class01362.N().N(class04689.B).y().i().u().N(class07752.u).N(class04641.field_15971)
   );
   public static final class00891 k = N(
      "spruce_sapling", var0 -> new class07013(class03707.L, var0), class01362.N().N(class04689.B).y().i().u().N(class07752.u).N(class04641.field_15971)
   );
   public static final class00891 Y = N(
      "birch_sapling", var0 -> new class07013(class03707.R, var0), class01362.N().N(class04689.B).y().i().u().N(class07752.u).N(class04641.field_15971)
   );
   public static final class00891 Q = N(
      "jungle_sapling", var0 -> new class07013(class03707.M, var0), class01362.N().N(class04689.B).y().i().u().N(class07752.u).N(class04641.field_15971)
   );
   public static final class00891 O = N(
      "acacia_sapling", var0 -> new class07013(class03707.B, var0), class01362.N().N(class04689.B).y().i().u().N(class07752.u).N(class04641.field_15971)
   );
   public static final class00891 g = N(
      "cherry_sapling", var0 -> new class07013(class03707.Z, var0), class01362.N().N(class04689.n).y().i().u().N(class07752.Nh).N(class04641.field_15971)
   );
   public static final class00891 I = N(
      "dark_oak_sapling", var0 -> new class07013(class03707.z, var0), class01362.N().N(class04689.B).y().i().u().N(class07752.u).N(class04641.field_15971)
   );
   public static final class00891 J = N(
      "pale_oak_sapling", var0 -> new class07013(class03707.U, var0), class01362.N().N(class04689.M).y().i().u().N(class07752.u).N(class04641.field_15971)
   );
   public static final class00891 o = N(
      "mangrove_propagule",
      var0 -> new class04091(class03707.u, var0),
      class01362.N().N(class04689.B).y().i().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 q = N("bedrock", class01362.N().N(class04689.E).N(class08089.field_12653).N(-1.0F, 3600000.0F).M().N(class00869::N));
   public static final class00891 K = N(
      "water", var0 -> new class07117(class04684.L, var0), class01362.N().N(class04689.W).s().y().u(100.0F).N(class04641.field_15971).M().z().N(class07752.N)
   );
   public static final class00891 V = N(
      "lava",
      var0 -> new class07117(class04684.i, var0),
      class01362.N().N(class04689.i).s().y().i().u(100.0F).N(var0 -> 15).N(class04641.field_15971).M().z().N(class07752.N)
   );
   public static final class00891 e = N(
      "sand", var0 -> new class08407(new class03728(14406560), var0), class01362.N().N(class04689.L).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 H = N(
      "suspicious_sand",
      var0 -> new class01979(e, class04909.uR, class04909.uR, var0),
      class01362.N().N(class04689.L).N(class08089.field_12643).u(0.25F).N(class07752.yu).N(class04641.field_15971)
   );
   public static final class00891 c = N(
      "red_sand", var0 -> new class08407(new class03728(11098145), var0), class01362.N().N(class04689.s).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 X = N(
      "gravel", var0 -> new class03736(new class03728(-8356741), var0), class01362.N().N(class04689.E).N(class08089.field_12643).u(0.6F).N(class07752.L)
   );
   public static final class00891 a = N(
      "suspicious_gravel",
      var0 -> new class01979(X, class04909.uM, class04909.uM, var0),
      class01362.N().N(class04689.E).N(class08089.field_12643).u(0.25F).N(class07752.yi).N(class04641.field_15971)
   );
   public static final class00891 p = N(
      "gold_ore", var0 -> new class06858(class02151.N(0), var0), class01362.N().N(class04689.E).N(class08089.field_12653).m().N(3.0F, 3.0F)
   );
   public static final class00891 F = N(
      "deepslate_gold_ore", var0 -> new class06858(class02151.N(0), var0), class01362.y(p).N(class04689.NB).N(4.5F, 3.0F).N(class07752.No)
   );
   public static final class00891 A = N(
      "iron_ore", var0 -> new class06858(class02151.N(0), var0), class01362.N().N(class04689.E).N(class08089.field_12653).m().N(3.0F, 3.0F)
   );
   public static final class00891 f = N(
      "deepslate_iron_ore", var0 -> new class06858(class02151.N(0), var0), class01362.y(A).N(class04689.NB).N(4.5F, 3.0F).N(class07752.No)
   );
   public static final class00891 C = N(
      "coal_ore", var0 -> new class06858(class02135.y(0, 2), var0), class01362.N().N(class04689.E).N(class08089.field_12653).m().N(3.0F, 3.0F)
   );
   public static final class00891 S = N(
      "deepslate_coal_ore", var0 -> new class06858(class02135.y(0, 2), var0), class01362.y(C).N(class04689.NB).N(4.5F, 3.0F).N(class07752.No)
   );
   public static final class00891 x = N(
      "nether_gold_ore",
      var0 -> new class06858(class02135.y(0, 1), var0),
      class01362.N().N(class04689.K).N(class08089.field_12653).m().N(3.0F, 3.0F).N(class07752.S)
   );
   public static final class00891 D = N("oak_log", class07004::new, N(class04689.m, class04689.q, class07752.y));
   public static final class00891 h = N("spruce_log", class07004::new, N(class04689.q, class04689.k, class07752.y));
   public static final class00891 r = N("birch_log", class07004::new, N(class04689.L, class04689.P, class07752.y));
   public static final class00891 NN = N("jungle_log", class07004::new, N(class04689.U, class04689.q, class07752.y));
   public static final class00891 Ny = N("acacia_log", class07004::new, N(class04689.s, class04689.E, class07752.y));
   public static final class00891 NL = N("cherry_log", class07004::new, N(class04689.V, class04689.F, class07752.ND));
   public static final class00891 Nu = N("dark_oak_log", class07004::new, N(class04689.k, class04689.k, class07752.y));
   public static final class00891 Ni = N("pale_oak_log", class07004::new, N(t.k(), n.k(), class07752.y));
   public static final class00891 NR = N("mangrove_log", class07004::new, N(class04689.Q, class04689.q, class07752.y));
   public static final class00891 NM = N(
      "mangrove_roots",
      class04097::new,
      class01362.N().N(class04689.q).N(class08089.field_12651).u(0.7F).N(class07752.Nc).L().y(class00869::y).L(class00869::y).L().Z()
   );
   public static final class00891 NB = N("muddy_mangrove_roots", class07004::new, class01362.N().N(class04689.q).u(0.7F).N(class07752.NX));
   public static final class00891 NZ = N("bamboo_block", class07004::new, N(class04689.j, class04689.B, class07752.NS));
   public static final class00891 Nz = N("stripped_spruce_log", class07004::new, N(class04689.q, class04689.q, class07752.y));
   public static final class00891 NU = N("stripped_birch_log", class07004::new, N(class04689.L, class04689.L, class07752.y));
   public static final class00891 NE = N("stripped_jungle_log", class07004::new, N(class04689.U, class04689.U, class07752.y));
   public static final class00891 NW = N("stripped_acacia_log", class07004::new, N(class04689.s, class04689.s, class07752.y));
   public static final class00891 Nm = N("stripped_cherry_log", class07004::new, N(class04689.V, class04689.p, class07752.ND));
   public static final class00891 NP = N("stripped_dark_oak_log", class07004::new, N(class04689.k, class04689.k, class07752.y));
   public static final class00891 Ns = N("stripped_pale_oak_log", class07004::new, N(t.k(), t.k(), class07752.y));
   public static final class00891 NT = N("stripped_oak_log", class07004::new, N(class04689.m, class04689.m, class07752.y));
   public static final class00891 Nb = N("stripped_mangrove_log", class07004::new, N(class04689.Q, class04689.Q, class07752.y));
   public static final class00891 Nj = N("stripped_bamboo_block", class07004::new, N(class04689.j, class04689.j, class07752.NS));
   public static final class00891 Nv = N("oak_wood", class07004::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.0F).N(class07752.y).Z());
   public static final class00891 Nn = N("spruce_wood", class07004::new, class01362.N().N(class04689.q).N(class08089.field_12651).u(2.0F).N(class07752.y).Z());
   public static final class00891 Nt = N("birch_wood", class07004::new, class01362.N().N(class04689.L).N(class08089.field_12651).u(2.0F).N(class07752.y).Z());
   public static final class00891 NG = N("jungle_wood", class07004::new, class01362.N().N(class04689.U).N(class08089.field_12651).u(2.0F).N(class07752.y).Z());
   public static final class00891 Nl = N("acacia_wood", class07004::new, class01362.N().N(class04689.t).N(class08089.field_12651).u(2.0F).N(class07752.y).Z());
   public static final class00891 Nd = N("cherry_wood", class07004::new, class01362.N().N(class04689.F).N(class08089.field_12651).u(2.0F).N(class07752.ND).Z());
   public static final class00891 Nw = N("dark_oak_wood", class07004::new, class01362.N().N(class04689.k).N(class08089.field_12651).u(2.0F).N(class07752.y).Z());
   public static final class00891 Nk = N("mangrove_wood", class07004::new, class01362.N().N(class04689.Q).N(class08089.field_12651).u(2.0F).N(class07752.y).Z());
   public static final class00891 NY = N(
      "stripped_oak_wood", class07004::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.0F).N(class07752.y).Z()
   );
   public static final class00891 NQ = N(
      "stripped_spruce_wood", class07004::new, class01362.N().N(class04689.q).N(class08089.field_12651).u(2.0F).N(class07752.y).Z()
   );
   public static final class00891 NO = N(
      "stripped_birch_wood", class07004::new, class01362.N().N(class04689.L).N(class08089.field_12651).u(2.0F).N(class07752.y).Z()
   );
   public static final class00891 Ng = N(
      "stripped_jungle_wood", class07004::new, class01362.N().N(class04689.U).N(class08089.field_12651).u(2.0F).N(class07752.y).Z()
   );
   public static final class00891 NI = N(
      "stripped_acacia_wood", class07004::new, class01362.N().N(class04689.s).N(class08089.field_12651).u(2.0F).N(class07752.y).Z()
   );
   public static final class00891 NJ = N(
      "stripped_cherry_wood", class07004::new, class01362.N().N(class04689.p).N(class08089.field_12651).u(2.0F).N(class07752.ND).Z()
   );
   public static final class00891 No = N(
      "stripped_dark_oak_wood", class07004::new, class01362.N().N(class04689.k).N(class08089.field_12651).u(2.0F).N(class07752.y).Z()
   );
   public static final class00891 Nq = N(
      "stripped_pale_oak_wood", class07004::new, class01362.N().N(t.k()).N(class08089.field_12651).u(2.0F).N(class07752.y).Z()
   );
   public static final class00891 NK = N("stripped_mangrove_wood", class07004::new, N(class04689.Q, class04689.Q, class07752.y));
   public static final class00891 NV = N("oak_leaves", var0 -> new class08564(0.01F, var0), N(class07752.u));
   public static final class00891 Ne = N("spruce_leaves", var0 -> new class08564(0.01F, var0), N(class07752.u));
   public static final class00891 NH = N("birch_leaves", var0 -> new class08564(0.01F, var0), N(class07752.u));
   public static final class00891 Nc = N("jungle_leaves", var0 -> new class08564(0.01F, var0), N(class07752.u));
   public static final class00891 NX = N("acacia_leaves", var0 -> new class08564(0.01F, var0), N(class07752.u));
   public static final class00891 Na = N(
      "cherry_leaves",
      var0 -> new class08567(0.1F, class07107.q, var0),
      class01362.N()
         .N(class04689.n)
         .u(0.2F)
         .i()
         .N(class07752.Nr)
         .L()
         .N(class00869::L)
         .y(class00869::y)
         .L(class00869::y)
         .Z()
         .N(class04641.field_15971)
         .N_9(class00869::y)
   );
   public static final class00891 Np = N("dark_oak_leaves", var0 -> new class08564(0.01F, var0), N(class07752.u));
   public static final class00891 NF = N(
      "pale_oak_leaves",
      var0 -> new class08567(0.02F, class07107.K, var0),
      class01362.N()
         .N(class04689.M)
         .u(0.2F)
         .i()
         .N(class07752.u)
         .L()
         .N(class00869::L)
         .y(class00869::y)
         .L(class00869::y)
         .Z()
         .N(class04641.field_15971)
         .N_9(class00869::y)
   );
   public static final class00891 NA = N("mangrove_leaves", var0 -> new class04098(0.01F, var0), N(class07752.u));
   public static final class00891 Nf = N("azalea_leaves", var0 -> new class08567(0.01F, class02329.N(class07107.V, -9399763), var0), N(class07752.Nk));
   public static final class00891 NC = N("flowering_azalea_leaves", var0 -> new class08567(0.01F, class02329.N(class07107.V, -9399763), var0), N(class07752.Nk));
   public static final class00891 NS = N("sponge", class07711::new, class01362.N().N(class04689.j).u(0.6F).N(class07752.yZ));
   public static final class00891 Nx = N("wet_sponge", class00420::new, class01362.N().N(class04689.j).u(0.6F).N(class07752.yz));
   public static final class00891 ND = N(
      "glass",
      class03137::new,
      class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L().N(class00869::N).N_9(class00869::y).y(class00869::y).L(class00869::y)
   );
   public static final class00891 Nh = N(
      "lapis_ore", var0 -> new class06858(class02135.y(2, 5), var0), class01362.N().N(class04689.E).N(class08089.field_12653).m().N(3.0F, 3.0F)
   );
   public static final class00891 Nr = N(
      "deepslate_lapis_ore", var0 -> new class06858(class02135.y(2, 5), var0), class01362.y(Nh).N(class04689.NB).N(4.5F, 3.0F).N(class07752.No)
   );
   public static final class00891 yN = N("lapis_block", class01362.N().N(class04689.J).m().N(3.0F, 3.0F));
   public static final class00891 yy = N("dispenser", class06758::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().u(3.5F));
   public static final class00891 yL = N("sandstone", class01362.N().N(class04689.L).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 yu = N("chiseled_sandstone", class01362.N().N(class04689.L).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 yi = N("cut_sandstone", class01362.N().N(class04689.L).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 yR = N("note_block", class06867::new, class01362.N().N(class04689.m).N(class08089.field_12651).N(class07752.y).u(0.8F).Z());
   public static final class00891 yM = N("white_bed", class06563.field_7952);
   public static final class00891 yB = N("orange_bed", class06563.field_7946);
   public static final class00891 yZ = N("magenta_bed", class06563.field_7958);
   public static final class00891 yz = N("light_blue_bed", class06563.field_7951);
   public static final class00891 yU = N("yellow_bed", class06563.field_7947);
   public static final class00891 yE = N("lime_bed", class06563.field_7961);
   public static final class00891 yW = N("pink_bed", class06563.field_7954);
   public static final class00891 ym = N("gray_bed", class06563.field_7944);
   public static final class00891 yP = N("light_gray_bed", class06563.field_7967);
   public static final class00891 ys = N("cyan_bed", class06563.field_7955);
   public static final class00891 yT = N("purple_bed", class06563.field_7945);
   public static final class00891 yb = N("blue_bed", class06563.field_7966);
   public static final class00891 yj = N("brown_bed", class06563.field_7957);
   public static final class00891 yv = N("green_bed", class06563.field_7942);
   public static final class00891 yn = N("red_bed", class06563.field_7964);
   public static final class00891 yt = N("black_bed", class06563.field_7963);
   public static final class00891 yG = N("powered_rail", class06900::new, class01362.N().y().u(0.7F).N(class07752.M));
   public static final class00891 yl = N("detector_rail", class06784::new, class01362.N().y().u(0.7F).N(class07752.M));
   public static final class00891 yd = N("sticky_piston", var0 -> new class00513(true, var0), L());
   public static final class00891 yw = N(
      "cobweb", class00663::new, class01362.N().N(class04689.u).N(class07752.ym).U().y().m().u(4.0F).N(class04641.field_15971)
   );
   public static final class00891 yk = N(
      "short_grass", class00635::new, class01362.N().N(class04689.B).s().y().u().N(class07752.u).N(class01344.field_10655).Z().N(class04641.field_15971)
   );
   public static final class00891 yY = N(
      "fern", class00635::new, class01362.N().N(class04689.B).s().y().u().N(class07752.u).N(class01344.field_10655).Z().N(class04641.field_15971)
   );
   public static final class00891 yQ = N("dead_bush", class06786::new, class01362.N().N(class04689.m).s().y().u().N(class07752.u).Z().N(class04641.field_15971));
   public static final class00891 yO = N("bush", class08434::new, class01362.N().N(class04689.B).s().y().u().N(class07752.u).Z().N(class04641.field_15971));
   public static final class00891 yg = N(
      "short_dry_grass", class08417::new, class01362.N().N(class04689.j).s().y().u().N(class07752.u).Z().N(class01344.field_10655).N(class04641.field_15971)
   );
   public static final class00891 yI = N(
      "tall_dry_grass", class08436::new, class01362.N().N(class04689.j).s().y().u().N(class07752.u).Z().N(class01344.field_10655).N(class04641.field_15971)
   );
   public static final class00891 yJ = N("seagrass", class07010::new, class01362.N().N(class04689.W).s().y().u().N(class07752.T).N(class04641.field_15971));
   public static final class00891 yo = N(
      "tall_seagrass", class07749::new, class01362.N().N(class04689.W).s().y().u().N(class07752.T).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 yq = N("piston", var0 -> new class00513(false, var0), L());
   public static final class00891 yK = N("piston_head", class00483::new, class01362.N().N(class04689.E).u(1.5F).M().N(class04641.field_15972));
   public static final class00891 yV = N("white_wool", class01362.N().N(class04689.Z).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 ye = N("orange_wool", class01362.N().N(class04689.s).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yH = N("magenta_wool", class01362.N().N(class04689.T).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yc = N("light_blue_wool", class01362.N().N(class04689.b).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yX = N("yellow_wool", class01362.N().N(class04689.j).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 ya = N("lime_wool", class01362.N().N(class04689.v).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yp = N("pink_wool", class01362.N().N(class04689.n).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yF = N("gray_wool", class01362.N().N(class04689.t).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yA = N("light_gray_wool", class01362.N().N(class04689.G).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yf = N("cyan_wool", class01362.N().N(class04689.l).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yC = N("purple_wool", class01362.N().N(class04689.d).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yS = N("blue_wool", class01362.N().N(class04689.w).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yx = N("brown_wool", class01362.N().N(class04689.k).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yD = N("green_wool", class01362.N().N(class04689.Y).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yh = N("red_wool", class01362.N().N(class04689.Q).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 yr = N("black_wool", class01362.N().N(class04689.O).N(class08089.field_12654).u(0.8F).N(class07752.Z).Z());
   public static final class00891 LN = N(
      "moving_piston",
      class00511::new,
      class01362.N().N(class04689.E).U().u(-1.0F).R().M().L().N_9(class00869::y).y(class00869::y).L(class00869::y).N(class04641.field_15972)
   );
   public static final class00891 Ly = N(
      "dandelion",
      var0 -> new class00729(class07047.G, 0.35F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LL = N(
      "torchflower",
      var0 -> new class00729(class07047.s, 5.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 Lu = N(
      "poppy",
      var0 -> new class00729(class07047.s, 5.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 Li = N(
      "blue_orchid",
      var0 -> new class00729(class07047.G, 0.35F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LR = N(
      "allium",
      var0 -> new class00729(class07047.E, 3.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LM = N(
      "azure_bluet",
      var0 -> new class00729(class07047.P, 11.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LB = N(
      "red_tulip",
      var0 -> new class00729(class07047.b, 7.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LZ = N(
      "orange_tulip",
      var0 -> new class00729(class07047.b, 7.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 Lz = N(
      "white_tulip",
      var0 -> new class00729(class07047.b, 7.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LU = N(
      "pink_tulip",
      var0 -> new class00729(class07047.b, 7.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LE = N(
      "oxeye_daisy",
      var0 -> new class00729(class07047.z, 7.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LW = N(
      "cornflower",
      var0 -> new class00729(class07047.B, 5.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 Lm = N(
      "wither_rose",
      var0 -> new class00424(class07047.v, 7.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 LP = N(
      "lily_of_the_valley",
      var0 -> new class00729(class07047.j, 11.0F, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 Ls = N(
      "brown_mushroom",
      var0 -> new class07119(class03168.i, var0),
      class01362.N().N(class04689.k).y().i().u().N(class07752.u).N(var0 -> 1).u(class00869::N).N(class04641.field_15971)
   );
   public static final class00891 LT = N(
      "red_mushroom",
      var0 -> new class07119(class03168.R, var0),
      class01362.N().N(class04689.Q).y().i().u().N(class07752.u).u(class00869::N).N(class04641.field_15971)
   );
   public static final class00891 Lb = N("gold_block", class01362.N().N(class04689.g).N(class08089.field_12644).m().N(3.0F, 6.0F).N(class07752.M));
   public static final class00891 Lj = N("iron_block", class01362.N().N(class04689.M).N(class08089.field_18284).m().N(5.0F, 6.0F).N(class07752.yb));
   public static final class00891 Lv = N("bricks", class01362.N().N(class04689.Q).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Ln = N("tnt", class00655::new, class01362.N().N(class04689.i).u().N(class07752.u).Z().N_9(class00869::y));
   public static final class00891 Lt = N("bookshelf", class01362.N().N(class04689.m).N(class08089.field_12651).u(1.5F).N(class07752.y).Z());
   public static final class00891 LG = N(
      "chiseled_bookshelf", class03769::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(1.5F).N(class07752.yy).Z()
   );
   public static final class00891 Ll = N("acacia_shelf", class08968::new, class01362.N().N(b.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F));
   public static final class00891 Ld = N("bamboo_shelf", class08968::new, class01362.N().N(l.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F));
   public static final class00891 Lw = N("birch_shelf", class08968::new, class01362.N().N(s.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F));
   public static final class00891 Lk = N("cherry_shelf", class08968::new, class01362.N().N(j.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F));
   public static final class00891 LY = N(
      "crimson_shelf", class08968::new, class01362.N().N(class04689.Ny).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F)
   );
   public static final class00891 LQ = N(
      "dark_oak_shelf", class08968::new, class01362.N().N(Nu.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F)
   );
   public static final class00891 LO = N("jungle_shelf", class08968::new, class01362.N().N(NN.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F));
   public static final class00891 Lg = N(
      "mangrove_shelf", class08968::new, class01362.N().N(NR.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F)
   );
   public static final class00891 LI = N("oak_shelf", class08968::new, class01362.N().N(m.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F));
   public static final class00891 LJ = N(
      "pale_oak_shelf", class08968::new, class01362.N().N(t.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F)
   );
   public static final class00891 Lo = N("spruce_shelf", class08968::new, class01362.N().N(h.k()).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F));
   public static final class00891 Lq = N(
      "warped_shelf", class08968::new, class01362.N().N(class04689.Ni).N(class08089.field_12651).N(class07752.yL).Z().N(2.0F, 3.0F)
   );
   public static final class00891 LK = N("mossy_cobblestone", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 LV = N("obsidian", class01362.N().N(class04689.O).N(class08089.field_12653).m().N(50.0F, 1200.0F));
   public static final class00891 Le = N(
      "torch", var0 -> new class00670(class07107.J, var0), class01362.N().y().u().N(var0 -> 14).N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 LH = N(
      "wall_torch", var0 -> new class00651(class07107.J, var0), N(Le, true).y().u().N(var0 -> 14).N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 Lc = N(
      "fire", class00756::new, class01362.N().N(class04689.i).s().y().u().N(var0 -> 15).N(class07752.Z).N(class04641.field_15971)
   );
   public static final class00891 LX = N(
      "soul_fire", class06001::new, class01362.N().N(class04689.b).s().y().u().N(var0 -> 10).N(class07752.Z).N(class04641.field_15971)
   );
   public static final class00891 La = N("spawner", class07033::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().u(5.0F).N(class07752.yP).L());
   public static final class00891 Lp = N("creaking_heart", class00325::new, class01362.N().N(class04689.s).N(class08089.field_12653).u(10.0F).N(class07752.yE));
   public static final class00891 LF = N("oak_stairs", m);
   public static final class00891 LA = N(
      "chest",
      var0 -> new class00860(() -> class00404.field_11914, class04909.Rb, class04909.Rs, var0),
      class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z()
   );
   public static final class00891 Lf = N("redstone_wire", class06884::new, class01362.N().y().u().N(class04641.field_15971));
   public static final class00891 LC = N(
      "diamond_ore", var0 -> new class06858(class02135.y(3, 7), var0), class01362.N().N(class04689.E).N(class08089.field_12653).m().N(3.0F, 3.0F)
   );
   public static final class00891 LS = N(
      "deepslate_diamond_ore", var0 -> new class06858(class02135.y(3, 7), var0), class01362.y(LC).N(class04689.NB).N(4.5F, 3.0F).N(class07752.No)
   );
   public static final class00891 Lx = N("diamond_block", class01362.N().N(class04689.I).m().N(5.0F, 6.0F).N(class07752.M));
   public static final class00891 LD = N(
      "crafting_table", class06766::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z()
   );
   public static final class00891 Lh = N(
      "wheat",
      class06772::new,
      class01362.N().N_25(var0 -> var0.L(class06772.R) >= 6 ? class04689.j : class04689.B).y().i().u().N(class07752.G).N(class04641.field_15971)
   );
   public static final class00891 Lr = N(
      "farmland", class07208::new, class01362.N().N(class04689.U).i().u(0.6F).N(class07752.L).L(class00869::N).y(class00869::N)
   );
   public static final class00891 uN = N("furnace", class05659::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().u(3.5F).N(N(13)));
   public static final class00891 uy = N(
      "oak_sign", var0 -> new class07751(class05904.y, var0), class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uL = N(
      "spruce_sign", var0 -> new class07751(class05904.L, var0), class01362.N().N(h.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uu = N(
      "birch_sign", var0 -> new class07751(class05904.u, var0), class01362.N().N(class04689.L).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 ui = N(
      "acacia_sign", var0 -> new class07751(class05904.i, var0), class01362.N().N(class04689.s).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uR = N(
      "cherry_sign", var0 -> new class07751(class05904.R, var0), class01362.N().N(j.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uM = N(
      "jungle_sign", var0 -> new class07751(class05904.M, var0), class01362.N().N(NN.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uB = N(
      "dark_oak_sign", var0 -> new class07751(class05904.B, var0), class01362.N().N(Nu.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uZ = N(
      "pale_oak_sign", var0 -> new class07751(class05904.Z, var0), class01362.N().N(t.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uz = N(
      "mangrove_sign", var0 -> new class07751(class05904.E, var0), class01362.N().N(NR.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uU = N(
      "bamboo_sign", var0 -> new class07751(class05904.W, var0), class01362.N().N(l.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uE = N(
      "oak_door", var0 -> new class07196(class01960.M, var0), class01362.N().N(m.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 uW = N("ladder", class07123::new, class01362.N().E().u(0.4F).N(class07752.W).L().N(class04641.field_15971));
   public static final class00891 um = N("rail", class06892::new, class01362.N().y().u(0.7F).N(class07752.M));
   public static final class00891 uP = N("cobblestone_stairs", W);
   public static final class00891 us = N(
      "oak_wall_sign", var0 -> new class00662(class05904.y, var0), N(uy, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uT = N(
      "spruce_wall_sign", var0 -> new class00662(class05904.L, var0), N(uL, true).N(h.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 ub = N(
      "birch_wall_sign", var0 -> new class00662(class05904.u, var0), N(uu, true).N(class04689.L).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uj = N(
      "acacia_wall_sign", var0 -> new class00662(class05904.i, var0), N(ui, true).N(class04689.s).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uv = N(
      "cherry_wall_sign", var0 -> new class00662(class05904.R, var0), N(uR, true).N(NL.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 un = N(
      "jungle_wall_sign", var0 -> new class00662(class05904.M, var0), N(uM, true).N(NN.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 ut = N(
      "dark_oak_wall_sign", var0 -> new class00662(class05904.B, var0), N(uB, true).N(Nu.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uG = N(
      "pale_oak_wall_sign", var0 -> new class00662(class05904.Z, var0), N(uZ, true).N(t.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 ul = N(
      "mangrove_wall_sign", var0 -> new class00662(class05904.E, var0), N(uz, true).N(NR.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 ud = N(
      "bamboo_wall_sign", var0 -> new class00662(class05904.W, var0), N(uU, true).N(l.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uw = N(
      "oak_hanging_sign", var0 -> new class03787(class05904.y, var0), class01362.N().N(D.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uk = N(
      "spruce_hanging_sign", var0 -> new class03787(class05904.L, var0), class01362.N().N(h.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uY = N(
      "birch_hanging_sign", var0 -> new class03787(class05904.u, var0), class01362.N().N(class04689.L).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uQ = N(
      "acacia_hanging_sign", var0 -> new class03787(class05904.i, var0), class01362.N().N(class04689.s).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uO = N(
      "cherry_hanging_sign", var0 -> new class03787(class05904.R, var0), class01362.N().N(class04689.p).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 ug = N(
      "jungle_hanging_sign", var0 -> new class03787(class05904.M, var0), class01362.N().N(NN.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uI = N(
      "dark_oak_hanging_sign", var0 -> new class03787(class05904.B, var0), class01362.N().N(Nu.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uJ = N(
      "pale_oak_hanging_sign", var0 -> new class03787(class05904.Z, var0), class01362.N().N(t.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uo = N(
      "crimson_hanging_sign", var0 -> new class03787(class05904.z, var0), class01362.N().N(class04689.Ny).U().N(class08089.field_12651).y().u(1.0F)
   );
   public static final class00891 uq = N(
      "warped_hanging_sign", var0 -> new class03787(class05904.U, var0), class01362.N().N(class04689.Ni).U().N(class08089.field_12651).y().u(1.0F)
   );
   public static final class00891 uK = N(
      "mangrove_hanging_sign", var0 -> new class03787(class05904.E, var0), class01362.N().N(NR.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uV = N(
      "bamboo_hanging_sign", var0 -> new class03787(class05904.W, var0), class01362.N().N(class04689.j).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 ue = N(
      "oak_wall_hanging_sign", var0 -> new class03792(class05904.y, var0), N(uw, true).N(D.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uH = N(
      "spruce_wall_hanging_sign", var0 -> new class03792(class05904.L, var0), N(uk, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uc = N(
      "birch_wall_hanging_sign", var0 -> new class03792(class05904.u, var0), N(uY, true).N(class04689.L).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uX = N(
      "acacia_wall_hanging_sign", var0 -> new class03792(class05904.i, var0), N(uQ, true).N(class04689.s).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 ua = N(
      "cherry_wall_hanging_sign", var0 -> new class03792(class05904.R, var0), N(uO, true).N(class04689.p).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 up = N(
      "jungle_wall_hanging_sign", var0 -> new class03792(class05904.M, var0), N(ug, true).N(NN.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uF = N(
      "dark_oak_wall_hanging_sign", var0 -> new class03792(class05904.B, var0), N(uI, true).N(Nu.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uA = N(
      "pale_oak_wall_hanging_sign", var0 -> new class03792(class05904.Z, var0), N(uJ, true).N(t.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uf = N(
      "mangrove_wall_hanging_sign", var0 -> new class03792(class05904.E, var0), N(uK, true).N(NR.k()).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uC = N(
      "crimson_wall_hanging_sign", var0 -> new class03792(class05904.z, var0), N(uo, true).N(class04689.Ny).U().N(class08089.field_12651).y().u(1.0F)
   );
   public static final class00891 uS = N(
      "warped_wall_hanging_sign", var0 -> new class03792(class05904.U, var0), N(uq, true).N(class04689.Ni).U().N(class08089.field_12651).y().u(1.0F)
   );
   public static final class00891 ux = N(
      "bamboo_wall_hanging_sign", var0 -> new class03792(class05904.W, var0), N(uV, true).N(class04689.j).U().N(class08089.field_12651).y().u(1.0F).Z()
   );
   public static final class00891 uD = N("lever", class07127::new, class01362.N().y().u(0.5F).N(class07752.R).N(class04641.field_15971));
   public static final class00891 uh = N(
      "stone_pressure_plate",
      var0 -> new class06902(class01960.i, var0),
      class01362.N().N(class04689.E).U().N(class08089.field_12653).y().u(0.5F).N(class04641.field_15971)
   );
   public static final class00891 ur = N(
      "iron_door", var0 -> new class07196(class01960.y, var0), class01362.N().N(class04689.M).u(5.0F).L().N(class04641.field_15971)
   );
   public static final class00891 iN = N(
      "oak_pressure_plate",
      var0 -> new class06902(class01960.M, var0),
      class01362.N().N(m.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iy = N(
      "spruce_pressure_plate",
      var0 -> new class06902(class01960.B, var0),
      class01362.N().N(P.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iL = N(
      "birch_pressure_plate",
      var0 -> new class06902(class01960.Z, var0),
      class01362.N().N(s.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iu = N(
      "jungle_pressure_plate",
      var0 -> new class06902(class01960.E, var0),
      class01362.N().N(T.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 ii = N(
      "acacia_pressure_plate",
      var0 -> new class06902(class01960.z, var0),
      class01362.N().N(b.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iR = N(
      "cherry_pressure_plate",
      var0 -> new class06902(class01960.U, var0),
      class01362.N().N(j.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iM = N(
      "dark_oak_pressure_plate",
      var0 -> new class06902(class01960.W, var0),
      class01362.N().N(v.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iB = N(
      "pale_oak_pressure_plate",
      var0 -> new class06902(class01960.m, var0),
      class01362.N().N(t.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iZ = N(
      "mangrove_pressure_plate",
      var0 -> new class06902(class01960.T, var0),
      class01362.N().N(G.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iz = N(
      "bamboo_pressure_plate",
      var0 -> new class06902(class01960.b, var0),
      class01362.N().N(l.k()).U().N(class08089.field_12651).y().u(0.5F).Z().N(class04641.field_15971)
   );
   public static final class00891 iU = N(
      "redstone_ore", class06888::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().i().N(N(9)).N(3.0F, 3.0F)
   );
   public static final class00891 iE = N("deepslate_redstone_ore", class06888::new, class01362.y(iU).N(class04689.NB).N(4.5F, 3.0F).N(class07752.No));
   public static final class00891 iW = N("redstone_torch", class06896::new, class01362.N().y().u().N(N(7)).N(class07752.y).N(class04641.field_15971));
   public static final class00891 im = N("redstone_wall_torch", class06882::new, N(iW, true).y().u().N(N(7)).N(class07752.y).N(class04641.field_15971));
   public static final class00891 iP = N("stone_button", var0 -> new class00889(class01960.i, 20, var0), N());
   public static final class00891 is = N(
      "snow",
      class06999::new,
      class01362.N().N(class04689.Z).s().E().i().u(0.1F).m().N(class07752.U).L((var0, var1x, var2x) -> var0.L(class06999.L) >= 8).N(class04641.field_15971)
   );
   public static final class00891 iT = N(
      "ice",
      class07133::new,
      class01362.N().N(class04689.R).N(0.98F).i().u(0.5F).N(class07752.B).L().N((var0, var1x, var2x, var3x) -> var3x == class07078.yL).N_9(class00869::y)
   );
   public static final class00891 ib = N("snow_block", class01362.N().N(class04689.Z).m().u(0.2F).N(class07752.U));
   public static final class00891 ij = N("cactus", class00882::new, class01362.N().N(class04689.B).i().u(0.4F).N(class07752.Z).N(class04641.field_15971));
   public static final class00891 iv = N(
      "cactus_flower", class08425::new, class01362.N().N(class04689.n).y().u().Z().N(class07752.Ns).N(class04641.field_15971)
   );
   public static final class00891 in = N("clay", class01362.N().N(class04689.z).N(class08089.field_12650).u(0.6F).N(class07752.L));
   public static final class00891 it = N("sugar_cane", class07710::new, class01362.N().N(class04689.B).y().i().u().N(class07752.u).N(class04641.field_15971));
   public static final class00891 iG = N("jukebox", class07122::new, class01362.N().N(class04689.U).N(class08089.field_12651).N(2.0F, 6.0F).N(class07752.y).Z());
   public static final class00891 il = N("oak_fence", class00730::new, class01362.N().N(m.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 id = N("netherrack", class06021::new, class01362.N().N(class04689.K).N(class08089.field_12653).m().u(0.4F).N(class07752.H));
   public static final class00891 iw = N(
      "soul_sand",
      class07022::new,
      class01362.N()
         .N(class04689.k)
         .N(class08089.field_18285)
         .u(0.5F)
         .y(0.4F)
         .N(class07752.q)
         .N(class00869::y)
         .N_9(class00869::N)
         .L(class00869::N)
         .y(class00869::N)
   );
   public static final class00891 ik = N("soul_soil", class01362.N().N(class04689.k).u(0.5F).N(class07752.K));
   public static final class00891 iY = N("basalt", class07004::new, class01362.N().N(class04689.O).N(class08089.field_12653).m().N(1.25F, 4.2F).N(class07752.V));
   public static final class00891 iQ = N(
      "polished_basalt", class07004::new, class01362.N().N(class04689.O).N(class08089.field_12653).m().N(1.25F, 4.2F).N(class07752.V)
   );
   public static final class00891 iO = N(
      "soul_torch", var0 -> new class00670(class07107.X, var0), class01362.N().y().u().N(var0 -> 10).N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 ig = N(
      "soul_wall_torch", var0 -> new class00651(class07107.X, var0), N(iO, true).y().u().N(var0 -> 10).N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 iI = N(
      "copper_torch", var0 -> new class00670(class07107.R, var0), class01362.N().y().u().N(var0 -> 14).N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 iJ = N(
      "copper_wall_torch", var0 -> new class00651(class07107.R, var0), N(iI, true).y().u().N(var0 -> 14).N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 io = N(
      "glowstone", class01362.N().N(class04689.L).N(class08089.field_18289).u(0.3F).N(class07752.B).N(var0 -> 15).N_9(class00869::y)
   );
   public static final class00891 iq = N(
      "nether_portal", class07136::new, class01362.N().y().i().u(-1.0F).N(class07752.B).N(var0 -> 11).N(class04641.field_15972)
   );
   public static final class00891 iK = N(
      "carved_pumpkin", class00885::new, class01362.N().N(class04689.s).u(1.0F).N(class07752.y).N(class00869::y).N(class04641.field_15971)
   );
   public static final class00891 iV = N(
      "jack_o_lantern", class00885::new, class01362.N().N(class04689.s).u(1.0F).N(class07752.y).N(var0 -> 15).N(class00869::y).N(class04641.field_15971)
   );
   public static final class00891 ie = N("cake", class00868::new, class01362.N().U().u(0.5F).N(class07752.Z).N(class04641.field_15971));
   public static final class00891 iH = N("repeater", class06859::new, class01362.N().u().N(class07752.R).N(class04641.field_15971));
   public static final class00891 ic = y("white_stained_glass", class06563.field_7952);
   public static final class00891 iX = y("orange_stained_glass", class06563.field_7946);
   public static final class00891 ia = y("magenta_stained_glass", class06563.field_7958);
   public static final class00891 ip = y("light_blue_stained_glass", class06563.field_7951);
   public static final class00891 iF = y("yellow_stained_glass", class06563.field_7947);
   public static final class00891 iA = y("lime_stained_glass", class06563.field_7961);
   public static final class00891 f_if__1 = y("pink_stained_glass", class06563.field_7954);
   public static final class00891 iC = y("gray_stained_glass", class06563.field_7944);
   public static final class00891 iS = y("light_gray_stained_glass", class06563.field_7967);
   public static final class00891 ix = y("cyan_stained_glass", class06563.field_7955);
   public static final class00891 iD = y("purple_stained_glass", class06563.field_7945);
   public static final class00891 ih = y("blue_stained_glass", class06563.field_7966);
   public static final class00891 ir = y("brown_stained_glass", class06563.field_7957);
   public static final class00891 RN = y("green_stained_glass", class06563.field_7942);
   public static final class00891 Ry = y("red_stained_glass", class06563.field_7964);
   public static final class00891 RL = y("black_stained_glass", class06563.field_7963);
   public static final class00891 Ru = N(
      "oak_trapdoor", var0 -> new class00624(class01960.M, var0), class01362.N().N(class04689.m).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 Ri = N(
      "spruce_trapdoor", var0 -> new class00624(class01960.B, var0), class01362.N().N(class04689.q).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 RR = N(
      "birch_trapdoor", var0 -> new class00624(class01960.Z, var0), class01362.N().N(class04689.L).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 RM = N(
      "jungle_trapdoor", var0 -> new class00624(class01960.E, var0), class01362.N().N(class04689.U).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 RB = N(
      "acacia_trapdoor", var0 -> new class00624(class01960.z, var0), class01362.N().N(class04689.s).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 RZ = N(
      "cherry_trapdoor", var0 -> new class00624(class01960.U, var0), class01362.N().N(class04689.V).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 Rz = N(
      "dark_oak_trapdoor",
      var0 -> new class00624(class01960.W, var0),
      class01362.N().N(class04689.k).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 RU = N(
      "pale_oak_trapdoor", var0 -> new class00624(class01960.m, var0), class01362.N().N(t.k()).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 RE = N(
      "mangrove_trapdoor",
      var0 -> new class00624(class01960.T, var0),
      class01362.N().N(class04689.Q).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 RW = N(
      "bamboo_trapdoor", var0 -> new class00624(class01960.b, var0), class01362.N().N(class04689.j).N(class08089.field_12651).u(3.0F).L().N(class00869::N).Z()
   );
   public static final class00891 Rm = N("stone_bricks", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 RP = N("mossy_stone_bricks", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 Rs = N("cracked_stone_bricks", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 RT = N("chiseled_stone_bricks", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 Rb = N("packed_mud", class01362.y(z).N(1.0F, 3.0F).N(class07752.NF));
   public static final class00891 Rj = N("mud_bricks", class01362.N().N(class04689.A).N(class08089.field_12653).m().N(1.5F, 3.0F).N(class07752.Np));
   public static final class00891 Rv = N("infested_stone", var0 -> new class07137(y, var0), class01362.N().N(class04689.z));
   public static final class00891 Rn = N("infested_cobblestone", var0 -> new class07137(W, var0), class01362.N().N(class04689.z));
   public static final class00891 Rt = N("infested_stone_bricks", var0 -> new class07137(Rm, var0), class01362.N().N(class04689.z));
   public static final class00891 RG = N("infested_mossy_stone_bricks", var0 -> new class07137(RP, var0), class01362.N().N(class04689.z));
   public static final class00891 Rl = N("infested_cracked_stone_bricks", var0 -> new class07137(Rs, var0), class01362.N().N(class04689.z));
   public static final class00891 Rd = N("infested_chiseled_stone_bricks", var0 -> new class07137(RT, var0), class01362.N().N(class04689.z));
   public static final class00891 Rw = N(
      "brown_mushroom_block", class00746::new, class01362.N().N(class04689.U).N(class08089.field_12651).u(0.2F).N(class07752.y).Z()
   );
   public static final class00891 Rk = N(
      "red_mushroom_block", class00746::new, class01362.N().N(class04689.Q).N(class08089.field_12651).u(0.2F).N(class07752.y).Z()
   );
   public static final class00891 RY = N("mushroom_stem", class00746::new, class01362.N().N(class04689.u).N(class08089.field_12651).u(0.2F).N(class07752.y).Z());
   public static final class00891 RQ = N("iron_bars", class07100::new, class01362.N().m().N(5.0F, 6.0F).N(class07752.yb).L());
   public static final class00948 RO = class00948.N(
      "copper_bars", class00869::N, class07100::new, class08139::new, var0 -> class01362.N().m().N(5.0F, 6.0F).N(class07752.Nz).L()
   );
   public static final class00891 Rg = N("iron_chain", class05050::new, class01362.N().U().m().N(5.0F, 6.0F).N(class07752.C).L());
   public static final class00948 RI = class00948.N(
      "copper_chain", class00869::N, class05050::new, class00919::new, var0 -> class01362.N().U().m().N(5.0F, 6.0F).N(class07752.C).L()
   );
   public static final class00891 RJ = N("glass_pane", class07100::new, class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L());
   public static final class00891 Ro = N(
      class03712.N, class06885::new, class01362.N().N(class04689.s).N(class08089.field_18286).u(1.0F).N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 Rq = N(class03712.u, class01362.N().N(class04689.v).u(1.0F).N(class07752.y).N(class04641.field_15971));
   public static final class00891 RK = N(
      class03712.L,
      var0 -> new class07660(class03712.y, class03712.N, class03733.N, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 RV = N(
      class03712.R,
      var0 -> new class07660(class03712.i, class03712.u, class03733.y, var0),
      class01362.N().N(class04689.B).y().u().N(class07752.y).N(class04641.field_15971)
   );
   public static final class00891 Re = N(
      class03712.y,
      var0 -> new class07728(class03712.N, class03712.L, class03733.N, var0),
      class01362.N().N(class04689.B).y().i().u().N(class07752.l).N(class04641.field_15971)
   );
   public static final class00891 RH = N(
      class03712.i,
      var0 -> new class07728(class03712.u, class03712.R, class03733.y, var0),
      class01362.N().N(class04689.B).y().i().u().N(class07752.l).N(class04641.field_15971)
   );
   public static final class00891 Rc = N(
      "vine", class00659::new, class01362.N().N(class04689.B).s().y().i().u(0.2F).N(class07752.d).Z().N(class04641.field_15971)
   );
   public static final class00891 RX = N(
      "glow_lichen", class05580::new, class01362.N().N(class04689.Nz).s().y().u(0.2F).N(class07752.NJ).N(class05580.y(7)).Z().N(class04641.field_15971)
   );
   public static final class00891 Ra = N("resin_clump", class05543::new, class01362.N().N(class04689.e).s().y().N(class07752.ys).Z().N(class04641.field_15971));
   public static final class00891 Rp = N(
      "oak_fence_gate", var0 -> new class07188(class05904.y, var0), class01362.N().N(m.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 RF = N("brick_stairs", Lv);
   public static final class00891 RA = N("stone_brick_stairs", Rm);
   public static final class00891 Rf = N("mud_brick_stairs", Rj);
   public static final class00891 RC = N("mycelium", class07093::new, class01362.N().N(class04689.d).i().u(0.6F).N(class07752.u));
   public static final class00891 RS = N("lily_pad", class00643::new, class01362.N().N(class04689.B).u().N(class07752.i).L().N(class04641.field_15971));
   public static final class00891 Rx = N("resin_block", class01362.N().N(class04689.e).N(class08089.field_12653).N(class07752.ys));
   public static final class00891 RD = N("resin_bricks", class01362.N().N(class04689.e).N(class08089.field_12653).m().N(class07752.yT).N(1.5F, 6.0F));
   public static final class00891 Rh = N("resin_brick_stairs", RD);
   public static final class00891 Rr = N(
      "resin_brick_slab", var0 -> new class07007(var0), class01362.N().N(class04689.e).N(class08089.field_12653).m().N(class07752.yT).N(1.5F, 6.0F)
   );
   public static final class00891 MN = N(
      "resin_brick_wall", var0 -> new class00650(var0), class01362.N().N(class04689.e).N(class08089.field_12653).m().N(class07752.yT).N(1.5F, 6.0F)
   );
   public static final class00891 My = N("chiseled_resin_bricks", class01362.N().N(class04689.e).N(class08089.field_12653).m().N(class07752.yT).N(1.5F, 6.0F));
   public static final class00891 ML = N("nether_bricks", class01362.N().N(class04689.K).N(class08089.field_12653).m().N(2.0F, 6.0F).N(class07752.c));
   public static final class00891 Mu = N(
      "nether_brick_fence", class00730::new, class01362.N().N(class04689.K).N(class08089.field_12653).m().N(2.0F, 6.0F).N(class07752.c)
   );
   public static final class00891 Mi = N("nether_brick_stairs", ML);
   public static final class00891 MR = N("nether_wart", class07090::new, class01362.N().N(class04689.Q).y().i().N(class07752.w).N(class04641.field_15971));
   public static final class00891 MM = N(
      "enchanting_table", class07203::new, class01362.N().N(class04689.Q).N(class08089.field_12653).m().N(var0 -> 7).N(5.0F, 1200.0F)
   );
   public static final class00891 MB = N("brewing_stand", class00902::new, class01362.N().N(class04689.M).u(0.5F).N(var0 -> 1).L());
   public static final class00891 MZ = N("cauldron", class05476::new, class01362.N().N(class04689.E).m().u(2.0F).L());
   public static final class00891 Mz = N("water_cauldron", var0 -> new class01096(class00801.field_9382, class04823.u, var0), class01362.y(MZ));
   public static final class00891 MU = N("lava_cauldron", class01126::new, class01362.y(MZ).N(var0 -> 15));
   public static final class00891 ME = N("powder_snow_cauldron", var0 -> new class01096(class00801.field_9383, class04823.R, var0), class01362.y(MZ));
   public static final class00891 MW = N(
      "end_portal", class07207::new, class01362.N().N(class04689.O).y().N(var0 -> 15).N(-1.0F, 3600000.0F).M().N(class04641.field_15972)
   );
   public static final class00891 Mm = N(
      "end_portal_frame", class07200::new, class01362.N().N(class04689.Y).N(class08089.field_12653).N(class07752.B).N(var0 -> 1).N(-1.0F, 3600000.0F).M()
   );
   public static final class00891 MP = N("end_stone", class01362.N().N(class04689.L).N(class08089.field_12653).m().N(3.0F, 9.0F));
   public static final class00891 Ms = N("dragon_egg", class07184::new, class01362.N().N(class04689.O).N(3.0F, 9.0F).N(var0 -> 1).L().N(class04641.field_15971));
   public static final class00891 MT = N("redstone_lamp", class06877::new, class01362.N().N(class04689.e).N(N(15)).u(0.3F).N(class07752.B).N(class00869::y));
   public static final class00891 Mb = N(
      "cocoa", class00900::new, class01362.N().N(class04689.B).i().N(0.2F, 3.0F).N(class07752.y).L().N(class04641.field_15971)
   );
   public static final class00891 Mj = N("sandstone_stairs", yL);
   public static final class00891 Mv = N(
      "emerald_ore", var0 -> new class06858(class02135.y(3, 7), var0), class01362.N().N(class04689.E).N(class08089.field_12653).m().N(3.0F, 3.0F)
   );
   public static final class00891 Mn = N(
      "deepslate_emerald_ore", var0 -> new class06858(class02135.y(3, 7), var0), class01362.y(Mv).N(class04689.NB).N(4.5F, 3.0F).N(class07752.No)
   );
   public static final class00891 Mt = N("ender_chest", class07189::new, class01362.N().N(class04689.E).N(class08089.field_12653).N(22.5F, 600.0F).N(var0 -> 7));
   public static final class00891 MG = N("tripwire_hook", class00637::new, class01362.N().y().N(class07752.y).N(class04641.field_15971));
   public static final class00891 Ml = N("tripwire", var0 -> new class00664(MG, var0), class01362.N().y().N(class04641.field_15971));
   public static final class00891 Md = N("emerald_block", class01362.N().N(class04689.o).N(class08089.field_18287).m().N(5.0F, 6.0F).N(class07752.M));
   public static final class00891 Mw = N("spruce_stairs", P);
   public static final class00891 Mk = N("birch_stairs", s);
   public static final class00891 MY = N("jungle_stairs", T);
   public static final class00891 MQ = N("command_block", var0 -> new class06759(false, var0), class01362.N().N(class04689.k).m().N(-1.0F, 3600000.0F).M());
   public static final class00891 MO = N(
      "beacon", class07763::new, class01362.N().N(class04689.I).N(class08089.field_12645).u(3.0F).N(var0 -> 15).L().N_9(class00869::y)
   );
   public static final class00891 Mg = N("cobblestone_wall", class00650::new, class01362.y(W).U());
   public static final class00891 MI = N("mossy_cobblestone_wall", class00650::new, class01362.y(W).U());
   public static final class00891 MJ = N("flower_pot", var0 -> new class00757(N, var0), y());
   public static final class00891 Mo = N("potted_torchflower", var0 -> new class00757(LL, var0), y());
   public static final class00891 Mq = N("potted_oak_sapling", var0 -> new class00757(w, var0), y());
   public static final class00891 MK = N("potted_spruce_sapling", var0 -> new class00757(k, var0), y());
   public static final class00891 MV = N("potted_birch_sapling", var0 -> new class00757(Y, var0), y());
   public static final class00891 Me = N("potted_jungle_sapling", var0 -> new class00757(Q, var0), y());
   public static final class00891 MH = N("potted_acacia_sapling", var0 -> new class00757(O, var0), y());
   public static final class00891 Mc = N("potted_cherry_sapling", var0 -> new class00757(g, var0), y());
   public static final class00891 MX = N("potted_dark_oak_sapling", var0 -> new class00757(I, var0), y());
   public static final class00891 Ma = N("potted_pale_oak_sapling", var0 -> new class00757(J, var0), y());
   public static final class00891 Mp = N("potted_mangrove_propagule", var0 -> new class00757(o, var0), y());
   public static final class00891 MF = N("potted_fern", var0 -> new class00757(yY, var0), y());
   public static final class00891 MA = N("potted_dandelion", var0 -> new class00757(Ly, var0), y());
   public static final class00891 Mf = N("potted_poppy", var0 -> new class00757(Lu, var0), y());
   public static final class00891 MC = N("potted_blue_orchid", var0 -> new class00757(Li, var0), y());
   public static final class00891 MS = N("potted_allium", var0 -> new class00757(LR, var0), y());
   public static final class00891 Mx = N("potted_azure_bluet", var0 -> new class00757(LM, var0), y());
   public static final class00891 MD = N("potted_red_tulip", var0 -> new class00757(LB, var0), y());
   public static final class00891 Mh = N("potted_orange_tulip", var0 -> new class00757(LZ, var0), y());
   public static final class00891 Mr = N("potted_white_tulip", var0 -> new class00757(Lz, var0), y());
   public static final class00891 BN = N("potted_pink_tulip", var0 -> new class00757(LU, var0), y());
   public static final class00891 By = N("potted_oxeye_daisy", var0 -> new class00757(LE, var0), y());
   public static final class00891 BL = N("potted_cornflower", var0 -> new class00757(LW, var0), y());
   public static final class00891 Bu = N("potted_lily_of_the_valley", var0 -> new class00757(LP, var0), y());
   public static final class00891 Bi = N("potted_wither_rose", var0 -> new class00757(Lm, var0), y());
   public static final class00891 BR = N("potted_red_mushroom", var0 -> new class00757(LT, var0), y());
   public static final class00891 BM = N("potted_brown_mushroom", var0 -> new class00757(Ls, var0), y());
   public static final class00891 BB = N("potted_dead_bush", var0 -> new class00757(yQ, var0), y());
   public static final class00891 BZ = N("potted_cactus", var0 -> new class00757(ij, var0), y());
   public static final class00891 Bz = N("carrots", class00899::new, class01362.N().N(class04689.B).y().i().u().N(class07752.G).N(class04641.field_15971));
   public static final class00891 BU = N("potatoes", class06883::new, class01362.N().N(class04689.B).y().i().u().N(class07752.G).N(class04641.field_15971));
   public static final class00891 BE = N("oak_button", var0 -> new class00889(class01960.M, 30, var0), N());
   public static final class00891 BW = N("spruce_button", var0 -> new class00889(class01960.B, 30, var0), N());
   public static final class00891 Bm = N("birch_button", var0 -> new class00889(class01960.Z, 30, var0), N());
   public static final class00891 BP = N("jungle_button", var0 -> new class00889(class01960.E, 30, var0), N());
   public static final class00891 Bs = N("acacia_button", var0 -> new class00889(class01960.z, 30, var0), N());
   public static final class00891 BT = N("cherry_button", var0 -> new class00889(class01960.U, 30, var0), N());
   public static final class00891 Bb = N("dark_oak_button", var0 -> new class00889(class01960.W, 30, var0), N());
   public static final class00891 Bj = N("pale_oak_button", var0 -> new class00889(class01960.m, 30, var0), N());
   public static final class00891 Bv = N("mangrove_button", var0 -> new class00889(class01960.T, 30, var0), N());
   public static final class00891 Bn = N("bamboo_button", var0 -> new class00889(class01960.b, 30, var0), N());
   public static final class00891 Bt = N(
      "skeleton_skull", var0 -> new class07000(class07032.field_11512, var0), class01362.N().N(class08089.field_41325).u(1.0F).N(class04641.field_15971).L()
   );
   public static final class00891 BG = N(
      "skeleton_wall_skull", var0 -> new class00653(class07032.field_11512, var0), N(Bt, true).u(1.0F).N(class04641.field_15971)
   );
   public static final class00891 Bl = N(
      "wither_skeleton_skull", class00399::new, class01362.N().N(class08089.field_41328).u(1.0F).N(class04641.field_15971).L()
   );
   public static final class00891 Bd = N("wither_skeleton_wall_skull", class00409::new, N(Bl, true).u(1.0F).N(class04641.field_15971));
   public static final class00891 Bw = N(
      "zombie_head", var0 -> new class07000(class07032.field_11508, var0), class01362.N().N(class08089.field_41324).u(1.0F).N(class04641.field_15971).L()
   );
   public static final class00891 Bk = N(
      "zombie_wall_head", var0 -> new class00653(class07032.field_11508, var0), N(Bw, true).u(1.0F).N(class04641.field_15971)
   );
   public static final class00891 BY = N("player_head", class06861::new, class01362.N().N(class08089.field_41604).u(1.0F).N(class04641.field_15971).L());
   public static final class00891 BQ = N("player_wall_head", class06906::new, N(BY, true).u(1.0F).N(class04641.field_15971));
   public static final class00891 BO = N(
      "creeper_head", var0 -> new class07000(class07032.field_11507, var0), class01362.N().N(class08089.field_41326).u(1.0F).N(class04641.field_15971).L()
   );
   public static final class00891 Bg = N(
      "creeper_wall_head", var0 -> new class00653(class07032.field_11507, var0), N(BO, true).u(1.0F).N(class04641.field_15971)
   );
   public static final class00891 BI = N(
      "dragon_head", var0 -> new class07000(class07032.field_11511, var0), class01362.N().N(class08089.field_41327).u(1.0F).N(class04641.field_15971).L()
   );
   public static final class00891 BJ = N(
      "dragon_wall_head", var0 -> new class00653(class07032.field_11511, var0), N(BI, true).u(1.0F).N(class04641.field_15971)
   );
   public static final class00891 Bo = N(
      "piglin_head", var0 -> new class07000(class07032.field_41313, var0), class01362.N().N(class08089.field_41329).u(1.0F).N(class04641.field_15971).L()
   );
   public static final class00891 Bq = N("piglin_wall_head", class04202::new, N(Bo, true).u(1.0F).N(class04641.field_15971));
   public static final class00891 BK = N(
      "anvil", class07804::new, class01362.N().N(class04689.M).m().N(5.0F, 1200.0F).N(class07752.m).N(class04641.field_15972)
   );
   public static final class00891 BV = N(
      "chipped_anvil", class07804::new, class01362.N().N(class04689.M).m().N(5.0F, 1200.0F).N(class07752.m).N(class04641.field_15972)
   );
   public static final class00891 Be = N(
      "damaged_anvil", class07804::new, class01362.N().N(class04689.M).m().N(5.0F, 1200.0F).N(class07752.m).N(class04641.field_15972)
   );
   public static final class00891 BH = N("trapped_chest", class00639::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z());
   public static final class00891 Bc = N(
      "light_weighted_pressure_plate", var0 -> new class00644(15, class01960.u, var0), class01362.N().N(class04689.g).U().y().u(0.5F).N(class04641.field_15971)
   );
   public static final class00891 BX = N(
      "heavy_weighted_pressure_plate",
      var0 -> new class00644(150, class01960.y, var0),
      class01362.N().N(class04689.M).U().y().u(0.5F).N(class04641.field_15971)
   );
   public static final class00891 Ba = N("comparator", class06775::new, class01362.N().u().N(class07752.R).N(class04641.field_15971));
   public static final class00891 Bp = N(
      "daylight_detector", class06768::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(0.2F).N(class07752.y).Z()
   );
   public static final class00891 BF = N("redstone_block", class06878::new, class01362.N().N(class04689.i).m().N(5.0F, 6.0F).N(class07752.M).N_9(class00869::y));
   public static final class00891 BA = N(
      "nether_quartz_ore",
      var0 -> new class06858(class02135.y(2, 5), var0),
      class01362.N().N(class04689.K).N(class08089.field_12653).m().N(3.0F, 3.0F).N(class07752.a)
   );
   public static final class00891 Bf = N("hopper", class00739::new, class01362.N().N(class04689.E).m().N(3.0F, 4.8F).N(class07752.M).L());
   public static final class00891 BC = N("quartz_block", class01362.N().N(class04689.P).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 BS = N("chiseled_quartz_block", class01362.N().N(class04689.P).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 Bx = N("quartz_pillar", class07004::new, class01362.N().N(class04689.P).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 BD = N("quartz_stairs", BC);
   public static final class00891 Bh = N("activator_rail", class06900::new, class01362.N().y().u(0.7F).N(class07752.M));
   public static final class00891 Br = N("dropper", class07194::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().u(3.5F));
   public static final class00891 ZN = N("white_terracotta", class01362.N().N(class04689.V).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 Zy = N("orange_terracotta", class01362.N().N(class04689.e).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZL = N("magenta_terracotta", class01362.N().N(class04689.H).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 Zu = N("light_blue_terracotta", class01362.N().N(class04689.c).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 Zi = N("yellow_terracotta", class01362.N().N(class04689.X).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZR = N("lime_terracotta", class01362.N().N(class04689.a).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZM = N("pink_terracotta", class01362.N().N(class04689.p).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZB = N("gray_terracotta", class01362.N().N(class04689.F).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZZ = N("light_gray_terracotta", class01362.N().N(class04689.A).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 Zz = N("cyan_terracotta", class01362.N().N(class04689.f).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZU = N("purple_terracotta", class01362.N().N(class04689.C).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZE = N("blue_terracotta", class01362.N().N(class04689.S).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZW = N("brown_terracotta", class01362.N().N(class04689.x).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 Zm = N("green_terracotta", class01362.N().N(class04689.D).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZP = N("red_terracotta", class01362.N().N(class04689.h).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 Zs = N("black_terracotta", class01362.N().N(class04689.r).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 ZT = N(
      "white_stained_glass_pane", var0 -> new class07750(class06563.field_7952, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zb = N(
      "orange_stained_glass_pane", var0 -> new class07750(class06563.field_7946, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zj = N(
      "magenta_stained_glass_pane", var0 -> new class07750(class06563.field_7958, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zv = N(
      "light_blue_stained_glass_pane",
      var0 -> new class07750(class06563.field_7951, var0),
      class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zn = N(
      "yellow_stained_glass_pane", var0 -> new class07750(class06563.field_7947, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zt = N(
      "lime_stained_glass_pane", var0 -> new class07750(class06563.field_7961, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 ZG = N(
      "pink_stained_glass_pane", var0 -> new class07750(class06563.field_7954, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zl = N(
      "gray_stained_glass_pane", var0 -> new class07750(class06563.field_7944, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zd = N(
      "light_gray_stained_glass_pane",
      var0 -> new class07750(class06563.field_7967, var0),
      class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zw = N(
      "cyan_stained_glass_pane", var0 -> new class07750(class06563.field_7955, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zk = N(
      "purple_stained_glass_pane", var0 -> new class07750(class06563.field_7945, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 ZY = N(
      "blue_stained_glass_pane", var0 -> new class07750(class06563.field_7966, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 ZQ = N(
      "brown_stained_glass_pane", var0 -> new class07750(class06563.field_7957, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 ZO = N(
      "green_stained_glass_pane", var0 -> new class07750(class06563.field_7942, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 Zg = N(
      "red_stained_glass_pane", var0 -> new class07750(class06563.field_7964, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 ZI = N(
      "black_stained_glass_pane", var0 -> new class07750(class06563.field_7963, var0), class01362.N().N(class08089.field_12645).u(0.3F).N(class07752.B).L()
   );
   public static final class00891 ZJ = N("acacia_stairs", b);
   public static final class00891 Zo = N("cherry_stairs", j);
   public static final class00891 Zq = N("dark_oak_stairs", v);
   public static final class00891 ZK = N("pale_oak_stairs", t);
   public static final class00891 ZV = N("mangrove_stairs", G);
   public static final class00891 Ze = N("bamboo_stairs", l);
   public static final class00891 ZH = N("bamboo_mosaic_stairs", d);
   public static final class00891 Zc = N("slime_block", class07031::new, class01362.N().N(class04689.y).N(0.8F).N(class07752.P).L());
   public static final class00891 ZX = N(
      "barrier", class07801::new, class01362.N().N(-1.0F, 3600000.8F).N_25(y(class04689.N)).M().L().N(class00869::N).P().N(class04641.field_15972)
   );
   public static final class00891 Za = N("light", class04392::new, class01362.N().s().N(-1.0F, 3600000.8F).N_25(y(class04689.N)).M().L().N(class04392.i));
   public static final class00891 Zp = N(
      "iron_trapdoor", var0 -> new class00624(class01960.y, var0), class01362.N().N(class04689.M).m().u(5.0F).L().N(class00869::N)
   );
   public static final class00891 ZF = N("prismarine", class01362.N().N(class04689.l).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 ZA = N("prismarine_bricks", class01362.N().N(class04689.I).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 Zf = N("dark_prismarine", class01362.N().N(class04689.I).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 ZC = N("prismarine_stairs", ZF);
   public static final class00891 ZS = N("prismarine_brick_stairs", ZA);
   public static final class00891 Zx = N("dark_prismarine_stairs", Zf);
   public static final class00891 ZD = N("prismarine_slab", class07007::new, class01362.N().N(class04689.l).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 Zh = N("prismarine_brick_slab", class07007::new, class01362.N().N(class04689.I).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 Zr = N("dark_prismarine_slab", class07007::new, class01362.N().N(class04689.I).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 zN = N(
      "sea_lantern", class01362.N().N(class04689.P).N(class08089.field_12645).u(0.3F).N(class07752.B).N(var0 -> 15).N_9(class00869::y)
   );
   public static final class00891 zy = N("hay_block", class00723::new, class01362.N().N(class04689.j).N(class08089.field_18288).u(0.5F).N(class07752.u));
   public static final class00891 zL = N(
      "white_carpet", var0 -> new class06056(class06563.field_7952, var0), class01362.N().N(class04689.Z).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zu = N(
      "orange_carpet", var0 -> new class06056(class06563.field_7946, var0), class01362.N().N(class04689.s).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zi = N(
      "magenta_carpet", var0 -> new class06056(class06563.field_7958, var0), class01362.N().N(class04689.T).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zR = N(
      "light_blue_carpet", var0 -> new class06056(class06563.field_7951, var0), class01362.N().N(class04689.b).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zM = N(
      "yellow_carpet", var0 -> new class06056(class06563.field_7947, var0), class01362.N().N(class04689.j).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zB = N(
      "lime_carpet", var0 -> new class06056(class06563.field_7961, var0), class01362.N().N(class04689.v).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zZ = N(
      "pink_carpet", var0 -> new class06056(class06563.field_7954, var0), class01362.N().N(class04689.n).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zz = N(
      "gray_carpet", var0 -> new class06056(class06563.field_7944, var0), class01362.N().N(class04689.t).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zU = N(
      "light_gray_carpet", var0 -> new class06056(class06563.field_7967, var0), class01362.N().N(class04689.G).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zE = N(
      "cyan_carpet", var0 -> new class06056(class06563.field_7955, var0), class01362.N().N(class04689.l).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zW = N(
      "purple_carpet", var0 -> new class06056(class06563.field_7945, var0), class01362.N().N(class04689.d).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zm = N(
      "blue_carpet", var0 -> new class06056(class06563.field_7966, var0), class01362.N().N(class04689.w).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zP = N(
      "brown_carpet", var0 -> new class06056(class06563.field_7957, var0), class01362.N().N(class04689.k).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zs = N(
      "green_carpet", var0 -> new class06056(class06563.field_7942, var0), class01362.N().N(class04689.Y).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zT = N(
      "red_carpet", var0 -> new class06056(class06563.field_7964, var0), class01362.N().N(class04689.Q).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zb = N(
      "black_carpet", var0 -> new class06056(class06563.field_7963, var0), class01362.N().N(class04689.O).u(0.1F).N(class07752.Z).Z()
   );
   public static final class00891 zj = N("terracotta", class01362.N().N(class04689.s).N(class08089.field_12653).m().N(1.25F, 4.2F));
   public static final class00891 zv = N("coal_block", class01362.N().N(class04689.O).N(class08089.field_12653).m().N(5.0F, 6.0F));
   public static final class00891 zn = N("packed_ice", class01362.N().N(class04689.R).N(class08089.field_12647).N(0.98F).u(0.5F).N(class07752.B));
   public static final class00891 zt = N(
      "sunflower", class07725::new, class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 zG = N(
      "lilac", class07725::new, class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 zl = N(
      "rose_bush", class07725::new, class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 zd = N(
      "peony", class07725::new, class01362.N().N(class04689.B).y().u().N(class07752.u).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 zw = N(
      "tall_grass", class06761::new, class01362.N().N(class04689.B).s().y().u().N(class07752.u).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 zk = N(
      "large_fern", class06761::new, class01362.N().N(class04689.B).s().y().u().N(class07752.u).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 zY = N(
      "white_banner",
      var0 -> new class07800(class06563.field_7952, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zQ = N(
      "orange_banner",
      var0 -> new class07800(class06563.field_7946, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zO = N(
      "magenta_banner",
      var0 -> new class07800(class06563.field_7958, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zg = N(
      "light_blue_banner",
      var0 -> new class07800(class06563.field_7951, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zI = N(
      "yellow_banner",
      var0 -> new class07800(class06563.field_7947, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zJ = N(
      "lime_banner",
      var0 -> new class07800(class06563.field_7961, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zo = N(
      "pink_banner",
      var0 -> new class07800(class06563.field_7954, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zq = N(
      "gray_banner",
      var0 -> new class07800(class06563.field_7944, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zK = N(
      "light_gray_banner",
      var0 -> new class07800(class06563.field_7967, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zV = N(
      "cyan_banner",
      var0 -> new class07800(class06563.field_7955, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 ze = N(
      "purple_banner",
      var0 -> new class07800(class06563.field_7945, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zH = N(
      "blue_banner",
      var0 -> new class07800(class06563.field_7966, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zc = N(
      "brown_banner",
      var0 -> new class07800(class06563.field_7957, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zX = N(
      "green_banner",
      var0 -> new class07800(class06563.field_7942, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 za = N(
      "red_banner",
      var0 -> new class07800(class06563.field_7964, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zp = N(
      "black_banner",
      var0 -> new class07800(class06563.field_7963, var0),
      class01362.N().N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zF = N(
      "white_wall_banner",
      var0 -> new class00645(class06563.field_7952, var0),
      N(zY, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zA = N(
      "orange_wall_banner",
      var0 -> new class00645(class06563.field_7946, var0),
      N(zQ, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zf = N(
      "magenta_wall_banner",
      var0 -> new class00645(class06563.field_7958, var0),
      N(zO, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zC = N(
      "light_blue_wall_banner",
      var0 -> new class00645(class06563.field_7951, var0),
      N(zg, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zS = N(
      "yellow_wall_banner",
      var0 -> new class00645(class06563.field_7947, var0),
      N(zI, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zx = N(
      "lime_wall_banner",
      var0 -> new class00645(class06563.field_7961, var0),
      N(zJ, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zD = N(
      "pink_wall_banner",
      var0 -> new class00645(class06563.field_7954, var0),
      N(zo, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zh = N(
      "gray_wall_banner",
      var0 -> new class00645(class06563.field_7944, var0),
      N(zq, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 zr = N(
      "light_gray_wall_banner",
      var0 -> new class00645(class06563.field_7967, var0),
      N(zK, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 UN = N(
      "cyan_wall_banner",
      var0 -> new class00645(class06563.field_7955, var0),
      N(zV, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 Uy = N(
      "purple_wall_banner",
      var0 -> new class00645(class06563.field_7945, var0),
      N(ze, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 UL = N(
      "blue_wall_banner",
      var0 -> new class00645(class06563.field_7966, var0),
      N(zH, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 Uu = N(
      "brown_wall_banner",
      var0 -> new class00645(class06563.field_7957, var0),
      N(zc, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 Ui = N(
      "green_wall_banner",
      var0 -> new class00645(class06563.field_7942, var0),
      N(zX, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 UR = N(
      "red_wall_banner",
      var0 -> new class00645(class06563.field_7964, var0),
      N(za, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 UM = N(
      "black_wall_banner",
      var0 -> new class00645(class06563.field_7963, var0),
      N(zp, true).N(class04689.m).U().N(class08089.field_12651).y().u(1.0F).N(class07752.y).Z()
   );
   public static final class00891 UB = N("red_sandstone", class01362.N().N(class04689.s).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 UZ = N("chiseled_red_sandstone", class01362.N().N(class04689.s).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 Uz = N("cut_red_sandstone", class01362.N().N(class04689.s).N(class08089.field_12653).m().u(0.8F));
   public static final class00891 UU = N("red_sandstone_stairs", UB);
   public static final class00891 UE = N(
      "oak_slab", class07007::new, class01362.N().N(class04689.m).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z()
   );
   public static final class00891 UW = N(
      "spruce_slab", class07007::new, class01362.N().N(class04689.q).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z()
   );
   public static final class00891 Um = N(
      "birch_slab", class07007::new, class01362.N().N(class04689.L).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z()
   );
   public static final class00891 UP = N(
      "jungle_slab", class07007::new, class01362.N().N(class04689.U).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z()
   );
   public static final class00891 Us = N(
      "acacia_slab", class07007::new, class01362.N().N(class04689.s).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z()
   );
   public static final class00891 UT = N(
      "cherry_slab", class07007::new, class01362.N().N(class04689.V).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.ND).Z()
   );
   public static final class00891 Ub = N(
      "dark_oak_slab", class07007::new, class01362.N().N(class04689.k).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z()
   );
   public static final class00891 Uj = N("pale_oak_slab", class07007::new, class01362.N().N(t.k()).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z());
   public static final class00891 Uv = N(
      "mangrove_slab", class07007::new, class01362.N().N(class04689.Q).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.y).Z()
   );
   public static final class00891 Un = N(
      "bamboo_slab", class07007::new, class01362.N().N(class04689.j).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.NS).Z()
   );
   public static final class00891 Ut = N(
      "bamboo_mosaic_slab", class07007::new, class01362.N().N(class04689.j).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.NS).Z()
   );
   public static final class00891 UG = N("stone_slab", class07007::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Ul = N("smooth_stone_slab", class07007::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Ud = N("sandstone_slab", class07007::new, class01362.N().N(class04689.L).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Uw = N("cut_sandstone_slab", class07007::new, class01362.N().N(class04689.L).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Uk = N("petrified_oak_slab", class07007::new, class01362.N().N(class04689.m).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 UY = N("cobblestone_slab", class07007::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 UQ = N("brick_slab", class07007::new, class01362.N().N(class04689.Q).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 UO = N("stone_brick_slab", class07007::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Ug = N(
      "mud_brick_slab", class07007::new, class01362.N().N(class04689.A).N(class08089.field_12653).m().N(1.5F, 3.0F).N(class07752.Np)
   );
   public static final class00891 UI = N(
      "nether_brick_slab", class07007::new, class01362.N().N(class04689.K).N(class08089.field_12653).m().N(2.0F, 6.0F).N(class07752.c)
   );
   public static final class00891 UJ = N("quartz_slab", class07007::new, class01362.N().N(class04689.P).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Uo = N("red_sandstone_slab", class07007::new, class01362.N().N(class04689.s).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Uq = N("cut_red_sandstone_slab", class07007::new, class01362.N().N(class04689.s).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 UK = N("purpur_slab", class07007::new, class01362.N().N(class04689.T).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 UV = N("smooth_stone", class01362.N().N(class04689.E).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Ue = N("smooth_sandstone", class01362.N().N(class04689.L).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 UH = N("smooth_quartz", class01362.N().N(class04689.P).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 Uc = N("smooth_red_sandstone", class01362.N().N(class04689.s).N(class08089.field_12653).m().N(2.0F, 6.0F));
   public static final class00891 UX = N(
      "spruce_fence_gate", var0 -> new class07188(class05904.L, var0), class01362.N().N(P.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 Ua = N(
      "birch_fence_gate", var0 -> new class07188(class05904.u, var0), class01362.N().N(s.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 Up = N(
      "jungle_fence_gate", var0 -> new class07188(class05904.M, var0), class01362.N().N(T.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 UF = N(
      "acacia_fence_gate", var0 -> new class07188(class05904.i, var0), class01362.N().N(b.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 UA = N(
      "cherry_fence_gate", var0 -> new class07188(class05904.R, var0), class01362.N().N(j.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 Uf = N(
      "dark_oak_fence_gate", var0 -> new class07188(class05904.B, var0), class01362.N().N(v.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 UC = N(
      "pale_oak_fence_gate", var0 -> new class07188(class05904.Z, var0), class01362.N().N(t.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 US = N(
      "mangrove_fence_gate", var0 -> new class07188(class05904.E, var0), class01362.N().N(G.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 Ux = N(
      "bamboo_fence_gate", var0 -> new class07188(class05904.W, var0), class01362.N().N(l.k()).U().N(class08089.field_12651).N(2.0F, 3.0F).Z()
   );
   public static final class00891 UD = N("spruce_fence", class00730::new, class01362.N().N(P.k()).N(class08089.field_12651).N(2.0F, 3.0F).Z().N(class07752.y));
   public static final class00891 Uh = N("birch_fence", class00730::new, class01362.N().N(s.k()).N(class08089.field_12651).N(2.0F, 3.0F).Z().N(class07752.y));
   public static final class00891 Ur = N("jungle_fence", class00730::new, class01362.N().N(T.k()).N(class08089.field_12651).N(2.0F, 3.0F).Z().N(class07752.y));
   public static final class00891 EN = N("acacia_fence", class00730::new, class01362.N().N(b.k()).N(class08089.field_12651).N(2.0F, 3.0F).Z().N(class07752.y));
   public static final class00891 Ey = N("cherry_fence", class00730::new, class01362.N().N(j.k()).N(class08089.field_12651).N(2.0F, 3.0F).Z().N(class07752.ND));
   public static final class00891 EL = N("dark_oak_fence", class00730::new, class01362.N().N(v.k()).N(class08089.field_12651).N(2.0F, 3.0F).Z().N(class07752.y));
   public static final class00891 Eu = N("pale_oak_fence", class00730::new, class01362.N().N(t.k()).N(class08089.field_12651).N(2.0F, 3.0F).Z().N(class07752.y));
   public static final class00891 Ei = N("mangrove_fence", class00730::new, class01362.N().N(G.k()).N(class08089.field_12651).N(2.0F, 3.0F).Z().N(class07752.y));
   public static final class00891 ER = N("bamboo_fence", class00730::new, class01362.N().N(l.k()).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.NS).Z());
   public static final class00891 EM = N(
      "spruce_door", var0 -> new class07196(class01960.B, var0), class01362.N().N(P.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 EB = N(
      "birch_door", var0 -> new class07196(class01960.Z, var0), class01362.N().N(s.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 EZ = N(
      "jungle_door", var0 -> new class07196(class01960.E, var0), class01362.N().N(T.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 Ez = N(
      "acacia_door", var0 -> new class07196(class01960.z, var0), class01362.N().N(b.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 EU = N(
      "cherry_door", var0 -> new class07196(class01960.U, var0), class01362.N().N(j.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 EE = N(
      "dark_oak_door", var0 -> new class07196(class01960.W, var0), class01362.N().N(v.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 EW = N(
      "pale_oak_door", var0 -> new class07196(class01960.m, var0), class01362.N().N(t.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 Em = N(
      "mangrove_door", var0 -> new class07196(class01960.T, var0), class01362.N().N(G.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 EP = N(
      "bamboo_door", var0 -> new class07196(class01960.b, var0), class01362.N().N(l.k()).N(class08089.field_12651).u(3.0F).L().Z().N(class04641.field_15971)
   );
   public static final class00891 Es = N("end_rod", class01106::new, class01362.N().E().u().N(var0 -> 14).N(class07752.y).L());
   public static final class00891 ET = N(
      "chorus_plant", class06771::new, class01362.N().N(class04689.d).E().u(0.4F).N(class07752.y).L().N(class04641.field_15971)
   );
   public static final class00891 Eb = N(
      "chorus_flower",
      var0 -> new class00898(ET, var0),
      class01362.N().N(class04689.d).E().i().u(0.4F).N(class07752.y).L().N(class00869::N).N(class04641.field_15971).N_9(class00869::y)
   );
   public static final class00891 Ej = N("purpur_block", class01362.N().N(class04689.T).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 Ev = N("purpur_pillar", class07004::new, class01362.N().N(class04689.T).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 En = N("purpur_stairs", Ej);
   public static final class00891 Et = N("end_stone_bricks", class01362.N().N(class04689.L).N(class08089.field_12653).m().N(3.0F, 9.0F));
   public static final class00891 EG = N(
      "torchflower_crop", class01947::new, class01362.N().N(class04689.B).y().i().u().N(class07752.G).N(class04641.field_15971)
   );
   public static final class00891 El = N("pitcher_crop", class03587::new, class01362.N().N(class04689.B).y().i().u().N(class07752.G).N(class04641.field_15971));
   public static final class00891 Ed = N(
      "pitcher_plant", class06761::new, class01362.N().N(class04689.B).y().u().N(class07752.G).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 Ew = N("beetroots", class07803::new, class01362.N().N(class04689.B).y().i().u().N(class07752.G).N(class04641.field_15971));
   public static final class00891 Ek = N(
      "dirt_path", class00733::new, class01362.N().N(class04689.U).u(0.65F).N(class07752.u).L(class00869::N).y(class00869::N)
   );
   public static final class00891 EY = N(
      "end_gateway", class07205::new, class01362.N().N(class04689.O).y().N(var0 -> 15).N(-1.0F, 3600000.0F).M().N(class04641.field_15972)
   );
   public static final class00891 EQ = N(
      "repeating_command_block", var0 -> new class06759(false, var0), class01362.N().N(class04689.d).m().N(-1.0F, 3600000.0F).M()
   );
   public static final class00891 EO = N("chain_command_block", var0 -> new class06759(true, var0), class01362.N().N(class04689.Y).m().N(-1.0F, 3600000.0F).M());
   public static final class00891 Eg = N(
      "frosted_ice",
      class00749::new,
      class01362.N().N(class04689.R).N(0.98F).u(0.5F).N(class07752.B).L().N((var0, var1x, var2x, var3x) -> var3x == class07078.yL).N_9(class00869::y)
   );
   public static final class00891 EI = N(
      "magma_block",
      class07095::new,
      class01362.N()
         .N(class04689.K)
         .N(class08089.field_12653)
         .m()
         .N(var0 -> 3)
         .u(0.5F)
         .N((var0, var1x, var2x, var3x) -> var3x.L())
         .u(class00869::N)
         .i(class00869::N)
   );
   public static final class00891 EJ = N("nether_wart_block", class01362.N().N(class04689.Q).u(1.0F).N(class07752.e));
   public static final class00891 Eo = N("red_nether_bricks", class01362.N().N(class04689.K).N(class08089.field_12653).m().N(2.0F, 6.0F).N(class07752.c));
   public static final class00891 Eq = N("bone_block", class07004::new, class01362.N().N(class04689.L).N(class08089.field_12655).m().u(2.0F).N(class07752.p));
   public static final class00891 EK = N("structure_void", class07712::new, class01362.N().s().y().M().P().N(class04641.field_15971));
   public static final class00891 EV = N("observer", class06869::new, class01362.N().N(class04689.E).N(class08089.field_12653).u(3.0F).m().N_9(class00869::y));
   public static final class00891 Ee = N("shulker_box", var0 -> new class07027(null, var0), L(class04689.d));
   public static final class00891 EH = N("white_shulker_box", var0 -> new class07027(class06563.field_7952, var0), L(class04689.Z));
   public static final class00891 Ec = N("orange_shulker_box", var0 -> new class07027(class06563.field_7946, var0), L(class04689.s));
   public static final class00891 EX = N("magenta_shulker_box", var0 -> new class07027(class06563.field_7958, var0), L(class04689.T));
   public static final class00891 Ea = N("light_blue_shulker_box", var0 -> new class07027(class06563.field_7951, var0), L(class04689.b));
   public static final class00891 Ep = N("yellow_shulker_box", var0 -> new class07027(class06563.field_7947, var0), L(class04689.j));
   public static final class00891 EF = N("lime_shulker_box", var0 -> new class07027(class06563.field_7961, var0), L(class04689.v));
   public static final class00891 EA = N("pink_shulker_box", var0 -> new class07027(class06563.field_7954, var0), L(class04689.n));
   public static final class00891 Ef = N("gray_shulker_box", var0 -> new class07027(class06563.field_7944, var0), L(class04689.t));
   public static final class00891 EC = N("light_gray_shulker_box", var0 -> new class07027(class06563.field_7967, var0), L(class04689.G));
   public static final class00891 ES = N("cyan_shulker_box", var0 -> new class07027(class06563.field_7955, var0), L(class04689.l));
   public static final class00891 Ex = N("purple_shulker_box", var0 -> new class07027(class06563.field_7945, var0), L(class04689.C));
   public static final class00891 ED = N("blue_shulker_box", var0 -> new class07027(class06563.field_7966, var0), L(class04689.w));
   public static final class00891 Eh = N("brown_shulker_box", var0 -> new class07027(class06563.field_7957, var0), L(class04689.k));
   public static final class00891 Er = N("green_shulker_box", var0 -> new class07027(class06563.field_7942, var0), L(class04689.Y));
   public static final class00891 WN = N("red_shulker_box", var0 -> new class07027(class06563.field_7964, var0), L(class04689.Q));
   public static final class00891 Wy = N("black_shulker_box", var0 -> new class07027(class06563.field_7963, var0), L(class04689.O));
   public static final class00891 WL = N(
      "white_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7952).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 Wu = N(
      "orange_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7946).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 Wi = N(
      "magenta_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7958).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WR = N(
      "light_blue_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7951).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WM = N(
      "yellow_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7947).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WB = N(
      "lime_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7961).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WZ = N(
      "pink_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7954).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 Wz = N(
      "gray_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7944).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WU = N(
      "light_gray_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7967).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WE = N(
      "cyan_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7955).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WW = N(
      "purple_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7945).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 Wm = N(
      "blue_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7966).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WP = N(
      "brown_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7957).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 Ws = N(
      "green_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7942).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 WT = N(
      "red_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7964).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 Wb = N(
      "black_glazed_terracotta", class00738::new, class01362.N().N(class06563.field_7963).N(class08089.field_12653).m().u(1.4F).N(class04641.field_15970)
   );
   public static final class00891 Wj = N("white_concrete", class01362.N().N(class06563.field_7952).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wv = N("orange_concrete", class01362.N().N(class06563.field_7946).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wn = N("magenta_concrete", class01362.N().N(class06563.field_7958).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wt = N("light_blue_concrete", class01362.N().N(class06563.field_7951).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 WG = N("yellow_concrete", class01362.N().N(class06563.field_7947).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wl = N("lime_concrete", class01362.N().N(class06563.field_7961).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wd = N("pink_concrete", class01362.N().N(class06563.field_7954).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Ww = N("gray_concrete", class01362.N().N(class06563.field_7944).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wk = N("light_gray_concrete", class01362.N().N(class06563.field_7967).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 WY = N("cyan_concrete", class01362.N().N(class06563.field_7955).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 WQ = N("purple_concrete", class01362.N().N(class06563.field_7945).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 WO = N("blue_concrete", class01362.N().N(class06563.field_7966).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wg = N("brown_concrete", class01362.N().N(class06563.field_7957).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 WI = N("green_concrete", class01362.N().N(class06563.field_7942).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 WJ = N("red_concrete", class01362.N().N(class06563.field_7964).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wo = N("black_concrete", class01362.N().N(class06563.field_7963).N(class08089.field_12653).m().u(1.8F));
   public static final class00891 Wq = N(
      "white_concrete_powder", var0 -> new class06785(Wj, var0), class01362.N().N(class06563.field_7952).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WK = N(
      "orange_concrete_powder", var0 -> new class06785(Wv, var0), class01362.N().N(class06563.field_7946).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WV = N(
      "magenta_concrete_powder", var0 -> new class06785(Wn, var0), class01362.N().N(class06563.field_7958).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 We = N(
      "light_blue_concrete_powder", var0 -> new class06785(Wt, var0), class01362.N().N(class06563.field_7951).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WH = N(
      "yellow_concrete_powder", var0 -> new class06785(WG, var0), class01362.N().N(class06563.field_7947).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 Wc = N(
      "lime_concrete_powder", var0 -> new class06785(Wl, var0), class01362.N().N(class06563.field_7961).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WX = N(
      "pink_concrete_powder", var0 -> new class06785(Wd, var0), class01362.N().N(class06563.field_7954).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 Wa = N(
      "gray_concrete_powder", var0 -> new class06785(Ww, var0), class01362.N().N(class06563.field_7944).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 Wp = N(
      "light_gray_concrete_powder", var0 -> new class06785(Wk, var0), class01362.N().N(class06563.field_7967).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WF = N(
      "cyan_concrete_powder", var0 -> new class06785(WY, var0), class01362.N().N(class06563.field_7955).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WA = N(
      "purple_concrete_powder", var0 -> new class06785(WQ, var0), class01362.N().N(class06563.field_7945).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 Wf = N(
      "blue_concrete_powder", var0 -> new class06785(WO, var0), class01362.N().N(class06563.field_7966).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WC = N(
      "brown_concrete_powder", var0 -> new class06785(Wg, var0), class01362.N().N(class06563.field_7957).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WS = N(
      "green_concrete_powder", var0 -> new class06785(WI, var0), class01362.N().N(class06563.field_7942).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 Wx = N(
      "red_concrete_powder", var0 -> new class06785(WJ, var0), class01362.N().N(class06563.field_7964).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 WD = N(
      "black_concrete_powder", var0 -> new class06785(Wo, var0), class01362.N().N(class06563.field_7963).N(class08089.field_12643).u(0.5F).N(class07752.z)
   );
   public static final class00891 Wh = N("kelp", class07110::new, class01362.N().N(class04689.W).y().i().u().N(class07752.T).N(class04641.field_15971));
   public static final class00891 Wr = N("kelp_plant", class07108::new, class01362.N().N(class04689.W).y().u().N(class07752.T).N(class04641.field_15971));
   public static final class00891 mN = N("dried_kelp_block", class01362.N().N(class04689.Y).N(0.5F, 2.5F).N(class07752.u));
   public static final class00891 my = N(
      "turtle_egg", class00628::new, class01362.N().N(class04689.L).U().u(0.5F).N(class07752.M).i().L().N(class04641.field_15971)
   );
   public static final class00891 mL = N("sniffer_egg", class03561::new, class01362.N().N(class04689.Q).u(0.5F).N(class07752.M).L());
   public static final class00891 mu = N("dried_ghast", class00009::new, class01362.N().N(class04689.t).U().u().N(class07752.yj).L().i());
   public static final class00891 mi = N("dead_tube_coral_block", class01362.N().N(class04689.t).U().N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 mR = N("dead_brain_coral_block", class01362.N().N(class04689.t).U().N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 mM = N("dead_bubble_coral_block", class01362.N().N(class04689.t).U().N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 mB = N("dead_fire_coral_block", class01362.N().N(class04689.t).U().N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 mZ = N("dead_horn_coral_block", class01362.N().N(class04689.t).U().N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 mz = N(
      "tube_coral_block", var0 -> new class06787(mi, var0), class01362.N().N(class04689.w).N(class08089.field_12653).m().N(1.5F, 6.0F).N(class07752.b)
   );
   public static final class00891 mU = N(
      "brain_coral_block", var0 -> new class06787(mR, var0), class01362.N().N(class04689.n).N(class08089.field_12653).m().N(1.5F, 6.0F).N(class07752.b)
   );
   public static final class00891 mE = N(
      "bubble_coral_block", var0 -> new class06787(mM, var0), class01362.N().N(class04689.d).N(class08089.field_12653).m().N(1.5F, 6.0F).N(class07752.b)
   );
   public static final class00891 mW = N(
      "fire_coral_block", var0 -> new class06787(mB, var0), class01362.N().N(class04689.Q).N(class08089.field_12653).m().N(1.5F, 6.0F).N(class07752.b)
   );
   public static final class00891 mm = N(
      "horn_coral_block", var0 -> new class06787(mZ, var0), class01362.N().N(class04689.j).N(class08089.field_12653).m().N(1.5F, 6.0F).N(class07752.b)
   );
   public static final class00891 mP = N("dead_tube_coral", class07792::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 ms = N("dead_brain_coral", class07792::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mT = N("dead_bubble_coral", class07792::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mb = N("dead_fire_coral", class07792::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mj = N("dead_horn_coral", class07792::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mv = N(
      "tube_coral", var0 -> new class06774(mP, var0), class01362.N().N(class04689.w).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mn = N(
      "brain_coral", var0 -> new class06774(ms, var0), class01362.N().N(class04689.n).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mt = N(
      "bubble_coral", var0 -> new class06774(mT, var0), class01362.N().N(class04689.d).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mG = N(
      "fire_coral", var0 -> new class06774(mb, var0), class01362.N().N(class04689.Q).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 ml = N(
      "horn_coral", var0 -> new class06774(mj, var0), class01362.N().N(class04689.j).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 md = N("dead_tube_coral_fan", class07781::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mw = N("dead_brain_coral_fan", class07781::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mk = N("dead_bubble_coral_fan", class07781::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mY = N("dead_fire_coral_fan", class07781::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mQ = N("dead_horn_coral_fan", class07781::new, class01362.N().N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mO = N(
      "tube_coral_fan", var0 -> new class06795(md, var0), class01362.N().N(class04689.w).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mg = N(
      "brain_coral_fan", var0 -> new class06795(mw, var0), class01362.N().N(class04689.n).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mI = N(
      "bubble_coral_fan", var0 -> new class06795(mk, var0), class01362.N().N(class04689.d).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mJ = N(
      "fire_coral_fan", var0 -> new class06795(mY, var0), class01362.N().N(class04689.Q).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mo = N(
      "horn_coral_fan", var0 -> new class06795(mQ, var0), class01362.N().N(class04689.j).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mq = N("dead_tube_coral_wall_fan", class07774::new, N(md, false).N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mK = N("dead_brain_coral_wall_fan", class07774::new, N(mw, false).N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mV = N("dead_bubble_coral_wall_fan", class07774::new, N(mk, false).N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 me = N("dead_fire_coral_wall_fan", class07774::new, N(mY, false).N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mH = N("dead_horn_coral_wall_fan", class07774::new, N(mQ, false).N(class04689.t).U().N(class08089.field_12653).m().y().u());
   public static final class00891 mc = N(
      "tube_coral_wall_fan", var0 -> new class06806(mq, var0), N(mO, false).N(class04689.w).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mX = N(
      "brain_coral_wall_fan", var0 -> new class06806(mK, var0), N(mg, false).N(class04689.n).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 ma = N(
      "bubble_coral_wall_fan", var0 -> new class06806(mV, var0), N(mI, false).N(class04689.d).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mp = N(
      "fire_coral_wall_fan", var0 -> new class06806(me, var0), N(mJ, false).N(class04689.Q).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mF = N(
      "horn_coral_wall_fan", var0 -> new class06806(mH, var0), N(mo, false).N(class04689.j).y().u().N(class07752.T).N(class04641.field_15971)
   );
   public static final class00891 mA = N(
      "sea_pickle",
      class06996::new,
      class01362.N().N(class04689.Y).N(var0 -> class06996.U(var0) ? 0 : 3 + 3 * var0.L(class06996.L)).N(class07752.P).L().N(class04641.field_15971)
   );
   public static final class00891 mf = N("blue_ice", class00741::new, class01362.N().N(class04689.R).u(2.8F).N(0.989F).N(class07752.B));
   public static final class00891 mC = N("conduit", class06783::new, class01362.N().N(class04689.I).U().N(class08089.field_12645).u(3.0F).N(var0 -> 15).L());
   public static final class00891 mS = N(
      "bamboo_sapling",
      class07770::new,
      class01362.N().N(class04689.m).U().i().u().y().u(1.0F).N(class07752.v).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 mx = N(
      "bamboo",
      class07784::new,
      class01362.N().N(class04689.B).U().i().u().u(1.0F).N(class07752.j).L().R().N(class01344.field_10657).Z().N(class04641.field_15971).N_9(class00869::y)
   );
   public static final class00891 mD = N("potted_bamboo", var0 -> new class00757(mx, var0), y());
   public static final class00891 mh = N("void_air", class07662::new, class01362.N().s().y().M().W());
   public static final class00891 mr = N("cave_air", class07662::new, class01362.N().s().y().M().W());
   public static final class00891 PN = N(
      "bubble_column", class00884::new, class01362.N().N(class04689.W).s().y().M().N(class04641.field_15971).z().N(class07752.N)
   );
   public static final class00891 Py = N("polished_granite_stairs", u);
   public static final class00891 PL = N("smooth_red_sandstone_stairs", Uc);
   public static final class00891 Pu = N("mossy_stone_brick_stairs", RP);
   public static final class00891 Pi = N("polished_diorite_stairs", R);
   public static final class00891 PR = N("mossy_cobblestone_stairs", LK);
   public static final class00891 PM = N("end_stone_brick_stairs", Et);
   public static final class00891 PB = N("stone_stairs", y);
   public static final class00891 PZ = N("smooth_sandstone_stairs", Ue);
   public static final class00891 Pz = N("smooth_quartz_stairs", UH);
   public static final class00891 PU = N("granite_stairs", L);
   public static final class00891 PE = N("andesite_stairs", M);
   public static final class00891 PW = N("red_nether_brick_stairs", Eo);
   public static final class00891 Pm = N("polished_andesite_stairs", B);
   public static final class00891 PP = N("diorite_stairs", i);
   public static final class00891 Ps = N("polished_granite_slab", class07007::new, class01362.y(u));
   public static final class00891 PT = N("smooth_red_sandstone_slab", class07007::new, class01362.y(Uc));
   public static final class00891 Pb = N("mossy_stone_brick_slab", class07007::new, class01362.y(RP));
   public static final class00891 Pj = N("polished_diorite_slab", class07007::new, class01362.y(R));
   public static final class00891 Pv = N("mossy_cobblestone_slab", class07007::new, class01362.y(LK));
   public static final class00891 Pn = N("end_stone_brick_slab", class07007::new, class01362.y(Et));
   public static final class00891 Pt = N("smooth_sandstone_slab", class07007::new, class01362.y(Ue));
   public static final class00891 PG = N("smooth_quartz_slab", class07007::new, class01362.y(UH));
   public static final class00891 Pl = N("granite_slab", class07007::new, class01362.y(L));
   public static final class00891 Pd = N("andesite_slab", class07007::new, class01362.y(M));
   public static final class00891 Pw = N("red_nether_brick_slab", class07007::new, class01362.y(Eo));
   public static final class00891 Pk = N("polished_andesite_slab", class07007::new, class01362.y(B));
   public static final class00891 PY = N("diorite_slab", class07007::new, class01362.y(i));
   public static final class00891 PQ = N("brick_wall", class00650::new, class01362.y(Lv).U());
   public static final class00891 PO = N("prismarine_wall", class00650::new, class01362.y(ZF).U());
   public static final class00891 Pg = N("red_sandstone_wall", class00650::new, class01362.y(UB).U());
   public static final class00891 PI = N("mossy_stone_brick_wall", class00650::new, class01362.y(RP).U());
   public static final class00891 PJ = N("granite_wall", class00650::new, class01362.y(L).U());
   public static final class00891 Po = N("stone_brick_wall", class00650::new, class01362.y(Rm).U());
   public static final class00891 Pq = N("mud_brick_wall", class00650::new, class01362.y(Rj).U());
   public static final class00891 PK = N("nether_brick_wall", class00650::new, class01362.y(ML).U());
   public static final class00891 PV = N("andesite_wall", class00650::new, class01362.y(M).U());
   public static final class00891 Pe = N("red_nether_brick_wall", class00650::new, class01362.y(Eo).U());
   public static final class00891 PH = N("sandstone_wall", class00650::new, class01362.y(yL).U());
   public static final class00891 Pc = N("end_stone_brick_wall", class00650::new, class01362.y(Et).U());
   public static final class00891 PX = N("diorite_wall", class00650::new, class01362.y(i).U());
   public static final class00891 Pa = N(
      "scaffolding", class06089::new, class01362.N().N(class04689.L).y().N(class07752.n).R().N(class00869::N).N(class04641.field_15971).N_9(class00869::y)
   );
   public static final class00891 Pp = N("loom", class07112::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z());
   public static final class00891 PF = N("barrel", class06109::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z());
   public static final class00891 PA = N("smoker", class06103::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().u(3.5F).N(N(13)));
   public static final class00891 Pf = N("blast_furnace", class06088::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().u(3.5F).N(N(13)));
   public static final class00891 PC = N(
      "cartography_table", class06106::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z()
   );
   public static final class00891 PS = N("fletching_table", class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z());
   public static final class00891 Px = N(
      "grindstone", class06121::new, class01362.N().N(class04689.M).m().N(2.0F, 6.0F).N(class07752.R).N(class04641.field_15972)
   );
   public static final class00891 PD = N("lectern", class06127::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z());
   public static final class00891 Ph = N(
      "smithing_table", class06111::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(2.5F).N(class07752.y).Z()
   );
   public static final class00891 Pr = N("stonecutter", class06118::new, class01362.N().N(class04689.E).N(class08089.field_12653).m().u(3.5F));
   public static final class00891 sN = N("bell", class06133::new, class01362.N().N(class04689.g).U().u(5.0F).N(class07752.m).N(class04641.field_15971));
   public static final class00891 sy = N(
      "lantern", class04873::new, class01362.N().N(class04689.M).U().u(3.5F).N(class07752.k).N(var0 -> 15).L().N(class04641.field_15971)
   );
   public static final class00891 sL = N(
      "soul_lantern", class04873::new, class01362.N().N(class04689.M).U().u(3.5F).N(class07752.k).N(var0 -> 10).L().N(class04641.field_15971)
   );
   public static final class00948 su = class00948.N(
      "copper_lantern",
      class00869::N,
      class04873::new,
      class00944::new,
      var0 -> class01362.N().N(class04689.M).U().u(3.5F).N(class07752.k).N(var0x -> 15).L().N(class04641.field_15971)
   );
   public static final class00891 si = N(
      "campfire", var0 -> new class05847(true, 1, var0), class01362.N().N(class04689.q).N(class08089.field_12651).u(2.0F).N(class07752.y).N(N(15)).L().Z()
   );
   public static final class00891 sR = N(
      "soul_campfire",
      var0 -> new class05847(false, 2, var0),
      class01362.N().N(class04689.q).N(class08089.field_12651).u(2.0F).N(class07752.y).N(N(10)).L().Z()
   );
   public static final class00891 sM = N("sweet_berry_bush", class05253::new, class01362.N().N(class04689.B).i().y().N(class07752.t).N(class04641.field_15971));
   public static final class00891 sB = N("warped_stem", class07004::new, N(class04689.Ni));
   public static final class00891 sZ = N("stripped_warped_stem", class07004::new, N(class04689.Ni));
   public static final class00891 sz = N("warped_hyphae", class07004::new, class01362.N().N(class04689.NR).N(class08089.field_12651).u(2.0F).N(class07752.Y));
   public static final class00891 sU = N(
      "stripped_warped_hyphae", class07004::new, class01362.N().N(class04689.NR).N(class08089.field_12651).u(2.0F).N(class07752.Y)
   );
   public static final class00891 sE = N(
      "warped_nylium", class04984::new, class01362.N().N(class04689.Nu).N(class08089.field_12653).m().u(0.4F).N(class07752.Q).i()
   );
   public static final class00891 sW = N(
      "warped_fungus", var0 -> new class05990(class03168.u, sE, var0), class01362.N().N(class04689.l).u().y().N(class07752.O).N(class04641.field_15971)
   );
   public static final class00891 sm = N("warped_wart_block", class01362.N().N(class04689.NM).u(1.0F).N(class07752.e));
   public static final class00891 sP = N(
      "warped_roots", class05991::new, class01362.N().N(class04689.l).s().y().u().N(class07752.g).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 ss = N(
      "nether_sprouts", class06019::new, class01362.N().N(class04689.l).s().y().u().N(class07752.X).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 sT = N("crimson_stem", class07004::new, N(class04689.Ny));
   public static final class00891 sb = N("stripped_crimson_stem", class07004::new, N(class04689.Ny));
   public static final class00891 sj = N("crimson_hyphae", class07004::new, class01362.N().N(class04689.NL).N(class08089.field_12651).u(2.0F).N(class07752.Y));
   public static final class00891 sv = N(
      "stripped_crimson_hyphae", class07004::new, class01362.N().N(class04689.NL).N(class08089.field_12651).u(2.0F).N(class07752.Y)
   );
   public static final class00891 sn = N(
      "crimson_nylium", class04984::new, class01362.N().N(class04689.NN).N(class08089.field_12653).m().u(0.4F).N(class07752.Q).i()
   );
   public static final class00891 st = N(
      "crimson_fungus", var0 -> new class05990(class03168.y, sn, var0), class01362.N().N(class04689.K).u().y().N(class07752.O).N(class04641.field_15971)
   );
   public static final class00891 sG = N("shroomlight", class01362.N().N(class04689.Q).u(1.0F).N(class07752.I).N(var0 -> 15));
   public static final class00891 sl = N("weeping_vines", class06010::new, class01362.N().N(class04689.K).i().y().u().N(class07752.J).N(class04641.field_15971));
   public static final class00891 sd = N(
      "weeping_vines_plant", class01364::new, class01362.N().N(class04689.K).y().u().N(class07752.J).N(class04641.field_15971)
   );
   public static final class00891 sw = N(
      "twisting_vines", class05988::new, class01362.N().N(class04689.l).i().y().u().N(class07752.J).N(class04641.field_15971)
   );
   public static final class00891 sk = N(
      "twisting_vines_plant", class01375::new, class01362.N().N(class04689.l).y().u().N(class07752.J).N(class04641.field_15971)
   );
   public static final class00891 sY = N(
      "crimson_roots", class05991::new, class01362.N().N(class04689.K).s().y().u().N(class07752.g).N(class01344.field_10657).N(class04641.field_15971)
   );
   public static final class00891 sQ = N("crimson_planks", class01362.N().N(class04689.Ny).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.Nx));
   public static final class00891 sO = N("warped_planks", class01362.N().N(class04689.Ni).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.Nx));
   public static final class00891 sg = N("crimson_slab", class07007::new, class01362.N().N(sQ.k()).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.Nx));
   public static final class00891 sI = N("warped_slab", class07007::new, class01362.N().N(sO.k()).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.Nx));
   public static final class00891 sJ = N(
      "crimson_pressure_plate",
      var0 -> new class06902(class01960.P, var0),
      class01362.N().N(sQ.k()).U().N(class08089.field_12651).y().u(0.5F).N(class04641.field_15971)
   );
   public static final class00891 so = N(
      "warped_pressure_plate",
      var0 -> new class06902(class01960.s, var0),
      class01362.N().N(sO.k()).U().N(class08089.field_12651).y().u(0.5F).N(class04641.field_15971)
   );
   public static final class00891 sq = N("crimson_fence", class00730::new, class01362.N().N(sQ.k()).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.Nx));
   public static final class00891 sK = N("warped_fence", class00730::new, class01362.N().N(sO.k()).N(class08089.field_12651).N(2.0F, 3.0F).N(class07752.Nx));
   public static final class00891 sV = N(
      "crimson_trapdoor", var0 -> new class00624(class01960.P, var0), class01362.N().N(sQ.k()).N(class08089.field_12651).u(3.0F).L().N(class00869::N)
   );
   public static final class00891 se = N(
      "warped_trapdoor", var0 -> new class00624(class01960.s, var0), class01362.N().N(sO.k()).N(class08089.field_12651).u(3.0F).L().N(class00869::N)
   );
   public static final class00891 sH = N(
      "crimson_fence_gate", var0 -> new class07188(class05904.z, var0), class01362.N().N(sQ.k()).U().N(class08089.field_12651).N(2.0F, 3.0F)
   );
   public static final class00891 sc = N(
      "warped_fence_gate", var0 -> new class07188(class05904.U, var0), class01362.N().N(sO.k()).U().N(class08089.field_12651).N(2.0F, 3.0F)
   );
   public static final class00891 sX = N("crimson_stairs", sQ);
   public static final class00891 sa = N("warped_stairs", sO);
   public static final class00891 sp = N("crimson_button", var0 -> new class00889(class01960.P, 30, var0), N());
   public static final class00891 sF = N("warped_button", var0 -> new class00889(class01960.s, 30, var0), N());
   public static final class00891 sA = N(
      "crimson_door", var0 -> new class07196(class01960.P, var0), class01362.N().N(sQ.k()).N(class08089.field_12651).u(3.0F).L().N(class04641.field_15971)
   );
   public static final class00891 sf = N(
      "warped_door", var0 -> new class07196(class01960.s, var0), class01362.N().N(sO.k()).N(class08089.field_12651).u(3.0F).L().N(class04641.field_15971)
   );
   public static final class00891 sC = N(
      "crimson_sign", var0 -> new class07751(class05904.z, var0), class01362.N().N(sQ.k()).N(class08089.field_12651).U().y().u(1.0F)
   );
   public static final class00891 sS = N(
      "warped_sign", var0 -> new class07751(class05904.U, var0), class01362.N().N(sO.k()).N(class08089.field_12651).U().y().u(1.0F)
   );
   public static final class00891 sx = N(
      "crimson_wall_sign", var0 -> new class00662(class05904.z, var0), N(sC, true).N(sQ.k()).N(class08089.field_12651).U().y().u(1.0F)
   );
   public static final class00891 sD = N(
      "warped_wall_sign", var0 -> new class00662(class05904.U, var0), N(sS, true).N(sO.k()).N(class08089.field_12651).U().y().u(1.0F)
   );
   public static final class00891 sh = N("structure_block", class07714::new, class01362.N().N(class04689.G).m().N(-1.0F, 3600000.0F).M());
   public static final class00891 sr = N("jigsaw", class04884::new, class01362.N().N(class04689.G).m().N(-1.0F, 3600000.0F).M());
   public static final class00891 TN = N("test_block", class08620::new, class01362.N().N(class04689.G).N(-1.0F, 3600000.0F).M());
   public static final class00891 Ty = N("test_instance_block", class08615::new, class01362.N().L().N(-1.0F, 3600000.0F).M().L(class00869::y));
   public static final class00891 TL = N("composter", class05836::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(0.6F).N(class07752.y).Z());
   public static final class00891 Tu = N("target", class04958::new, class01362.N().N(class04689.P).u(0.5F).N(class07752.u));
   public static final class00891 Ti = N("bee_nest", class04593::new, class01362.N().N(class04689.j).N(class08089.field_12651).u(0.3F).N(class07752.y).Z());
   public static final class00891 TR = N("beehive", class04593::new, class01362.N().N(class04689.m).N(class08089.field_12651).u(0.6F).N(class07752.y).Z());
   public static final class00891 TM = N("honey_block", class01451::new, class01362.N().N(class04689.s).y(0.4F).L(0.5F).L().N(class07752.s));
   public static final class00891 TB = N("honeycomb_block", class01362.N().N(class04689.s).u(0.6F).N(class07752.b));
   public static final class00891 TZ = N("netherite_block", class01362.N().N(class04689.O).m().N(50.0F, 1200.0F).N(class07752.F));
   public static final class00891 Tz = N("ancient_debris", class01362.N().N(class04689.O).m().N(30.0F, 1200.0F).N(class07752.A));
   public static final class00891 TU = N(
      "crying_obsidian", class04953::new, class01362.N().N(class04689.O).N(class08089.field_12653).m().N(50.0F, 1200.0F).N(var0 -> 10)
   );
   public static final class00891 TE = N(
      "respawn_anchor", class01338::new, class01362.N().N(class04689.O).N(class08089.field_12653).m().N(50.0F, 1200.0F).N(var0 -> class01338.N(var0, 15))
   );
   public static final class00891 TW = N("potted_crimson_fungus", var0 -> new class00757(st, var0), y());
   public static final class00891 Tm = N("potted_warped_fungus", var0 -> new class00757(sW, var0), y());
   public static final class00891 TP = N("potted_crimson_roots", var0 -> new class00757(sY, var0), y());
   public static final class00891 Ts = N("potted_warped_roots", var0 -> new class00757(sP, var0), y());
   public static final class00891 TT = N("lodestone", class01362.N().N(class04689.M).m().u(3.5F).N(class07752.f).N(class04641.field_15972));
   public static final class00891 Tb = N("blackstone", class01362.N().N(class04689.O).N(class08089.field_12653).m().N(1.5F, 6.0F));
   public static final class00891 Tj = N("blackstone_stairs", Tb);
   public static final class00891 Tv = N("blackstone_wall", class00650::new, class01362.y(Tb).U());
   public static final class00891 Tn = N("blackstone_slab", class07007::new, class01362.y(Tb).N(2.0F, 6.0F));
   public static final class00891 Tt = N("polished_blackstone", class01362.y(Tb).N(2.0F, 6.0F));
   public static final class00891 TG = N("polished_blackstone_bricks", class01362.y(Tt).N(1.5F, 6.0F));
   public static final class00891 Tl = N("cracked_polished_blackstone_bricks", class01362.y(TG));
   public static final class00891 Td = N("chiseled_polished_blackstone", class01362.y(Tt).N(1.5F, 6.0F));
   public static final class00891 Tw = N("polished_blackstone_brick_slab", class07007::new, class01362.y(TG).N(2.0F, 6.0F));
   public static final class00891 Tk = N("polished_blackstone_brick_stairs", TG);
   public static final class00891 TY = N("polished_blackstone_brick_wall", class00650::new, class01362.y(TG).U());
   public static final class00891 TQ = N("gilded_blackstone", class01362.y(Tb).N(class07752.x));
   public static final class00891 TO = N("polished_blackstone_stairs", Tt);
   public static final class00891 Tg = N("polished_blackstone_slab", class07007::new, class01362.y(Tt));
   public static final class00891 TI = N(
      "polished_blackstone_pressure_plate",
      var0 -> new class06902(class01960.R, var0),
      class01362.N().N(class04689.O).U().N(class08089.field_12653).y().u(0.5F).N(class04641.field_15971)
   );
   public static final class00891 TJ = N("polished_blackstone_button", var0 -> new class00889(class01960.i, 20, var0), N());
   public static final class00891 To = N("polished_blackstone_wall", class00650::new, class01362.y(Tt).U());
   public static final class00891 Tq = N("chiseled_nether_bricks", class01362.N().N(class04689.K).N(class08089.field_12653).m().N(2.0F, 6.0F).N(class07752.c));
   public static final class00891 TK = N("cracked_nether_bricks", class01362.N().N(class04689.K).N(class08089.field_12653).m().N(2.0F, 6.0F).N(class07752.c));
   public static final class00891 TV = N("quartz_bricks", class01362.y(BC));
   public static final class00891 Te = N("candle", class05440::new, u(class04689.L));
   public static final class00891 TH = N("white_candle", class05440::new, u(class04689.u));
   public static final class00891 Tc = N("orange_candle", class05440::new, u(class04689.s));
   public static final class00891 TX = N("magenta_candle", class05440::new, u(class04689.T));
   public static final class00891 Ta = N("light_blue_candle", class05440::new, u(class04689.b));
   public static final class00891 Tp = N("yellow_candle", class05440::new, u(class04689.j));
   public static final class00891 TF = N("lime_candle", class05440::new, u(class04689.v));
   public static final class00891 TA = N("pink_candle", class05440::new, u(class04689.n));
   public static final class00891 Tf = N("gray_candle", class05440::new, u(class04689.t));
   public static final class00891 TC = N("light_gray_candle", class05440::new, u(class04689.G));
   public static final class00891 TS = N("cyan_candle", class05440::new, u(class04689.l));
   public static final class00891 Tx = N("purple_candle", class05440::new, u(class04689.d));
   public static final class00891 TD = N("blue_candle", class05440::new, u(class04689.w));
   public static final class00891 Th = N("brown_candle", class05440::new, u(class04689.k));
   public static final class00891 Tr = N("green_candle", class05440::new, u(class04689.Y));
   public static final class00891 bN = N("red_candle", class05440::new, u(class04689.Q));
   public static final class00891 by = N("black_candle", class05440::new, u(class04689.O));
   public static final class00891 bL = N("candle_cake", var0 -> new class05467(Te, var0), class01362.y(ie).N(N(3)));
   public static final class00891 bu = N("white_candle_cake", var0 -> new class05467(TH, var0), class01362.y(bL));
   public static final class00891 bi = N("orange_candle_cake", var0 -> new class05467(Tc, var0), class01362.y(bL));
   public static final class00891 bR = N("magenta_candle_cake", var0 -> new class05467(TX, var0), class01362.y(bL));
   public static final class00891 bM = N("light_blue_candle_cake", var0 -> new class05467(Ta, var0), class01362.y(bL));
   public static final class00891 bB = N("yellow_candle_cake", var0 -> new class05467(Tp, var0), class01362.y(bL));
   public static final class00891 bZ = N("lime_candle_cake", var0 -> new class05467(TF, var0), class01362.y(bL));
   public static final class00891 bz = N("pink_candle_cake", var0 -> new class05467(TA, var0), class01362.y(bL));
   public static final class00891 bU = N("gray_candle_cake", var0 -> new class05467(Tf, var0), class01362.y(bL));
   public static final class00891 bE = N("light_gray_candle_cake", var0 -> new class05467(TC, var0), class01362.y(bL));
   public static final class00891 bW = N("cyan_candle_cake", var0 -> new class05467(TS, var0), class01362.y(bL));
   public static final class00891 bm = N("purple_candle_cake", var0 -> new class05467(Tx, var0), class01362.y(bL));
   public static final class00891 bP = N("blue_candle_cake", var0 -> new class05467(TD, var0), class01362.y(bL));
   public static final class00891 bs = N("brown_candle_cake", var0 -> new class05467(Th, var0), class01362.y(bL));
   public static final class00891 bT = N("green_candle_cake", var0 -> new class05467(Tr, var0), class01362.y(bL));
   public static final class00891 bb = N("red_candle_cake", var0 -> new class05467(bN, var0), class01362.y(bL));
   public static final class00891 bj = N("black_candle_cake", var0 -> new class05467(by, var0), class01362.y(bL));
   public static final class00891 bv = N("amethyst_block", class05439::new, class01362.N().N(class04689.d).u(1.5F).N(class07752.h).m());
   public static final class00891 bn = N(
      "budding_amethyst", class05481::new, class01362.N().N(class04689.d).i().u(1.5F).N(class07752.h).m().N(class04641.field_15971)
   );
   public static final class00891 bt = N(
      "amethyst_cluster",
      var0 -> new class05453(7.0F, 10.0F, var0),
      class01362.N().N(class04689.d).U().L().N(class07752.r).u(1.5F).N(var0 -> 5).N(class04641.field_15971)
   );
   public static final class00891 bG = N("large_amethyst_bud", var0 -> new class05453(5.0F, 10.0F, var0), class01362.y(bt).N(class07752.Ny).N(var0 -> 4));
   public static final class00891 bl = N("medium_amethyst_bud", var0 -> new class05453(4.0F, 10.0F, var0), class01362.y(bt).N(class07752.NL).N(var0 -> 2));
   public static final class00891 bd = N("small_amethyst_bud", var0 -> new class05453(3.0F, 8.0F, var0), class01362.y(bt).N(class07752.NN).N(var0 -> 1));
   public static final class00891 bw = N("tuff", class01362.N().N(class04689.F).N(class08089.field_12653).N(class07752.Nu).m().N(1.5F, 6.0F));
   public static final class00891 bk = N("tuff_slab", class07007::new, class01362.y(bw));
   public static final class00891 bY = N("tuff_stairs", var0 -> new class07746(bw.W(), var0), class01362.y(bw));
   public static final class00891 bQ = N("tuff_wall", class00650::new, class01362.y(bw).U());
   public static final class00891 bO = N("polished_tuff", class01362.y(bw).N(class07752.NR));
   public static final class00891 bg = N("polished_tuff_slab", class07007::new, class01362.y(bO));
   public static final class00891 bI = N("polished_tuff_stairs", var0 -> new class07746(bO.W(), var0), class01362.y(bO));
   public static final class00891 bJ = N("polished_tuff_wall", class00650::new, class01362.y(bO).U());
   public static final class00891 bo = N("chiseled_tuff", class01362.y(bw));
   public static final class00891 bq = N("tuff_bricks", class01362.y(bw).N(class07752.Ni));
   public static final class00891 bK = N("tuff_brick_slab", class07007::new, class01362.y(bq));
   public static final class00891 bV = N("tuff_brick_stairs", var0 -> new class07746(bq.W(), var0), class01362.y(bq));
   public static final class00891 be = N("tuff_brick_wall", class00650::new, class01362.y(bq).U());
   public static final class00891 bH = N("chiseled_tuff_bricks", class01362.y(bq));
   public static final class00891 bc = N("calcite", class01362.N().N(class04689.V).N(class08089.field_12653).N(class07752.NM).m().u(0.75F));
   public static final class00891 bX = N(
      "tinted_glass", class01107::new, class01362.y(ND).N(class04689.t).L().N(class00869::N).N_9(class00869::y).y(class00869::y).L(class00869::y)
   );
   public static final class00891 ba = N("powder_snow", class04819::new, class01362.N().N(class04689.Z).u(0.25F).N(class07752.E).R().L().N_9(class00869::y));
   public static final class00891 bp = N(
      "sculk_sensor",
      class06361::new,
      class01362.N().N(class04689.l).u(1.5F).N(class07752.NY).N(var0 -> 1).i((var0, var1x, var2x) -> class06361.U(var0) == class01193.field_28122)
   );
   public static final class00891 bF = N("calibrated_sculk_sensor", class03584::new, class01362.y(bp));
   public static final class00891 bA = N("sculk", class04094::new, class01362.N().N(class04689.O).u(0.2F).N(class07752.NO));
   public static final class00891 bf = N(
      "sculk_vein", class04063::new, class01362.N().N(class04689.O).U().y().u(0.2F).N(class07752.Ng).N(class04641.field_15971)
   );
   public static final class00891 bC = N("sculk_catalyst", class04066::new, class01362.N().N(class04689.O).N(3.0F, 3.0F).N(class07752.NQ).N(var0 -> 6));
   public static final class00891 bS = N("sculk_shrieker", class04007::new, class01362.N().N(class04689.O).N(3.0F, 3.0F).N(class07752.NI));
   public static final class00891 bx = N(
      "copper_block", var0 -> new class06049(class02774.field_28704, var0), class01362.N().N(class04689.s).m().N(3.0F, 6.0F).N(class07752.Nz)
   );
   public static final class00891 bD = N("exposed_copper", var0 -> new class06049(class02774.field_28705, var0), class01362.N(bx).N(class04689.A));
   public static final class00891 bh = N("weathered_copper", var0 -> new class06049(class02774.field_28706, var0), class01362.N(bx).N(class04689.Ni));
   public static final class00891 br = N("oxidized_copper", var0 -> new class06049(class02774.field_28707, var0), class01362.N(bx).N(class04689.Nu));
   public static final class00891 jN = N("copper_ore", var0 -> new class06858(class02151.N(0), var0), class01362.y(A));
   public static final class00891 jy = N(
      "deepslate_copper_ore", var0 -> new class06858(class02151.N(0), var0), class01362.y(jN).N(class04689.NB).N(4.5F, 3.0F).N(class07752.No)
   );
   public static final class00891 jL = N("oxidized_cut_copper", var0 -> new class06049(class02774.field_28707, var0), class01362.N(br));
   public static final class00891 ju = N("weathered_cut_copper", var0 -> new class06049(class02774.field_28706, var0), class01362.N(bh));
   public static final class00891 ji = N("exposed_cut_copper", var0 -> new class06049(class02774.field_28705, var0), class01362.N(bD));
   public static final class00891 jR = N("cut_copper", var0 -> new class06049(class02774.field_28704, var0), class01362.N(bx));
   public static final class00891 jM = N("oxidized_chiseled_copper", var0 -> new class06049(class02774.field_28707, var0), class01362.N(br));
   public static final class00891 jB = N("weathered_chiseled_copper", var0 -> new class06049(class02774.field_28706, var0), class01362.N(bh));
   public static final class00891 jZ = N("exposed_chiseled_copper", var0 -> new class06049(class02774.field_28705, var0), class01362.N(bD));
   public static final class00891 jz = N("chiseled_copper", var0 -> new class06049(class02774.field_28704, var0), class01362.N(bx));
   public static final class00891 jU = N("waxed_oxidized_chiseled_copper", class01362.N(jM));
   public static final class00891 jE = N("waxed_weathered_chiseled_copper", class01362.N(jB));
   public static final class00891 jW = N("waxed_exposed_chiseled_copper", class01362.N(jZ));
   public static final class00891 jm = N("waxed_chiseled_copper", class01362.N(jz));
   public static final class00891 jP = N("oxidized_cut_copper_stairs", var0 -> new class06033(class02774.field_28707, jL.W(), var0), class01362.N(jL));
   public static final class00891 js = N("weathered_cut_copper_stairs", var0 -> new class06033(class02774.field_28706, ju.W(), var0), class01362.N(bh));
   public static final class00891 jT = N("exposed_cut_copper_stairs", var0 -> new class06033(class02774.field_28705, ji.W(), var0), class01362.N(bD));
   public static final class00891 jb = N("cut_copper_stairs", var0 -> new class06033(class02774.field_28704, jR.W(), var0), class01362.N(bx));
   public static final class00891 jj = N("oxidized_cut_copper_slab", var0 -> new class06044(class02774.field_28707, var0), class01362.N(jL));
   public static final class00891 jv = N("weathered_cut_copper_slab", var0 -> new class06044(class02774.field_28706, var0), class01362.N(ju));
   public static final class00891 jn = N("exposed_cut_copper_slab", var0 -> new class06044(class02774.field_28705, var0), class01362.N(ji));
   public static final class00891 jt = N("cut_copper_slab", var0 -> new class06044(class02774.field_28704, var0), class01362.N(jR));
   public static final class00891 jG = N("waxed_copper_block", class01362.N(bx));
   public static final class00891 jl = N("waxed_weathered_copper", class01362.N(bh));
   public static final class00891 jd = N("waxed_exposed_copper", class01362.N(bD));
   public static final class00891 jw = N("waxed_oxidized_copper", class01362.N(br));
   public static final class00891 jk = N("waxed_oxidized_cut_copper", class01362.N(br));
   public static final class00891 jY = N("waxed_weathered_cut_copper", class01362.N(bh));
   public static final class00891 jQ = N("waxed_exposed_cut_copper", class01362.N(bD));
   public static final class00891 jO = N("waxed_cut_copper", class01362.N(bx));
   public static final class00891 jg = y("waxed_oxidized_cut_copper_stairs", jk);
   public static final class00891 jI = y("waxed_weathered_cut_copper_stairs", jY);
   public static final class00891 jJ = y("waxed_exposed_cut_copper_stairs", jQ);
   public static final class00891 jo = y("waxed_cut_copper_stairs", jO);
   public static final class00891 jq = N("waxed_oxidized_cut_copper_slab", class07007::new, class01362.N(jk).m());
   public static final class00891 jK = N("waxed_weathered_cut_copper_slab", class07007::new, class01362.N(jY).m());
   public static final class00891 jV = N("waxed_exposed_cut_copper_slab", class07007::new, class01362.N(jQ).m());
   public static final class00891 je = N("waxed_cut_copper_slab", class07007::new, class01362.N(jO).m());
   public static final class00891 jH = N(
      "copper_door", var0 -> new class03116(class01960.L, class02774.field_28704, var0), class01362.N().N(bx.k()).N(3.0F, 6.0F).L().N(class04641.field_15971)
   );
   public static final class00891 jc = N("exposed_copper_door", var0 -> new class03116(class01960.L, class02774.field_28705, var0), class01362.N(jH).N(bD.k()));
   public static final class00891 jX = N("oxidized_copper_door", var0 -> new class03116(class01960.L, class02774.field_28707, var0), class01362.N(jH).N(br.k()));
   public static final class00891 ja = N(
      "weathered_copper_door", var0 -> new class03116(class01960.L, class02774.field_28706, var0), class01362.N(jH).N(bh.k())
   );
   public static final class00891 jp = N("waxed_copper_door", var0 -> new class07196(class01960.L, var0), class01362.N(jH));
   public static final class00891 jF = N("waxed_exposed_copper_door", var0 -> new class07196(class01960.L, var0), class01362.N(jc));
   public static final class00891 jA = N("waxed_oxidized_copper_door", var0 -> new class07196(class01960.L, var0), class01362.N(jX));
   public static final class00891 jf = N("waxed_weathered_copper_door", var0 -> new class07196(class01960.L, var0), class01362.N(ja));
   public static final class00891 jC = N(
      "copper_trapdoor", var0 -> new class03104(class01960.L, class02774.field_28704, var0), class01362.N().N(bx.k()).N(3.0F, 6.0F).m().L().N(class00869::N)
   );
   public static final class00891 jS = N(
      "exposed_copper_trapdoor", var0 -> new class03104(class01960.L, class02774.field_28705, var0), class01362.N(jC).N(bD.k())
   );
   public static final class00891 jx = N(
      "oxidized_copper_trapdoor", var0 -> new class03104(class01960.L, class02774.field_28707, var0), class01362.N(jC).N(br.k())
   );
   public static final class00891 jD = N(
      "weathered_copper_trapdoor", var0 -> new class03104(class01960.L, class02774.field_28706, var0), class01362.N(jC).N(bh.k())
   );
   public static final class00891 jh = N("waxed_copper_trapdoor", var0 -> new class00624(class01960.L, var0), class01362.N(jC));
   public static final class00891 jr = N("waxed_exposed_copper_trapdoor", var0 -> new class00624(class01960.L, var0), class01362.N(jS));
   public static final class00891 vN = N("waxed_oxidized_copper_trapdoor", var0 -> new class00624(class01960.L, var0), class01362.N(jx));
   public static final class00891 vy = N("waxed_weathered_copper_trapdoor", var0 -> new class00624(class01960.L, var0), class01362.N(jD));
   public static final class00891 vL = N(
      "copper_grate",
      var0 -> new class03125(class02774.field_28704, var0),
      class01362.N().N(3.0F, 6.0F).N(class07752.NE).N(class04689.s).L().m().N(class00869::N).N_9(class00869::y).y(class00869::y).L(class00869::y)
   );
   public static final class00891 vu = N("exposed_copper_grate", var0 -> new class03125(class02774.field_28705, var0), class01362.N(vL).N(class04689.A));
   public static final class00891 vi = N("weathered_copper_grate", var0 -> new class03125(class02774.field_28706, var0), class01362.N(vL).N(class04689.Ni));
   public static final class00891 vR = N("oxidized_copper_grate", var0 -> new class03125(class02774.field_28707, var0), class01362.N(vL).N(class04689.Nu));
   public static final class00891 vM = N("waxed_copper_grate", class01802::new, class01362.N(vL));
   public static final class00891 vB = N("waxed_exposed_copper_grate", class01802::new, class01362.N(vu));
   public static final class00891 vZ = N("waxed_weathered_copper_grate", class01802::new, class01362.N(vi));
   public static final class00891 vz = N("waxed_oxidized_copper_grate", class01802::new, class01362.N(vR));
   public static final class00891 vU = N(
      "copper_bulb",
      var0 -> new class03107(class02774.field_28704, var0),
      class01362.N().N(bx.k()).N(3.0F, 6.0F).N(class07752.NU).m().N_9(class00869::y).N(N(15))
   );
   public static final class00891 vE = N("exposed_copper_bulb", var0 -> new class03107(class02774.field_28705, var0), class01362.N(vU).N(class04689.A).N(N(12)));
   public static final class00891 vW = N(
      "weathered_copper_bulb", var0 -> new class03107(class02774.field_28706, var0), class01362.N(vU).N(class04689.Ni).N(N(8))
   );
   public static final class00891 vm = N(
      "oxidized_copper_bulb", var0 -> new class03107(class02774.field_28707, var0), class01362.N(vU).N(class04689.Nu).N(N(4))
   );
   public static final class00891 vP = N("waxed_copper_bulb", class03135::new, class01362.N(vU));
   public static final class00891 vs = N("waxed_exposed_copper_bulb", class03135::new, class01362.N(vE));
   public static final class00891 vT = N("waxed_weathered_copper_bulb", class03135::new, class01362.N(vW));
   public static final class00891 vb = N("waxed_oxidized_copper_bulb", class03135::new, class01362.N(vm));
   public static final class00891 vj = N(
      "copper_chest",
      var0 -> new class08984(class02774.field_28704, class04909.Ms, class04909.MP, var0),
      class01362.N().N(bx.k()).N(3.0F, 6.0F).N(class07752.Nz).m()
   );
   public static final class00891 vv = N(
      "exposed_copper_chest", var0 -> new class08984(class02774.field_28705, class04909.Ms, class04909.MP, var0), class01362.N(vj).N(class04689.A)
   );
   public static final class00891 vn = N(
      "weathered_copper_chest", var0 -> new class08984(class02774.field_28706, class04909.Mb, class04909.MT, var0), class01362.N(vj).N(class04689.Ni)
   );
   public static final class00891 vt = N(
      "oxidized_copper_chest", var0 -> new class08984(class02774.field_28707, class04909.Mv, class04909.Mj, var0), class01362.N(vj).N(class04689.Nu)
   );
   public static final class00891 vG = N(
      "waxed_copper_chest", var0 -> new class08950(class02774.field_28704, class04909.Ms, class04909.MP, var0), class01362.N(vj)
   );
   public static final class00891 vl = N(
      "waxed_exposed_copper_chest", var0 -> new class08950(class02774.field_28705, class04909.Ms, class04909.MP, var0), class01362.N(vv)
   );
   public static final class00891 vd = N(
      "waxed_weathered_copper_chest", var0 -> new class08950(class02774.field_28706, class04909.Mb, class04909.MT, var0), class01362.N(vn)
   );
   public static final class00891 vw = N(
      "waxed_oxidized_copper_chest", var0 -> new class08950(class02774.field_28707, class04909.Mv, class04909.Mj, var0), class01362.N(vt)
   );
   public static final class00891 vk = N(
      "copper_golem_statue",
      var0 -> new class08986(class02774.field_28704, var0),
      class01362.N().N(bx.k()).N(3.0F, 6.0F).N(class07752.NW).N(class04641.field_15971).L()
   );
   public static final class00891 vY = N("exposed_copper_golem_statue", var0 -> new class08986(class02774.field_28705, var0), class01362.N(vk).N(class04689.A));
   public static final class00891 vQ = N(
      "weathered_copper_golem_statue", var0 -> new class08986(class02774.field_28706, var0), class01362.N(vk).N(class04689.Ni)
   );
   public static final class00891 vO = N(
      "oxidized_copper_golem_statue", var0 -> new class08986(class02774.field_28707, var0), class01362.N(vk).N(class04689.Nu)
   );
   public static final class00891 vg = N("waxed_copper_golem_statue", var0 -> new class08981(class02774.field_28704, var0), class01362.N(vk));
   public static final class00891 vI = N("waxed_exposed_copper_golem_statue", var0 -> new class08981(class02774.field_28705, var0), class01362.N(vY));
   public static final class00891 vJ = N("waxed_weathered_copper_golem_statue", var0 -> new class08981(class02774.field_28706, var0), class01362.N(vQ));
   public static final class00891 vo = N("waxed_oxidized_copper_golem_statue", var0 -> new class08981(class02774.field_28707, var0), class01362.N(vO));
   public static final class00891 vq = N(
      "lightning_rod", var0 -> new class08954(class02774.field_28704, var0), class01362.N().N(class04689.s).U().m().N(3.0F, 6.0F).N(class07752.Nz).L()
   );
   public static final class00891 vK = N("exposed_lightning_rod", var0 -> new class08954(class02774.field_28705, var0), class01362.N(vq).N(class04689.A));
   public static final class00891 vV = N("weathered_lightning_rod", var0 -> new class08954(class02774.field_28706, var0), class01362.N(vq).N(class04689.Ni));
   public static final class00891 ve = N("oxidized_lightning_rod", var0 -> new class08954(class02774.field_28707, var0), class01362.N(vq).N(class04689.Nu));
   public static final class00891 vH = N("waxed_lightning_rod", class01111::new, class01362.N(vq));
   public static final class00891 vc = N("waxed_exposed_lightning_rod", class01111::new, class01362.N(vK));
   public static final class00891 vX = N("waxed_weathered_lightning_rod", class01111::new, class01362.N(vV));
   public static final class00891 va = N("waxed_oxidized_lightning_rod", class01111::new, class01362.N(ve));
   public static final class00891 vp = N(
      "pointed_dripstone",
      class06342::new,
      class01362.N()
         .N(class04689.x)
         .U()
         .N(class08089.field_12653)
         .L()
         .N(class07752.NZ)
         .i()
         .N(1.5F, 3.0F)
         .R()
         .N(class01344.field_10657)
         .N(class04641.field_15971)
         .N_9(class00869::y)
         .L()
   );
   public static final class00891 vF = N("dripstone_block", class01362.N().N(class04689.x).N(class08089.field_12653).N(class07752.NB).m().N(1.5F, 1.0F));
   public static final class00891 vA = N(
      "cave_vines", class06045::new, class01362.N().N(class04689.B).i().y().N(class05568.e_(14)).u().N(class07752.Nm).N(class04641.field_15971)
   );
   public static final class00891 vf = N(
      "cave_vines_plant", class05578::new, class01362.N().N(class04689.B).y().N(class05568.e_(14)).u().N(class07752.Nm).N(class04641.field_15971)
   );
   public static final class00891 vC = N("spore_blossom", class06077::new, class01362.N().N(class04689.B).u().y().N(class07752.NP).N(class04641.field_15971));
   public static final class00891 vS = N("azalea", class05555::new, class01362.N().N(class04689.B).E().u().N(class07752.NT).L().N(class04641.field_15971));
   public static final class00891 vx = N(
      "flowering_azalea", class05555::new, class01362.N().N(class04689.B).E().u().N(class07752.Nb).L().N(class04641.field_15971)
   );
   public static final class00891 vD = N("moss_carpet", class00410::new, class01362.N().N(class04689.Y).u(0.1F).N(class07752.Nj).N(class04641.field_15971));
   public static final class00891 vh = N("pink_petals", class08612::new, class01362.N().N(class04689.B).y().N(class07752.Nv).N(class04641.field_15971));
   public static final class00891 vr = N("wildflowers", class08612::new, class01362.N().N(class04689.B).y().N(class07752.Nv).N(class04641.field_15971));
   public static final class00891 nN = N("leaf_litter", class08596::new, class01362.N().N(class04689.k).s().y().N(class07752.Nn).N(class04641.field_15971));
   public static final class00891 ny = N(
      "moss_block", var0 -> new class00320(class03192.m, var0), class01362.N().N(class04689.Y).u(0.1F).N(class07752.Nt).N(class04641.field_15971)
   );
   public static final class00891 nL = N("big_dripleaf", class05584::new, class01362.N().N(class04689.B).E().u(0.1F).N(class07752.NG).N(class04641.field_15971));
   public static final class00891 nu = N(
      "big_dripleaf_stem", class05540::new, class01362.N().N(class04689.B).y().u(0.1F).N(class07752.NG).N(class04641.field_15971)
   );
   public static final class00891 ni = N(
      "small_dripleaf", class06043::new, class01362.N().N(class04689.B).y().u().N(class07752.Nl).N(class01344.field_10655).N(class04641.field_15971)
   );
   public static final class00891 nR = N(
      "hanging_roots", class06081::new, class01362.N().N(class04689.U).s().y().u().N(class07752.Nw).N(class01344.field_10657).Z().N(class04641.field_15971)
   );
   public static final class00891 nM = N("rooted_dirt", class02202::new, class01362.N().N(class04689.U).u(0.5F).N(class07752.Nd));
   public static final class00891 nB = N(
      "mud", class04062::new, class01362.y(z).N(class04689.f).N(class00869::y).N_9(class00869::N).L(class00869::N).y(class00869::N).N(class07752.Na)
   );
   public static final class00891 nZ = N(
      "deepslate", class07004::new, class01362.N().N(class04689.NB).N(class08089.field_12653).m().N(3.0F, 6.0F).N(class07752.No)
   );
   public static final class00891 nz = N("cobbled_deepslate", class01362.y(nZ).N(3.5F, 6.0F));
   public static final class00891 nU = N("cobbled_deepslate_stairs", nz);
   public static final class00891 nE = N("cobbled_deepslate_slab", class07007::new, class01362.y(nz));
   public static final class00891 nW = N("cobbled_deepslate_wall", class00650::new, class01362.y(nz).U());
   public static final class00891 nm = N("polished_deepslate", class01362.y(nz).N(class07752.NV));
   public static final class00891 nP = N("polished_deepslate_stairs", nm);
   public static final class00891 ns = N("polished_deepslate_slab", class07007::new, class01362.y(nm));
   public static final class00891 nT = N("polished_deepslate_wall", class00650::new, class01362.y(nm).U());
   public static final class00891 nb = N("deepslate_tiles", class01362.y(nz).N(class07752.NK));
   public static final class00891 nj = N("deepslate_tile_stairs", nb);
   public static final class00891 nv = N("deepslate_tile_slab", class07007::new, class01362.y(nb));
   public static final class00891 nn = N("deepslate_tile_wall", class00650::new, class01362.y(nb).U());
   public static final class00891 nt = N("deepslate_bricks", class01362.y(nz).N(class07752.Nq));
   public static final class00891 nG = N("deepslate_brick_stairs", nt);
   public static final class00891 nl = N("deepslate_brick_slab", class07007::new, class01362.y(nt));
   public static final class00891 nd = N("deepslate_brick_wall", class00650::new, class01362.y(nt).U());
   public static final class00891 nw = N("chiseled_deepslate", class01362.y(nz).N(class07752.Nq));
   public static final class00891 nk = N("cracked_deepslate_bricks", class01362.y(nt));
   public static final class00891 nY = N("cracked_deepslate_tiles", class01362.y(nb));
   public static final class00891 nQ = N("infested_deepslate", var0 -> new class03431(nZ, var0), class01362.N().N(class04689.NB).N(class07752.No));
   public static final class00891 nO = N("smooth_basalt", class01362.y(iY));
   public static final class00891 ng = N("raw_iron_block", class01362.N().N(class04689.NZ).N(class08089.field_12653).m().N(5.0F, 6.0F));
   public static final class00891 nI = N("raw_copper_block", class01362.N().N(class04689.s).N(class08089.field_12653).m().N(5.0F, 6.0F));
   public static final class00891 nJ = N("raw_gold_block", class01362.N().N(class04689.g).N(class08089.field_12653).m().N(5.0F, 6.0F));
   public static final class00891 no = N("potted_azalea_bush", var0 -> new class00757(vS, var0), y());
   public static final class00891 nq = N("potted_flowering_azalea_bush", var0 -> new class00757(vx, var0), y());
   public static final class00891 nK = N("ochre_froglight", class07004::new, class01362.N().N(class04689.L).u(0.3F).N(var0 -> 15).N(class07752.Ne));
   public static final class00891 nV = N("verdant_froglight", class07004::new, class01362.N().N(class04689.Nz).u(0.3F).N(var0 -> 15).N(class07752.Ne));
   public static final class00891 ne = N("pearlescent_froglight", class07004::new, class01362.N().N(class04689.n).u(0.3F).N(var0 -> 15).N(class07752.Ne));
   public static final class00891 nH = N("frogspawn", class04088::new, class01362.N().N(class04689.W).u().L().y().N(class07752.NH).N(class04641.field_15971));
   public static final class00891 nc = N("reinforced_deepslate", class01362.N().N(class04689.NB).N(class08089.field_12653).N(class07752.No).N(55.0F, 1200.0F));
   public static final class00891 nX = N("decorated_pot", class01977::new, class01362.N().N(class04689.h).N(0.0F, 0.0F).N(class04641.field_15971).L());
   public static final class00891 na = N("crafter", class01748::new, class01362.N().N(class04689.E).N(1.5F, 3.5F));
   public static final class00891 np = N(
      "trial_spawner",
      class04487::new,
      class01362.N().N(class04689.E).N(class08089.field_12653).N(var0 -> var0.L(class04487.y).N()).u(50.0F).N(class07752.yB).L(class00869::y).L()
   );
   public static final class00891 nF = N(
      "vault",
      class02271::new,
      class01362.N().N(class04689.E).N(class08089.field_12653).L().N(class07752.yU).N(var0 -> var0.L(class02271.y).N()).u(50.0F).L(class00869::y)
   );
   public static final class00891 nA = N(
      "heavy_core", class02460::new, class01362.N().N(class04689.M).N(class08089.field_12643).N(class07752.yW).u(10.0F).N(class04641.field_15974).R(1200.0F)
   );
   public static final class00891 nf = N(
      "pale_moss_block", var0 -> new class00320(class03193.c, var0), class01362.N().Z().N(class04689.G).u(0.1F).N(class07752.Nt).N(class04641.field_15971)
   );
   public static final class00891 nC = N(
      "pale_moss_carpet", class00318::new, class01362.N().Z().N(nf.k()).u(0.1F).N(class07752.Nj).N(class04641.field_15971).L()
   );
   public static final class00891 nS = N("pale_hanging_moss", class00288::new, class01362.N().Z().N(nf.k()).y().N(class07752.Nj).N(class04641.field_15971));
   public static final class00891 nx = N(
      "open_eyeblossom",
      var0 -> new class08817(class08846.field_55070, var0),
      class01362.N().N(Lp.k()).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971).i()
   );
   public static final class00891 nD = N(
      "closed_eyeblossom",
      var0 -> new class08817(class08846.field_55071, var0),
      class01362.N().N(NF.k()).y().u().N(class07752.u).N(class01344.field_10657).N(class04641.field_15971).i()
   );
   public static final class00891 nh = N("potted_open_eyeblossom", var0 -> new class00757(nx, var0), y().i());
   public static final class00891 nr = N("potted_closed_eyeblossom", var0 -> new class00757(nD, var0), y().i());
   public static final class00891 tN = N(
      "firefly_bush", class08422::new, class01362.N().N(class04689.B).Z().N(var0 -> 2).y().u().N(class07752.t).N(class04641.field_15971)
   );

   private static class01362 L(class04689 var0) {
      return class01362.N().N(var0).U().u(2.0F).R().L().y(ty).L(ty).N(class04641.field_15971);
   }

   private static class01362 L() {
      return class01362.N().N(class04689.E).u(1.5F).N_9(class00869::y).y(tL).L(tL).N(class04641.field_15972);
   }

   public static Boolean L(class00500 var0, class07290 var1, class07209 var2, class07078<?> var3) {
      return var3 == class07078.Na || var3 == class07078.Nx;
   }

   public class00869() {
      super();
   }

   private static class01362 u(class04689 var0) {
      return class01362.N().N(var0).L().u(0.1F).N(class07752.D).N(class05440.Z).N(class04641.field_15971);
   }

   public static boolean y(class00500 var0, class07290 var1, class07209 var2) {
      return false;
   }

   private static class00891 y(String var0, class06563 var1) {
      return N(
         var0,
         var1x -> new class07734(var1, var1x),
         class01362.N().N(var1).N(class08089.field_12645).u(0.3F).N(class07752.B).L().N(class00869::N).N_9(class00869::y).y(class00869::y).L(class00869::y)
      );
   }

   public static Boolean y(class00500 var0, class07290 var1, class07209 var2, class07078<?> var3) {
      return true;
   }

   private static Function<class00500, class04689> y(class04689 var0) {
      return var1 -> var1.L(class06665.q) ? class04689.W : var0;
   }

   private static class00891 y(String var0, class00891 var1) {
      return N(var0, var1x -> new class07746(var1.W(), var1x), class01362.N(var1));
   }

   public static class01362 y() {
      return class01362.N().u().L().N(class04641.field_15971);
   }

   private static void N(CallbackInfo var0) {
      RegistryEntryAddedCallback.event(class04206.i).register((RegistryEntryAddedCallback)(var0x, var1, var2) -> {
         UnmodifiableIterator unmodifiableiterator = var2.E().N().iterator();

         while (unmodifiableiterator.hasNext()) {
            ((class00500)unmodifiableiterator.next()).u();
         }
      });
   }

   public static class00891 N(class05946<class00891> var0, Function<class01362, class00891> var1, class01362 var2) {
      class00891 class00891 = (class00891)var1.apply(var2.N(var0));
      return class00751.N(class04206.i, var0, class00891);
   }

   public static boolean N(class00500 var0, class07290 var1, class07209 var2) {
      return true;
   }

   private static class00891 N(String var0, class01362 var1) {
      return N(var0, class00891::new, var1);
   }

   public static class01362 N(class04689 var0) {
      return class01362.N().N_25(var1 -> var0).N(class08089.field_12651).u(2.0F).N(class07752.Y);
   }

   public static class01362 N(class04689 var0, class04689 var1, class07752 var2) {
      return class01362.N().N_25(var2x -> var2x.L(class07004.L) == class07185.field_11052 ? var0 : var1).N(class08089.field_12651).u(2.0F).N(var2).Z();
   }

   public static class00891 N(class05946<class00891> var0, class01362 var1) {
      return N(var0, class00891::new, var1);
   }

   private static class01362 N(class00891 var0, boolean var1) {
      class01362 class01362 = class01362.N().N(var0.d());
      if (var1) {
         class01362 = class01362.N(var0.w());
      }

      return class01362;
   }

   @Deprecated
   private static class00891 N(String var0, class00891 var1) {
      return N(var0, var1x -> new class07746(var1.W(), var1x), class01362.y(var1));
   }

   public static class01362 N(class07752 var0) {
      return class01362.N()
         .N(class04689.B)
         .u(0.2F)
         .i()
         .N(var0)
         .L()
         .N(class00869::L)
         .y(class00869::y)
         .L(class00869::y)
         .Z()
         .N(class04641.field_15971)
         .N_9(class00869::y);
   }

   private static class05946<class00891> N(String var0) {
      return class05946.N(class04227.Z, class01894.y(var0));
   }

   private static class00891 N(String var0, Function<class01362, class00891> var1, class01362 var2) {
      return N(N(var0), var1, var2);
   }

   public static Boolean N(class00500 var0, class07290 var1, class07209 var2, class07078<?> var3) {
      return false;
   }

   private static class00891 N(String var0, class06563 var1) {
      return N(
         var0,
         var1x -> new class07789(var1, var1x),
         class01362.N()
            .N_25(var1x -> var1x.L(class07789.y) == class06637.field_12557 ? var1.u() : class04689.u)
            .N(class07752.y)
            .u(0.2F)
            .L()
            .Z()
            .N(class04641.field_15971)
      );
   }

   public static ToIntFunction<class00500> N(int var0) {
      return var1 -> var1.L(class06665.n) ? var0 : 0;
   }

   public static class01362 N() {
      return class01362.N().y().u(0.5F).N(class04641.field_15971);
   }

   static {
      for (class00891 class00891 : class04206.i) {
         UnmodifiableIterator unmodifiableiterator = class00891.E().N().iterator();

         while (unmodifiableiterator.hasNext()) {
            class00500 class00500 = (class00500)unmodifiableiterator.next();
            class00891.U.y(class00500);
            class00500.u();
         }
      }
   }
}
