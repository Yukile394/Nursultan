package minecraft;

import java.util.Optional;
import java.util.stream.IntStream;

public class class05433 {
   public static final class05403 N = N("cube", class05418.L, class05418.z, class05418.U, class05418.E, class05418.W, class05418.m, class05418.P);
   public static final class05403 y = N("cube_directional", class05418.L, class05418.z, class05418.U, class05418.E, class05418.W, class05418.m, class05418.P);
   public static final class05403 L = N("cube_all", class05418.N);
   public static final class05403 u = N("cube_all_inner_faces", class05418.N);
   public static final class05403 i = y("cube_mirrored_all", "_mirrored", class05418.N);
   public static final class05403 R = y("cube_north_west_mirrored_all", "_north_west_mirrored", class05418.N);
   public static final class05403 M = y("cube_column_uv_locked_x", "_x", class05418.u, class05418.Z);
   public static final class05403 B = y("cube_column_uv_locked_y", "_y", class05418.u, class05418.Z);
   public static final class05403 Z = y("cube_column_uv_locked_z", "_z", class05418.u, class05418.Z);
   public static final class05403 z = N("cube_column", class05418.u, class05418.Z);
   public static final class05403 U = y("cube_column_horizontal", "_horizontal", class05418.u, class05418.Z);
   public static final class05403 E = y("cube_column_mirrored", "_mirrored", class05418.u, class05418.Z);
   public static final class05403 W = N("cube_top", class05418.R, class05418.Z);
   public static final class05403 m = N("cube_bottom_top", class05418.R, class05418.i, class05418.Z);
   public static final class05403 P = N("cube_bottom_top_inner_faces", class05418.R, class05418.i, class05418.Z);
   public static final class05403 s = N("orientable", class05418.R, class05418.M, class05418.Z);
   public static final class05403 T = N("orientable_with_bottom", class05418.R, class05418.i, class05418.Z, class05418.M);
   public static final class05403 b = y("orientable_vertical", "_vertical", class05418.M, class05418.Z);
   public static final class05403 j = N("button", class05418.y);
   public static final class05403 v = y("button_pressed", "_pressed", class05418.y);
   public static final class05403 n = y("button_inventory", "_inventory", class05418.y);
   public static final class05403 t = y("door_bottom_left", "_bottom_left", class05418.R, class05418.i);
   public static final class05403 G = y("door_bottom_left_open", "_bottom_left_open", class05418.R, class05418.i);
   public static final class05403 l = y("door_bottom_right", "_bottom_right", class05418.R, class05418.i);
   public static final class05403 d = y("door_bottom_right_open", "_bottom_right_open", class05418.R, class05418.i);
   public static final class05403 w = y("door_top_left", "_top_left", class05418.R, class05418.i);
   public static final class05403 k = y("door_top_left_open", "_top_left_open", class05418.R, class05418.i);
   public static final class05403 Y = y("door_top_right", "_top_right", class05418.R, class05418.i);
   public static final class05403 Q = y("door_top_right_open", "_top_right_open", class05418.R, class05418.i);
   public static final class05403 O = y("custom_fence_post", "_post", class05418.y, class05418.L);
   public static final class05403 g = y("custom_fence_side_north", "_side_north", class05418.y);
   public static final class05403 I = y("custom_fence_side_east", "_side_east", class05418.y);
   public static final class05403 J = y("custom_fence_side_south", "_side_south", class05418.y);
   public static final class05403 o = y("custom_fence_side_west", "_side_west", class05418.y);
   public static final class05403 q = y("custom_fence_inventory", "_inventory", class05418.y);
   public static final class05403 K = y("fence_post", "_post", class05418.y);
   public static final class05403 V = y("fence_side", "_side", class05418.y);
   public static final class05403 e = y("fence_inventory", "_inventory", class05418.y);
   public static final class05403 H = y("template_wall_post", "_post", class05418.j);
   public static final class05403 c = y("template_wall_side", "_side", class05418.j);
   public static final class05403 X = y("template_wall_side_tall", "_side_tall", class05418.j);
   public static final class05403 a = y("wall_inventory", "_inventory", class05418.j);
   public static final class05403 p = N("template_custom_fence_gate", class05418.y, class05418.L);
   public static final class05403 F = y("template_custom_fence_gate_open", "_open", class05418.y, class05418.L);
   public static final class05403 A = y("template_custom_fence_gate_wall", "_wall", class05418.y, class05418.L);
   public static final class05403 f = y("template_custom_fence_gate_wall_open", "_wall_open", class05418.y, class05418.L);
   public static final class05403 C = N("template_fence_gate", class05418.y);
   public static final class05403 S = y("template_fence_gate_open", "_open", class05418.y);
   public static final class05403 x = y("template_fence_gate_wall", "_wall", class05418.y);
   public static final class05403 D = y("template_fence_gate_wall_open", "_wall_open", class05418.y);
   public static final class05403 h = N("pressure_plate_up", class05418.y);
   public static final class05403 r = y("pressure_plate_down", "_down", class05418.y);
   public static final class05403 NN = N(class05418.L);
   public static final class05403 Ny = N("slab", class05418.i, class05418.R, class05418.Z);
   public static final class05403 NL = y("slab_top", "_top", class05418.i, class05418.R, class05418.Z);
   public static final class05403 Nu = N("leaves", class05418.N);
   public static final class05403 Ni = N("stairs", class05418.i, class05418.R, class05418.Z);
   public static final class05403 NR = y("inner_stairs", "_inner", class05418.i, class05418.R, class05418.Z);
   public static final class05403 NM = y("outer_stairs", "_outer", class05418.i, class05418.R, class05418.Z);
   public static final class05403 NB = y("template_trapdoor_top", "_top", class05418.y);
   public static final class05403 NZ = y("template_trapdoor_bottom", "_bottom", class05418.y);
   public static final class05403 Nz = y("template_trapdoor_open", "_open", class05418.y);
   public static final class05403 NU = y("template_orientable_trapdoor_top", "_top", class05418.y);
   public static final class05403 NE = y("template_orientable_trapdoor_bottom", "_bottom", class05418.y);
   public static final class05403 NW = y("template_orientable_trapdoor_open", "_open", class05418.y);
   public static final class05403 Nm = N("pointed_dripstone", class05418.s);
   public static final class05403 NP = N("cross", class05418.s);
   public static final class05403 Ns = N("tinted_cross", class05418.s);
   public static final class05403 NT = N("cross_emissive", class05418.s, class05418.T);
   public static final class05403 Nb = N("flower_pot_cross", class05418.b);
   public static final class05403 Nj = N("tinted_flower_pot_cross", class05418.b);
   public static final class05403 Nv = N("flower_pot_cross_emissive", class05418.b, class05418.T);
   public static final class05403 Nn = N("rail_flat", class05418.v);
   public static final class05403 Nt = y("rail_curved", "_corner", class05418.v);
   public static final class05403 NG = y("template_rail_raised_ne", "_raised_ne", class05418.v);
   public static final class05403 Nl = y("template_rail_raised_sw", "_raised_sw", class05418.v);
   public static final class05403 Nd = N("carpet", class05418.n);
   public static final class05403 Nw = N("mossy_carpet_side", class05418.Z);
   public static final class05403 Nk = y("flowerbed_1", "_1", class05418.p, class05418.w);
   public static final class05403 NY = y("flowerbed_2", "_2", class05418.p, class05418.w);
   public static final class05403 NQ = y("flowerbed_3", "_3", class05418.p, class05418.w);
   public static final class05403 NO = y("flowerbed_4", "_4", class05418.p, class05418.w);
   public static final class05403 Ng = y("template_leaf_litter_1", "_1", class05418.y);
   public static final class05403 NI = y("template_leaf_litter_2", "_2", class05418.y);
   public static final class05403 NJ = y("template_leaf_litter_3", "_3", class05418.y);
   public static final class05403 No = y("template_leaf_litter_4", "_4", class05418.y);
   public static final class05403 Nq = N("coral_fan", class05418.d);
   public static final class05403 NK = N("coral_wall_fan", class05418.d);
   public static final class05403 NV = N("template_glazed_terracotta", class05418.t);
   public static final class05403 Ne = N("template_chorus_flower", class05418.y);
   public static final class05403 NH = N("template_daylight_detector", class05418.R, class05418.Z);
   public static final class05403 Nc = y("template_glass_pane_noside", "_noside", class05418.G);
   public static final class05403 NX = y("template_glass_pane_noside_alt", "_noside_alt", class05418.G);
   public static final class05403 Na = y("template_glass_pane_post", "_post", class05418.G, class05418.l);
   public static final class05403 Np = y("template_glass_pane_side", "_side", class05418.G, class05418.l);
   public static final class05403 NF = y("template_glass_pane_side_alt", "_side_alt", class05418.G, class05418.l);
   public static final class05403 NA = N("template_command_block", class05418.M, class05418.B, class05418.Z);
   public static final class05403 Nf = y("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", class05418.y);
   public static final class05403 NC = y("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", class05418.y);
   public static final class05403 NS = y("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", class05418.y);
   public static final class05403 Nx = y("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", class05418.y);
   public static final class05403 ND = y("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", class05418.y);
   public static final class05403 Nh = y("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", class05418.y);
   public static final class05403 Nr = N("template_shelf_body", class05418.N, class05418.L);
   public static final class05403 yN = y("template_shelf_inventory", "_inventory", class05418.N, class05418.L);
   public static final class05403 yy = y("template_shelf_unpowered", "_unpowered", class05418.N, class05418.L);
   public static final class05403 yL = y("template_shelf_unconnected", "_unconnected", class05418.N, class05418.L);
   public static final class05403 yu = y("template_shelf_left", "_left", class05418.N, class05418.L);
   public static final class05403 yi = y("template_shelf_center", "_center", class05418.N, class05418.L);
   public static final class05403 yR = y("template_shelf_right", "_right", class05418.N, class05418.L);
   public static final class05403 yM = N("template_anvil", class05418.R);
   public static final class05403[] yB = IntStream.range(0, 8)
      .mapToObj(var0 -> y("stem_growth" + var0, "_stage" + var0, class05418.w))
      .toArray(class05403[]::new);
   public static final class05403 yZ = N("stem_fruit", class05418.w, class05418.k);
   public static final class05403 yz = N("crop", class05418.Y);
   public static final class05403 yU = N("template_farmland", class05418.Q, class05418.R);
   public static final class05403 yE = N("template_fire_floor", class05418.O);
   public static final class05403 yW = N("template_fire_side", class05418.O);
   public static final class05403 ym = N("template_fire_side_alt", class05418.O);
   public static final class05403 yP = N("template_fire_up", class05418.O);
   public static final class05403 ys = N("template_fire_up_alt", class05418.O);
   public static final class05403 yT = N("template_campfire", class05418.O, class05418.e);
   public static final class05403 yb = N("template_lantern", class05418.g);
   public static final class05403 yj = y("template_hanging_lantern", "_hanging", class05418.g);
   public static final class05403 yv = N("template_chain", class05418.y);
   public static final class05403 yn = y("template_bars_cap", "_cap", class05418.A, class05418.l);
   public static final class05403 yt = y("template_bars_cap_alt", "_cap_alt", class05418.A, class05418.l);
   public static final class05403 yG = y("template_bars_post", "_post", class05418.A, class05418.l);
   public static final class05403 yl = y("template_bars_post_ends", "_post_ends", class05418.A, class05418.l);
   public static final class05403 yd = y("template_bars_side", "_side", class05418.A, class05418.l);
   public static final class05403 yw = y("template_bars_side_alt", "_side_alt", class05418.A, class05418.l);
   public static final class05403 yk = N("template_torch", class05418.o);
   public static final class05403 yY = N("template_torch_unlit", class05418.o);
   public static final class05403 yQ = N("template_torch_wall", class05418.o);
   public static final class05403 yO = N("template_torch_wall_unlit", class05418.o);
   public static final class05403 yg = N("template_redstone_torch", class05418.o);
   public static final class05403 yI = N("template_redstone_torch_wall", class05418.o);
   public static final class05403 yJ = N("template_piston", class05418.I, class05418.i, class05418.Z);
   public static final class05403 yo = N("template_piston_head", class05418.I, class05418.Z, class05418.J);
   public static final class05403 yq = N("template_piston_head_short", class05418.I, class05418.Z, class05418.J);
   public static final class05403 yK = N("template_seagrass", class05418.y);
   public static final class05403 yV = N("template_turtle_egg", class05418.N);
   public static final class05403 ye = N(
      "dried_ghast", class05418.L, class05418.R, class05418.i, class05418.z, class05418.U, class05418.E, class05418.W, class05418.F
   );
   public static final class05403 yH = N("template_two_turtle_eggs", class05418.N);
   public static final class05403 yc = N("template_three_turtle_eggs", class05418.N);
   public static final class05403 yX = N("template_four_turtle_eggs", class05418.N);
   public static final class05403 ya = N("template_single_face", class05418.y);
   public static final class05403 yp = N("template_cauldron_level1", class05418.X, class05418.c, class05418.L, class05418.R, class05418.i, class05418.Z);
   public static final class05403 yF = N("template_cauldron_level2", class05418.X, class05418.c, class05418.L, class05418.R, class05418.i, class05418.Z);
   public static final class05403 yA = N("template_cauldron_full", class05418.X, class05418.c, class05418.L, class05418.R, class05418.i, class05418.Z);
   public static final class05403 yf = N("template_azalea", class05418.R, class05418.Z);
   public static final class05403 yC = N("template_potted_azalea_bush", class05418.b, class05418.R, class05418.Z);
   public static final class05403 yS = N("template_potted_azalea_bush", class05418.b, class05418.R, class05418.Z);
   public static final class05403 yx = N("sniffer_egg", class05418.R, class05418.i, class05418.z, class05418.U, class05418.E, class05418.W);
   public static final class05403 yD = y("generated", class05418.q);
   public static final class05403 yh = y("template_music_disc", class05418.q);
   public static final class05403 yr = y("handheld", class05418.q);
   public static final class05403 LN = y("handheld_rod", class05418.q);
   public static final class05403 Ly = y("generated", class05418.q, class05418.K);
   public static final class05403 LL = y("generated", class05418.q, class05418.K, class05418.V);
   public static final class05403 Lu = y("template_shulker_box", class05418.L);
   public static final class05403 Li = y("template_bed", class05418.L);
   public static final class05403 LR = y("template_chest", class05418.L);
   public static final class05403 LM = N("template_bundle_open_front", "_open_front", class05418.q);
   public static final class05403 LB = N("template_bundle_open_back", "_open_back", class05418.q);
   public static final class05403 LZ = y("bow", class05418.q);
   public static final class05403 Lz = y("crossbow", class05418.q);
   public static final class05403 LU = N("spear_in_hand", "_in_hand", class05418.q);
   public static final class05403 LE = N("template_candle", class05418.N, class05418.L);
   public static final class05403 LW = N("template_two_candles", class05418.N, class05418.L);
   public static final class05403 Lm = N("template_three_candles", class05418.N, class05418.L);
   public static final class05403 LP = N("template_four_candles", class05418.N, class05418.L);
   public static final class05403 Ls = N("template_cake_with_candle", class05418.H, class05418.i, class05418.Z, class05418.R, class05418.L);
   public static final class05403 LT = N("template_sculk_shrieker", class05418.i, class05418.Z, class05418.R, class05418.L, class05418.a);
   public static final class05403 Lb = N("template_vault", class05418.R, class05418.i, class05418.Z, class05418.M);
   public static final class05403 Lj = y("handheld_mace", class05418.q);
   public static final class05403 Lv = N("template_lightning_rod", class05418.y);

   public class05433() {
      super();
   }

   private static class05403 y(String var0, class05418... var1) {
      return new class05403(Optional.of(class01894.y("item/" + var0)), Optional.empty(), var1);
   }

   private static class05403 y(String var0, String var1, class05418... var2) {
      return new class05403(Optional.of(class01894.y("block/" + var0)), Optional.of(var1), var2);
   }

   private static class05403 N(String var0, String var1, class05418... var2) {
      return new class05403(Optional.of(class01894.y("item/" + var0)), Optional.of(var1), var2);
   }

   private static class05403 N(String var0, class05418... var1) {
      return new class05403(Optional.of(class01894.y("block/" + var0)), Optional.empty(), var1);
   }

   private static class05403 N(class05418... var0) {
      return new class05403(Optional.empty(), Optional.empty(), var0);
   }
}
